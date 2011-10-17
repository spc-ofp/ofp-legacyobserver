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
public class VesselAttribute {
 
    private long tripId;
	private Integer boat_id;
	private String owner;
	private Integer n_speed;
	private Integer n_tow;
	private Boolean tenderboat;
	private Integer n_light;
	private Integer skiff_hp;
	private String skiff_make;
	private Double v_speed;
	private String heli_make;
	private String heli_model;
	private String heli_reg_n;
	private Integer heli_range;
	private String heli_rang2;
	private String heli_colr;
	private Integer heli_nbves;
	
	public long getTripId() {
		return tripId;
	}
	public void setTripId(long tripId) {
		this.tripId = tripId;
	}
	public Integer getBoat_id() {
		return boat_id;
	}
	public void setBoat_id(Integer boat_id) {
		this.boat_id = boat_id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Integer getN_speed() {
		return n_speed;
	}
	public void setN_speed(Integer n_speed) {
		this.n_speed = n_speed;
	}
	public Integer getN_tow() {
		return n_tow;
	}
	public void setN_tow(Integer n_tow) {
		this.n_tow = n_tow;
	}
	public Boolean getTenderboat() {
		return tenderboat;
	}
	public void setTenderboat(Boolean tenderboat) {
		this.tenderboat = tenderboat;
	}
	public Integer getN_light() {
		return n_light;
	}
	public void setN_light(Integer n_light) {
		this.n_light = n_light;
	}
	public Integer getSkiff_hp() {
		return skiff_hp;
	}
	public void setSkiff_hp(Integer skiff_hp) {
		this.skiff_hp = skiff_hp;
	}
	public String getSkiff_make() {
		return skiff_make;
	}
	public void setSkiff_make(String skiff_make) {
		this.skiff_make = skiff_make;
	}
	public Double getV_speed() {
		return v_speed;
	}
	public void setV_speed(Double v_speed) {
		this.v_speed = v_speed;
	}
	public String getHeli_make() {
		return heli_make;
	}
	public void setHeli_make(String heli_make) {
		this.heli_make = heli_make;
	}
	public String getHeli_model() {
		return heli_model;
	}
	public void setHeli_model(String heli_model) {
		this.heli_model = heli_model;
	}
	public String getHeli_reg_n() {
		return heli_reg_n;
	}
	public void setHeli_reg_n(String heli_reg_n) {
		this.heli_reg_n = heli_reg_n;
	}
	public Integer getHeli_range() {
		return heli_range;
	}
	public void setHeli_range(Integer heli_range) {
		this.heli_range = heli_range;
	}
	public String getHeli_rang2() {
		return heli_rang2;
	}
	public void setHeli_rang2(String heli_rang2) {
		this.heli_rang2 = heli_rang2;
	}
	public String getHeli_colr() {
		return heli_colr;
	}
	public void setHeli_colr(String heli_colr) {
		this.heli_colr = heli_colr;
	}
	public Integer getHeli_nbves() {
		return heli_nbves;
	}
	public void setHeli_nbves(Integer heli_nbves) {
		this.heli_nbves = heli_nbves;
	}

}
