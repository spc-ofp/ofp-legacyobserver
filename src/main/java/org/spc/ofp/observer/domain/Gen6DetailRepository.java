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
@org.springframework.stereotype.Repository("observer.Gen6DetailRepository")
public class Gen6DetailRepository extends Repository<Gen6Detail> implements IGen6DetailRepository {

    private static final String SELECT_QUERY =
        "SELECT " +
		"    POLL_H_ID, " + 
		"    POLL_D_ID, " + 
		"    POLL_TYPE, " + 
		"    MATERIAL_ID, " + 
		"    YN, " + 
		"    TYPE, " + 
		"    QUANTITY " + 
		"FROM " +
		"    GEN6_POLLUTION_D ";
        
    @Override
    public Gen6Detail findById(final long id) {
        final String query = SELECT_QUERY + " WHERE POLL_D_ID = ? ";
        return find(query, new Gen6DetailMapper(), id);
    }
    
    @Override
	public List<Gen6Detail> findByHeaderId(final long headerId) {
    	final String query = SELECT_QUERY + " WHERE POLL_H_ID = ? ";
        return list(query, new Gen6DetailMapper(), headerId);
	}
    
    private static final class Gen6DetailMapper implements RowMapper<Gen6Detail> {

        @Override
        public Gen6Detail mapRow(final ResultSet rs, final int rowNum) throws SQLException {
            final Gen6Detail obj = new Gen6Detail();
            obj.setId(rs.getLong("POLL_D_ID"));
            obj.setHeaderId(rs.getLong("POLL_H_ID"));
			obj.setPoll_type(readInteger(rs, "POLL_TYPE")); //readInteger(rs, "POLL_TYPE");
			obj.setMaterial_id(rs.getString("MATERIAL_ID")); //rs.getString("MATERIAL_I");
			obj.setYn(readInteger(rs, "YN")); //readInteger(rs, "YN");
			obj.setType(rs.getString("TYPE")); //rs.getString("TYPE");
			obj.setQuantity(rs.getString("QUANTITY")); //rs.getString("QUANTITY");
            return obj;
        }
    
    }
}
