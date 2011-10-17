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
public class BrailPattern {
 
	private long id;
	private long dayLogId;
	private Integer s_lfreq_id;	
	private Integer pattern;
	private Integer fullness;
	private Integer samples;
	
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
	public Integer getS_lfreq_id() {
		return s_lfreq_id;
	}
	public void setS_lfreq_id(Integer s_lfreq_id) {
		this.s_lfreq_id = s_lfreq_id;
	}
	public Integer getPattern() {
		return pattern;
	}
	public void setPattern(Integer pattern) {
		this.pattern = pattern;
	}
	public Integer getFullness() {
		return fullness;
	}
	public void setFullness(Integer fullness) {
		this.fullness = fullness;
	}
	public Integer getSamples() {
		return samples;
	}
	public void setSamples(Integer samples) {
		this.samples = samples;
	}

}
