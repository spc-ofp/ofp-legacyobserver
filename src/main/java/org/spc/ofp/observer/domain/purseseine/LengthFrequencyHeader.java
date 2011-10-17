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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
public class LengthFrequencyHeader {
 
	private long id;
    private long dayLogId;
	private Integer page_no;	
	private Integer tbrail;
	private Integer nbrail;
	private Integer brail_full;
	private Integer brail_78;
	private Integer brail_34;
	private Integer brail_23;
	private Integer brail_12;
	private Integer brail_13;
	private Integer brail_14;
	private Integer brail_18;
	private Integer fish_brl;
	private String measure;
	private String protocol;
	private Double sum_brails;
	private String prot_comme;
	private String othersamp;
	private Integer samptype;
	private Integer whichbrail;
	private Integer nbformused;
	private Integer totused;
	private String enteredby;
	private Date inserttime;
	
	private List<LengthFrequencyDetail> details = new ArrayList<LengthFrequencyDetail>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDayLogId() {
		return dayLogId;
	}
	public void setDayLogId(long dayLogId) {
		this.dayLogId = dayLogId;
	}
	public Integer getPage_no() {
		return page_no;
	}
	public void setPage_no(Integer page_no) {
		this.page_no = page_no;
	}
	public Integer getTbrail() {
		return tbrail;
	}
	public void setTbrail(Integer tbrail) {
		this.tbrail = tbrail;
	}
	public Integer getNbrail() {
		return nbrail;
	}
	public void setNbrail(Integer nbrail) {
		this.nbrail = nbrail;
	}
	public Integer getBrail_full() {
		return brail_full;
	}
	public void setBrail_full(Integer brail_full) {
		this.brail_full = brail_full;
	}
	public Integer getBrail_78() {
		return brail_78;
	}
	public void setBrail_78(Integer brail_78) {
		this.brail_78 = brail_78;
	}
	public Integer getBrail_34() {
		return brail_34;
	}
	public void setBrail_34(Integer brail_34) {
		this.brail_34 = brail_34;
	}
	public Integer getBrail_23() {
		return brail_23;
	}
	public void setBrail_23(Integer brail_23) {
		this.brail_23 = brail_23;
	}
	public Integer getBrail_12() {
		return brail_12;
	}
	public void setBrail_12(Integer brail_12) {
		this.brail_12 = brail_12;
	}
	public Integer getBrail_13() {
		return brail_13;
	}
	public void setBrail_13(Integer brail_13) {
		this.brail_13 = brail_13;
	}
	public Integer getBrail_14() {
		return brail_14;
	}
	public void setBrail_14(Integer brail_14) {
		this.brail_14 = brail_14;
	}
	public Integer getBrail_18() {
		return brail_18;
	}
	public void setBrail_18(Integer brail_18) {
		this.brail_18 = brail_18;
	}
	public Integer getFish_brl() {
		return fish_brl;
	}
	public void setFish_brl(Integer fish_brl) {
		this.fish_brl = fish_brl;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public Double getSum_brails() {
		return sum_brails;
	}
	public void setSum_brails(Double sum_brails) {
		this.sum_brails = sum_brails;
	}
	public String getProt_comme() {
		return prot_comme;
	}
	public void setProt_comme(String prot_comme) {
		this.prot_comme = prot_comme;
	}
	public String getOthersamp() {
		return othersamp;
	}
	public void setOthersamp(String othersamp) {
		this.othersamp = othersamp;
	}
	public Integer getSamptype() {
		return samptype;
	}
	public void setSamptype(Integer samptype) {
		this.samptype = samptype;
	}
	public Integer getWhichbrail() {
		return whichbrail;
	}
	public void setWhichbrail(Integer whichbrail) {
		this.whichbrail = whichbrail;
	}
	public Integer getNbformused() {
		return nbformused;
	}
	public void setNbformused(Integer nbformused) {
		this.nbformused = nbformused;
	}
	public Integer getTotused() {
		return totused;
	}
	public void setTotused(Integer totused) {
		this.totused = totused;
	}
	public String getEnteredby() {
		return enteredby;
	}
	public void setEnteredby(String enteredby) {
		this.enteredby = enteredby;
	}
	public Date getInserttime() {
		return inserttime;
	}
	public void setInserttime(Date inserttime) {
		this.inserttime = inserttime;
	}
	public List<LengthFrequencyDetail> getDetails() {
		return details;
	}
	public boolean addDetail(final LengthFrequencyDetail detail) {
		return details.add(detail);
	}
	public boolean addDetails(final Collection<LengthFrequencyDetail> dl) {
		return details.addAll(dl);
	}
}
