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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spc.ofp.data.Repository;
import org.springframework.jdbc.core.RowMapper;

import com.google.common.base.Joiner;

/**
 * TripIdRepository provides a 'driver query' functionality
 * for integration.  Complex filtering queries belong in the
 * TripRepository.
 * 
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.TripIdRepository")
public class TripIdRepository extends Repository<Long> {

	private static final String GEAR_AND_YEAR_QUERY =
			"SELECT " +
		    "    obstrip_id " +
		    "FROM " +
		    "    obs_trip " +
		    "WHERE " +
		    "    gr_id = ?";
	
	private static String buildGearAndYearQuery(final Long limit, String... years) {
		final StringBuilder sb = new StringBuilder(GEAR_AND_YEAR_QUERY);
		if (null != years && years.length > 0) {
			final Joiner joiner = Joiner.on(" OR ").skipNulls();
			sb.append(" AND (").append(joiner.join(years)).append(")");
		}
		if (null != limit && limit.longValue() > 0L) {
			sb.append(" LIMIT ").append(limit.intValue());
		}
		return sb.toString();
	}
	
	public List<Long> findTripIdsByGearAndYear(final String gear, final Long limit, final String... years) {
		final String query = buildGearAndYearQuery(limit, years);
		return list(query, new TripIdMapper(), gear);
	}
	
	private static final class TripIdMapper implements RowMapper<Long> {

		@Override
		public Long mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			return rs.getLong("OBSTRIP_ID");
		}
		
	}
}
