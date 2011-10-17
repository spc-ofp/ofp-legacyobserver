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

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:observer-context.xml"})
public class ElectronicsRepositoryTest {

	@Autowired
	protected ElectronicsRepository repo;
	
	private static final long DOES_EXIST = 5L;
	private static final long DOES_NOT_EXIST = 999L;
	private static final long TRIP_ID = 1744L;
	
	/**
	 * Test method for {@link org.spc.ofp.observer.domain.ElectronicsRepository#findById(long)}.
	 */
	@Test
	public void testFindById() {
		final List<Electronics> e = repo.findById(DOES_EXIST);
		assertNotNull(e);
		assertFalse(e.isEmpty());
		assertEquals(DOES_EXIST, e.get(0).getId());
	}
	
	@Test
	@ExpectedException(java.lang.AssertionError.class)
	public void testFindByInvalidId() {
		@SuppressWarnings("unused")
		final List<Electronics> e = repo.findById(DOES_NOT_EXIST);
		fail();
	}

	/**
	 * Test method for {@link org.spc.ofp.observer.domain.ElectronicsRepository#findByTrip(long)}.
	 */
	@Test
	public void testFindByTrip() {
		final List<Electronics> list = repo.findByTripId(TRIP_ID);
		assertNotNull(list);
		assertFalse(list.isEmpty());
		assertEquals(TRIP_ID, list.get(0).getTripId());
	}

}
