/*
 * Copyright (C) 2011 Secretariat of the Pacific Community
 *
 * This file is part of TUBS.
 *
 * TUBS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TUBS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with TUBS.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spc.ofp.observer.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.spc.ofp.data.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.TripRepository")
public class TripRepository extends Repository<Trip> implements ITripRepository {
	
	@Autowired
	protected FieldStaffRepository fieldStaffRepo;
	
	@Autowired
	protected VesselRepository vesselRepo;
	
	@Autowired
	protected Gen3Repository gen3Repo;
	
	@Autowired
	protected ElectronicsRepository electronicsRepo;
	
	@Autowired
	protected FishTransferRepository transferRepo;
	
	@Autowired
	protected VesselSightingRepository vesselSightingRepo;
	
	@Autowired
	protected MarineDeviceRepository marineDeviceRepo;
	
	@Autowired
	protected SafetyRepository safetyRepo;
	
	@Autowired
	protected SpecialSpeciesRepository specialSpeciesRepo;
	
	@Autowired
	protected PortRepository portRepo;
	
	private static final String SELECT_QUERY =
			"SELECT " +
			"  OBSTRIP_ID," +
			"  trim(OBS_PRG_ID) as OBS_PRG_ID, " +
			"  trim(OBSV_ID) as OBSV_ID, " +
			"  trim(TRIPNO) as TRIPNO, " +
			"  date(O_DEP_DATE) as O_DEP_DATE, " +
			"  date(O_RET_DATE) as O_RET_DATE, " +
			"  trim(VESSELNAME) as VESSELNAME, " +
			"  BOAT_ID, " +
			"  REGIST_NO, " +
			"  trim(FLAG_ID) as FLAG_ID, " +
			"  FLEET_ID, " +
			"  GRT, " +
			"  trim(GR_ID) as GR_ID, " +
			"  DEP_ID, " +
			"  RET_ID, " +
			"  trim(DEP_PORT) as DEP_PORT, " +
			"  trim(RET_PORT) as RET_PORT " +
			"FROM " +
			"  obs_trip ";
		
	private Trip fill(final Trip t) {
		if (null == t) { return null; }
		final long tripId = t.getId();
		if (0L == tripId) { return t; }
		t.setObserver(fieldStaffRepo.findByCode(t.getObserverId()));
		t.setBoat(vesselRepo.findById(t.getBoatId()));
		t.setGen3Report(gen3Repo.findByTrip(tripId));
		// TODO Each electronics device has an underlying MarineDevice
		t.addElectronics(electronicsRepo.findByTripId(tripId));
		t.addFishTransfers(transferRepo.findByTrip(tripId));
		t.addVesselSightings(vesselSightingRepo.findByTrip(tripId));
		t.addSafetyInspections(safetyRepo.findByTripId(tripId));
		t.addSpecialSpecies(specialSpeciesRepo.findByTrip(tripId));
		t.setReturnPort(portRepo.findByName(t.getReturnPortName()));
		t.setDeparturePort(portRepo.findByName(t.getDeparturePortName()));
		return t;
	}
	
	private List<Trip> fillAll(final List<Trip> trips) {
		for (Trip t : trips) {
			t = fill(t);
		}
		return trips;
	}
	
	public Trip tripById(final long id) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ?";
		return fill(find(query, new TripMapper(), id));
	}
	
	public List<Trip> allTrips() {
		return fillAll(list(SELECT_QUERY, new TripMapper()));
	}
	
	public List<Trip> tripByObserver(String name) {
		final String query = SELECT_QUERY + " WHERE trim(OBSV_ID) = trim(?)";
		return fillAll(list(query, new TripMapper(), name));
	}

	public List<Trip> tripByDeparturePort(String name) {
		final String query = SELECT_QUERY + " WHERE trim(DEP_PORT) = trim(?)";
		return fillAll(list(query, new TripMapper(), name));
	}
	
	public String getTripType(final long id) {
		final Map<String, Object> results = repository.rawExecute("SELECT trim(gr_id) as gr_id FROM obs_trip WHERE OBSTRIP_ID = ?", id);
		return (String)results.get("gr_id");
	}
		
	private static final class TripMapper implements RowMapper<Trip> {
		
		public Trip mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final Trip t = new Trip();
			// Not nearly as cool as JPA but then it has it's advantages too
			t.setId(rs.getLong("OBSTRIP_ID"));
			t.setProgramId(rs.getString("OBS_PRG_ID"));
			t.setObserverId(rs.getString("OBSV_ID"));
			t.setTripNumber(rs.getString("TRIPNO"));
			t.setDepartureDate(readDate(rs, "O_DEP_DATE"));
			t.setReturnDate(readDate(rs, "O_RET_DATE"));
			t.setVesselName(rs.getString("VESSELNAME"));
			t.setBoatId(rs.getLong("BOAT_ID"));
			t.setRegistrationNumber(rs.getString("REGIST_NO"));
			t.setFlagId(rs.getString("FLAG_ID"));
			t.setFleetId(rs.getString("FLEET_ID"));
			t.setGrossTonnage(rs.getDouble("GRT"));
			t.setGearType(rs.getString("GR_ID"));
			t.setDepartureId(rs.getInt("DEP_ID"));
			t.setReturnId(rs.getInt("RET_ID"));
			t.setDeparturePortName(rs.getString("DEP_PORT"));
			t.setReturnPortName(rs.getString("RET_PORT"));
			return t;
		}
	}
}
