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

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class Gear {
 
    private long tripId;
	private String mline_haul;
	private String c_mline_ha;
	private String bline_haul;
	private String c_bline_ha;
	private String lshoot;
	private String c_lshoot;
	private String bait_thr;
	private String c_bait_thr;
	private String branch_att;
	private String c_branch_a;
	private String weight_sca;
	private String c_weight_s;
	private String mainl_comp;
	private String bline_comp;
	private String mainl_mat;
	private Integer mainl_len;
	private Double mainl_diam;
	private String bline_mat1;
	private String bline_mat2;
	private String bline_mat3;
	private String wire_trace;
	private String sea_water;
	private String blast_free;
	private String ice;
	private String chilled_se;
	private String oth_storag;
	private String hk_japan_s;
	private Integer hk_japan_p;
	private String hk_circle_;
	private Integer hk_circle2;
	private String hk_j_s;
	private Integer hk_j_p;
	private String hk_other_t;
	private String hk_other_s;
	private Integer hk_other_p;
	
	public long getTripId() {
		return tripId;
	}
	public void setTripId(long tripId) {
		this.tripId = tripId;
	}
	public String getMline_haul() {
		return mline_haul;
	}
	public void setMline_haul(String mline_haul) {
		this.mline_haul = mline_haul;
	}
	public String getC_mline_ha() {
		return c_mline_ha;
	}
	public void setC_mline_ha(String c_mline_ha) {
		this.c_mline_ha = c_mline_ha;
	}
	public String getBline_haul() {
		return bline_haul;
	}
	public void setBline_haul(String bline_haul) {
		this.bline_haul = bline_haul;
	}
	public String getC_bline_ha() {
		return c_bline_ha;
	}
	public void setC_bline_ha(String c_bline_ha) {
		this.c_bline_ha = c_bline_ha;
	}
	public String getLshoot() {
		return lshoot;
	}
	public void setLshoot(String lshoot) {
		this.lshoot = lshoot;
	}
	public String getC_lshoot() {
		return c_lshoot;
	}
	public void setC_lshoot(String c_lshoot) {
		this.c_lshoot = c_lshoot;
	}
	public String getBait_thr() {
		return bait_thr;
	}
	public void setBait_thr(String bait_thr) {
		this.bait_thr = bait_thr;
	}
	public String getC_bait_thr() {
		return c_bait_thr;
	}
	public void setC_bait_thr(String c_bait_thr) {
		this.c_bait_thr = c_bait_thr;
	}
	public String getBranch_att() {
		return branch_att;
	}
	public void setBranch_att(String branch_att) {
		this.branch_att = branch_att;
	}
	public String getC_branch_a() {
		return c_branch_a;
	}
	public void setC_branch_a(String c_branch_a) {
		this.c_branch_a = c_branch_a;
	}
	public String getWeight_sca() {
		return weight_sca;
	}
	public void setWeight_sca(String weight_sca) {
		this.weight_sca = weight_sca;
	}
	public String getC_weight_s() {
		return c_weight_s;
	}
	public void setC_weight_s(String c_weight_s) {
		this.c_weight_s = c_weight_s;
	}
	public String getMainl_comp() {
		return mainl_comp;
	}
	public void setMainl_comp(String mainl_comp) {
		this.mainl_comp = mainl_comp;
	}
	public String getBline_comp() {
		return bline_comp;
	}
	public void setBline_comp(String bline_comp) {
		this.bline_comp = bline_comp;
	}
	public String getMainl_mat() {
		return mainl_mat;
	}
	public void setMainl_mat(String mainl_mat) {
		this.mainl_mat = mainl_mat;
	}
	public Integer getMainl_len() {
		return mainl_len;
	}
	public void setMainl_len(Integer mainl_len) {
		this.mainl_len = mainl_len;
	}
	public Double getMainl_diam() {
		return mainl_diam;
	}
	public void setMainl_diam(Double mainl_diam) {
		this.mainl_diam = mainl_diam;
	}
	public String getBline_mat1() {
		return bline_mat1;
	}
	public void setBline_mat1(String bline_mat1) {
		this.bline_mat1 = bline_mat1;
	}
	public String getBline_mat2() {
		return bline_mat2;
	}
	public void setBline_mat2(String bline_mat2) {
		this.bline_mat2 = bline_mat2;
	}
	public String getBline_mat3() {
		return bline_mat3;
	}
	public void setBline_mat3(String bline_mat3) {
		this.bline_mat3 = bline_mat3;
	}
	public String getWire_trace() {
		return wire_trace;
	}
	public void setWire_trace(String wire_trace) {
		this.wire_trace = wire_trace;
	}
	public String getSea_water() {
		return sea_water;
	}
	public void setSea_water(String sea_water) {
		this.sea_water = sea_water;
	}
	public String getBlast_free() {
		return blast_free;
	}
	public void setBlast_free(String blast_free) {
		this.blast_free = blast_free;
	}
	public String getIce() {
		return ice;
	}
	public void setIce(String ice) {
		this.ice = ice;
	}
	public String getChilled_se() {
		return chilled_se;
	}
	public void setChilled_se(String chilled_se) {
		this.chilled_se = chilled_se;
	}
	public String getOth_storag() {
		return oth_storag;
	}
	public void setOth_storag(String oth_storag) {
		this.oth_storag = oth_storag;
	}
	public String getHk_japan_s() {
		return hk_japan_s;
	}
	public void setHk_japan_s(String hk_japan_s) {
		this.hk_japan_s = hk_japan_s;
	}
	public Integer getHk_japan_p() {
		return hk_japan_p;
	}
	public void setHk_japan_p(Integer hk_japan_p) {
		this.hk_japan_p = hk_japan_p;
	}
	public String getHk_circle_() {
		return hk_circle_;
	}
	public void setHk_circle_(String hk_circle_) {
		this.hk_circle_ = hk_circle_;
	}
	public Integer getHk_circle2() {
		return hk_circle2;
	}
	public void setHk_circle2(Integer hk_circle2) {
		this.hk_circle2 = hk_circle2;
	}
	public String getHk_j_s() {
		return hk_j_s;
	}
	public void setHk_j_s(String hk_j_s) {
		this.hk_j_s = hk_j_s;
	}
	public Integer getHk_j_p() {
		return hk_j_p;
	}
	public void setHk_j_p(Integer hk_j_p) {
		this.hk_j_p = hk_j_p;
	}
	public String getHk_other_t() {
		return hk_other_t;
	}
	public void setHk_other_t(String hk_other_t) {
		this.hk_other_t = hk_other_t;
	}
	public String getHk_other_s() {
		return hk_other_s;
	}
	public void setHk_other_s(String hk_other_s) {
		this.hk_other_s = hk_other_s;
	}
	public Integer getHk_other_p() {
		return hk_other_p;
	}
	public void setHk_other_p(Integer hk_other_p) {
		this.hk_other_p = hk_other_p;
	}

}
