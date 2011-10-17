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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.Gen6HeaderRepository")
public class Gen6HeaderRepository extends Repository<Gen6Header> implements IGen6HeaderRepository {

    @Autowired
    protected Gen6DetailRepository detailRepo;
	
	private static final String SELECT_QUERY =
        "SELECT " +
		"    OBSTRIP_ID, " + 
		"    POLL_H_ID, " + 
		"    date(\"DATE\") as XDATE, " + 
		"    \"TIME\" as XTIME, " + 
		"    LAT, " + 
		"    LON, " + 
		"    EZ_ID, " + 
		"    WINDDIR, " + 
		"    WINDSPEED, " + 
		"    SEACOND, " + 
		"    CURRENT, " + 
		"    CURRENTDIR, " + 
		"    ACT_ID, " + 
		"    VESSELNAME, " + 
		"    IRCS, " + 
		"    VESSELTYPE, " + 
		"    BEARING, " + 
		"    DISTANCE, " + 
		"    STICKERS, " + 
		"    MARPOL, " + 
		"    INFRINGEME, " + 
		"    PHOTOS, " + 
		"    COMMENTS " + 
		"FROM " +
		"    GEN6_POLLUTION_H ";
        
    private Gen6Header fill(final Gen6Header header) {
    	if (null == header) { return null; }
    	header.addDetails(detailRepo.findByHeaderId(header.getId()));
    	return header;
    }
    
    private List<Gen6Header> fillAll(final List<Gen6Header> headers) {
    	for (Gen6Header header : headers) {
    		header = fill(header);
    	}
    	return headers;
    }
	
	@Override
    public Gen6Header findById(final long id) {
        final String query = SELECT_QUERY + " WHERE POLL_H_ID = ? ";
        return fill(find(query, new Gen6HeaderMapper(), id));
    }
    
    @Override
	public List<Gen6Header> findByTripId(long tripId) {
    	final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? ";
    	return fillAll(list(query, new Gen6HeaderMapper(), tripId));
	}
    
    private static final class Gen6HeaderMapper implements RowMapper<Gen6Header> {

        @Override
        public Gen6Header mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final Gen6Header obj = new Gen6Header();
            obj.setId(rs.getLong("POLL_H_ID"));
            obj.setTripId(rs.getLong("OBSTRIP_ID"));
			obj.setDate(readDate(rs, "XDATE"));
			obj.setTime(rs.getString("XTIME")); //rs.getString("TIME");
			obj.setLatitude(rs.getString("LAT")); //rs.getString("LAT");
			obj.setLongitude(rs.getString("LON")); //rs.getString("LON");
			obj.setEz_id(rs.getString("EZ_ID")); //rs.getString("EZ_ID");
			obj.setWinddir(readInteger(rs, "WINDDIR")); //readInteger(rs, "WINDDIR");
			obj.setWindspeed(readInteger(rs, "WINDSPEED")); //readInteger(rs, "WINDSPEED");
			obj.setSeacond(rs.getString("SEACOND")); //rs.getString("SEACOND");
			obj.setCurrent(readDouble(rs, "CURRENT")); //readDouble(rs, "CURRENT");
			obj.setCurrentdir(readInteger(rs, "CURRENTDIR")); //readInteger(rs, "CURRENTDIR");
			obj.setAct_id(readInteger(rs, "ACT_ID")); //readInteger(rs, "ACT_ID");
			obj.setVesselname(rs.getString("VESSELNAME")); //rs.getString("VESSELNAME");
			obj.setIrcs(rs.getString("IRCS")); //rs.getString("IRCS");
			obj.setVesseltype(readInteger(rs, "VESSELTYPE")); //readInteger(rs, "VESSELTYPE");
			obj.setBearing(readInteger(rs, "BEARING")); //readInteger(rs, "BEARING");
			obj.setDistance(readDouble(rs, "DISTANCE")); //readDouble(rs, "DISTANCE");
			obj.setStickers(rs.getBoolean("STICKERS")); //rs.getBoolean("STICKERS");
			obj.setMarpol(rs.getBoolean("MARPOL")); //rs.getBoolean("MARPOL");
			obj.setInfringeme(rs.getBoolean("INFRINGEME")); //rs.getBoolean("INFRINGEME");
			obj.setPhotos(rs.getBoolean("PHOTOS")); //rs.getBoolean("PHOTOS");
			obj.setComments(rs.getString("COMMENTS")); //rs.getString("COMMENTS");
            return obj;
        }
    
    }	
}
