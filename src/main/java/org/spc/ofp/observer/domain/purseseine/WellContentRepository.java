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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spc.ofp.data.Repository;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.WellContentRepository")
public class WellContentRepository extends Repository<WellContent> implements IWellContentRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    OBSTRIP_ID, " + 
		"    WC_ID, " + 
		"    FUEL_WATER, " + 
		"    W_NO, " + 
		"    PS, " + 
		"    W_CAP, " + 
		"    COMMENTS " + 
		"FROM " +
		"    PS1_WELLCONTENT ";
        
    @Override
    public WellContent findById(final long id) {
        final String query = SELECT_QUERY + " WHERE WC_ID = ? ";
        return find(query, new WellContentMapper(), id);
    }

	@Override
	public List<WellContent> findByTripId(final long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? ";
        return list(query, new WellContentMapper(), tripId);
	}
    
    private static final class WellContentMapper implements RowMapper<WellContent> {

        @Override
        public WellContent mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final WellContent obj = new WellContent();
            obj.setId(rs.getLong("WC_ID")); //readInteger(rs, "WC_ID");
            obj.setTripId(rs.getLong("OBSTRIP_ID")); //readInteger(rs, "OBSTRIP_ID");			
			obj.setFuel_water(readInteger(rs, "FUEL_WATER")); //readInteger(rs, "FUEL_WATER");
			obj.setW_no(readInteger(rs, "W_NO")); //readInteger(rs, "W_NO");
			obj.setPs(readInteger(rs, "PS")); //readInteger(rs, "PS");
			obj.setW_cap(readDouble(rs, "W_CAP")); //readDouble(rs, "W_CAP");
			obj.setComments(rs.getString("COMMENTS")); //rs.getString("COMMENTS");
            return obj;
        }
    
    }
}
