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
package org.spc.ofp.observer.domain.longline;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spc.ofp.data.Repository;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.SetHaulLogRepository")
public class SetHaulLogRepository extends Repository<SetHaulLog> implements ISetHaulLogRepository {

	private static final String SELECT_QUERY =
	    "SELECT " +
        "    OBSTRIP_ID, " +
		"    L_SHAUL_ID, " +
		"    EVENTNO, " +
		"    trim(SET_HAUL) as SET_HAUL, " +
	    "    date(LOGDATE) as LOGDATE, " +
	    "    trim(LOGTIME) as LOGTIME, " +
	    "    trim(LAT_LONG) as LAT_LONG, " +
	    "    trim(LON_LONG) as LON_LONG, " +
	    "    trim(EZ_ID) as EZ_ID, " +
	    "    WINDDIR, " +
	    "    WIND_KTS, " +
	    "    trim(SEA_ID) as SEA_ID, " +
	    "    CLOUD, " +
	    "    trim(COMMENTS) as COMMENTS " +
	    "FROM " +
	    "    L_SH_LOG ";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.longline.ISetHaulLogRepository#findByTrip(long)
	 */
	@Override
	public List<SetHaulLog> findByTrip(long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ?";
		return list(query, new SetHaulLogMapper(), tripId);
	}
	
	private static final class SetHaulLogMapper implements RowMapper<SetHaulLog> {

		@Override
		public SetHaulLog mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final SetHaulLog shl = new SetHaulLog();
			shl.setTripId(rs.getLong("OBSTRIP_ID"));
			shl.setSetHaulId(rs.getLong("L_SHAUL_ID"));
			shl.setEventNo(rs.getLong("EVENTNO"));
			shl.setSet_haul(rs.getString("SET_HAUL"));
			shl.setLogdate(readDate(rs, "LOGDATE"));
			shl.setLogtime(rs.getString("LOGTIME"));
			shl.setLat_long(rs.getString("LAT_LONG"));
			shl.setLon_long(rs.getString("LON_LONG"));
			shl.setEz_id(rs.getString("EZ_ID"));
			shl.setWinddir(readInteger(rs, "WINDDIR"));
			shl.setWind_kts(readInteger(rs, "WIND_KTS"));
			shl.setSea_id(rs.getString("SEA_ID"));
			shl.setCloud(readInteger(rs, "CLOUD"));
			shl.setComments(rs.getString("COMMENTS"));
			return shl;
		}
	}
}
