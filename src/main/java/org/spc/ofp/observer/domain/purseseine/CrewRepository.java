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
@org.springframework.stereotype.Repository("observer.CrewRepository")
public class CrewRepository extends Repository<Crew> implements ICrewRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    OBSTRIP_ID, " + 
		"    CREW_ID, " + 
		"    POSITION_I, " + 
		"    NAME, " + 
		"    FLAG_ID, " + 
		"    EXP_YR, " + 
		"    EXP_MO, " + 
		"    COMMENTS " + 
		"FROM " +
		"    PS1_CREW ";
        
    @Override
    public Crew findById(final long id) {
        final String query = SELECT_QUERY + " WHERE CREW_ID = ? ";
        return find(query, new CrewMapper(), id);
    }
    
    @Override
	public List<Crew> findByTripId(final long tripId) {
    	final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? ";
		return list(query, new CrewMapper(), tripId);
	}
    
    private static final class CrewMapper implements RowMapper<Crew> {

        @Override
        public Crew mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final Crew obj = new Crew();
            obj.setId(rs.getLong("CREW_ID")); //readInteger(rs, "CREW_ID");
            obj.setTripId(rs.getLong("OBSTRIP_ID")); //readInteger(rs, "OBSTRIP_ID");			
			obj.setPosition_i(rs.getString("POSITION_I")); //rs.getString("POSITION_I");
			obj.setName(rs.getString("NAME")); //rs.getString("NAME");
			obj.setFlag_id(rs.getString("FLAG_ID")); //rs.getString("FLAG_ID");
			obj.setExp_yr(readInteger(rs, "EXP_YR")); //readInteger(rs, "EXP_YR");
			obj.setExp_mo(readInteger(rs, "EXP_MO")); //readInteger(rs, "EXP_MO");
			obj.setComments(rs.getString("COMMENTS")); //rs.getString("COMMENTS");
            return obj;
        }
    
    }
}
