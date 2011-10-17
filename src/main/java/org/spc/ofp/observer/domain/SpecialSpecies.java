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
package org.spc.ofp.observer.domain;

import java.util.Date;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class SpecialSpecies {

	private long id;
	private long tripId;
	private Integer landed;
	private Date date_land;
	private String time_land;
	private Date date_inter;
	private String time_inter;
	private String latitude;
	private String longitude;
	private String sp_id;
	private String sp_desc;
	private String ld_cond_id;
	private String ld_cond_de;
	private String ld_handlin;
	private Double ld_len;
	private String ld_len_cod;
	private String ld_sex;
	private String dsc_cond_i;
	private String dsc_cond_d;
	private Integer vess_act;
	private String vess_act_o;
	private String int_cond_i;
	private String int_cond_d;
	private String inte_cond_;
	private String inte_cond2;
	private String int_descrip;
	private Integer sgt_act;
	private String sgt_act_ot;
	private Integer sgt_nb;
	private Integer sgt_nb_ad;
	private Integer sgt_nb_ju;
	private String sgt_len;
	private Double sgt_dist;
	private String sgt_dis_un;
	private String sgt_behav;
	private String tag_ret_no;
	private String tag_ret_ty;
	private String tag_ret_or;
	private String tag_pla_no;
	private String tag_pla_ty;
	private String tag_pla_or;
	
	public long getTripId() {
		return tripId;
	}
	public void setTripId(long tripId) {
		this.tripId = tripId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate_land() {
		return date_land;
	}
	public void setDate_land(Date date_land) {
		this.date_land = date_land;
	}
	public String getTime_land() {
		return time_land;
	}
	public void setTime_land(String time_land) {
		this.time_land = time_land;
	}
	public Date getDate_inter() {
		return date_inter;
	}
	public void setDate_inter(Date date_inter) {
		this.date_inter = date_inter;
	}
	public String getTime_inter() {
		return time_inter;
	}
	public void setTime_inter(String time_inter) {
		this.time_inter = time_inter;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}
	public String getSp_desc() {
		return sp_desc;
	}
	public void setSp_desc(String sp_desc) {
		this.sp_desc = sp_desc;
	}
	public String getLd_cond_id() {
		return ld_cond_id;
	}
	public void setLd_cond_id(String ld_cond_id) {
		this.ld_cond_id = ld_cond_id;
	}
	public String getLd_cond_de() {
		return ld_cond_de;
	}
	public void setLd_cond_de(String ld_cond_de) {
		this.ld_cond_de = ld_cond_de;
	}
	public String getLd_handlin() {
		return ld_handlin;
	}
	public void setLd_handlin(String ld_handlin) {
		this.ld_handlin = ld_handlin;
	}
	public Double getLd_len() {
		return ld_len;
	}
	public void setLd_len(Double ld_len) {
		this.ld_len = ld_len;
	}
	public String getLd_len_cod() {
		return ld_len_cod;
	}
	public void setLd_len_cod(String ld_len_cod) {
		this.ld_len_cod = ld_len_cod;
	}
	public String getLd_sex() {
		return ld_sex;
	}
	public void setLd_sex(String ld_sex) {
		this.ld_sex = ld_sex;
	}
	public String getDsc_cond_i() {
		return dsc_cond_i;
	}
	public void setDsc_cond_i(String dsc_cond_i) {
		this.dsc_cond_i = dsc_cond_i;
	}
	public String getDsc_cond_d() {
		return dsc_cond_d;
	}
	public void setDsc_cond_d(String dsc_cond_d) {
		this.dsc_cond_d = dsc_cond_d;
	}
	public Integer getVess_act() {
		return vess_act;
	}
	public void setVess_act(Integer vess_act) {
		this.vess_act = vess_act;
	}
	public String getVess_act_o() {
		return vess_act_o;
	}
	public void setVess_act_o(String vess_act_o) {
		this.vess_act_o = vess_act_o;
	}
	public String getInt_cond_i() {
		return int_cond_i;
	}
	public void setInt_cond_i(String int_cond_i) {
		this.int_cond_i = int_cond_i;
	}
	public String getInt_cond_d() {
		return int_cond_d;
	}
	public void setInt_cond_d(String int_cond_d) {
		this.int_cond_d = int_cond_d;
	}
	public String getInte_cond_() {
		return inte_cond_;
	}
	public void setInte_cond_(String inte_cond_) {
		this.inte_cond_ = inte_cond_;
	}
	public String getInte_cond2() {
		return inte_cond2;
	}
	public void setInte_cond2(String inte_cond2) {
		this.inte_cond2 = inte_cond2;
	}
	public String getInt_descrip() {
		return int_descrip;
	}
	public void setInt_descrip(String int_descrip) {
		this.int_descrip = int_descrip;
	}
	public Integer getSgt_act() {
		return sgt_act;
	}
	public void setSgt_act(Integer sgt_act) {
		this.sgt_act = sgt_act;
	}
	public String getSgt_act_ot() {
		return sgt_act_ot;
	}
	public void setSgt_act_ot(String sgt_act_ot) {
		this.sgt_act_ot = sgt_act_ot;
	}
	public Integer getSgt_nb() {
		return sgt_nb;
	}
	public void setSgt_nb(Integer sgt_nb) {
		this.sgt_nb = sgt_nb;
	}
	public Integer getSgt_nb_ad() {
		return sgt_nb_ad;
	}
	public void setSgt_nb_ad(Integer sgt_nb_ad) {
		this.sgt_nb_ad = sgt_nb_ad;
	}
	public Integer getSgt_nb_ju() {
		return sgt_nb_ju;
	}
	public void setSgt_nb_ju(Integer sgt_nb_ju) {
		this.sgt_nb_ju = sgt_nb_ju;
	}
	public String getSgt_len() {
		return sgt_len;
	}
	public void setSgt_len(String sgt_len) {
		this.sgt_len = sgt_len;
	}
	public Double getSgt_dist() {
		return sgt_dist;
	}
	public void setSgt_dist(Double sgt_dist) {
		this.sgt_dist = sgt_dist;
	}
	public String getSgt_dis_un() {
		return sgt_dis_un;
	}
	public void setSgt_dis_un(String sgt_dis_un) {
		this.sgt_dis_un = sgt_dis_un;
	}
	public String getSgt_behav() {
		return sgt_behav;
	}
	public void setSgt_behav(String sgt_behav) {
		this.sgt_behav = sgt_behav;
	}
	public String getTag_ret_no() {
		return tag_ret_no;
	}
	public void setTag_ret_no(String tag_ret_no) {
		this.tag_ret_no = tag_ret_no;
	}
	public String getTag_ret_ty() {
		return tag_ret_ty;
	}
	public void setTag_ret_ty(String tag_ret_ty) {
		this.tag_ret_ty = tag_ret_ty;
	}
	public String getTag_ret_or() {
		return tag_ret_or;
	}
	public void setTag_ret_or(String tag_ret_or) {
		this.tag_ret_or = tag_ret_or;
	}
	public String getTag_pla_no() {
		return tag_pla_no;
	}
	public void setTag_pla_no(String tag_pla_no) {
		this.tag_pla_no = tag_pla_no;
	}
	public String getTag_pla_ty() {
		return tag_pla_ty;
	}
	public void setTag_pla_ty(String tag_pla_ty) {
		this.tag_pla_ty = tag_pla_ty;
	}
	public String getTag_pla_or() {
		return tag_pla_or;
	}
	public void setTag_pla_or(String tag_pla_or) {
		this.tag_pla_or = tag_pla_or;
	}
	public Integer getLanded() {
		return landed;
	}
	public void setLanded(Integer landed) {
		this.landed = landed;
	}
}
