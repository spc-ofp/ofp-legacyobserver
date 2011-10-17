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

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class Vessel {

	private long id;
	private long ffaVid;
	private String gearType;
	private String name;
	private String registrationNumber;
	private String flag;
	private String c_boat_id;
	private Double grossTonnage;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFfaVid() {
		return ffaVid;
	}
	public void setFfaVid(long ffaVid) {
		this.ffaVid = ffaVid;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public Double getGrossTonnage() {
		return grossTonnage;
	}
	public void setGrossTonnage(Double grossTonnage) {
		this.grossTonnage = grossTonnage;
	}
	public String getC_boat_id() {
		return c_boat_id;
	}
	public void setC_boat_id(String c_boat_id) {
		this.c_boat_id = c_boat_id;
	}
}
