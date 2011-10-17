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
public class FieldStaffRepositoryTest {

	@Autowired
	protected FieldStaffRepository repo;
	
	private static final String DOES_EXIST = "DAB"; // Deirdre Brogan
	private static final String DOES_NOT_EXIST = "123"; // Nonsense!
	
	/**
	 * Test method for {@link org.spc.ofp.observer.domain.FieldStaffRepository#findByCode(java.lang.String)}.
	 */
	@Test
	public void testFindByCode() {
		final FieldStaff fs = repo.findByCode(DOES_EXIST);
		assertNotNull(fs);
		assertEquals(DOES_EXIST, fs.getStaffCode());
	}
	
	@Test
	@ExpectedException(java.lang.AssertionError.class)
	public void testFieldStaffByInvalidCode() {
		@SuppressWarnings("unused")
		final FieldStaff fs = repo.findByCode(DOES_NOT_EXIST);
		fail("Didn't throw ExpectedException");
	}

	/**
	 * Test method for {@link org.spc.ofp.observer.domain.FieldStaffRepository#allFieldStaff()}.
	 */
	@Test
	public void testAllFieldStaff() {
		final List<FieldStaff> staffList = repo.allFieldStaff();
		assertNotNull(staffList);
		assertFalse(staffList.isEmpty());
	}

}
