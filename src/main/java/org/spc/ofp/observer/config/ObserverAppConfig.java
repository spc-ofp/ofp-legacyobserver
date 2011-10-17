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
package org.spc.ofp.observer.config;

import org.spc.ofp.data.JdbcRepository;
import org.spc.ofp.data.RepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@Configuration
@Import(ObserverDataSourceConfig.class)
public class ObserverAppConfig {

	@Autowired
	private ObserverDataSourceConfig dataSourceConfig;
	
	@Primary
	@Bean(name={"repository"})
	public RepositoryImpl repository() {
		final JdbcRepository repo = new JdbcRepository();
		repo.setDataSource(dataSourceConfig.jdbcDataSource());
		return repo;
	}
}
