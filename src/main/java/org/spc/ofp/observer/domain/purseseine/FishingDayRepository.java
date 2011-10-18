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
@org.springframework.stereotype.Repository("observer.FishingDayRepository")
public class FishingDayRepository extends Repository<FishingDay> implements IFishingDayRepository {

    @Autowired
    protected DayLogRepository daylogRepo;
	
	private static final String SELECT_QUERY =
        "SELECT " +
		"    OBSTRIP_ID, " + 
		"    S_DAY_ID, " + 
		"    date(DAYDATE) as DAYDATE, " + 
		"    DAYTIME, " + 
		"    date(UTC_DATE) as UTC_DATE, " + 
		"    UTC_TIME, " + 
		"    LOGNOFSH, " + 
		"    LOG_FSH, " + 
		"    SCH_FSH, " + 
		"    FAD_FSH, " + 
		"    FADNOFSH " + 
		"FROM " +
		"    S_DAY ";
    
    private FishingDay fill(final FishingDay fd) {
    	fd.addActivities(daylogRepo.findByDayId(fd.getId()));
    	return fd;
    }
    
    private List<FishingDay> fillAll(final List<FishingDay> fdl) {
    	for (FishingDay fd : fdl) {
    		fd = fill(fd);
    	}
    	return fdl;
    }
        
    @Override
    public FishingDay findById(final long id) {
        final String query = SELECT_QUERY + " WHERE S_DAY_ID = ? ";
        return fill(find(query, new FishingDayMapper(), id));
    }
    
    @Override
	public List<FishingDay> findByTripId(final long tripId) {
    	final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? ";
        return fillAll(list(query, new FishingDayMapper(), tripId));
	}
    
    private static final class FishingDayMapper implements RowMapper<FishingDay> {

        @Override
        public FishingDay mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final FishingDay obj = new FishingDay();
            obj.setId(rs.getLong("S_DAY_ID")); //readInteger(rs, "S_DAY_ID");
            obj.setTripId(rs.getLong("OBSTRIP_ID")); //readInteger(rs, "OBSTRIP_ID");			
			obj.setDaydate(readDate(rs, "DAYDATE")); //rs.getDate("DAYDATE");
			obj.setDaytime(rs.getString("DAYTIME")); //rs.getString("DAYTIME");
			obj.setUtc_date(readDate(rs, "UTC_DATE")); //rs.getDate("UTC_DATE");
			obj.setUtc_time(rs.getString("UTC_TIME")); //rs.getString("UTC_TIME");
			obj.setLognofsh(readInteger(rs, "LOGNOFSH")); //readInteger(rs, "LOGNOFSH");
			obj.setLog_fsh(readInteger(rs, "LOG_FSH")); //readInteger(rs, "LOG_FSH");
			obj.setSch_fsh(readInteger(rs, "SCH_FSH")); //readInteger(rs, "SCH_FSH");
			obj.setFad_fsh(readInteger(rs, "FAD_FSH")); //readInteger(rs, "FAD_FSH");
			obj.setFadnofsh(readInteger(rs, "FADNOFSH")); //readInteger(rs, "FADNOFSH");
            return obj;
        }
    
    }	
}
