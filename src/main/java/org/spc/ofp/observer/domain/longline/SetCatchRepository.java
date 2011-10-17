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
@org.springframework.stereotype.Repository("observer.LongLineSetCatchRepository")
public class SetCatchRepository extends Repository<SetCatch> implements ISetCatchRepository {

	private static final String SELECT_QUERY =
	     "SELECT " +
	     "    OBSTRIP_ID, " +
	     "    L_SHAUL_ID, " +
	     "    L_CMON_ID, " +
	     "    date(CDATE) as CDATE, " +
	     "    trim(CTIME) as CTIME, " +
	     "    SAMPLE_NO, " +
	     "    HOOK_NO, " +
	     "    trim(SP_ID) as SP_ID, " +
	     "    trim(COND_ID) as COND_ID, " +
	     "    trim(COND_2_ID) as COND_2_ID, " +
	     "    trim(FATE_ID) as FATE_ID, " +
	     "    LEN, " +
	     "    trim(LEN_ID) as LEN_ID, " +
	     "    WT, " +
	     "    WT_EST, " +
	     "    WT_EST_REL, " +
	     "    trim(WT_ID) as WT_ID, " +
	     "    trim(SEX_ID) as SEX_ID, " +
	     "    trim(GONAD) as GONAD, " +
	     "    trim(COMMENTS) as COMMENTS " +
	     "FROM " + 
	     "    L_CMON";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.longline.ISetCatchRepository#findById(long)
	 */
	@Override
	public SetCatch findById(long id) {
		final String query = SELECT_QUERY + " WHERE L_CMON_ID = ?";
		return find(query, new SetCatchMapper(), id);
	}

	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.longline.ISetCatchRepository#findBySetHaul(long)
	 */
	@Override
	public List<SetCatch> findBySetHaul(long setHaulId) {
		final String query = SELECT_QUERY + " WHERE L_SHAUL_ID = ?";
		return list(query, new SetCatchMapper(), setHaulId);
	}

	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.longline.ISetCatchRepository#findByTrip(long)
	 */
	@Override
	public List<SetCatch> findByTrip(long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ?";
		return list(query, new SetCatchMapper(), tripId);
	}
	
	private static final class SetCatchMapper implements RowMapper<SetCatch> {

		@Override
		public SetCatch mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final SetCatch sc = new SetCatch();
			sc.setId(rs.getLong("L_CMON_ID"));
			sc.setSetHaulId(rs.getLong("L_SHAUL_ID"));
			sc.setTripId(rs.getLong("OBSTRIP_ID"));
			sc.setCdate(readDate(rs, "CDATE"));
			sc.setCtime(rs.getString("CTIME"));
			sc.setSample_no(readInteger(rs, "SAMPLE_NO"));
			sc.setHook_no(readInteger(rs, "HOOK_NO"));
			sc.setSp_id(rs.getString("SP_ID"));
			sc.setCond_id(rs.getString("COND_ID"));
			sc.setCond_2_id(rs.getString("COND_2_ID"));
			sc.setFate_id(rs.getString("FATE_ID"));
			sc.setLen(readInteger(rs, "LEN"));
			sc.setLen_id(rs.getString("LEN_ID"));
			sc.setWt(readInteger(rs, "WT"));
			sc.setWt_est(readInteger(rs, "WT_EST"));
			sc.setWt_est_rel(readInteger(rs, "WT_EST_REL"));
			sc.setWt_id(rs.getString("WT_ID"));
			sc.setSex_id(rs.getString("SEX_ID"));
			sc.setGonad(rs.getString("GONAD"));
			sc.setComments(rs.getString("COMMENTS"));
			return sc;
		}
	}

}
