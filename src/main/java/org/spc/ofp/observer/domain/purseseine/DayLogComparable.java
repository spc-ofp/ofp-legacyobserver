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

import java.util.Comparator;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class DayLogComparable implements Comparator<DayLog> {

	@Override
	public int compare(final DayLog o1, final DayLog o2) {
		if (null == o1 || null == o2) { return 0; }
		if (null == o1.getActdate() || null == o2.getActdate()) {
			return 0;
		}
		final int dateCompare = o1.getActdate().compareTo(o2.getActdate());
		if (0 == dateCompare) {
			if (null != o1.getActtime() && null != o2.getActtime()) {
				return o1.getActtime().compareToIgnoreCase(o2.getActtime());
			}
		}
		return dateCompare;
	}

}
