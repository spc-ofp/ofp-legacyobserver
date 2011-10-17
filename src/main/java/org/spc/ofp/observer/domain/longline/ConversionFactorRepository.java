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
@org.springframework.stereotype.Repository("observer.ConversionFactorRepository")
public class ConversionFactorRepository extends Repository<ConversionFactor> implements IConversionFactorRepository {

	private static final String SELECT_QUERY =
	    "SELECT " +
	    "    OBSTRIP_ID, " +
	    "    L_SHAUL_ID, " +
	    "    date(CDATE) as CDATE, " +
	    "    CTIME, " +
	    "    SP_ID, " +
	    "    LEN_TT, " +
	    "    LEN_UF, " +
	    "    LEN_US, " +
	    "    LEN_LF, " +
	    "    LEN_PF, " +
	    "    LEN_PS, " +
	    "    LEN_SL, " +
	    "    LEN_EO, " +
	    "    LEN_CK, " +
	    "    LEN_TL, " +
	    "    LEN_CU, " +
	    "    WT_WW, " +
	    "    WT_HEAD, " +
	    "    WT_TAIL, " +
	    "    WT_GUTS, " +
	    "    WT_PR, " +
	    "    trim(WT_PR_ID) as WT_PR_ID, " +
	    "    trim(LABEL_NO) as LABEL_NO, " +
	    "    WT_LD, " +
	    "    trim(WT_LD_ID) as WT_LD_ID " +
	    "FROM " +
	    "    L_CFACTOR ";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.longline.IConversionFactorRepository#findByTrip(long)
	 */
	@Override
	public List<ConversionFactor> findByTrip(final long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ?";
		return list(query, new ConversionFactorMapper(), tripId);
	}

	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.longline.IConversionFactorRepository#findByTripAndSetHaul(long, long)
	 */
	@Override
	public List<ConversionFactor> findByTripAndSetHaul(final long tripId, final long setHaulId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? AND L_SHAUL_ID = ?";
		return list(query, new ConversionFactorMapper(), tripId, setHaulId);
	}
	
	private static final class ConversionFactorMapper implements RowMapper<ConversionFactor> {

		@Override
		public ConversionFactor mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final ConversionFactor cf = new ConversionFactor();
			cf.setTripId(rs.getLong("OBSTRIP_ID"));
			cf.setSetHaulId(rs.getLong("L_SHAUL_ID"));
			cf.setCdate(readDate(rs, "CDATE"));
			cf.setCtime(rs.getString("CTIME"));
			cf.setSp_id(rs.getString("SP_ID"));
			cf.setLen_tt(readInteger(rs, "LEN_TT"));
			cf.setLen_uf(readInteger(rs, "LEN_UF"));
			cf.setLen_us(readInteger(rs, "LEN_US"));
			cf.setLen_lf(readInteger(rs, "LEN_LF"));
			cf.setLen_pf(readInteger(rs, "LEN_PF"));
			cf.setLen_ps(readInteger(rs, "LEN_PS"));
			cf.setLen_sl(readInteger(rs, "LEN_SL"));
			cf.setLen_eo(readInteger(rs, "LEN_EO"));
			cf.setLen_ck(readInteger(rs, "LEN_CK"));
			cf.setLen_tl(readInteger(rs, "LEN_TL"));
			cf.setLen_cu(readInteger(rs, "LEN_CU"));
			cf.setWt_ww(readDouble(rs, "WT_WW"));
			cf.setWt_head(readDouble(rs, "WT_HEAD"));
			cf.setWt_tail(readDouble(rs, "WT_TAIL"));
			cf.setWt_guts(readDouble(rs, "WT_GUTS"));
			cf.setWt_pr(readDouble(rs, "WT_PR"));
			cf.setWt_pr_id(rs.getString("WT_PR_ID"));
			cf.setLabel_no(rs.getString("LABEL_NO"));
			cf.setWt_ld(readDouble(rs, "WT_LD"));
			cf.setWt_ld_id(rs.getString("WT_LD_ID"));
			return cf;
		}
		
	}

}
