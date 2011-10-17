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
@org.springframework.stereotype.Repository("observer.Gen3Repository")
public class Gen3Repository extends Repository<Gen3> implements IGen3Repository {

	private static final String SELECT_QUERY =
	    "SELECT "+
	    "    OBSTRIP_ID, "+
	    "    GEN3_ID, "+
	    "    Q1, "+
	    "    Q2, "+
	    "    Q3, "+
	    "    Q4, "+
	    "    Q5, "+
	    "    Q6, "+
	    "    Q7, "+
	    "    Q8, "+
	    "    Q9, "+
	    "    Q10, "+
	    "    Q11, "+
	    "    Q12, "+
	    "    Q13, "+
	    "    Q14, "+
	    "    Q15, "+
	    "    Q16, "+
	    "    Q17, "+
	    "    Q18, "+
	    "    Q19, "+
	    "    Q20, "+
	    "    date(DATE1) as DATE1, "+
	    "    COMMENT1, "+
	    "    date(DATE2) as DATE2, "+
	    "    COMMENT2, "+
	    "    date(DATE3) as DATE3, "+
	    "    COMMENT3 "+
	    "FROM "+
	    "    GEN3";
	
	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IGen3Repository#findByTrip(long)
	 */
	@Override
	public Gen3 findByTrip(long tripId) {
		final String query = SELECT_QUERY + " WHERE OBSTRIP_ID = ?";
		return find(query, new Gen3Mapper(), tripId);
	}

	/* (non-Javadoc)
	 * @see org.spc.ofp.observer.domain.IGen3Repository#findById(long)
	 */
	@Override
	public Gen3 findById(long id) {
		final String query = SELECT_QUERY + " WHERE GEN3_ID = ?";
		return find(query, new Gen3Mapper(), id);
	}
	
	private static final class Gen3Mapper implements RowMapper<Gen3> {

		@Override
		public Gen3 mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final Gen3 g3 = new Gen3();
			g3.setId(rs.getLong("GEN3_ID"));
			g3.setTripId(rs.getLong("OBSTRIP_ID"));
			g3.setQ1(rs.getBoolean("Q1"));
			g3.setQ2(rs.getBoolean("Q2"));
			g3.setQ3(rs.getBoolean("Q3"));
			g3.setQ4(rs.getBoolean("Q4"));
			g3.setQ5(rs.getBoolean("Q5"));
			g3.setQ6(rs.getBoolean("Q6"));
			g3.setQ7(rs.getBoolean("Q7"));
			g3.setQ8(rs.getBoolean("Q8"));
			g3.setQ9(rs.getBoolean("Q9"));
			g3.setQ10(rs.getBoolean("Q10"));
			g3.setQ11(rs.getBoolean("Q11"));
			g3.setQ12(rs.getBoolean("Q12"));
			g3.setQ13(rs.getBoolean("Q13"));
			g3.setQ14(rs.getBoolean("Q14"));
			g3.setQ15(rs.getBoolean("Q15"));
			g3.setQ16(rs.getBoolean("Q16"));
			g3.setQ17(rs.getBoolean("Q17"));
			g3.setQ18(rs.getBoolean("Q18"));
			g3.setQ19(rs.getBoolean("Q19"));
			g3.setQ20(rs.getBoolean("Q20"));
			g3.setDate1(readDate(rs, "DATE1"));
			g3.setDate2(readDate(rs, "DATE2"));
			g3.setDate3(readDate(rs, "DATE3"));
			g3.setComment1(rs.getString("COMMENT1"));
			g3.setComment2(rs.getString("COMMENT2"));
			g3.setComment3(rs.getString("COMMENT3"));
			return g3;
		}
		
	}

}
