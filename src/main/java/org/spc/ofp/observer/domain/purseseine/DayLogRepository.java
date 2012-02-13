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
@org.springframework.stereotype.Repository("observer.DayLogRepository")
public class DayLogRepository extends Repository<DayLog> implements IDayLogRepository {

    @Autowired
    protected BrailPatternRepository brailRepo;
    
    @Autowired
    protected LengthFrequencyHeaderRepository headerRepo;
    
    @Autowired
    protected SetCatchRepository setCatchRepo;
    
	private static final String SELECT_QUERY =
        "SELECT " +
		"    OBSTRIP_ID, " + 
		"    S_DAY_ID, " + 
		"    S_ALOG_ID, " + 
		"    SETNO, " + 
		"    date(ACTDATE) as ACTDATE, " + 
		"    trim(ACTTIME) as ACTTIME, " + 
		"    date(UTC_ADATE) as UTC_ADATE, " + 
		"    trim(UTC_ATIME) as UTC_ATIME, " + 
		"    trim(LAT_LONG) as LAT_LONG, " + 
		"    trim(LON_LONG) as LON_LONG, " + 
		"    trim(EZ_ID) as EZ_ID, " + 
		"    FISH_DAYS, " + 
		"    S_ACT_ID, " + 
		"    WINDDIR, " + 
		"    WIND_KTS, " + 
		"    trim(SEA_ID) as SEA_ID, " + 
		"    SCH_ID, " + 
		"    DET_ID, " + 
		"    trim(BEACON) as BEACON, " + 
		"    trim(COMMENT) as COMMENT, " + 
		"    LD_ONBOARD, " + 
		"    LD_VES_ONB, " + 
		"    LD_TONNAGE, " + 
		"    LD_VES_TON, " + 
		"    ONESET, " + 
		"    LD_NEWONBO, " + 
		"    LD_VES_NEW, " + 
		"    TUNA_CATCH, " + 
		"    LD_BRAILS, " + 
		"    LD_BRAILS2, " + 
		"    TOT_CATCH, " + 
		"    trim(WNCH_ON) as WNCH_ON, " + 
		"    trim(RING_UP) as RING_UP, " + 
		"    trim(SBRAIL) as SBRAIL, " + 
		"    trim(EBRAIL) as EBRAIL, " + 
		"    trim(STOP) as STOP, " + 
		"    B_DISCARDS, " + 
		"    B_ESCAPE, " + 
		"    b_escpercent, " + 
		"    B_NBSPECIES, " + 
		"    B_SCHOOL, " + 
		"    B_NBTAGS, " + 
		"    B_TAGNO, " + 
		"    B_SP_ID, " + 
		"    B_LEN, " + 
		"    B_WEIGHT, " + 
		"    B_SEX, " + 
		"    trim(PS3_COMMENT) as PS3_COMMENT," + 
		"    SET_ID, " + 
		"    SET_ID_LEV, " + 
		"    PERC_SKJ, " + 
		"    PERC_YFT, " + 
		"    PERC_BET, " + 
		"    PERC_LARG_YFT, " + 
		"    NB_LARG_YFT, " + 
		"    PERC_LARG_BET, " + 
		"    NB_LARG_BET, " + 
		"    PERC_LARG_YB, " + 
		"    NB_LARG_YB, " + 
		"    datetime(INSERTTIME) as INSERTTIME, " + 
		"    ENTEREDBY " + 
		"FROM " +
		"    S_ALOG ";
        
    private DayLog fill(final DayLog dl) {
    	if (null == dl) { return null; }
    	final long dayLogId = dl.getId();
    	if (0L == dayLogId) { return dl; }
    	dl.addBrailPatterns(brailRepo.findByDaylogId(dayLogId));
    	dl.addHeaders(headerRepo.findByDayLogId(dayLogId));
    	dl.addSetCatch(setCatchRepo.findByDayLogId(dayLogId));
    	return dl;
    }
    
    private List<DayLog> fillAll(final List<DayLog> logs) {
		for (DayLog dl : logs) {
			dl = fill(dl);
		}
    	return logs;
	}
	
	
	@Override
    public DayLog findById(final long id) {
        final String query = SELECT_QUERY + " WHERE S_ALOG_ID = ? ";
        return fill(find(query, new DayLogMapper(), id));
    }

	@Override
	public List<DayLog> findByTripId(final long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ? ORDER BY S_DAY_ID ASC";
		return fillAll(list(query, new DayLogMapper(), tripId));
	}

	@Override
	public List<DayLog> findByDayId(final long dayId) {
		final String query = SELECT_QUERY + " WHERE S_DAY_ID = ? ";
		return fillAll(list(query, new DayLogMapper(), dayId));
	}
	
    private static final class DayLogMapper implements RowMapper<DayLog> {

        @Override
        public DayLog mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final DayLog obj = new DayLog();
            obj.setId(rs.getLong("S_ALOG_ID")); //readInteger(rs, "S_ALOG_ID");
            obj.setTripId(rs.getLong("OBSTRIP_ID")); //readInteger(rs, "OBSTRIP_ID");
            obj.setDayId(rs.getLong("S_DAY_ID")); //readInteger(rs, "S_DAY_ID");			
			obj.setSetno(readInteger(rs, "SETNO")); //readInteger(rs, "SETNO");
			obj.setActdate(readDate(rs, "ACTDATE")); //rs.getDate("ACTDATE");
			obj.setActtime(rs.getString("ACTTIME")); //rs.getString("ACTTIME");
			obj.setUtc_adate(readDate(rs, "UTC_ADATE")); //rs.getDate("UTC_ADATE");
			obj.setUtc_atime(rs.getString("UTC_ATIME")); //rs.getString("UTC_ATIME");
			obj.setLat_long(rs.getString("LAT_LONG")); //rs.getString("LAT_LONG");
			obj.setLon_long(rs.getString("LON_LONG")); //rs.getString("LON_LONG");
			obj.setEz_id(rs.getString("EZ_ID")); //rs.getString("EZ_ID");
			obj.setFish_days(readDouble(rs, "FISH_DAYS")); //readDouble(rs, "FISH_DAYS");
			obj.setS_act_id(readInteger(rs, "S_ACT_ID")); //readInteger(rs, "S_ACT_ID");
			obj.setWinddir(readInteger(rs, "WINDDIR")); //readInteger(rs, "WINDDIR");
			obj.setWind_kts(readInteger(rs, "WIND_KTS")); //readInteger(rs, "WIND_KTS");
			obj.setSea_id(rs.getString("SEA_ID")); //rs.getString("SEA_ID");
			obj.setSch_id(readInteger(rs, "SCH_ID")); //readInteger(rs, "SCH_ID");
			obj.setDet_id(readInteger(rs, "DET_ID")); //readInteger(rs, "DET_ID");
			obj.setBeacon(rs.getString("BEACON")); //rs.getString("BEACON");
			obj.setComment(rs.getString("COMMENT")); //rs.getString("COMMENT");
			obj.setLd_onboard(readDouble(rs, "LD_ONBOARD")); //readDouble(rs, "LD_ONBOARD");
			obj.setLd_ves_onb(readDouble(rs, "LD_VES_ONB")); //readDouble(rs, "LD_VES_ONB");
			obj.setLd_tonnage(readDouble(rs, "LD_TONNAGE")); //readDouble(rs, "LD_TONNAGE");
			obj.setLd_ves_ton(readDouble(rs, "LD_VES_TON")); //readDouble(rs, "LD_VES_TON");
			obj.setOneset(rs.getBoolean("ONESET")); //rs.getBoolean("ONESET");
			obj.setLd_newonbo(readDouble(rs, "LD_NEWONBO")); //readDouble(rs, "LD_NEWONBO");
			obj.setLd_ves_new(readDouble(rs, "LD_VES_NEW")); //readDouble(rs, "LD_VES_NEW");
			obj.setTuna_catch(readDouble(rs, "TUNA_CATCH")); //readDouble(rs, "TUNA_CATCH");
			obj.setLd_brails(readDouble(rs, "LD_BRAILS")); //readDouble(rs, "LD_BRAILS");
			obj.setLd_brails2(readDouble(rs, "LD_BRAILS2")); //readDouble(rs, "LD_BRAILS2");
			obj.setTot_catch(readDouble(rs, "TOT_CATCH")); //readDouble(rs, "TOT_CATCH");
			obj.setWnch_on(rs.getString("WNCH_ON")); //rs.getString("WNCH_ON");
			obj.setRing_up(rs.getString("RING_UP")); //rs.getString("RING_UP");
			obj.setSbrail(rs.getString("SBRAIL")); //rs.getString("SBRAIL");
			obj.setEbrail(rs.getString("EBRAIL")); //rs.getString("EBRAIL");
			obj.setStop(rs.getString("STOP")); //rs.getString("STOP");
			obj.setB_discards(rs.getBoolean("B_DISCARDS")); //rs.getBoolean("B_DISCARDS");
			obj.setB_escape(rs.getBoolean("B_ESCAPE")); //rs.getBoolean("B_ESCAPE");
			obj.setB_escperce(readInteger(rs, "B_ESCPERCENT")); //readInteger(rs, "B_ESCPERCE");
			obj.setB_nbspecie(readInteger(rs, "B_NBSPECIES")); //readInteger(rs, "B_NBSPECIE");
			obj.setB_school(readInteger(rs, "B_SCHOOL")); //readInteger(rs, "B_SCHOOL");
			obj.setB_nbtags(readInteger(rs, "B_NBTAGS")); //readInteger(rs, "B_NBTAGS");
			obj.setB_tagno(rs.getString("B_TAGNO")); //rs.getString("B_TAGNO");
			obj.setB_sp_id(rs.getString("B_SP_ID")); //rs.getString("B_SP_ID");
			obj.setB_len(readInteger(rs, "B_LEN")); //readInteger(rs, "B_LEN");
			obj.setB_weight(readDouble(rs, "B_WEIGHT")); //readDouble(rs, "B_WEIGHT");
			obj.setB_sex(rs.getString("B_SEX")); //rs.getString("B_SEX");
			obj.setPs3_commen(rs.getString("PS3_COMMENT")); //rs.getString("PS3_COMMEN");
			obj.setSet_id(readInteger(rs, "SET_ID")); //readInteger(rs, "SET_ID");
			obj.setSet_id_lev(readInteger(rs, "SET_ID_LEV")); //readInteger(rs, "SET_ID_LEV");
			obj.setPerc_skj(readInteger(rs, "PERC_SKJ")); //readInteger(rs, "PERC_SKJ");
			obj.setPerc_yft(readInteger(rs, "PERC_YFT")); //readInteger(rs, "PERC_YFT");
			obj.setPerc_bet(readInteger(rs, "PERC_BET")); //readInteger(rs, "PERC_BET");
			obj.setPerc_larg_(readInteger(rs, "PERC_LARG_YFT")); //readInteger(rs, "PERC_LARG_");
			obj.setNb_larg_yf(readInteger(rs, "NB_LARG_YFT")); //readInteger(rs, "NB_LARG_YF");
			obj.setPerc_larg2(readInteger(rs, "PERC_LARG_BET")); //readInteger(rs, "PERC_LARG2");
			obj.setNb_larg_be(readInteger(rs, "NB_LARG_BET")); //readInteger(rs, "NB_LARG_BE");
			obj.setPerc_larg3(readInteger(rs, "PERC_LARG_YB")); //readInteger(rs, "PERC_LARG3");
			obj.setNb_larg_yb(readInteger(rs, "NB_LARG_YB")); //readInteger(rs, "NB_LARG_YB");
			obj.setInserttime(readTimestamp(rs,"INSERTTIME")); //rs.getNone("INSERTTIME");
			obj.setEnteredby(rs.getString("ENTEREDBY"));//rs.getString("ENTEREDBY");
            return obj;
        }
    
    }
}
