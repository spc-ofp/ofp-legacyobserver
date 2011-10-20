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
package org.spc.ofp.observer.domain.longline;

import org.spc.ofp.observer.domain.Trip;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class LongLineTrip extends Trip {

	public LongLineTrip() {}
	
	public LongLineTrip(final Trip t) {
		this.boat = t.getBoat();
		this.boatId = t.getBoatId();
		this.departureDate = t.getDepartureDate();
		this.departureId = t.getDepartureId();
		this.departurePort = t.getDeparturePort();
		this.flagId = t.getFlagId();
		this.fleetId = t.getFleetId();
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
	}
}
