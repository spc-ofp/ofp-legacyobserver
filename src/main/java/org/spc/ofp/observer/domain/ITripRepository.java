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

import java.util.List;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public interface ITripRepository {

	// The first two are necessary for data conversion
	Trip tripById(final long id);
	List<Trip> allTrips();
	
	// The rest of this is optional
	/*
	List<Trip> tripByObserver(final String value);
	List<Trip> tripByDeparturePort(final String value);
	List<Trip> tripByReturnPort(final String value);
	List<Trip> tripByObserverProgram(final String value);
	List<Trip> tripByVessel(final String value);
	List<Trip> tripByFlag(final String value);
	List<Trip> tripByFleet(final String value);
	*/

}
