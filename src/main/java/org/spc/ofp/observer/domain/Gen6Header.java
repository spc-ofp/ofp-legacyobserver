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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class Gen6Header {
 
    private long id;
	private long tripId;
	private Date date;
	private String time;
	private String latitude;
	private String longitude;
	private String ez_id;
	private Integer winddir;
	private Integer windspeed;
	private String seacond;
	private Double current;
	private Integer currentdir;
	private Integer act_id;
	private String vesselname;
	private String ircs;
	private Integer vesseltype;
	private Integer bearing;
	private Double distance;
	private Boolean stickers;
	private Boolean marpol;
	private Boolean infringeme;
	private Boolean photos;
	private String comments;
	
	private List<Gen6Detail> details = new ArrayList<Gen6Detail>();
	
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
	public Integer getWinddir() {
		return winddir;
	}
	public void setWinddir(Integer winddir) {
		this.winddir = winddir;
	}
	public Integer getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(Integer windspeed) {
		this.windspeed = windspeed;
	}
	public String getSeacond() {
		return seacond;
	}
	public void setSeacond(String seacond) {
		this.seacond = seacond;
	}
	public Double getCurrent() {
		return current;
	}
	public void setCurrent(Double current) {
		this.current = current;
	}
	public Integer getCurrentdir() {
		return currentdir;
	}
	public void setCurrentdir(Integer currentdir) {
		this.currentdir = currentdir;
	}
	public Integer getAct_id() {
		return act_id;
	}
	public void setAct_id(Integer act_id) {
		this.act_id = act_id;
	}
	public String getVesselname() {
		return vesselname;
	}
	public void setVesselname(String vesselname) {
		this.vesselname = vesselname;
	}
	public String getIrcs() {
		return ircs;
	}
	public void setIrcs(String ircs) {
		this.ircs = ircs;
	}
	public Integer getVesseltype() {
		return vesseltype;
	}
	public void setVesseltype(Integer vesseltype) {
		this.vesseltype = vesseltype;
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
	public Boolean getStickers() {
		return stickers;
	}
	public void setStickers(Boolean stickers) {
		this.stickers = stickers;
	}
	public Boolean getMarpol() {
		return marpol;
	}
	public void setMarpol(Boolean marpol) {
		this.marpol = marpol;
	}
	public Boolean getInfringeme() {
		return infringeme;
	}
	public void setInfringeme(Boolean infringeme) {
		this.infringeme = infringeme;
	}
	public Boolean getPhotos() {
		return photos;
	}
	public void setPhotos(Boolean photos) {
		this.photos = photos;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public List<Gen6Detail> getDetails() {
		return details;
	}
	public boolean addDetail(final Gen6Detail detail) {
		return details.add(detail);
	}
	public boolean addDetails(final Collection<Gen6Detail> detail) {
		return details.addAll(detail);
	}
}
