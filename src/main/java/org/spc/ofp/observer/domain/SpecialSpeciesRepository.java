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
@org.springframework.stereotype.Repository("observer.SpecialSpeciesRepository")
public class SpecialSpeciesRepository extends Repository<SpecialSpecies>
		implements ISpecialSpeciesRepository {

	private static final String SELECT_QUERY =
	    "SELECT "+
        "    OBSTRIP_ID, "+
		"    SSP_ID, "+
		"    LANDED, "+
		"    date(DATE_LAND) as DATE_LAND, "+
		"    TIME_LAND, "+
		"    date(DATE_INTER) as DATE_INTER, "+
		"    TIME_INTER, "+
		"    LAT, "+
		"    LON, "+
		"    SP_ID, "+
		"    SP_DESC, "+
		"    LD_COND_ID, "+
		"    LD_COND_DE, "+
		"    LD_HANDLIN, "+
		"    LD_LEN, "+
		"    LD_LEN_COD, "+
		"    LD_SEX, "+
		"    DSC_COND_I, "+
		"    DSC_COND_D, "+
		"    VESS_ACT, "+
		"    VESS_ACT_O, "+
		"    INT_COND_I, "+
		"    INT_COND_D, "+
		"    INTE_COND2, "+
		"    INT_DESCRI, "+
		"    SGT_ACT, "+
		"    SGT_ACT_OT, "+
		"    SGT_NB, "+
		"    SGT_NB_AD, "+
		"    SGT_NB_JU, "+
		"    SGT_LEN, "+
		"    SGT_DIST, "+
		"    SGT_DIS_UN, "+
		"    SGT_BEHAV, "+
		"    TAG_RET_NO, "+
		"    TAG_RET_TY, "+
		"    TAG_RET_OR, "+
		"    TAG_PLA_NO, "+
		"    TAG_PLA_TY, "+
		"    TAG_PLA_OR "+
		"FROM "+
		"    SPECIAL_SPECIES";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.ISpecialSpeciesRepository#findById(java.math.BigInteger)
	 */
	@Override
	public SpecialSpecies findById(final long id) {
		final String query = SELECT_QUERY + " WHERE SSP_ID = ?";
		return find(query, new SpecialSpeciesMapper(), id);
	}

	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.ISpecialSpeciesRepository#findByTrip(long)
	 */
	@Override
	public List<SpecialSpecies> findByTrip(final long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ?";
		return list(query, new SpecialSpeciesMapper(), tripId);
	}
	
	private static final class SpecialSpeciesMapper implements RowMapper<SpecialSpecies> {

		@Override
		public SpecialSpecies mapRow(final ResultSet rs, final int rowNum)
				throws SQLException {
			final SpecialSpecies ss = new SpecialSpecies();
			ss.setId(rs.getLong("SSP_ID"));
			//ss.setId(BigInteger.valueOf(rs.getLong("SSP_ID")));
			ss.setTripId(rs.getLong("OBSTRIP_ID"));
			ss.setLanded(readInteger(rs, "LANDED"));
			ss.setDate_land(readDate(rs, "DATE_LAND"));
			ss.setTime_land(rs.getString("TIME_LAND"));
			ss.setDate_inter(readDate(rs, "DATE_INTER"));
			ss.setTime_inter(rs.getString("TIME_INTER"));
			ss.setLatitude(rs.getString("LAT"));
			ss.setLongitude(rs.getString("LON"));
			ss.setSp_id(rs.getString("SP_ID"));
			ss.setSp_desc(rs.getString("SP_DESC"));
			ss.setLd_cond_id(rs.getString("LD_COND_ID"));
			ss.setLd_cond_de(rs.getString("LD_COND_DE"));
			ss.setLd_handlin(rs.getString("LD_HANDLIN"));
			ss.setLd_len(readDouble(rs, "LD_LEN"));
			ss.setLd_len_cod(rs.getString("LD_LEN_COD"));
			ss.setLd_sex(rs.getString("LD_SEX"));
			ss.setDsc_cond_i(rs.getString("DSC_COND_I"));
			ss.setDsc_cond_d(rs.getString("DSC_COND_D"));
			ss.setVess_act(readInteger(rs, "VESS_ACT"));
			ss.setVess_act_o(rs.getString("VESS_ACT_O"));
			ss.setInt_cond_i(rs.getString("INT_COND_I"));
			ss.setInt_cond_d(rs.getString("INT_COND_D"));
			ss.setInte_cond2(rs.getString("INTE_COND2"));
			ss.setInt_descrip(rs.getString("INT_DESCRI"));
			ss.setSgt_act(readInteger(rs, "SGT_ACT"));
			ss.setSgt_act_ot(rs.getString("SGT_ACT_OT"));
			ss.setSgt_nb(readInteger(rs, "SGT_NB"));
			ss.setSgt_nb_ad(readInteger(rs, "SGT_NB_AD"));
			ss.setSgt_nb_ju(readInteger(rs, "SGT_NB_JU"));
			ss.setSgt_len(rs.getString("SGT_LEN"));
			ss.setSgt_dist(readDouble(rs, "SGT_DIST"));
			ss.setSgt_dis_un(rs.getString("SGT_DIS_UN"));
			ss.setSgt_behav(rs.getString("SGT_BEHAV"));
			ss.setTag_ret_no(rs.getString("TAG_RET_NO"));
			ss.setTag_ret_ty(rs.getString("TAG_RET_TY"));
			ss.setTag_ret_or(rs.getString("TAG_RET_OR"));
			ss.setTag_pla_no(rs.getString("TAG_PLA_NO"));
			ss.setTag_pla_ty(rs.getString("TAG_PLA_TY"));
			ss.setTag_pla_or(rs.getString("TAG_PLA_OR"));
			return ss;
		}		
	}

}
