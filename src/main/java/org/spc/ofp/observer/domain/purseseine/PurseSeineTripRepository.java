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
package org.spc.ofp.observer.domain.purseseine;

import org.spc.ofp.data.Repository;
import org.spc.ofp.observer.domain.Trip;
import org.spc.ofp.observer.domain.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.PurseSeineTripRepository")
public class PurseSeineTripRepository extends Repository<PurseSeineTrip>
		implements IPurseSeineTripRepository {

	@Autowired
	protected TripRepository tripRepo;
	
	@Autowired
	protected DayLogRepository dayLogRepo;
	
	@Autowired
	protected CrewRepository crewRepo;
	
	@Autowired
	protected FishingDayRepository fishingDayRepo;
	
	@Autowired
	protected GearRepository gearRepo;
	
	@Autowired
	protected SetCatchRepository setCatchRepo;
	
	@Autowired
	protected VesselAttributeRepository vesselAttributeRepo;
	
	@Autowired
	protected WellContentRepository wellContentRepo;
	
	@Autowired
	protected WellReconRepository wellReconRepo;
	
	/*
	 *private List<DayLog> daylogs = new ArrayList<DayLog>();
	private List<Crew> crewList = new ArrayList<Crew>();
	private List<FishingDay> fishingDays = new ArrayList<FishingDay>();
	private List<Gear> gearList = new ArrayList<Gear>();
	private List<SetCatch> setCatchList = new ArrayList<SetCatch>();
	private List<VesselAttribute> vesselAttributes = new ArrayList<VesselAttribute>();
	private List<WellContent> wellContents = new ArrayList<WellContent>();
	private List<WellRecon> wellReconList = new ArrayList<WellRecon>();
	 */
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.purseseine.IPurseSeineTripRepository#findById(long)
	 */
	@Override
	public PurseSeineTrip findById(final long tripId) {
		final Trip t = tripRepo.tripById(tripId);
		if (null == t) { return null; }
		final PurseSeineTrip pst = new PurseSeineTrip(t);
		pst.addDayLogs(dayLogRepo.findByTripId(tripId));
		pst.addCrew(crewRepo.findByTripId(tripId));
		pst.addFishingDays(fishingDayRepo.findByTripId(tripId));
		pst.addGear(gearRepo.findByTripId(tripId));
		pst.addSetCatch(setCatchRepo.findByTripId(tripId));
		pst.addVesselAttributes(vesselAttributeRepo.findByTripId(tripId));
		pst.addWellContents(wellContentRepo.findByTripId(tripId));
		pst.addWellRecon(wellReconRepo.findByTripId(tripId));
		return pst;
	}

}
