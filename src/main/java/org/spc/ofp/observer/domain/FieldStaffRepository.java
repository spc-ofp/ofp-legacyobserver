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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spc.ofp.data.Repository;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.FieldStaffRepository")
public class FieldStaffRepository extends Repository<FieldStaff> implements IFieldStaffRepository {

	// This is somewhat non-portable in that the trim() function is ANSI SQL and doesn't work with FoxPro
	private static final String SELECT_QUERY =
			"SELECT "+
			"    trim(FS.STAFF_ID) as STAFF_ID, " +
			"    trim(FS.FIRST_NAME) as FIRST_NAME, " +
			"    trim(FS.LAST_NAME) as LAST_NAME, " +
			"    trim(P.PORT_NAME) as PORT_NAME, " +
			"    trim(FS.CO_ID) as CO_ID " +
			"FROM " +
			"    FIELD_STAFF FS " +
			"        LEFT OUTER JOIN PORT P " +
			"            ON FS.BASEPORT_I = P.PORT_ID";
	
	/**
	 * @see org.spc.ofp.observer.domain.IFieldStaffRepository#findByCode(java.lang.String)
	 */
	@Override
	public FieldStaff findByCode(String staffCode) {
		final String query = SELECT_QUERY + " WHERE trim(FS.STAFF_ID) = ?";
		return find(query, new FieldStaffMapper(), staffCode);
	}

	/**
	 * @see org.spc.ofp.observer.domain.IFieldStaffRepository#allFieldStaff()
	 */
	@Override
	public List<FieldStaff> allFieldStaff() {
		return list(SELECT_QUERY, new FieldStaffMapper());
	}

	private static final class FieldStaffMapper implements RowMapper<FieldStaff> {
		
		public FieldStaff mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final FieldStaff fs = new FieldStaff();
			fs.setStaffCode(rs.getString("STAFF_ID"));
			fs.setFirstName(rs.getString("FIRST_NAME"));
			fs.setLastName(rs.getString("LAST_NAME"));
			fs.setHomePort(rs.getString("PORT_NAME"));
			fs.setHomeCountry(rs.getString("CO_ID"));
			return fs;
		}
	}
}
