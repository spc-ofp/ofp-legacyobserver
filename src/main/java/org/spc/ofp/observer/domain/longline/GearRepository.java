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
package org.spc.ofp.observer.domain.longline;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spc.ofp.data.Repository;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.LongLineGearRepository")
public class GearRepository extends Repository<Gear> implements IGearRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    OBSTRIP_ID, " + 
		"    MLINE_HAUL, " + 
		"    trim(C_MLINE_HAUL) as C_MLINE_HAUL, " + 
		"    trim(BLINE_HAUL) as BLINE_HAUL, " + 
		"    trim(C_BLINE_HAUL) as C_BLINE_HAUL, " + 
		"    trim(LSHOOT) as LSHOOT, " + 
		"    trim(C_LSHOOT) as C_LSHOOT, " + 
		"    trim(BAIT_THR) as BAIT_THR, " + 
		"    trim(C_BAIT_THR) as C_BAIT_THR, " + 
		"    trim(BRANCH_ATT) as BRANCH_ATT, " + 
		"    trim(C_BRANCH_ATT) as C_BRANCH_ATT, " + 
		"    trim(WEIGHT_SCA) as WEIGHT_SCA, " + 
		"    trim(C_WEIGHT_SCA) as C_WEIGHT_SCA, " + 
		"    trim(MAINL_COMP) as MAINL_COMP, " + 
		"    trim(BLINE_COMP) as BLINE_COMP, " + 
		"    trim(MAINL_MAT) as MAINL_MAT, " + 
		"    MAINL_LEN, " + 
		"    MAINL_DIAM, " + 
		"    trim(BLINE_MAT1) as BLINE_MAT1, " + 
		"    BLINE_MAT2, " + 
		"    BLINE_MAT3, " + 
		"    WIRE_TRACE, " + 
		"    SEA_WATER, " + 
		"    BLAST_FREEZER, " + 
		"    ICE, " + 
		"    CHILLED_SEA_WATER, " + 
		"    OTH_STORAGE, " + 
		"    trim(HK_JAPAN_S) as HK_JAPAN_S, " + 
		"    HK_JAPAN_P, " + 
		"    trim(HK_CIRCLE_S) as HK_CIRCLE_S, " + 
		"    HK_CIRCLE_P, " + 
		"    HK_J_S, " + 
		"    HK_J_P, " + 
		"    trim(HK_OTHER_T) as HK_OTHER_T, " + 
		"    trim(HK_OTHER_S) as HK_OTHER_S, " + 
		"    HK_OTHER_P " + 
		"FROM " +
		"    L_GEAR ";
    
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
			obj.setMline_haul(rs.getString("MLINE_HAUL")); //rs.getString("MLINE_HAUL");
			obj.setC_mline_ha(rs.getString("C_MLINE_HAUL")); //rs.getString("C_MLINE_HA");
			obj.setBline_haul(rs.getString("BLINE_HAUL")); //rs.getString("BLINE_HAUL");
			obj.setC_bline_ha(rs.getString("C_BLINE_HAUL")); //rs.getString("C_BLINE_HA");
			obj.setLshoot(rs.getString("LSHOOT")); //rs.getString("LSHOOT");
			obj.setC_lshoot(rs.getString("C_LSHOOT")); //rs.getString("C_LSHOOT");
			obj.setBait_thr(rs.getString("BAIT_THR")); //rs.getString("BAIT_THR");
			obj.setC_bait_thr(rs.getString("C_BAIT_THR")); //rs.getString("C_BAIT_THR");
			obj.setBranch_att(rs.getString("BRANCH_ATT")); //rs.getString("BRANCH_ATT");
			obj.setC_branch_a(rs.getString("C_BRANCH_ATT")); //rs.getString("C_BRANCH_A");
			obj.setWeight_sca(rs.getString("WEIGHT_SCA")); //rs.getString("WEIGHT_SCA");
			obj.setC_weight_s(rs.getString("C_WEIGHT_SCA")); //rs.getString("C_WEIGHT_S");
			obj.setMainl_comp(rs.getString("MAINL_COMP")); //rs.getString("MAINL_COMP");
			obj.setBline_comp(rs.getString("BLINE_COMP")); //rs.getString("BLINE_COMP");
			obj.setMainl_mat(rs.getString("MAINL_MAT")); //rs.getString("MAINL_MAT");
			obj.setMainl_len(readInteger(rs, "MAINL_LEN")); //readInteger(rs, "MAINL_LEN");
			obj.setMainl_diam(readDouble(rs, "MAINL_DIAM")); //readDouble(rs, "MAINL_DIAM");
			obj.setBline_mat1(rs.getString("BLINE_MAT1")); //rs.getString("BLINE_MAT1");
			obj.setBline_mat2(rs.getString("BLINE_MAT2")); //rs.getString("BLINE_MAT2");
			obj.setBline_mat3(rs.getString("BLINE_MAT3")); //rs.getString("BLINE_MAT3");
			obj.setWire_trace(rs.getString("WIRE_TRACE")); //rs.getString("WIRE_TRACE");
			obj.setSea_water(rs.getString("SEA_WATER")); //rs.getString("SEA_WATER");
			obj.setBlast_free(rs.getString("BLAST_FREEZER")); //rs.getString("BLAST_FREE");
			obj.setIce(rs.getString("ICE")); //rs.getString("ICE");
			obj.setChilled_se(rs.getString("CHILLED_SEA_WATER")); //rs.getString("CHILLED_SE");
			obj.setOth_storag(rs.getString("OTH_STORAGE")); //rs.getString("OTH_STORAG");
			obj.setHk_japan_s(rs.getString("HK_JAPAN_S")); //rs.getString("HK_JAPAN_S");
			obj.setHk_japan_p(readInteger(rs, "HK_JAPAN_P")); //readInteger(rs, "HK_JAPAN_P");
			obj.setHk_circle_(rs.getString("HK_CIRCLE_S")); //rs.getString("HK_CIRCLE_");
			obj.setHk_circle2(readInteger(rs, "HK_CIRCLE_P")); //readInteger(rs, "HK_CIRCLE2");
			obj.setHk_j_s(rs.getString("HK_J_S")); //rs.getString("HK_J_S");
			obj.setHk_j_p(readInteger(rs, "HK_J_P")); //readInteger(rs, "HK_J_P");
			obj.setHk_other_t(rs.getString("HK_OTHER_T")); //rs.getString("HK_OTHER_T");
			obj.setHk_other_s(rs.getString("HK_OTHER_S")); //rs.getString("HK_OTHER_S");
			obj.setHk_other_p(readInteger(rs, "HK_OTHER_P")); //readInteger(rs, "HK_OTHER_P");
            return obj;
        }
    
    }

	
}
