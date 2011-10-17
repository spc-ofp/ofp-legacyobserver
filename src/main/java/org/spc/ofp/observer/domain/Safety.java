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
public class Safety {
 
    private long id;
	private long tripId;
	private Integer lj_provid;
	private Boolean lj_sizeok;
	private Integer lj_avail;
	private Integer nbbuoys;
	private String epi1_type;
	private Integer epi1_no;
	private String epi2_type;
	private Integer epi2_no;
	private Integer lr1_capac;
	private Integer lr2_capac;
	private Integer lr3_capac;
	private Integer lr4_capac;
	private Date lr1_expiry;
	private Date lr2_expiry;
	private Date lr3_expiry;
	private Date lr4_expiry;
	private String lr1_type;
	private String lr2_type;
	private String lr3_type;
	private String lr4_type;
	
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
	public Integer getLj_provid() {
		return lj_provid;
	}
	public void setLj_provid(Integer lj_provid) {
		this.lj_provid = lj_provid;
	}
	public Boolean getLj_sizeok() {
		return lj_sizeok;
	}
	public void setLj_sizeok(Boolean lj_sizeok) {
		this.lj_sizeok = lj_sizeok;
	}
	public Integer getLj_avail() {
		return lj_avail;
	}
	public void setLj_avail(Integer lj_avail) {
		this.lj_avail = lj_avail;
	}
	public Integer getNbbuoys() {
		return nbbuoys;
	}
	public void setNbbuoys(Integer nbbuoys) {
		this.nbbuoys = nbbuoys;
	}
	public String getEpi1_type() {
		return epi1_type;
	}
	public void setEpi1_type(String epi1_type) {
		this.epi1_type = epi1_type;
	}
	public Integer getEpi1_no() {
		return epi1_no;
	}
	public void setEpi1_no(Integer epi1_no) {
		this.epi1_no = epi1_no;
	}
	public String getEpi2_type() {
		return epi2_type;
	}
	public void setEpi2_type(String epi2_type) {
		this.epi2_type = epi2_type;
	}
	public Integer getEpi2_no() {
		return epi2_no;
	}
	public void setEpi2_no(Integer epi2_no) {
		this.epi2_no = epi2_no;
	}
	public Integer getLr1_capac() {
		return lr1_capac;
	}
	public void setLr1_capac(Integer lr1_capac) {
		this.lr1_capac = lr1_capac;
	}
	public Integer getLr2_capac() {
		return lr2_capac;
	}
	public void setLr2_capac(Integer lr2_capac) {
		this.lr2_capac = lr2_capac;
	}
	public Integer getLr3_capac() {
		return lr3_capac;
	}
	public void setLr3_capac(Integer lr3_capac) {
		this.lr3_capac = lr3_capac;
	}
	public Integer getLr4_capac() {
		return lr4_capac;
	}
	public void setLr4_capac(Integer lr4_capac) {
		this.lr4_capac = lr4_capac;
	}
	public Date getLr1_expiry() {
		return lr1_expiry;
	}
	public void setLr1_expiry(Date lr1_expiry) {
		this.lr1_expiry = lr1_expiry;
	}
	public Date getLr2_expiry() {
		return lr2_expiry;
	}
	public void setLr2_expiry(Date lr2_expiry) {
		this.lr2_expiry = lr2_expiry;
	}
	public Date getLr3_expiry() {
		return lr3_expiry;
	}
	public void setLr3_expiry(Date lr3_expiry) {
		this.lr3_expiry = lr3_expiry;
	}
	public Date getLr4_expiry() {
		return lr4_expiry;
	}
	public void setLr4_expiry(Date lr4_expiry) {
		this.lr4_expiry = lr4_expiry;
	}
	public String getLr1_type() {
		return lr1_type;
	}
	public void setLr1_type(String lr1_type) {
		this.lr1_type = lr1_type;
	}
	public String getLr2_type() {
		return lr2_type;
	}
	public void setLr2_type(String lr2_type) {
		this.lr2_type = lr2_type;
	}
	public String getLr3_type() {
		return lr3_type;
	}
	public void setLr3_type(String lr3_type) {
		this.lr3_type = lr3_type;
	}
	public String getLr4_type() {
		return lr4_type;
	}
	public void setLr4_type(String lr4_type) {
		this.lr4_type = lr4_type;
	}
}
