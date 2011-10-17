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
public class SetCatch {

	private long id;
	private long setHaulId;
	private long tripId;
	private Date cdate;
	private String ctime;
	private Integer sample_no;
	private Integer hook_no;
	private String sp_id;
	private String cond_id;
	private String cond_2_id;
	private String fate_id;
	private Integer len;
	private String len_id;
	private Integer wt;
	private Integer wt_est;
	private Integer wt_est_rel;
	private String wt_id;
	private String sex_id;
	private String gonad;
	private String comments;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSetHaulId() {
		return setHaulId;
	}
	public void setSetHaulId(long setHaulId) {
		this.setHaulId = setHaulId;
	}
	public long getTripId() {
		return tripId;
	}
	public void setTripId(long tripId) {
		this.tripId = tripId;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public Integer getSample_no() {
		return sample_no;
	}
	public void setSample_no(Integer sample_no) {
		this.sample_no = sample_no;
	}
	public Integer getHook_no() {
		return hook_no;
	}
	public void setHook_no(Integer hook_no) {
		this.hook_no = hook_no;
	}
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}
	public String getCond_id() {
		return cond_id;
	}
	public void setCond_id(String cond_id) {
		this.cond_id = cond_id;
	}
	public String getCond_2_id() {
		return cond_2_id;
	}
	public void setCond_2_id(String cond_2_id) {
		this.cond_2_id = cond_2_id;
	}
	public String getFate_id() {
		return fate_id;
	}
	public void setFate_id(String fate_id) {
		this.fate_id = fate_id;
	}
	public Integer getLen() {
		return len;
	}
	public void setLen(Integer len) {
		this.len = len;
	}
	public String getLen_id() {
		return len_id;
	}
	public void setLen_id(String len_id) {
		this.len_id = len_id;
	}
	public Integer getWt() {
		return wt;
	}
	public void setWt(Integer wt) {
		this.wt = wt;
	}
	public Integer getWt_est() {
		return wt_est;
	}
	public void setWt_est(Integer wt_est) {
		this.wt_est = wt_est;
	}
	public Integer getWt_est_rel() {
		return wt_est_rel;
	}
	public void setWt_est_rel(Integer wt_est_rel) {
		this.wt_est_rel = wt_est_rel;
	}
	public String getWt_id() {
		return wt_id;
	}
	public void setWt_id(String wt_id) {
		this.wt_id = wt_id;
	}
	public String getSex_id() {
		return sex_id;
	}
	public void setSex_id(String sex_id) {
		this.sex_id = sex_id;
	}
	public String getGonad() {
		return gonad;
	}
	public void setGonad(String gonad) {
		this.gonad = gonad;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
