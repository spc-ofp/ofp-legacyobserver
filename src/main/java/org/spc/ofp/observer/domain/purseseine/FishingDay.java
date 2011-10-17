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

import java.util.Date;
 
/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class FishingDay {
 
    private long id;
	private long tripId;
	private Date daydate;
	private String daytime;
	private Date utc_date;
	private String utc_time;
	private Integer lognofsh;
	private Integer log_fsh;
	private Integer sch_fsh;
	private Integer fad_fsh;
	private Integer fadnofsh;
	
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
	public Date getDaydate() {
		return daydate;
	}
	public void setDaydate(Date daydate) {
		this.daydate = daydate;
	}
	public String getDaytime() {
		return daytime;
	}
	public void setDaytime(String daytime) {
		this.daytime = daytime;
	}
	public Date getUtc_date() {
		return utc_date;
	}
	public void setUtc_date(Date utc_date) {
		this.utc_date = utc_date;
	}
	public String getUtc_time() {
		return utc_time;
	}
	public void setUtc_time(String utc_time) {
		this.utc_time = utc_time;
	}
	public Integer getLognofsh() {
		return lognofsh;
	}
	public void setLognofsh(Integer lognofsh) {
		this.lognofsh = lognofsh;
	}
	public Integer getLog_fsh() {
		return log_fsh;
	}
	public void setLog_fsh(Integer log_fsh) {
		this.log_fsh = log_fsh;
	}
	public Integer getSch_fsh() {
		return sch_fsh;
	}
	public void setSch_fsh(Integer sch_fsh) {
		this.sch_fsh = sch_fsh;
	}
	public Integer getFad_fsh() {
		return fad_fsh;
	}
	public void setFad_fsh(Integer fad_fsh) {
		this.fad_fsh = fad_fsh;
	}
	public Integer getFadnofsh() {
		return fadnofsh;
	}
	public void setFadnofsh(Integer fadnofsh) {
		this.fadnofsh = fadnofsh;
	}
}
