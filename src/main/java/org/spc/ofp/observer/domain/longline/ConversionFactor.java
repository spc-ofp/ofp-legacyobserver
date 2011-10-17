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
public class ConversionFactor {
	
	private long setHaulId;
	private long tripId;
	private Date cdate;
	private String ctime;
	private String sp_id;
	private Integer len_tt;
	private Integer len_uf;
	private Integer len_us;
	private Integer len_lf;
	private Integer len_pf;
	private Integer len_ps;
	private Integer len_sl;
	private Integer len_eo;
	private Integer len_ck;
	private Integer len_tl;
	private Integer len_cu;
	private Double wt_ww;
	private Double wt_head;
	private Double wt_tail;
	private Double wt_guts;
	private Double wt_pr;
	private String wt_pr_id;
	private String label_no;
	private Double wt_ld;
	private String wt_ld_id;
	
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
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}
	public Integer getLen_tt() {
		return len_tt;
	}
	public void setLen_tt(Integer len_tt) {
		this.len_tt = len_tt;
	}
	public Integer getLen_uf() {
		return len_uf;
	}
	public void setLen_uf(Integer len_uf) {
		this.len_uf = len_uf;
	}
	public Integer getLen_us() {
		return len_us;
	}
	public void setLen_us(Integer len_us) {
		this.len_us = len_us;
	}
	public Integer getLen_lf() {
		return len_lf;
	}
	public void setLen_lf(Integer len_lf) {
		this.len_lf = len_lf;
	}
	public Integer getLen_pf() {
		return len_pf;
	}
	public void setLen_pf(Integer len_pf) {
		this.len_pf = len_pf;
	}
	public Integer getLen_ps() {
		return len_ps;
	}
	public void setLen_ps(Integer len_ps) {
		this.len_ps = len_ps;
	}
	public Integer getLen_sl() {
		return len_sl;
	}
	public void setLen_sl(Integer len_sl) {
		this.len_sl = len_sl;
	}
	public Integer getLen_eo() {
		return len_eo;
	}
	public void setLen_eo(Integer len_eo) {
		this.len_eo = len_eo;
	}
	public Integer getLen_ck() {
		return len_ck;
	}
	public void setLen_ck(Integer len_ck) {
		this.len_ck = len_ck;
	}
	public Integer getLen_tl() {
		return len_tl;
	}
	public void setLen_tl(Integer len_tl) {
		this.len_tl = len_tl;
	}
	public Integer getLen_cu() {
		return len_cu;
	}
	public void setLen_cu(Integer len_cu) {
		this.len_cu = len_cu;
	}
	public Double getWt_ww() {
		return wt_ww;
	}
	public void setWt_ww(Double wt_ww) {
		this.wt_ww = wt_ww;
	}
	public Double getWt_head() {
		return wt_head;
	}
	public void setWt_head(Double wt_head) {
		this.wt_head = wt_head;
	}
	public Double getWt_tail() {
		return wt_tail;
	}
	public void setWt_tail(Double wt_tail) {
		this.wt_tail = wt_tail;
	}
	public Double getWt_guts() {
		return wt_guts;
	}
	public void setWt_guts(Double wt_guts) {
		this.wt_guts = wt_guts;
	}
	public Double getWt_pr() {
		return wt_pr;
	}
	public void setWt_pr(Double wt_pr) {
		this.wt_pr = wt_pr;
	}
	public String getWt_pr_id() {
		return wt_pr_id;
	}
	public void setWt_pr_id(String wt_pr_id) {
		this.wt_pr_id = wt_pr_id;
	}
	public String getLabel_no() {
		return label_no;
	}
	public void setLabel_no(String label_no) {
		this.label_no = label_no;
	}
	public Double getWt_ld() {
		return wt_ld;
	}
	public void setWt_ld(Double wt_ld) {
		this.wt_ld = wt_ld;
	}
	public String getWt_ld_id() {
		return wt_ld_id;
	}
	public void setWt_ld_id(String wt_ld_id) {
		this.wt_ld_id = wt_ld_id;
	}
}
