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
@org.springframework.stereotype.Repository("observer.VesselAttributeRepository")
public class VesselAttributeRepository extends Repository<VesselAttribute> implements IVesselAttributeRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    OBSTRIP_ID, " + 
		"    BOAT_ID, " + 
		"    OWNER, " + 
		"    N_SPEED, " + 
		"    N_TOW, " + 
		"    TENDERBOAT, " + 
		"    N_LIGHT, " + 
		"    SKIFF_HP, " + 
		"    SKIFF_MAKE, " + 
		"    V_SPEED, " + 
		"    HELI_MAKE, " + 
		"    HELI_MODEL, " + 
		"    HELI_REG_N, " + 
		"    HELI_RANGE, " + 
		"    HELI_RANG2, " + 
		"    HELI_COLR, " + 
		"    HELI_NBVES " + 
		"FROM " +
		"    S_VESS_ATTR ";
        
    @Override
    public List<VesselAttribute> findByTripId(final long tripId) {
        final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? ";
        return list(query, new VesselAttributeMapper(), tripId);
    }
    
    private static final class VesselAttributeMapper implements RowMapper<VesselAttribute> {

        @Override
        public VesselAttribute mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final VesselAttribute obj = new VesselAttribute();
            obj.setTripId(rs.getLong("OBSTRIP_ID")); //readInteger(rs, "OBSTRIP_ID");
			obj.setBoat_id(readInteger(rs, "BOAT_ID")); //readInteger(rs, "BOAT_ID");
			obj.setOwner(rs.getString("OWNER")); //rs.getString("OWNER");
			obj.setN_speed(readInteger(rs, "N_SPEED")); //readInteger(rs, "N_SPEED");
			obj.setN_tow(readInteger(rs, "N_TOW")); //readInteger(rs, "N_TOW");
			obj.setTenderboat(rs.getBoolean("TENDERBOAT")); //rs.getBoolean("TENDERBOAT");
			obj.setN_light(readInteger(rs, "N_LIGHT")); //readInteger(rs, "N_LIGHT");
			obj.setSkiff_hp(readInteger(rs, "SKIFF_HP")); //readInteger(rs, "SKIFF_HP");
			obj.setSkiff_make(rs.getString("SKIFF_MAKE")); //rs.getString("SKIFF_MAKE");
			obj.setV_speed(readDouble(rs, "V_SPEED")); //readDouble(rs, "V_SPEED");
			obj.setHeli_make(rs.getString("HELI_MAKE")); //rs.getString("HELI_MAKE");
			obj.setHeli_model(rs.getString("HELI_MODEL")); //rs.getString("HELI_MODEL");
			obj.setHeli_reg_n(rs.getString("HELI_REG_N")); //rs.getString("HELI_REG_N");
			obj.setHeli_range(readInteger(rs, "HELI_RANGE")); //readInteger(rs, "HELI_RANGE");
			obj.setHeli_rang2(rs.getString("HELI_RANG2")); //rs.getString("HELI_RANG2");
			obj.setHeli_colr(rs.getString("HELI_COLR")); //rs.getString("HELI_COLR");
			obj.setHeli_nbves(readInteger(rs, "HELI_NBVES")); //readInteger(rs, "HELI_NBVES");
            return obj;
        }
    
    }
}
