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
@org.springframework.stereotype.Repository("observer.SafetyRepository")
public class SafetyRepository extends Repository<Safety> implements ISafetyRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    OBSTRIP_ID, " + 
		"    SAFETY_ID, " + 
		"    LJ_PROVID, " + 
		"    LJ_SIZEOK, " + 
		"    LJ_AVAIL, " + 
		"    NBBUOYS, " + 
		"    EPI1_TYPE, " + 
		"    EPI1_NO, " + 
		"    EPI2_TYPE, " + 
		"    EPI2_NO, " + 
		"    LR1_CAPAC, " + 
		"    LR2_CAPAC, " + 
		"    LR3_CAPAC, " + 
		"    LR4_CAPAC, " + 
		"    date(LR1_EXPIRY) as LR1_EXPIRY, " + 
		"    date(LR2_EXPIRY) as LR2_EXPIRY, " + 
		"    date(LR3_EXPIRY) as LR3_EXPIRY, " + 
		"    date(LR4_EXPIRY) as LR4_EXPIRY, " + 
		"    LR1_TYPE, " + 
		"    LR2_TYPE, " + 
		"    LR3_TYPE, " + 
		"    LR4_TYPE " + 
		"FROM " +
		"    SAFETY ";
        
    @Override
    public Safety findById(final long id) {
        final String query = SELECT_QUERY + " WHERE SAFETY_ID = ? ";
        return find(query, new SafetyMapper(), id);
    }    

	@Override
	public List<Safety> findByTripId(final long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? ";
		return list(query, new SafetyMapper(), tripId);
	}
    
    private static final class SafetyMapper implements RowMapper<Safety> {

        @Override
        public Safety mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final Safety obj = new Safety();
            obj.setId(rs.getLong("SAFETY_ID")); //readInteger(rs, "SAFETY_ID");
            obj.setTripId(rs.getLong("OBSTRIP_ID")); //readInteger(rs, "OBSTRIP_ID");			
			obj.setLj_provid(readInteger(rs, "LJ_PROVID")); //readInteger(rs, "LJ_PROVID");
			obj.setLj_sizeok(rs.getBoolean("LJ_SIZEOK")); //rs.getBoolean("LJ_SIZEOK");
			obj.setLj_avail(readInteger(rs, "LJ_AVAIL")); //readInteger(rs, "LJ_AVAIL");
			obj.setNbbuoys(readInteger(rs, "NBBUOYS")); //readInteger(rs, "NBBUOYS");
			obj.setEpi1_type(rs.getString("EPI1_TYPE")); //rs.getString("EPI1_TYPE");
			obj.setEpi1_no(readInteger(rs, "EPI1_NO")); //readInteger(rs, "EPI1_NO");
			obj.setEpi1_type(rs.getString("EPI2_TYPE")); //rs.getString("EPI2_TYPE");
			obj.setEpi2_no(readInteger(rs, "EPI2_NO")); //readInteger(rs, "EPI2_NO");
			obj.setLr1_capac(readInteger(rs, "LR1_CAPAC")); //readInteger(rs, "LR1_CAPAC");
			obj.setLr2_capac(readInteger(rs, "LR2_CAPAC")); //readInteger(rs, "LR2_CAPAC");
			obj.setLr3_capac(readInteger(rs, "LR3_CAPAC")); //readInteger(rs, "LR3_CAPAC");
			obj.setLr4_capac(readInteger(rs, "LR4_CAPAC")); //readInteger(rs, "LR4_CAPAC");
			obj.setLr1_expiry(readDate(rs, "LR1_EXPIRY")); //rs.getDate("LR1_EXPIRY");
			obj.setLr2_expiry(readDate(rs, "LR2_EXPIRY")); //rs.getDate("LR2_EXPIRY");
			obj.setLr3_expiry(readDate(rs, "LR3_EXPIRY")); //rs.getDate("LR3_EXPIRY");
			obj.setLr4_expiry(readDate(rs, "LR4_EXPIRY"));//rs.getDate("LR4_EXPIRY");
			obj.setLr1_type(rs.getString("LR1_TYPE")); //rs.getString("LR1_TYPE");
			obj.setLr2_type(rs.getString("LR2_TYPE")); //rs.getString("LR2_TYPE");
			obj.setLr3_type(rs.getString("LR3_TYPE")); //rs.getString("LR3_TYPE");
			obj.setLr4_type(rs.getString("LR4_TYPE")); //rs.getString("LR4_TYPE");
            return obj;
        }
    
    }
}
