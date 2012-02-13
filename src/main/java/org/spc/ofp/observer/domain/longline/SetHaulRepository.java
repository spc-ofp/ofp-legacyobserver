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

import org.springframework.jdbc.core.RowMapper;

import org.spc.ofp.data.Repository;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("SetHaulRepository")
public class SetHaulRepository extends Repository<SetHaul> implements ISetHaulRepository {


	private static final String SELECT_QUERY =
			"SELECT " +
		    "    OBSTRIP_ID, " +
		    "    L_SHAUL_ID, " +
		    "    date(SETDATE) as SETDATE, " +
		    "    trim(SETTIME) as SETTIME, " +
		    "    date(UTC_SDATE) as UTC_SDATE, " +
		    "    trim(UTC_STIME) as UTC_STIME, " +
		    "    HK_BT_FLT, " +
		    "    NO_OBSV, " +
		    "    HOOK, " +
		    "    HOOK_SET, " +
		    "    HOOK_EST, " +
		    "    HOOK_CALC, " +
		    "    BASK, " +
		    "    BASKOBS, " +
		    "    DEPTH_L, " +
		    "    DEPTH_H, " +
		    "    DIST, " +
		    "    BRANCH, " +
		    "    BR_0_20, " +
		    "    BR_20_34, " +
		    "    BR_35_50, " +
		    "    BR_50_99, " +
		    "    \"FLOAT\" as FLOATX, " +
		    "    VSPEED, " +
		    "    LSPEED, " +
		    "    LINESP_UNIT, " +
		    "    TBRANCH, " +
		    "    SETDETAILS, " +
		    "    BAIT1_SP_ID, " +
		    "    BAIT2_SP_ID, " +
		    "    BAIT3_SP_ID, " +
		    "    BAIT4_SP_ID, " +
		    "    BAIT5_SP_ID, " +
		    "    BAIT1_W, " +
		    "    BAIT2_W, " +
		    "    BAIT3_W, " +
		    "    BAIT4_W, " +
		    "    BAIT5_W, " +
		    "    BAIT1_H, " +
		    "    BAIT2_H, " +
		    "    BAIT3_H, " +
		    "    BAIT4_H, " +
		    "    LIGHTSTICKS, " +
		    "    EVENT, " +
		    "    MEASUREINST, " +
		    "    OBSV_DIRECT, " +
		    "    FLOATHOOK, " +
		    "    STRATEGY, " +
		    "    NBSHARK_LINES, " +
		    "    TARGET_SP_ID, " +
		    "    TDR_DEPLOYED, " +
		    "    TDR_LEN, " +
		    "    ENTEREDBY, " +
		    "    INSERTTIME " + // FIXME How do we get DateTime out of here?
		    "FROM " +
		    "    L_SETHAUL";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.longline.ISetHaulRepository#findById(long)
	 */
	@Override
	public SetHaul findById(long id) {
		final String query = SELECT_QUERY + " WHERE L_SHAUL_ID = ?";
		return find(query, new SetHaulMapper(), id);
	}

	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.longline.ISetHaulRepository#findByTrip(long)
	 */
	@Override
	public List<SetHaul> findByTrip(long id) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ?";
		return list(query, new SetHaulMapper(), id);
	}
	
	private static final class SetHaulMapper implements RowMapper<SetHaul> {

		public SetHaul mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final SetHaul sh = new SetHaul();
			sh.setId(rs.getLong("L_SHAUL_ID"));
			sh.setTripId(rs.getLong("OBSTRIP_ID"));
			sh.setSetDate(readDate(rs, "SETDATE"));
			sh.setSetTime(rs.getString("SETTIME"));
			sh.setUtcSetDate(readDate(rs, "UTC_SDATE"));
			sh.setUtcSetTime(rs.getString("UTC_STIME"));
			sh.setHk_bt_flt(readLong(rs, "HK_BT_FLT"));
			sh.setNo_obsv(rs.getBoolean("NO_OBSV"));
			sh.setHook(readInteger(rs, "HOOK"));
			sh.setHook_set(readInteger(rs, "HOOK_SET"));
			sh.setHook_est(readInteger(rs, "HOOK_EST"));
			sh.setHook_calc(rs.getString("HOOK_CALC"));
			sh.setBask(readInteger(rs, "BASK"));
			sh.setBaskobs(readInteger(rs, "BASKOBS"));
			sh.setDepth_l(readInteger(rs, "DEPTH_L"));
			sh.setDepth_h(readInteger(rs, "DEPTH_H"));
			sh.setDist(readDouble(rs, "DIST"));
			sh.setBranch(readInteger(rs, "BRANCH"));
			sh.setBr_0_20(readInteger(rs, "BR_0_20"));
			sh.setBr_20_34(readInteger(rs, "BR_20_34"));
			sh.setBr_35_50(readInteger(rs, "BR_35_50"));
			sh.setBr_50_99(readInteger(rs, "BR_50_99"));
			sh.setFloatX(readInteger(rs, "FLOATX"));
			sh.setVspeed(readDouble(rs, "VSPEED"));
			sh.setLspeed(readDouble(rs, "LSPEED"));
			sh.setLinespeedUnit(""); // FIXME Mt if 1, Kt if 2 or null
			sh.setTbranch(readInteger(rs, "TBRANCH"));
			sh.setSetDetails(rs.getString("SETDETAILS"));
			sh.setBait1_sp_id(rs.getString("BAIT1_SP_ID"));
			sh.setBait2_sp_id(rs.getString("BAIT2_SP_ID"));
			sh.setBait3_sp_id(rs.getString("BAIT3_SP_ID"));
			sh.setBait4_sp_id(rs.getString("BAIT4_SP_ID"));
			sh.setBait5_sp_id(rs.getString("BAIT5_SP_ID"));
			sh.setBait1_w(readInteger(rs, "BAIT1_W"));
			sh.setBait2_w(readInteger(rs, "BAIT2_W"));
			sh.setBait3_w(readInteger(rs, "BAIT3_W"));
			sh.setBait4_w(readInteger(rs, "BAIT4_W"));
			sh.setBait5_w(readInteger(rs, "BAIT5_W"));
			sh.setBait1_h(rs.getString("BAIT1_H"));
			sh.setBait2_h(rs.getString("BAIT2_H"));
			sh.setBait3_h(rs.getString("BAIT3_H"));
			sh.setBait4_h(rs.getString("BAIT4_H"));
			sh.setLightsticks(readInteger(rs, "LIGHTSTICKS"));
			sh.setEvent(rs.getBoolean("EVENT"));
			sh.setMeasureinst(rs.getString("MEASUREINST"));
			sh.setObsv_direct(rs.getBoolean("OBSV_DIRECT"));
			sh.setFloathook(readInteger(rs, "FLOATHOOK"));
			sh.setStrategy(rs.getString("STRATEGY"));
			sh.setNbshark_lines(readInteger(rs, "NBSHARK_LINES"));
			sh.setTarget_sp_id(readInteger(rs, "TARGET_SP_ID"));
			sh.setTdr_deployed(rs.getBoolean("TDR_DEPLOYED"));
			sh.setTdr_len(readInteger(rs, "TDR_LEN"));
			sh.setEnteredby(rs.getString("ENTEREDBY"));
			sh.setInsertTime(rs.getDate("INSERTTIME"));
			return sh;
		}
	}

}
