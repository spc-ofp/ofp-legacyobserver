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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.spc.ofp.observer.domain.Trip;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class PurseSeineTrip extends Trip {

	// Purse Seine data collections
	// NOTE Some of these items are subordinate to other items.  However,
	// if the base table exposes the trip ID, we'll use it to recover the data
	// here unless and until it becomes a problem.
	private List<DayLog> daylogs = new ArrayList<DayLog>();
	private List<Crew> crewList = new ArrayList<Crew>();
	private List<FishingDay> fishingDays = new ArrayList<FishingDay>();
	private List<Gear> gearList = new ArrayList<Gear>();
	private List<SetCatch> setCatchList = new ArrayList<SetCatch>();
	private List<VesselAttribute> vesselAttributes = new ArrayList<VesselAttribute>();
	private List<WellContent> wellContents = new ArrayList<WellContent>();
	private List<WellRecon> wellReconList = new ArrayList<WellRecon>();
	
	public PurseSeineTrip() {}
	
	// Copy constructor
	public PurseSeineTrip(final Trip t) {
		this.boat = t.getBoat();
		this.boatId = t.getBoatId();
		this.departureDate = t.getDepartureDate();
		this.departureId = t.getDepartureId();
		this.departurePort = t.getDeparturePort();
		this.flagId = t.getFlagId();
		this.fleetId = t.getFleetId();
		this.gearType = t.getGearType();
		this.grossTonnage = t.getGrossTonnage();
		this.id = t.getId();
		this.observer = t.getObserver();
		this.observerId = t.getObserverId();
		this.programId = t.getProgramId();
		this.registrationNumber = t.getRegistrationNumber();
		this.returnDate = t.getReturnDate();
		this.returnPort = t.getReturnPort();
		this.tripNumber = t.getTripNumber();
		this.vesselName = t.getVesselName();
		// Add any domain objects
		this.gen3Report = t.getGen3Report();
		this.electronics = t.getElectronics();
		this.fishTransfers = t.getFishTransfers();
		this.vesselSightings = t.getVesselSightings();
		this.marineDevices = t.getMarineDevices();
		this.safetyInspections = t.getSafetyInspections();
		this.specialSpecies = t.getSpecialSpecies();
	}
	
	public boolean addDayLog(final DayLog dayLog) {
		return daylogs.add(dayLog);
	}
	
	public boolean addDayLogs(final Collection<DayLog> dll) {
		return daylogs.addAll(dll);
	}
	
	public boolean addCrew(final Crew crew) {
		return crewList.add(crew);
	}
	
	public boolean addCrew(final Collection<Crew> cl) {
		return crewList.addAll(cl);
	}
	
	public boolean addFishingDay(final FishingDay fd) {
		return fishingDays.add(fd);
	}
	
	public boolean addFishingDays(final Collection<FishingDay> fdl) {
		return fishingDays.addAll(fdl);
	}
	
	public boolean addGear(final Gear gear) {
		return gearList.add(gear);
	}
	
	public boolean addGear(final Collection<Gear> gl) {
		return gearList.addAll(gl);
	}
	
	public boolean addSetCatch(final SetCatch sc) {
		return setCatchList.add(sc);
	}
	
	public boolean addSetCatch(final Collection<SetCatch> scl) {
		return setCatchList.addAll(scl);
	}
	
	public boolean addVesselAttribute(final VesselAttribute va) {
		return vesselAttributes.add(va);
	}
	
	public boolean addVesselAttributes(final Collection<VesselAttribute> val) {
		return vesselAttributes.addAll(val);
	}
	
	public boolean addWellContent(final WellContent wc) {
		return wellContents.add(wc);
	}
	
	public boolean addWellContents(final Collection<WellContent> wcl) {
		return wellContents.addAll(wcl);
	}
	
	public boolean addWellRecon(final WellRecon wr) {
		return wellReconList.add(wr);
	}
	
	public boolean addWellRecon(final Collection<WellRecon> wrl) {
		return wellReconList.addAll(wrl);
	}

	public List<DayLog> getDaylogs() {
		return daylogs;
	}

	public List<Crew> getCrewList() {
		return crewList;
	}

	public List<FishingDay> getFishingDays() {
		return fishingDays;
	}

	public List<Gear> getGearList() {
		return gearList;
	}

	public List<SetCatch> getSetCatchList() {
		return setCatchList;
	}

	public List<VesselAttribute> getVesselAttributes() {
		return vesselAttributes;
	}

	public List<WellContent> getWellContents() {
		return wellContents;
	}

	public List<WellRecon> getWellReconList() {
		return wellReconList;
	}
}
