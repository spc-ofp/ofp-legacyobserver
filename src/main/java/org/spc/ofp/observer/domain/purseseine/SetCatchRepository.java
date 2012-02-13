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
@org.springframework.stereotype.Repository("observer.PurseSeineSetCatchRepository")
public class SetCatchRepository extends Repository<SetCatch> implements ISetCatchRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    OBSTRIP_ID, " + 
		"    S_ALOG_ID, " + 
		"    S_CMON_ID, " + 
		"    SP_ID, " + 
		"    LARGEFISH, " + 
		"    FATE_ID, " + 
		"    COND_ID, " + 
		"    YESNO, " + 
		"    PERC_TOTCATCH, " + 
		"    SP_C, " + 
		"    SP_C_VES, " + 
		"    SP_C_SPCOMP, " + 
		"    SP_N, " + 
		"    SP_W_L, " + 
		"    SP_W_H, " + 
		"    AV_LEN, " + 
		"    VESSLOG, " + 
		"    COMMENTS, " + 
		"    TAGS, " + 
		"    SP_W_EST, " + 
		"    SP_W_ID, " + 
		"    SP_C_EST, " + 
		"    SP_C_ID, " + 
		"    SP_N_EST " + 
		"FROM " +
		"    S_CMON ";
        
    @Override
    public SetCatch findById(final long id) {
        final String query = SELECT_QUERY + " WHERE S_CMON_ID = ? ";
        return find(query, new SetCatchMapper(), id);
    }
    

	@Override
	public List<SetCatch> findByTripId(final long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? ";
        return list(query, new SetCatchMapper(), tripId);
	}
	
	@Override
	public List<SetCatch> findByDayLogId(final long dayLogId) {
		final String query = SELECT_QUERY + " WHERE S_ALOG_ID = ? ";
        return list(query, new SetCatchMapper(), dayLogId);
	}
    
    private static final class SetCatchMapper implements RowMapper<SetCatch> {

        @Override
        public SetCatch mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final SetCatch obj = new SetCatch();
            obj.setId(rs.getLong("S_CMON_ID")); //readInteger(rs, "S_CMON_ID");           
			obj.setDayLogId(rs.getLong("S_ALOG_ID")); //readInteger(rs, "S_ALOG_ID");
            obj.setTripId(rs.getLong("OBSTRIP_ID")); //readInteger(rs, "OBSTRIP_ID");           
			obj.setSp_id(rs.getString("SP_ID")); //rs.getString("SP_ID");
			obj.setLargefish(rs.getBoolean("LARGEFISH")); //rs.getBoolean("LARGEFISH");
			obj.setFate_id(rs.getString("FATE_ID")); //rs.getString("FATE_ID");
			obj.setCond_id(rs.getString("COND_ID")); //rs.getString("COND_ID");
			obj.setYesno(rs.getBoolean("YESNO")); //rs.getBoolean("YESNO");
			obj.setPerc_totca(readDouble(rs, "PERC_TOTCATCH")); //readDouble(rs, "PERC_TOTCA");
			obj.setSp_c(readDouble(rs, "SP_C")); //readDouble(rs, "SP_C");
			obj.setSp_c_ves(readDouble(rs, "SP_C_VES")); //readDouble(rs, "SP_C_VES");
			obj.setSp_c_spcom(readDouble(rs, "SP_C_SPCOMP")); //readDouble(rs, "SP_C_SPCOM");
			obj.setSp_n(readInteger(rs, "SP_N")); //readInteger(rs, "SP_N");
			obj.setSp_w_l(readDouble(rs, "SP_W_L")); //readDouble(rs, "SP_W_L");
			obj.setSp_w_h(readDouble(rs, "SP_W_H")); //readDouble(rs, "SP_W_H");
			obj.setAv_len(readInteger(rs, "AV_LEN")); //readInteger(rs, "AV_LEN");
			obj.setVesslog(readInteger(rs, "VESSLOG")); //readInteger(rs, "VESSLOG");
			obj.setComments(rs.getString("COMMENTS")); //rs.getString("COMMENTS");
			obj.setTags(rs.getString("TAGS")); //rs.getString("TAGS");
			obj.setSp_w_est(readDouble(rs, "SP_W_EST")); //readDouble(rs, "SP_W_EST");
			obj.setSp_w_id(readInteger(rs, "SP_W_ID")); //readInteger(rs, "SP_W_ID");
			obj.setSp_c_est(readDouble(rs, "SP_C_EST")); //readDouble(rs, "SP_C_EST");
			obj.setSp_c_id(readInteger(rs, "SP_C_ID")); //readInteger(rs, "SP_C_ID");
			obj.setSp_n_est(readInteger(rs, "SP_N_EST")); //readInteger(rs, "SP_N_EST");
            return obj;
        }
    
    }
}
