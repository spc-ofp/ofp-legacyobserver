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
@org.springframework.stereotype.Repository("observer.FishTransferRepository")
public class FishTransferRepository extends Repository<FishTransfer> implements
		IFishTransferRepository {

	private static final String SELECT_QUERY =
	    "SELECT " +
	    "    FISHT_ID, " +
	    "    OBSTRIP_ID, " +
	    "    date(\"DATE\") as XDATE, " +
	    "    trim(\"TIME\") as XTIME, " +
	    "    trim(LAT) as LAT, " +
	    "    trim(LON) as LON, " +
	    "    trim(R_NAME) as R_NAME, " +
	    "    trim(R_CALLSIGN) as R_CALLSIGN, " +
	    "    trim(R_FLAG) as R_FLAG, " +
	    "    SKJ_C, " +
	    "    YFT_C, " +
	    "    BET_C, " +
	    "    MIX_C, " +
	    "    trim(TRANSFER) as TRANSFER, " +
	    "    trim(COMMENT) as COMMENT " +
	    "FROM  " +
	    "    FISHTRANSFER ";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IFishTransferRepository#findById(long)
	 */
	@Override
	public FishTransfer findById(long id) {
		final String query = SELECT_QUERY + " WHERE FISHT_ID = ?";
		return find(query, new FishTransferMapper(), id);
	}

	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IFishTransferRepository#findByTrip(long)
	 */
	@Override
	public List<FishTransfer> findByTrip(long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ?";
		return list(query, new FishTransferMapper(), tripId);
	}
	
	private static final class FishTransferMapper implements RowMapper<FishTransfer> {

		@Override
		public FishTransfer mapRow(final ResultSet rs, final int rowNum)
				throws SQLException {
			final FishTransfer ft = new FishTransfer();
			ft.setId(rs.getLong("FISHT_ID"));
			ft.setTripId(rs.getLong("OBSTRIP_ID"));
			ft.setDate(readDate(rs, "XDATE"));
			ft.setTime(rs.getString("XTIME"));
			ft.setLatitude(rs.getString("LAT"));
			ft.setLongitude(rs.getString("LON"));
			ft.setR_name(rs.getString("R_NAME"));
			ft.setR_callsign(rs.getString("R_CALLSIGN"));
			ft.setR_flag(rs.getString("R_FLAG"));
			ft.setSkj_c(readDouble(rs, "SKJ_C"));
			ft.setYft_c(readDouble(rs, "YFT_C"));
			ft.setBet_c(readDouble(rs, "BET_C"));
			ft.setMix_c(readDouble(rs, "MIX_C"));
			ft.setTransfer(rs.getString("TRANSFER"));
			ft.setComment(rs.getString("COMMENT"));
			return ft;
		}
		
	}

}
