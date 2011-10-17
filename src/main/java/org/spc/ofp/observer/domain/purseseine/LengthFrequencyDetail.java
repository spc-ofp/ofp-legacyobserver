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
public class LengthFrequencyDetail {
 
    private long headerId;
	private long dayLogId;
	private Integer sample_no;
	private String sp_id;
	private Integer len;
	
	public long getHeaderId() {
		return headerId;
	}
	public void setHeaderId(long id) {
		this.headerId = id;
	}
	public long getDayLogId() {
		return dayLogId;
	}
	public void setDayLogId(long s_alog_id) {
		this.dayLogId = s_alog_id;
	}
	public Integer getSample_no() {
		return sample_no;
	}
	public void setSample_no(Integer sample_no) {
		this.sample_no = sample_no;
	}
	public String getSp_id() {
		return sp_id;
	}
	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}
	public Integer getLen() {
		return len;
	}
	public void setLen(Integer len) {
		this.len = len;
	}
}
