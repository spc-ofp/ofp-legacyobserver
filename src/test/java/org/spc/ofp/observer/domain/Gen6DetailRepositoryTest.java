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
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:observer-context.xml"})
public class Gen6DetailRepositoryTest {

	@Autowired
	protected Gen6DetailRepository repo;
	
	private static final long DOES_EXIST = 260L;
	private static final long HEADER_ID = 668L;
	
	/**
	 * Test method for {@link org.spc.ofp.observer.domain.Gen6DetailRepository#findById(long)}.
	 */
	@Test
	public void testFindById() {
		final Gen6Detail g6d = repo.findById(DOES_EXIST);
		assertNotNull(g6d);
		assertEquals(DOES_EXIST, g6d.getId());
	}

	/**
	 * Test method for {@link org.spc.ofp.observer.domain.Gen6DetailRepository#findByHeaderId(long)}.
	 */
	@Test
	public void testFindByHeaderId() {
		final List<Gen6Detail> g6ds = repo.findByHeaderId(HEADER_ID);
		assertNotNull(g6ds);
		assertFalse(g6ds.isEmpty());
		assertTrue(g6ds.size() > 1);
		assertEquals(HEADER_ID, g6ds.get(0).getHeaderId());
	}

}
