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
public class CrewRepositoryTest {

	@Autowired
	protected CrewRepository repo;
	
	private static final long DOES_EXIST = 757L;
	private static final long TRIP_ID = 8830L;
	
	/**
	 * Test method for {@link org.spc.ofp.observer.domain.purseseine.CrewRepository#findById(long)}.
	 */
	@Test
	public void testFindById() {
		final Crew c = repo.findById(DOES_EXIST);
		assertNotNull(c);
		assertEquals(DOES_EXIST, c.getId());
	}

	/**
	 * Test method for {@link org.spc.ofp.observer.domain.purseseine.CrewRepository#findByTripId(long)}.
	 */
	@Test
	public void testFindByTripId() {
		final List<Crew> cl = repo.findByTripId(TRIP_ID);
		assertNotNull(cl);
		assertFalse(cl.isEmpty());
		assertTrue(cl.size() > 3);
		assertEquals(TRIP_ID, cl.get(0).getTripId());		
	}

}
