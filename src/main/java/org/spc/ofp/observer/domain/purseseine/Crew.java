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
public class Crew {
 
    private long id;
	private long tripId;
	private String position_i;
	private String name;
	private String flag_id;
	private Integer exp_yr;
	private Integer exp_mo;
	private String comments;
	
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
	public String getPosition_i() {
		return position_i;
	}
	public void setPosition_i(String position_i) {
		this.position_i = position_i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlag_id() {
		return flag_id;
	}
	public void setFlag_id(String flag_id) {
		this.flag_id = flag_id;
	}
	public Integer getExp_yr() {
		return exp_yr;
	}
	public void setExp_yr(Integer exp_yr) {
		this.exp_yr = exp_yr;
	}
	public Integer getExp_mo() {
		return exp_mo;
	}
	public void setExp_mo(Integer exp_mo) {
		this.exp_mo = exp_mo;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
