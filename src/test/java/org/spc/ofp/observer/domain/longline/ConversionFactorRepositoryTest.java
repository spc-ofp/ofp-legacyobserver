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

import static org.junit.Assert.*;

import java.util.List;

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
public class ConversionFactorRepositoryTest {

	@Autowired
	protected ConversionFactorRepository repo;
	
	private static final long DOES_EXIST = 1335L;
	private static final long TRIP_ID = 523L;
	
	/**
	 * Test method for {@link org.spc.ofp.observer.domain.longline.ConversionFactorRepository#findByTrip(long)}.
	 */
	@Test
	public void testFindByTrip() {
		final List<ConversionFactor> cfl = repo.findByTrip(TRIP_ID);
		assertNotNull(cfl);
		assertFalse(cfl.isEmpty());
		assertEquals(TRIP_ID, cfl.get(0).getTripId());
	}

	/**
	 * Test method for {@link org.spc.ofp.observer.domain.longline.ConversionFactorRepository#findByTripAndSetHaul(long, long)}.
	 */
	@Test
	public void testFindByTripAndSetHaul() {
		final List<ConversionFactor> cfl = repo.findByTripAndSetHaul(TRIP_ID, DOES_EXIST);
		assertNotNull(cfl);
		assertFalse(cfl.isEmpty());
		assertEquals(TRIP_ID, cfl.get(0).getTripId());
		assertEquals(DOES_EXIST, cfl.get(0).getSetHaulId());
	}

}
