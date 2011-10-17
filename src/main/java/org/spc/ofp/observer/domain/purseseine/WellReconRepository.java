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
@org.springframework.stereotype.Repository("observer.WellReconRepository")
public class WellReconRepository extends Repository<WellRecon> implements IWellReconRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    LW_ID, " + 
		"    OBSTRIP_ID, " + 
		"    date(OBSDATE) as OBSDATE, " + 
		"    OBSTIME, " + 
		"    date(LOGDATE) as LOGDATE, " + 
		"    LOGTIME, " + 
		"    WELLFILL, " + 
		"    PW12, " + 
		"    PW11, " + 
		"    PW10, " + 
		"    PW9, " + 
		"    PW8, " + 
		"    PW7, " + 
		"    PW6, " + 
		"    PW5, " + 
		"    PW4, " + 
		"    PW3, " + 
		"    PW2, " + 
		"    PW1, " + 
		"    SW1, " + 
		"    SW2, " + 
		"    SW3, " + 
		"    SW4, " + 
		"    SW5, " + 
		"    SW6, " + 
		"    SW7, " + 
		"    SW8, " + 
		"    SW9, " + 
		"    SW10, " + 
		"    SW11, " + 
		"    SW12, " + 
		"    COMMENT, " + 
		"    CENTRAL1 " + 
		"FROM " +
		"    S_LOG_WELL_RECON ";
        
    @Override
    public WellRecon findById(final long id) {
        final String query = SELECT_QUERY + " WHERE LW_ID = ? ";
        return find(query, new WellReconMapper(), id);
    }

	@Override
	public List<WellRecon> findByTripId(final long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? ";
        return list(query, new WellReconMapper(), tripId);
	}
	
    private static final class WellReconMapper implements RowMapper<WellRecon> {

        @Override
        public WellRecon mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final WellRecon obj = new WellRecon();
            obj.setId(rs.getLong("LW_ID")); //readInteger(rs, "LW_ID");
			obj.setTripId(rs.getLong("OBSTRIP_ID")); //readInteger(rs, "OBSTRIP_ID");
			obj.setObsdate(readDate(rs, "OBSDATE")); //rs.getDate("OBSDATE");
			obj.setObstime(rs.getString("OBSTIME")); //rs.getString("OBSTIME");
			obj.setLogdate(readDate(rs, "LOGDATE")); //rs.getDate("LOGDATE");
			obj.setLogtime(rs.getString("LOGTIME")); //rs.getString("LOGTIME");
			obj.setWellfill(rs.getString("WELLFILL")); //rs.getString("WELLFILL");
			obj.setPw12(readDouble(rs, "PW12")); //readDouble(rs, "PW12");
			obj.setPw11(readDouble(rs, "PW11")); //readDouble(rs, "PW11");
			obj.setPw10(readDouble(rs, "PW10")); //readDouble(rs, "PW10");
			obj.setPw9(readDouble(rs, "PW9")); //readDouble(rs, "PW9");
			obj.setPw8(readDouble(rs, "PW8")); //readDouble(rs, "PW8");
			obj.setPw7(readDouble(rs, "PW7")); //readDouble(rs, "PW7");
			obj.setPw6(readDouble(rs, "PW6")); //readDouble(rs, "PW6");
			obj.setPw5(readDouble(rs, "PW5")); //readDouble(rs, "PW5");
			obj.setPw4(readDouble(rs, "PW4")); //readDouble(rs, "PW4");
			obj.setPw3(readDouble(rs, "PW3")); //readDouble(rs, "PW3");
			obj.setPw2(readDouble(rs, "PW2")); //readDouble(rs, "PW2");
			obj.setPw1(readDouble(rs, "PW1")); //readDouble(rs, "PW1");
			obj.setSw1(readDouble(rs, "SW1")); //readDouble(rs, "SW1");
			obj.setSw2(readDouble(rs, "SW2")); //readDouble(rs, "SW2");
			obj.setSw3(readDouble(rs, "SW3")); //readDouble(rs, "SW3");
			obj.setSw4(readDouble(rs, "SW4")); //readDouble(rs, "SW4");
			obj.setSw5(readDouble(rs, "SW5")); //readDouble(rs, "SW5");
			obj.setSw6(readDouble(rs, "SW6")); //readDouble(rs, "SW6");
			obj.setSw7(readDouble(rs, "SW7")); //readDouble(rs, "SW7");
			obj.setSw8(readDouble(rs, "SW8")); //readDouble(rs, "SW8");
			obj.setSw9(readDouble(rs, "SW9")); //readDouble(rs, "SW9");
			obj.setSw10(readDouble(rs, "SW10")); //readDouble(rs, "SW10");
			obj.setSw11(readDouble(rs, "SW11")); //readDouble(rs, "SW11");
			obj.setSw12(readDouble(rs, "SW12")); //readDouble(rs, "SW12");
			obj.setComment(rs.getString("COMMENT")); //rs.getString("COMMENT");
			obj.setCentral1(rs.getBoolean("CENTRAL1")); //rs.getBoolean("CENTRAL1");
            return obj;
        }
    
    }
}
