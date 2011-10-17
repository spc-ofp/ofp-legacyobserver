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
public class Gear {
 
    private long tripId;
	private String pb_model;
	private Integer pb_power;
	private Integer pb_speed;
	private String pw_model;
	private Integer pw_power;
	private Integer pw_speed;
	private Integer net_depth_;
	private String net_depth2;
	private Integer net_length;
	private String net_lengt2;
	private Integer net_strips;
	private Integer mesh_main;
	private String mesh_main_;
	private Integer net_hang;
	private Double brail_size;
	private Double brail_siz2;
	private String brail_type;
	
	public long getTripId() {
		return tripId;
	}
	public void setTripId(long tripId) {
		this.tripId = tripId;
	}
	public String getPb_model() {
		return pb_model;
	}
	public void setPb_model(String pb_model) {
		this.pb_model = pb_model;
	}
	public Integer getPb_power() {
		return pb_power;
	}
	public void setPb_power(Integer pb_power) {
		this.pb_power = pb_power;
	}
	public Integer getPb_speed() {
		return pb_speed;
	}
	public void setPb_speed(Integer pb_speed) {
		this.pb_speed = pb_speed;
	}
	public String getPw_model() {
		return pw_model;
	}
	public void setPw_model(String pw_model) {
		this.pw_model = pw_model;
	}
	public Integer getPw_power() {
		return pw_power;
	}
	public void setPw_power(Integer pw_power) {
		this.pw_power = pw_power;
	}
	public Integer getPw_speed() {
		return pw_speed;
	}
	public void setPw_speed(Integer pw_speed) {
		this.pw_speed = pw_speed;
	}
	public Integer getNet_depth_() {
		return net_depth_;
	}
	public void setNet_depth_(Integer net_depth_) {
		this.net_depth_ = net_depth_;
	}
	public String getNet_depth2() {
		return net_depth2;
	}
	public void setNet_depth2(String net_depth2) {
		this.net_depth2 = net_depth2;
	}
	public Integer getNet_length() {
		return net_length;
	}
	public void setNet_length(Integer net_length) {
		this.net_length = net_length;
	}
	public String getNet_lengt2() {
		return net_lengt2;
	}
	public void setNet_lengt2(String net_lengt2) {
		this.net_lengt2 = net_lengt2;
	}
	public Integer getNet_strips() {
		return net_strips;
	}
	public void setNet_strips(Integer net_strips) {
		this.net_strips = net_strips;
	}
	public Integer getMesh_main() {
		return mesh_main;
	}
	public void setMesh_main(Integer mesh_main) {
		this.mesh_main = mesh_main;
	}
	public String getMesh_main_() {
		return mesh_main_;
	}
	public void setMesh_main_(String mesh_main_) {
		this.mesh_main_ = mesh_main_;
	}
	public Integer getNet_hang() {
		return net_hang;
	}
	public void setNet_hang(Integer net_hang) {
		this.net_hang = net_hang;
	}
	public Double getBrail_size() {
		return brail_size;
	}
	public void setBrail_size(Double brail_size) {
		this.brail_size = brail_size;
	}
	public Double getBrail_siz2() {
		return brail_siz2;
	}
	public void setBrail_siz2(Double brail_siz2) {
		this.brail_siz2 = brail_siz2;
	}
	public String getBrail_type() {
		return brail_type;
	}
	public void setBrail_type(String brail_type) {
		this.brail_type = brail_type;
	}
}
