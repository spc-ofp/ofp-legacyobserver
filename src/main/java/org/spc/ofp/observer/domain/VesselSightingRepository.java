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

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.VesselSightingRepository")
public class VesselSightingRepository extends Repository<VesselSighting>
		implements IVesselSightingRepository {

	private static final String SELECT_QUERY =
	    "SELECT "+
	    "    AIR_ID, "+
	    "    OBSTRIP_ID, "+
	    "    date(\"DATE\") as XDATE, "+ // DATE is a reserved word in SQL
	    "    trim(\"TIME\") as XTIME, "+ // TIME is a reserved word in SQL
	    "    trim(LAT) as LAT, "+
	    "    trim(LON) as LON, "+
	    "    trim(EZ_ID) as EZ_ID, "+
	    "    trim(S_NAME) as S_NAME, "+
	    "    trim(S_CALLSIGN) as S_CALLSIGN, "+
	    "    trim(S_FLAG) as S_FLAG, "+
	    "    S_TYPE, "+
	    "    BEARING, "+
	    "    DISTANCE, "+
	    "    trim(DIST_UNIT) as DIST_UNIT, "+
	    "    ACTIVITY, "+
	    "    trim(PHOTO_NO) as PHOTO_NO, "+
	    "    trim(COMMENT) as COMMENT, "+
	    "    ACTIVITY_O "+
	    "FROM  "+
	    "    AIRCRAFTSIGHT ";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IVesselSightingRepository#findById(long)
	 */
	@Override
	public VesselSighting findById(long id) {
		final String query = SELECT_QUERY + " WHERE AIR_ID = ?";
		return find(query, new VesselSightingMapper(), id);
	}

	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IVesselSightingRepository#findByTrip(long)
	 */
	@Override
	public List<VesselSighting> findByTrip(long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ?";
		return list(query, new VesselSightingMapper(), tripId);
	}
	
	private static final class VesselSightingMapper implements RowMapper<VesselSighting> {

		@Override
		public VesselSighting mapRow(final ResultSet rs, final int rowNum)
				throws SQLException {
			VesselSighting vs = new VesselSighting();
			vs.setId(rs.getLong("AIR_ID"));
			vs.setTripId(rs.getLong("OBSTRIP_ID"));
			vs.setDate(readDate(rs, "XDATE"));
			vs.setTime(rs.getString("XTIME"));
			vs.setLatitude(rs.getString("LAT"));
			vs.setLongitude(rs.getString("LON"));
			vs.setEz_id(rs.getString("EZ_ID"));
			vs.setS_name(rs.getString("S_NAME"));
			vs.setS_callsign(rs.getString("S_CALLSIGN"));
			vs.setS_flag(rs.getString("S_FLAG"));
			vs.setS_type(readInteger(rs, "S_TYPE"));
			vs.setBearing(readInteger(rs, "BEARING"));
			vs.setDistance(readDouble(rs, "DISTANCE"));
			vs.setDist_unit(rs.getString("DIST_UNIT"));
			vs.setActivity(readInteger(rs, "ACTIVITY"));
			vs.setPhoto_no(rs.getString("PHOTO_NO"));
			vs.setComment(rs.getString("COMMENT"));
			vs.setActivity_o(readInteger(rs, "ACTIVITY_O"));
			return vs;
		}
		
	}

}
