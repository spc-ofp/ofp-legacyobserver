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
public class PortRepositoryTest {

	@Autowired
	protected PortRepository repo;
	
	private static final long DOES_EXIST = 67L;
	private static final String DOES_EXIST_NAME = "MajUro";
	
	/**
	 * Test method for {@link org.spc.ofp.observer.domain.PortRepository#findById(long)}.
	 */
	@Test
	public void testFindById() {
		final Port p = repo.findById(DOES_EXIST);
		assertNotNull(p);
		assertEquals(DOES_EXIST, p.getId());
	}

	/**
	 * Test method for {@link org.spc.ofp.observer.domain.PortRepository#findByName(java.lang.String)}.
	 */
	@Test
	public void testFindByName() {
		final Port p = repo.findByName(DOES_EXIST_NAME);
		assertNotNull(p);
		assertTrue(DOES_EXIST_NAME.equalsIgnoreCase(p.getName()));
	}

}
