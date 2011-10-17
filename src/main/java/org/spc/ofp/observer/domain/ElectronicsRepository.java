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
@org.springframework.stereotype.Repository("observer.ElectronicsRepository")
public class ElectronicsRepository extends Repository<Electronics> implements IElectronicsRepository {

	private static final String SELECT_QUERY =
		"SELECT " +
        "    DEVICE_ID, " +
        "    OBSTRIP_ID, " +
	    "    YESNO, " +
	    "    USAGE, " +
	    "    MAKE_DESC, " +
	    "    MODEL_DESC, " +
	    "    COMMENT " +
	    "FROM " +
	    "    ELECTRONICS ";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IElectronicsRepository#findById(long)
	 */
	@Override
	public List<Electronics> findById(final long id) {
		final String query = SELECT_QUERY + " WHERE DEVICE_ID = ?";
		return list(query, new ElectronicsMapper(), id);
	}

	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IElectronicsRepository#findByTrip(long)
	 */
	@Override
	public List<Electronics> findByTripId(final long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ?";
		return list(query, new ElectronicsMapper(), tripId);
	}
	
	private static final class ElectronicsMapper implements RowMapper<Electronics> {

		@Override
		public Electronics mapRow(final ResultSet rs, final int rowNum) throws SQLException {
		    final Electronics e = new Electronics();
		    e.setId(rs.getLong("DEVICE_ID"));
		    e.setTripId(rs.getLong("OBSTRIP_ID"));
		    e.setYesno(rs.getString("YESNO"));
		    e.setUsage(rs.getString("USAGE"));
		    e.setMake_desc(rs.getString("MAKE_DESC"));
		    e.setModel_desc(rs.getString("MODEL_DESC"));
		    e.setComment(rs.getString("COMMENT"));
		    return e;
		}
		
	}

}
