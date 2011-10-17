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
public class VesselSighting {

	private long id;
	private long tripId;
	private Date date;
	private String time;
	private String latitude;
	private String longitude;
	private String ez_id;
	private String s_name;
	private String s_callsign;
	private String s_flag;
	private Integer s_type;
	private Integer bearing;
	private Double distance;
	private String dist_unit;
	private Integer activity;
	private String photo_no;
	private String comment;
	private Integer activity_o;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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
	public String getEz_id() {
		return ez_id;
	}
	public void setEz_id(String ez_id) {
		this.ez_id = ez_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_callsign() {
		return s_callsign;
	}
	public void setS_callsign(String s_callsign) {
		this.s_callsign = s_callsign;
	}
	public String getS_flag() {
		return s_flag;
	}
	public void setS_flag(String s_flag) {
		this.s_flag = s_flag;
	}
	public Integer getS_type() {
		return s_type;
	}
	public void setS_type(Integer s_type) {
		this.s_type = s_type;
	}
	public Integer getBearing() {
		return bearing;
	}
	public void setBearing(Integer bearing) {
		this.bearing = bearing;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public String getDist_unit() {
		return dist_unit;
	}
	public void setDist_unit(String dist_unit) {
		this.dist_unit = dist_unit;
	}
	public Integer getActivity() {
		return activity;
	}
	public void setActivity(Integer activity) {
		this.activity = activity;
	}
	public String getPhoto_no() {
		return photo_no;
	}
	public void setPhoto_no(String photo_no) {
		this.photo_no = photo_no;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getActivity_o() {
		return activity_o;
	}
	public void setActivity_o(Integer activity_o) {
		this.activity_o = activity_o;
	}	
}
