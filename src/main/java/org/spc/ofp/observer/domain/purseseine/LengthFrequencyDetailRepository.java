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
@org.springframework.stereotype.Repository("observer.LengthFrequencyDetailRepository")
public class LengthFrequencyDetailRepository extends Repository<LengthFrequencyDetail> implements ILengthFrequencyDetailRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    S_ALOG_ID, " + 
		"    S_LFREQ_ID, " + 
		"    SAMPLE_NO, " + 
		"    SP_ID, " + 
		"    LEN " + 
		"FROM " +
		"    S_LFREQ ";
    
    @Override
	public List<LengthFrequencyDetail> findByDayLogId(final long dayLogId) {
    	final String query = SELECT_QUERY + " WHERE S_ALOG_ID = ? ";
    	return list(query, new LengthFrequencyDetailMapper(), dayLogId);
	}
    
    @Override
	public List<LengthFrequencyDetail> findByHeaderId(final long headerId) {
    	final String query = SELECT_QUERY + " WHERE S_LFREQ_ID = ? ";
    	return list(query, new LengthFrequencyDetailMapper(), headerId);
	}
    
    private static final class LengthFrequencyDetailMapper implements RowMapper<LengthFrequencyDetail> {

        @Override
        public LengthFrequencyDetail mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final LengthFrequencyDetail obj = new LengthFrequencyDetail();
            obj.setDayLogId(rs.getLong("S_ALOG_ID")); //readInteger(rs, "S_ALOG_ID");           
			obj.setHeaderId(readInteger(rs, "S_LFREQ_ID")); //readInteger(rs, "S_LFREQ_ID");
			obj.setSample_no(readInteger(rs, "SAMPLE_NO")); //readInteger(rs, "SAMPLE_NO");
			obj.setSp_id(rs.getString("SP_ID")); //rs.getString("SP_ID");
			obj.setLen(readInteger(rs, "LEN")); //readInteger(rs, "LEN");
            return obj;
        }
    
    }

	

	
}
