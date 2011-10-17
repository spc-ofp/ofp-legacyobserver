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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:observer-context.xml"})
public class TripRepositoryTest {

	@Autowired
	protected TripRepository repo;
	
	private static final long DOES_EXIST = 13L;
	
	/**
	 * Test method for {@link org.spc.ofp.observer.domain.TripRepository#tripById(long)}.
	 */
	@Test
	public void testTripById() {		
		final Trip t = repo.tripById(DOES_EXIST);
		assertNotNull(t);
		assertEquals(DOES_EXIST, t.getId());
		assertNotNull(t.getObserver());
		assertNotNull(t.getBoat());
		assertNotNull(t.getDeparturePort());
		assertNotNull(t.getReturnPort());
	}
	
	@Test
	public void testTripType() {
		final String tripType = repo.getTripType(8542L);
		assertNotNull(tripType);
		assertEquals("S", tripType);
	}

	/**
	 * Test method for {@link org.spc.ofp.observer.domain.TripRepository#allTrips()}.
	 */
	@Test
	@Ignore("Too resource intensive...")
	public void testAllTrips() {
		final List<Trip> trips = repo.allTrips();
		assertNotNull(trips);
		assertFalse(trips.isEmpty());
	}

}
