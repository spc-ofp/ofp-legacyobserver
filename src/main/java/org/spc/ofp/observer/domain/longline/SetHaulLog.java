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
public class SetHaulLog {

	private long setHaulId;
	private long tripId;
	private long eventNo;
	private String set_haul;
	private Date logdate;
	private String logtime;
	private String lat_long;
	private String lon_long;
	private String ez_id;
	private Integer winddir;
	private Integer wind_kts;
	private String sea_id;
	private Integer cloud;
	private String comments; // Only 1 character!
	
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
	public long getEventNo() {
		return eventNo;
	}
	public void setEventNo(long eventNo) {
		this.eventNo = eventNo;
	}
	public String getSet_haul() {
		return set_haul;
	}
	public void setSet_haul(String set_haul) {
		this.set_haul = set_haul;
	}
	public Date getLogdate() {
		return logdate;
	}
	public void setLogdate(Date logdate) {
		this.logdate = logdate;
	}
	public String getLogtime() {
		return logtime;
	}
	public void setLogtime(String logtime) {
		this.logtime = logtime;
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
	public Integer getCloud() {
		return cloud;
	}
	public void setCloud(Integer cloud) {
		this.cloud = cloud;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
