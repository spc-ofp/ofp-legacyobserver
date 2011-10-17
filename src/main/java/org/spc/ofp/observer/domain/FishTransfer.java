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
public class FishTransfer {

	private long id;
	private long tripId;
	private Date date;
	private String time;
	private String latitude;
	private String longitude;
	private String r_name;
	private String r_callsign;
	private String r_flag;
	private Double skj_c;
	private Double yft_c;
	private Double bet_c;
	private Double mix_c;
	private String transfer;
	private String comment;
	
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
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_callsign() {
		return r_callsign;
	}
	public void setR_callsign(String r_callsign) {
		this.r_callsign = r_callsign;
	}
	public String getR_flag() {
		return r_flag;
	}
	public void setR_flag(String r_flag) {
		this.r_flag = r_flag;
	}
	public Double getSkj_c() {
		return skj_c;
	}
	public void setSkj_c(Double skj_c) {
		this.skj_c = skj_c;
	}
	public Double getYft_c() {
		return yft_c;
	}
	public void setYft_c(Double yft_c) {
		this.yft_c = yft_c;
	}
	public Double getBet_c() {
		return bet_c;
	}
	public void setBet_c(Double bet_c) {
		this.bet_c = bet_c;
	}
	public Double getMix_c() {
		return mix_c;
	}
	public void setMix_c(Double mix_c) {
		this.mix_c = mix_c;
	}
	public String getTransfer() {
		return transfer;
	}
	public void setTransfer(String transfer) {
		this.transfer = transfer;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
