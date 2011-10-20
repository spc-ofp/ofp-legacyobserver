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

import java.util.Collection;
import java.util.Date;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public interface ITrip {

	boolean isPurseSeineTrip();
	boolean isLongLineTrip();
	boolean isPoleAndLineTrip();
	
	long getId();
	String getProgramId();
	String getObserverId();
	String getTripNumber();
	Date getDepartureDate();
	Date getReturnDate();
	String getVesselName();
	String getRegistrationNumber();
	String getFlagId();
	String getFleetId();
	Double getGrossTonnage();
	Integer getDepartureId();
	Integer getReturnId();
	String getDeparturePortName();
	String getReturnPortName();
	FieldStaff getObserver();
	Long getBoatId();
	Vessel getBoat();
	Gen3 getGen3Report();
	Collection<Gen6Header> getPollutionReports();
	Collection<FishTransfer> getFishTransfers();
	Collection<VesselSighting> getVesselSightings();
	Collection<MarineDevice> getMarineDevices();
	Collection<Safety> getSafetyInspections();
	Collection<SpecialSpecies> getSpecialSpecies();
	Port getDeparturePort();
	Port getReturnPort();
	String getGearType();
}
