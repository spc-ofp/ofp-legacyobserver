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
public class FieldStaff {

	
	/*
	 * SELECT DISTINCT field_staff.staff_id, NZ([first_name],"") AS [first], NZ([last_name],"") AS [last], IIf(DLookUp("port_id","Ref_Ports","Port_id=" & [field_staff].[baseport_id]) Is Null,0,[field_staff].[baseport_id]) AS port, IIf(DLookUp("country_code","Ref_countries","Country_code='" & [field_staff].[co_id] & "'") Is Null,"XX",[field_staff].[co_id]) AS Co
FROM obs_trip INNER JOIN field_staff ON obs_trip.obsv_id = field_staff.staff_id;
	 */
	
	private String staffCode;
	private String firstName;
	private String lastName;
	private String homePort;
	private String homeCountry;
	
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHomePort() {
		return homePort;
	}
	public void setHomePort(String homePort) {
		this.homePort = homePort;
	}
	public String getHomeCountry() {
		return homeCountry;
	}
	public void setHomeCountry(String homeCountry) {
		this.homeCountry = homeCountry;
	}
}
