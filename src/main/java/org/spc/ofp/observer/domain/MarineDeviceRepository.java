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

import org.spc.ofp.data.Repository;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@org.springframework.stereotype.Repository("observer.MarineDeviceRepository")
public class MarineDeviceRepository extends Repository<MarineDevice> implements IMarineDeviceRepository {

	private static final String SELECT_QUERY =
	    "SELECT " +
        "    DEVICE_ID, " +
	    "    trim(DEV_DESC) as DEV_DESC, " +
	    "    trim(DEV_CAT) as DEV_CAT, " +
	    "    trim(GEARLIST) as GEARLIST, " +
	    "    ORDER_L, " +
	    "    ORDER_P, " +
	    "    ORDER_S " +
	    "FROM " +
	    "    MAR_DEV";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IMarineDeviceRepository#findById(long)
	 */
	@Override
	public MarineDevice findById(long id) {
		final String query = SELECT_QUERY + " WHERE DEVICE_ID = ?";
		return find(query, new MarineDeviceMapper(), id);
	}
	
	private static final class MarineDeviceMapper implements RowMapper<MarineDevice> {

		@Override
		public MarineDevice mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final MarineDevice md = new MarineDevice();
			md.setId(rs.getLong("DEVICE_ID"));
			md.setDescription(rs.getString("DEV_DESC"));
			md.setCategory(rs.getString("DEV_CAT"));
			md.setGearList(rs.getString("GEARLIST"));
			md.setOrder_l(readInteger(rs, "ORDER_L"));
			md.setOrder_p(readInteger(rs, "ORDER_P"));
			md.setOrder_s(readInteger(rs, "ORDER_S"));
			return md;
		}
		
	}

}
