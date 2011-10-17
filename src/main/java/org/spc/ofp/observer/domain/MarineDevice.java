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
public class MarineDevice {

	private long id;
	private String description;
	private String category;
	private String gearList;
	private Integer order_l;
	private Integer order_s;
	private Integer order_p;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGearList() {
		return gearList;
	}
	public void setGearList(String gearList) {
		this.gearList = gearList;
	}
	public Integer getOrder_l() {
		return order_l;
	}
	public void setOrder_l(Integer order_l) {
		this.order_l = order_l;
	}
	public Integer getOrder_s() {
		return order_s;
	}
	public void setOrder_s(Integer order_s) {
		this.order_s = order_s;
	}
	public Integer getOrder_p() {
		return order_p;
	}
	public void setOrder_p(Integer order_p) {
		this.order_p = order_p;
	}
}
