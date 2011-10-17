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
@org.springframework.stereotype.Repository("observer.VesselRepository")
public class VesselRepository extends Repository<Vessel> implements IVesselRepository {
	
	private static final String SELECT_QUERY =
			"SELECT " +
			"  BOAT_ID," +
			"  FFA_VID, " +
			"  trim(GR_ID) as GR_ID, " +
			"  trim(VESSELNAME) as VESSELNAME, " +
			"  trim(REGIST_NO) as REGIST_NO, " +
			"  C_BOAT_ID, " +
			"  trim(FLAG_ID) as FLAG_ID, " +
			"  GRT " +
			"FROM " +
			"  vessel ";
	
	/**
	 * @see org.spc.ofp.observer.domain.IVesselRepository#findById(long)
	 */
	@Override
	public Vessel findById(long id) {
		final String query = SELECT_QUERY + " WHERE BOAT_ID = ?";
		return find(query, new VesselMapper(), id);
	}

	/**
	 * @see org.spc.ofp.observer.domain.IVesselRepository#allVessels()
	 */
	@Override
	public List<Vessel> allVessels() {
		return list(SELECT_QUERY, new VesselMapper());
	}
	
	private static final class VesselMapper implements RowMapper<Vessel> {

		public Vessel mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final Vessel v = new Vessel();
			v.setId(rs.getLong("BOAT_ID"));
			v.setFfaVid(rs.getLong("FFA_VID"));
			v.setGearType(rs.getString("GR_ID"));
			v.setName(rs.getString("VESSELNAME"));
			v.setRegistrationNumber(rs.getString("REGIST_NO"));
			v.setFlag(rs.getString("FLAG_ID"));
			v.setC_boat_id(rs.getString("C_BOAT_ID"));
			v.setGrossTonnage(rs.getDouble("GRT"));
			return v;
		}
	}

}
