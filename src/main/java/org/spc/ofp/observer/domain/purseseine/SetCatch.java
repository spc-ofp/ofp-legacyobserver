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

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class SetCatch {
 
    private long id;
	private long tripId;
	private long dayLogId;
	private String sp_id;
	private Boolean largefish;
	private String fate_id;
	private String cond_id;
	private Boolean yesno;
	private Double perc_totca;
	private Double sp_c;
	private Double sp_c_ves;
	private Double sp_c_spcom;
	private Integer sp_n;
	private Double sp_w_l;
	private Double sp_w_h;
	private Integer av_len;
	private Integer vesslog;
	private String comments;
	private String tags;
	private Double sp_w_est;
	private Integer sp_w_id;
	private Double sp_c_est;
	private Integer sp_c_id;
	private Integer sp_n_est;
	
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
	public long getDayLogId() {
		return dayLogId;
	}
	public void setDayLogId(long dayLogId) {
		this.dayLogId = dayLogId;
	}
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}
	public Boolean getLargefish() {
		return largefish;
	}
	public void setLargefish(Boolean largefish) {
		this.largefish = largefish;
	}
	public String getFate_id() {
		return fate_id;
	}
	public void setFate_id(String fate_id) {
		this.fate_id = fate_id;
	}
	public String getCond_id() {
		return cond_id;
	}
	public void setCond_id(String cond_id) {
		this.cond_id = cond_id;
	}
	public Boolean getYesno() {
		return yesno;
	}
	public void setYesno(Boolean yesno) {
		this.yesno = yesno;
	}
	public Double getPerc_totca() {
		return perc_totca;
	}
	public void setPerc_totca(Double perc_totca) {
		this.perc_totca = perc_totca;
	}
	public Double getSp_c() {
		return sp_c;
	}
	public void setSp_c(Double sp_c) {
		this.sp_c = sp_c;
	}
	public Double getSp_c_ves() {
		return sp_c_ves;
	}
	public void setSp_c_ves(Double sp_c_ves) {
		this.sp_c_ves = sp_c_ves;
	}
	public Double getSp_c_spcom() {
		return sp_c_spcom;
	}
	public void setSp_c_spcom(Double sp_c_spcom) {
		this.sp_c_spcom = sp_c_spcom;
	}
	public Integer getSp_n() {
		return sp_n;
	}
	public void setSp_n(Integer sp_n) {
		this.sp_n = sp_n;
	}
	public Double getSp_w_l() {
		return sp_w_l;
	}
	public void setSp_w_l(Double sp_w_l) {
		this.sp_w_l = sp_w_l;
	}
	public Double getSp_w_h() {
		return sp_w_h;
	}
	public void setSp_w_h(Double sp_w_h) {
		this.sp_w_h = sp_w_h;
	}
	public Integer getAv_len() {
		return av_len;
	}
	public void setAv_len(Integer av_len) {
		this.av_len = av_len;
	}
	public Integer getVesslog() {
		return vesslog;
	}
	public void setVesslog(Integer vesslog) {
		this.vesslog = vesslog;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Double getSp_w_est() {
		return sp_w_est;
	}
	public void setSp_w_est(Double sp_w_est) {
		this.sp_w_est = sp_w_est;
	}
	public Integer getSp_w_id() {
		return sp_w_id;
	}
	public void setSp_w_id(Integer sp_w_id) {
		this.sp_w_id = sp_w_id;
	}
	public Double getSp_c_est() {
		return sp_c_est;
	}
	public void setSp_c_est(Double sp_c_est) {
		this.sp_c_est = sp_c_est;
	}
	public Integer getSp_c_id() {
		return sp_c_id;
	}
	public void setSp_c_id(Integer sp_c_id) {
		this.sp_c_id = sp_c_id;
	}
	public Integer getSp_n_est() {
		return sp_n_est;
	}
	public void setSp_n_est(Integer sp_n_est) {
		this.sp_n_est = sp_n_est;
	}
}
