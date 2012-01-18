/*
 * Copyright (C) 2012 Secretariat of the Pacific Community
 *
 * This file is part of LegacyObserverData.
 *
 * TUBS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LegacyObserverData is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with LegacyObserverData.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spc.ofp.observer.domain.purseseine;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class DayLogComparableTest {

	/**
	 * Test method for {@link org.spc.ofp.observer.domain.purseseine.DayLogComparable#compare(org.spc.ofp.observer.domain.purseseine.DayLog, org.spc.ofp.observer.domain.purseseine.DayLog)}.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testCompare() {
		final DayLogComparable comparer = new DayLogComparable();
		assertEquals(0, comparer.compare(null, null));
		assertEquals(0, comparer.compare(null, new DayLog()));
		assertEquals(0, comparer.compare(new DayLog(), null));
		
		// If the dates are the same but there's no time, then nothing can be done
		final DayLog d1 = new DayLog();
		d1.setActdate(new Date(100, 0, 1));
		final DayLog d2 = new DayLog();
		d2.setActdate(new Date(100, 0, 1));
		assertEquals(0, comparer.compare(d1, d2));
		
		// Set different times
		d1.setActtime("0600");
		d2.setActtime("1200");
		assertEquals(-1, comparer.compare(d1, d2));
		
		// Change the date and time for d2
		d2.setActdate(new Date(100, 0, 2));
		d2.setActtime("0559");
		assertEquals(-1, comparer.compare(d1, d2));
		
	}

}
