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

import org.spc.ofp.data.Repository;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.PortRepository")
public class PortRepository extends Repository<Port> implements IPortRepository {

	private static final String SELECT_QUERY =
			"SELECT " +
	        "    PORT_ID, " +
	        "    trim(PORT_NAME) as PORT_NAME, " +
		    "    trim(CO_ID) as CO_ID " +
		    "FROM " +
		    "    PORT ";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IPortRepository#findById(long)
	 */
	@Override
	public Port findById(final long id) {
		final String query = SELECT_QUERY + " WHERE PORT_ID = ?";
		return find(query, new PortMapper(), id);
	}

	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IPortRepository#findByName(java.lang.String)
	 */
	@Override
	public Port findByName(final String name) {
		final String query = SELECT_QUERY + " WHERE trim(PORT_NAME) = trim(?)";
		return find(query, new PortMapper(), name.trim().toUpperCase());
	}
	
	private static final class PortMapper implements RowMapper<Port> {

		@Override
		public Port mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final Port p = new Port();
			p.setId(rs.getLong("PORT_ID"));
			p.setName(rs.getString("PORT_NAME"));
			p.setCountryCode(rs.getString("CO_ID"));
			return p;
		}
		
	}

}
