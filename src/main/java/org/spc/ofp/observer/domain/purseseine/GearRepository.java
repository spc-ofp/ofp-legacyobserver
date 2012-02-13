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
@org.springframework.stereotype.Repository("observer.PurseSeineGearRepository")
public class GearRepository extends Repository<Gear> implements IGearRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    OBSTRIP_ID, " + 
		"    PB_MODEL, " + 
		"    PB_POWER, " + 
		"    PB_SPEED, " + 
		"    PW_MODEL, " + 
		"    PW_POWER, " + 
		"    PW_SPEED, " + 
		"    NET_DEPTH_M, " + 
		"    NET_DEPTH_UNIT, " + 
		"    NET_LENGTH_M, " + 
		"    NET_LENGTH_UNIT, " + 
		"    NET_STRIPS, " + 
		"    MESH_MAIN, " + 
		"    MESH_MAIN_UNIT, " + 
		"    NET_HANG, " + 
		"    BRAIL_SIZE, " + 
		"    BRAIL_SIZE2, " + 
		"    BRAIL_TYPE " + 
		"FROM " +
		"    S_GEAR ";
        
    @Override
	public List<Gear> findByTripId(final long tripId) {
    	final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? ";
    	return list(query, new GearMapper(), tripId);
	}
    
    private static final class GearMapper implements RowMapper<Gear> {

        @Override
        public Gear mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final Gear obj = new Gear();
            obj.setTripId(rs.getLong("OBSTRIP_ID")); //readInteger(rs, "OBSTRIP_ID");            
			obj.setPb_model(rs.getString("PB_MODEL")); //rs.getString("PB_MODEL");
			obj.setPb_power(readInteger(rs, "PB_POWER")); //readInteger(rs, "PB_POWER");
			obj.setPb_speed(readInteger(rs, "PB_SPEED")); //readInteger(rs, "PB_SPEED");
			obj.setPw_model(rs.getString("PW_MODEL")); //rs.getString("PW_MODEL");
			obj.setPw_power(readInteger(rs, "PW_POWER")); //readInteger(rs, "PW_POWER");
			obj.setPw_speed(readInteger(rs, "PW_SPEED")); //readInteger(rs, "PW_SPEED");
			obj.setNet_depth_(readInteger(rs, "NET_DEPTH_M")); //readInteger(rs, "NET_DEPTH_");
			obj.setNet_depth2(rs.getString("NET_DEPTH_UNIT")); //rs.getString("NET_DEPTH2");
			obj.setNet_length(readInteger(rs, "NET_LENGTH_M")); //readInteger(rs, "NET_LENGTH");
			obj.setNet_lengt2(rs.getString("NET_LENGTH_UNIT")); //rs.getString("NET_LENGT2");
			obj.setNet_strips(readInteger(rs, "NET_STRIPS")); //readInteger(rs, "NET_STRIPS");
			obj.setMesh_main(readInteger(rs, "MESH_MAIN")); //readInteger(rs, "MESH_MAIN");
			obj.setMesh_main_(rs.getString("MESH_MAIN_UNIT")); //rs.getString("MESH_MAIN_");
			obj.setNet_hang(readInteger(rs, "NET_HANG")); //readInteger(rs, "NET_HANG");
			obj.setBrail_size(readDouble(rs, "BRAIL_SIZE")); //readDouble(rs, "BRAIL_SIZE");
			obj.setBrail_siz2(readDouble(rs, "BRAIL_SIZE2")); //readDouble(rs, "BRAIL_SIZ2");
			obj.setBrail_type(rs.getString("BRAIL_TYPE")); //rs.getString("BRAIL_TYPE");
            return obj;
        }
    
    }

	
}
