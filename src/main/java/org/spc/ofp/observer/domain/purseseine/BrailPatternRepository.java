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
@org.springframework.stereotype.Repository("observer.BrailPatternRepository")
public class BrailPatternRepository extends Repository<BrailPattern> implements IBrailPatternRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    S_ALOG_ID, " + 
		"    S_LFREQ_ID, " + 
		"    BP_ID, " + 
		"    PATTERN, " + 
		"    FULLNESS, " + 
		"    SAMPLES " + 
		"FROM " +
		"    PS4_BRAILPATTERN ";
        
    @Override
    public BrailPattern findById(final long id) {
        final String query = SELECT_QUERY + " WHERE BP_ID = ? ";
        return find(query, new BrailPatternMapper(), id);
    }
    
    @Override
	public List<BrailPattern> findByDaylogId(final long s_alog_id) {
    	final String query = SELECT_QUERY + " WHERE S_ALOG_ID = ? ";
		return list(query, new BrailPatternMapper(), s_alog_id);
	}
    
    private static final class BrailPatternMapper implements RowMapper<BrailPattern> {

        @Override
        public BrailPattern mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final BrailPattern obj = new BrailPattern();
            obj.setId(rs.getLong("BP_ID")); //readInteger(rs, "BP_ID");
            obj.setDayLogId(rs.getLong("S_ALOG_ID")); //readInteger(rs, "S_ALOG_ID");
			obj.setS_lfreq_id(readInteger(rs, "S_LFREQ_ID")); //readInteger(rs, "S_LFREQ_ID");			
			obj.setPattern(readInteger(rs, "PATTERN")); //readInteger(rs, "PATTERN");
			obj.setFullness(readInteger(rs, "FULLNESS")); //readInteger(rs, "FULLNESS");
			obj.setSamples(readInteger(rs, "SAMPLES")); //readInteger(rs, "SAMPLES");
            return obj;
        }
    
    }
}
