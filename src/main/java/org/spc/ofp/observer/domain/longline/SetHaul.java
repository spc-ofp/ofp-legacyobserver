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

import java.util.Date;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class SetHaul {

	private long id;
	private long tripId;
	private Date setDate;
	private String setTime;
	private Date utcSetDate;
	private String utcSetTime;
	private Long hk_bt_flt;
	private Boolean no_obsv;
	private Integer hook;
	private Integer hook_set;
	private Integer hook_est;
	private String hook_calc;
	private Integer bask;
	private Integer baskobs;
	private Integer depth_l;
	private Integer depth_h;
	private Double dist;
	private Integer branch;
	private Integer br_0_20;
	private Integer br_20_34;
	private Integer br_35_50;
	private Integer br_50_99;
	private Integer floatX; // float is a reserved word in Java...
	private Double vspeed;
	private Double lspeed;
	private String linespeedUnit;
	private Integer tbranch;
	private String setDetails;
	private String bait1_sp_id;
	private String bait2_sp_id;
	private String bait3_sp_id;
	private String bait4_sp_id;
	private String bait5_sp_id;
	private Integer bait1_w; 
	private Integer bait2_w; 
	private Integer bait3_w; 
	private Integer bait4_w; 
	private Integer bait5_w; 
	private String bait1_h; 
	private String bait2_h; 
	private String bait3_h; 
	private String bait4_h; 
	private Integer lightsticks;
	private Boolean event;
	private String measureinst;
	private Boolean obsv_direct;
	private Integer floathook;
	private String strategy;
	private Integer nbshark_lines;
	private Integer target_sp_id;
    private Boolean tdr_deployed;
    private Integer tdr_len;
    private String enteredby;
    private Date insertTime;
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
	public Date getSetDate() {
		return setDate;
	}
	public void setSetDate(Date setDate) {
		this.setDate = setDate;
	}
	public String getSetTime() {
		return setTime;
	}
	public void setSetTime(String setTime) {
		this.setTime = setTime;
	}
	public Date getUtcSetDate() {
		return utcSetDate;
	}
	public void setUtcSetDate(Date utcSetDate) {
		this.utcSetDate = utcSetDate;
	}
	public String getUtcSetTime() {
		return utcSetTime;
	}
	public void setUtcSetTime(String utcSetTime) {
		this.utcSetTime = utcSetTime;
	}
	public Long getHk_bt_flt() {
		return hk_bt_flt;
	}
	public void setHk_bt_flt(Long hk_bt_flt) {
		this.hk_bt_flt = hk_bt_flt;
	}
	public Boolean getNo_obsv() {
		return no_obsv;
	}
	public void setNo_obsv(Boolean no_obsv) {
		this.no_obsv = no_obsv;
	}
	public Integer getHook() {
		return hook;
	}
	public void setHook(Integer hook) {
		this.hook = hook;
	}
	public Integer getHook_set() {
		return hook_set;
	}
	public void setHook_set(Integer hook_set) {
		this.hook_set = hook_set;
	}
	public Integer getHook_est() {
		return hook_est;
	}
	public void setHook_est(Integer hook_est) {
		this.hook_est = hook_est;
	}
	public String getHook_calc() {
		return hook_calc;
	}
	public void setHook_calc(String hook_calc) {
		this.hook_calc = hook_calc;
	}
	public Integer getBask() {
		return bask;
	}
	public void setBask(Integer bask) {
		this.bask = bask;
	}
	public Integer getBaskobs() {
		return baskobs;
	}
	public void setBaskobs(Integer baskobs) {
		this.baskobs = baskobs;
	}
	public Integer getDepth_l() {
		return depth_l;
	}
	public void setDepth_l(Integer depth_l) {
		this.depth_l = depth_l;
	}
	public Integer getDepth_h() {
		return depth_h;
	}
	public void setDepth_h(Integer depth_h) {
		this.depth_h = depth_h;
	}
	public Double getDist() {
		return dist;
	}
	public void setDist(Double dist) {
		this.dist = dist;
	}
	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}
	public Integer getBr_0_20() {
		return br_0_20;
	}
	public void setBr_0_20(Integer br_0_20) {
		this.br_0_20 = br_0_20;
	}
	public Integer getBr_20_34() {
		return br_20_34;
	}
	public void setBr_20_34(Integer br_20_34) {
		this.br_20_34 = br_20_34;
	}
	public Integer getBr_35_50() {
		return br_35_50;
	}
	public void setBr_35_50(Integer br_35_50) {
		this.br_35_50 = br_35_50;
	}
	public Integer getBr_50_99() {
		return br_50_99;
	}
	public void setBr_50_99(Integer br_50_99) {
		this.br_50_99 = br_50_99;
	}
	public Integer getFloatX() {
		return floatX;
	}
	public void setFloatX(Integer floatX) {
		this.floatX = floatX;
	}
	public Double getVspeed() {
		return vspeed;
	}
	public void setVspeed(Double vspeed) {
		this.vspeed = vspeed;
	}
	public Double getLspeed() {
		return lspeed;
	}
	public void setLspeed(Double lspeed) {
		this.lspeed = lspeed;
	}
	public String getLinespeedUnit() {
		return linespeedUnit;
	}
	public void setLinespeedUnit(String linespeedUnit) {
		this.linespeedUnit = linespeedUnit;
	}
	public Integer getTbranch() {
		return tbranch;
	}
	public void setTbranch(Integer tbranch) {
		this.tbranch = tbranch;
	}
	public String getSetDetails() {
		return setDetails;
	}
	public void setSetDetails(String setDetails) {
		this.setDetails = setDetails;
	}
	public String getBait1_sp_id() {
		return bait1_sp_id;
	}
	public void setBait1_sp_id(String bait1_sp_id) {
		this.bait1_sp_id = bait1_sp_id;
	}
	public String getBait2_sp_id() {
		return bait2_sp_id;
	}
	public void setBait2_sp_id(String bait2_sp_id) {
		this.bait2_sp_id = bait2_sp_id;
	}
	public String getBait3_sp_id() {
		return bait3_sp_id;
	}
	public void setBait3_sp_id(String bait3_sp_id) {
		this.bait3_sp_id = bait3_sp_id;
	}
	public String getBait4_sp_id() {
		return bait4_sp_id;
	}
	public void setBait4_sp_id(String bait4_sp_id) {
		this.bait4_sp_id = bait4_sp_id;
	}
	public String getBait5_sp_id() {
		return bait5_sp_id;
	}
	public void setBait5_sp_id(String bait5_sp_id) {
		this.bait5_sp_id = bait5_sp_id;
	}
	public Integer getBait1_w() {
		return bait1_w;
	}
	public void setBait1_w(Integer bait1_w) {
		this.bait1_w = bait1_w;
	}
	public Integer getBait2_w() {
		return bait2_w;
	}
	public void setBait2_w(Integer bait2_w) {
		this.bait2_w = bait2_w;
	}
	public Integer getBait3_w() {
		return bait3_w;
	}
	public void setBait3_w(Integer bait3_w) {
		this.bait3_w = bait3_w;
	}
	public Integer getBait4_w() {
		return bait4_w;
	}
	public void setBait4_w(Integer bait4_w) {
		this.bait4_w = bait4_w;
	}
	public Integer getBait5_w() {
		return bait5_w;
	}
	public void setBait5_w(Integer bait5_w) {
		this.bait5_w = bait5_w;
	}
	public String getBait1_h() {
		return bait1_h;
	}
	public void setBait1_h(String bait1_h) {
		this.bait1_h = bait1_h;
	}
	public String getBait2_h() {
		return bait2_h;
	}
	public void setBait2_h(String bait2_h) {
		this.bait2_h = bait2_h;
	}
	public String getBait3_h() {
		return bait3_h;
	}
	public void setBait3_h(String bait3_h) {
		this.bait3_h = bait3_h;
	}
	public String getBait4_h() {
		return bait4_h;
	}
	public void setBait4_h(String bait4_h) {
		this.bait4_h = bait4_h;
	}
	public Integer getLightsticks() {
		return lightsticks;
	}
	public void setLightsticks(Integer lightsticks) {
		this.lightsticks = lightsticks;
	}
	public Boolean getEvent() {
		return event;
	}
	public void setEvent(Boolean event) {
		this.event = event;
	}
	public String getMeasureinst() {
		return measureinst;
	}
	public void setMeasureinst(String measureinst) {
		this.measureinst = measureinst;
	}
	public Boolean getObsv_direct() {
		return obsv_direct;
	}
	public void setObsv_direct(Boolean obsv_direct) {
		this.obsv_direct = obsv_direct;
	}
	public Integer getFloathook() {
		return floathook;
	}
	public void setFloathook(Integer floathook) {
		this.floathook = floathook;
	}
	public String getStrategy() {
		return strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	public Integer getNbshark_lines() {
		return nbshark_lines;
	}
	public void setNbshark_lines(Integer nbshark_lines) {
		this.nbshark_lines = nbshark_lines;
	}
	public Integer getTarget_sp_id() {
		return target_sp_id;
	}
	public void setTarget_sp_id(Integer target_sp_id) {
		this.target_sp_id = target_sp_id;
	}
	public Boolean getTdr_deployed() {
		return tdr_deployed;
	}
	public void setTdr_deployed(Boolean tdr_deployed) {
		this.tdr_deployed = tdr_deployed;
	}
	public Integer getTdr_len() {
		return tdr_len;
	}
	public void setTdr_len(Integer tdr_len) {
		this.tdr_len = tdr_len;
	}
	public String getEnteredby() {
		return enteredby;
	}
	public void setEnteredby(String enteredby) {
		this.enteredby = enteredby;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
    
    

}
