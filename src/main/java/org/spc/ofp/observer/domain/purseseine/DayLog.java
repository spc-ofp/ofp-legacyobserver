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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class DayLog {
 
    private long id;
	private long tripId;
	private long dayId;
	private Integer setno;
	private Date actdate;
	private String acttime;
	private Date utc_adate;
	private String utc_atime;
	private String lat_long;
	private String lon_long;
	private String ez_id;
	private Double fish_days;
	private Integer s_act_id;
	private Integer winddir;
	private Integer wind_kts;
	private String sea_id;
	private Integer sch_id;
	private Integer det_id;
	private String beacon;
	private String comment;
	private Double ld_onboard;
	private Double ld_ves_onb;
	private Double ld_tonnage;
	private Double ld_ves_ton;
	private Boolean oneset;
	private Double ld_newonbo;
	private Double ld_ves_new;
	private Double tuna_catch;
	private Double ld_brails;
	private Double ld_brails2;
	private Double tot_catch;
	private String wnch_on;
	private String ring_up;
	private String sbrail;
	private String ebrail;
	private String stop;
	private Boolean b_discards;
	private Boolean b_escape;
	private Integer b_escperce;
	private Integer b_nbspecie;
	private Integer b_school;
	private Integer b_nbtags;
	private String b_tagno;
	private String b_sp_id;
	private Integer b_len;
	private Double b_weight;
	private String b_sex;
	private String ps3_commen;
	private Integer set_id;
	private Integer set_id_lev;
	private Integer perc_skj;
	private Integer perc_yft;
	private Integer perc_bet;
	private Integer perc_larg_;
	private Integer nb_larg_yf;
	private Integer perc_larg2;
	private Integer nb_larg_be;
	private Integer perc_larg3;
	private Integer nb_larg_yb;
	private Date inserttime;
	private String enteredby;
	
	private List<BrailPattern> brailPatterns = new ArrayList<BrailPattern>();
	private List<LengthFrequencyHeader> headers = new ArrayList<LengthFrequencyHeader>();
	private List<SetCatch> setCatchList = new ArrayList<SetCatch>();
	
	public long getDayId() {
		return dayId;
	}
	public void setDayId(long dayId) {
		this.dayId = dayId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTripId() {
		return tripId;
	}
	public void setTripId(long tripId) {
		this.tripId = tripId;
	}
	public Integer getSetno() {
		return setno;
	}
	public void setSetno(Integer setno) {
		this.setno = setno;
	}
	public Date getActdate() {
		return actdate;
	}
	public void setActdate(Date actdate) {
		this.actdate = actdate;
	}
	public String getActtime() {
		return acttime;
	}
	public void setActtime(String acttime) {
		this.acttime = acttime;
	}
	public Date getUtc_adate() {
		return utc_adate;
	}
	public void setUtc_adate(Date utc_adate) {
		this.utc_adate = utc_adate;
	}
	public String getUtc_atime() {
		return utc_atime;
	}
	public void setUtc_atime(String utc_atime) {
		this.utc_atime = utc_atime;
	}
	public String getLat_long() {
		return lat_long;
	}
	public void setLat_long(String lat_long) {
		this.lat_long = lat_long;
	}
	public String getLon_long() {
		return lon_long;
	}
	public void setLon_long(String lon_long) {
		this.lon_long = lon_long;
	}
	public String getEz_id() {
		return ez_id;
	}
	public void setEz_id(String ez_id) {
		this.ez_id = ez_id;
	}
	public Double getFish_days() {
		return fish_days;
	}
	public void setFish_days(Double fish_days) {
		this.fish_days = fish_days;
	}
	public Integer getS_act_id() {
		return s_act_id;
	}
	public void setS_act_id(Integer s_act_id) {
		this.s_act_id = s_act_id;
	}
	public Integer getWinddir() {
		return winddir;
	}
	public void setWinddir(Integer winddir) {
		this.winddir = winddir;
	}
	public Integer getWind_kts() {
		return wind_kts;
	}
	public void setWind_kts(Integer wind_kts) {
		this.wind_kts = wind_kts;
	}
	public String getSea_id() {
		return sea_id;
	}
	public void setSea_id(String sea_id) {
		this.sea_id = sea_id;
	}
	public Integer getSch_id() {
		return sch_id;
	}
	public void setSch_id(Integer sch_id) {
		this.sch_id = sch_id;
	}
	public Integer getDet_id() {
		return det_id;
	}
	public void setDet_id(Integer det_id) {
		this.det_id = det_id;
	}
	public String getBeacon() {
		return beacon;
	}
	public void setBeacon(String beacon) {
		this.beacon = beacon;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Double getLd_onboard() {
		return ld_onboard;
	}
	public void setLd_onboard(Double ld_onboard) {
		this.ld_onboard = ld_onboard;
	}
	public Double getLd_ves_onb() {
		return ld_ves_onb;
	}
	public void setLd_ves_onb(Double ld_ves_onb) {
		this.ld_ves_onb = ld_ves_onb;
	}
	public Double getLd_tonnage() {
		return ld_tonnage;
	}
	public void setLd_tonnage(Double ld_tonnage) {
		this.ld_tonnage = ld_tonnage;
	}
	public Double getLd_ves_ton() {
		return ld_ves_ton;
	}
	public void setLd_ves_ton(Double ld_ves_ton) {
		this.ld_ves_ton = ld_ves_ton;
	}
	public Boolean getOneset() {
		return oneset;
	}
	public void setOneset(Boolean oneset) {
		this.oneset = oneset;
	}
	public Double getLd_newonbo() {
		return ld_newonbo;
	}
	public void setLd_newonbo(Double ld_newonbo) {
		this.ld_newonbo = ld_newonbo;
	}
	public Double getLd_ves_new() {
		return ld_ves_new;
	}
	public void setLd_ves_new(Double ld_ves_new) {
		this.ld_ves_new = ld_ves_new;
	}
	public Double getTuna_catch() {
		return tuna_catch;
	}
	public void setTuna_catch(Double tuna_catch) {
		this.tuna_catch = tuna_catch;
	}
	public Double getLd_brails() {
		return ld_brails;
	}
	public void setLd_brails(Double ld_brails) {
		this.ld_brails = ld_brails;
	}
	public Double getLd_brails2() {
		return ld_brails2;
	}
	public void setLd_brails2(Double ld_brails2) {
		this.ld_brails2 = ld_brails2;
	}
	public Double getTot_catch() {
		return tot_catch;
	}
	public void setTot_catch(Double tot_catch) {
		this.tot_catch = tot_catch;
	}
	public String getWnch_on() {
		return wnch_on;
	}
	public void setWnch_on(String wnch_on) {
		this.wnch_on = wnch_on;
	}
	public String getRing_up() {
		return ring_up;
	}
	public void setRing_up(String ring_up) {
		this.ring_up = ring_up;
	}
	public String getSbrail() {
		return sbrail;
	}
	public void setSbrail(String sbrail) {
		this.sbrail = sbrail;
	}
	public String getEbrail() {
		return ebrail;
	}
	public void setEbrail(String ebrail) {
		this.ebrail = ebrail;
	}
	public String getStop() {
		return stop;
	}
	public void setStop(String stop) {
		this.stop = stop;
	}
	public Boolean getB_discards() {
		return b_discards;
	}
	public void setB_discards(Boolean b_discards) {
		this.b_discards = b_discards;
	}
	public Boolean getB_escape() {
		return b_escape;
	}
	public void setB_escape(Boolean b_escape) {
		this.b_escape = b_escape;
	}
	public Integer getB_escperce() {
		return b_escperce;
	}
	public void setB_escperce(Integer b_escperce) {
		this.b_escperce = b_escperce;
	}
	public Integer getB_nbspecie() {
		return b_nbspecie;
	}
	public void setB_nbspecie(Integer b_nbspecie) {
		this.b_nbspecie = b_nbspecie;
	}
	public Integer getB_school() {
		return b_school;
	}
	public void setB_school(Integer b_school) {
		this.b_school = b_school;
	}
	public Integer getB_nbtags() {
		return b_nbtags;
	}
	public void setB_nbtags(Integer b_nbtags) {
		this.b_nbtags = b_nbtags;
	}
	public String getB_tagno() {
		return b_tagno;
	}
	public void setB_tagno(String b_tagno) {
		this.b_tagno = b_tagno;
	}
	public String getB_sp_id() {
		return b_sp_id;
	}
	public void setB_sp_id(String b_sp_id) {
		this.b_sp_id = b_sp_id;
	}
	public Integer getB_len() {
		return b_len;
	}
	public void setB_len(Integer b_len) {
		this.b_len = b_len;
	}
	public Double getB_weight() {
		return b_weight;
	}
	public void setB_weight(Double b_weight) {
		this.b_weight = b_weight;
	}
	public String getB_sex() {
		return b_sex;
	}
	public void setB_sex(String b_sex) {
		this.b_sex = b_sex;
	}
	public String getPs3_commen() {
		return ps3_commen;
	}
	public void setPs3_commen(String ps3_commen) {
		this.ps3_commen = ps3_commen;
	}
	public Integer getSet_id() {
		return set_id;
	}
	public void setSet_id(Integer set_id) {
		this.set_id = set_id;
	}
	public Integer getSet_id_lev() {
		return set_id_lev;
	}
	public void setSet_id_lev(Integer set_id_lev) {
		this.set_id_lev = set_id_lev;
	}
	public Integer getPerc_skj() {
		return perc_skj;
	}
	public void setPerc_skj(Integer perc_skj) {
		this.perc_skj = perc_skj;
	}
	public Integer getPerc_yft() {
		return perc_yft;
	}
	public void setPerc_yft(Integer perc_yft) {
		this.perc_yft = perc_yft;
	}
	public Integer getPerc_bet() {
		return perc_bet;
	}
	public void setPerc_bet(Integer perc_bet) {
		this.perc_bet = perc_bet;
	}
	public Integer getPerc_larg_() {
		return perc_larg_;
	}
	public void setPerc_larg_(Integer perc_larg_) {
		this.perc_larg_ = perc_larg_;
	}
	public Integer getNb_larg_yf() {
		return nb_larg_yf;
	}
	public void setNb_larg_yf(Integer nb_larg_yf) {
		this.nb_larg_yf = nb_larg_yf;
	}
	public Integer getPerc_larg2() {
		return perc_larg2;
	}
	public void setPerc_larg2(Integer perc_larg2) {
		this.perc_larg2 = perc_larg2;
	}
	public Integer getNb_larg_be() {
		return nb_larg_be;
	}
	public void setNb_larg_be(Integer nb_larg_be) {
		this.nb_larg_be = nb_larg_be;
	}
	public Integer getPerc_larg3() {
		return perc_larg3;
	}
	public void setPerc_larg3(Integer perc_larg3) {
		this.perc_larg3 = perc_larg3;
	}
	public Integer getNb_larg_yb() {
		return nb_larg_yb;
	}
	public void setNb_larg_yb(Integer nb_larg_yb) {
		this.nb_larg_yb = nb_larg_yb;
	}
	public Date getInserttime() {
		return inserttime;
	}
	public void setInserttime(Date inserttime) {
		this.inserttime = inserttime;
	}
	public String getEnteredby() {
		return enteredby;
	}
	public void setEnteredby(String enteredby) {
		this.enteredby = enteredby;
	}
	public List<BrailPattern> getBrailPatterns() {
		return brailPatterns;
	}
	public List<LengthFrequencyHeader> getHeaders() {
		return headers;
	}
	public boolean addBrailPattern(final BrailPattern bp) {
		return brailPatterns.add(bp);
	}
	public boolean addBrailPatterns(final Collection<BrailPattern> bpl) {
		return brailPatterns.addAll(bpl);
	}
	public boolean addHeader(final LengthFrequencyHeader lfh) {
		return headers.add(lfh);
	}
	public boolean addHeaders(final Collection<LengthFrequencyHeader> lfhl) {
		return headers.addAll(lfhl);
	}
	public boolean addSetCatch(final SetCatch sc) {
		return setCatchList.add(sc);
	}	
	public boolean addSetCatch(final Collection<SetCatch> scl) {
		return setCatchList.addAll(scl);
	}
}
