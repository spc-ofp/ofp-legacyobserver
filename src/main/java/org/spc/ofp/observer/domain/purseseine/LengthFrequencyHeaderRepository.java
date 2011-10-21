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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.LengthFrequencyHeaderRepository")
public class LengthFrequencyHeaderRepository extends Repository<LengthFrequencyHeader> implements ILengthFrequencyHeaderRepository {

    @Autowired
    protected LengthFrequencyDetailRepository detailRepo;
	
	private static final String SELECT_QUERY =
        "SELECT " +
		"    S_ALOG_ID, " + 
		"    PAGE_NO, " + 
		"    S_LFREQ_ID, " + 
		"    TBRAIL, " + 
		"    NBRAIL, " + 
		"    BRAIL_FULL, " + 
		"    BRAIL_78, " + 
		"    BRAIL_34, " + 
		"    BRAIL_23, " + 
		"    BRAIL_12, " + 
		"    BRAIL_13, " + 
		"    BRAIL_14, " + 
		"    BRAIL_18, " + 
		"    FISH_BRL, " + 
		"    MEASURE, " + 
		"    PROTOCOL, " + 
		"    SUM_BRAILS, " + 
		"    PROT_COMME, " + 
		"    OTHERSAMP, " + 
		"    SAMPTYPE, " + 
		"    WHICHBRAIL, " + 
		"    NBFORMUSED, " + 
		"    TOTUSED, " + 
		"    ENTEREDBY, " + 
		"    datetime(INSERTTIME) as INSERTTIME " + 
		"FROM " +
		"    S_LF_H ";
        
    private LengthFrequencyHeader fill(final LengthFrequencyHeader lfh) {
    	if (null == lfh) { return null; }
    	lfh.addDetails(detailRepo.findByHeaderId(lfh.getId()));
    	return lfh;
    }
    
    private List<LengthFrequencyHeader> fillAll(final List<LengthFrequencyHeader> lfhl) {
    	for (LengthFrequencyHeader lfh : lfhl) {
    		lfh = fill(lfh);
    	}
    	return lfhl;
    }
	
	@Override
    public LengthFrequencyHeader findById(final long id) {
        final String query = SELECT_QUERY + " WHERE S_LFREQ_ID = ? ";
        return fill(find(query, new LengthFrequencyHeaderMapper(), id));
    }

	@Override
	public List<LengthFrequencyHeader> findByDayLogId(final long dayLogId) {
		final String query = SELECT_QUERY + " WHERE S_ALOG_ID = ? ";
        return fillAll(list(query, new LengthFrequencyHeaderMapper(), dayLogId));
	}
	
    private static final class LengthFrequencyHeaderMapper implements RowMapper<LengthFrequencyHeader> {

        @Override
        public LengthFrequencyHeader mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final LengthFrequencyHeader obj = new LengthFrequencyHeader();
            obj.setId(rs.getLong("S_LFREQ_ID")); //readInteger(rs, "S_LFREQ_ID");
            obj.setDayLogId(rs.getLong("S_ALOG_ID")); //readInteger(rs, "S_ALOG_ID");
			
            obj.setPage_no(readInteger(rs, "PAGE_NO")); //readInteger(rs, "PAGE_NO");			
			obj.setTbrail(readInteger(rs, "TBRAIL")); //readInteger(rs, "TBRAIL");
			obj.setNbrail(readInteger(rs, "NBRAIL")); //readInteger(rs, "NBRAIL");
			obj.setBrail_full(readInteger(rs, "BRAIL_FULL")); //readInteger(rs, "BRAIL_FULL");
			obj.setBrail_78(readInteger(rs, "BRAIL_78")); //readInteger(rs, "BRAIL_78");
			obj.setBrail_34(readInteger(rs, "BRAIL_34")); //readInteger(rs, "BRAIL_34");
			obj.setBrail_23(readInteger(rs, "BRAIL_23")); //readInteger(rs, "BRAIL_23");
			obj.setBrail_12(readInteger(rs, "BRAIL_12")); //readInteger(rs, "BRAIL_12");
			obj.setBrail_13(readInteger(rs, "BRAIL_13")); //readInteger(rs, "BRAIL_13");
			obj.setBrail_14(readInteger(rs, "BRAIL_14")); //readInteger(rs, "BRAIL_14");
			obj.setBrail_18(readInteger(rs, "BRAIL_18")); //readInteger(rs, "BRAIL_18");
			obj.setFish_brl(readInteger(rs, "FISH_BRL")); //readInteger(rs, "FISH_BRL");
			obj.setMeasure(rs.getString("MEASURE")); //rs.getString("MEASURE");
			obj.setProtocol(rs.getString("PROTOCOL")); //rs.getString("PROTOCOL");
			obj.setSum_brails(readDouble(rs, "SUM_BRAILS")); //readDouble(rs, "SUM_BRAILS");
			obj.setProt_comme(rs.getString("PROT_COMME")); //rs.getString("PROT_COMME");
			obj.setOthersamp(rs.getString("OTHERSAMP")); //rs.getString("OTHERSAMP");
			obj.setSamptype(readInteger(rs, "SAMPTYPE")); //readInteger(rs, "SAMPTYPE");
			obj.setWhichbrail(readInteger(rs, "WHICHBRAIL")); //readInteger(rs, "WHICHBRAIL");
			obj.setNbformused(readInteger(rs, "NBFORMUSED")); //readInteger(rs, "NBFORMUSED");
			obj.setTotused(readInteger(rs, "TOTUSED")); //readInteger(rs, "TOTUSED");
			obj.setEnteredby(rs.getString("ENTEREDBY")); //rs.getString("ENTEREDBY");
			obj.setInserttime(readTimestamp(rs, "INSERTTIME")); //rs.getNone("INSERTTIME");
            return obj;
        }
    
    }
}
