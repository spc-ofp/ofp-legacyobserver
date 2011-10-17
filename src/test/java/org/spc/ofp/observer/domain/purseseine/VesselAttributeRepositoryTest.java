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
public class VesselAttributeRepositoryTest {

	@Autowired
	protected VesselAttributeRepository repo;
	
	private static final long TRIP_ID = 8830L;
	
	/**
	 * Test method for {@link org.spc.ofp.observer.domain.purseseine.VesselAttributeRepository#findByTripId(long)}.
	 */
	@Test
	@Ignore("s_vess_attr hasn't been migrated yet")
	public void testFindByTripId() {
		final List<VesselAttribute> val = repo.findByTripId(TRIP_ID);
		assertNotNull(val);
		assertFalse(val.isEmpty());
		assertEquals(TRIP_ID, val.get(0).getTripId());
	}

}
