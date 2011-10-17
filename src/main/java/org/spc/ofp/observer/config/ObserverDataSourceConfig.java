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

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * @author Corey Cole <coreyc@spc.int>
 *
 */
@Configuration
public class ObserverDataSourceConfig {

	public static final String DRIVER_CLASS = "org.sqlite.JDBC";
	//public static final String DEFAULT_PROPS = "[caching=true;format=VFP]";
	
	// JDBC URL comes from properties file
	private @Value("#{jdbcProperties.observerURL}") String OBSERVER_URL;
	
	@Primary
	@Bean(destroyMethod="close", name={"jdbcDataSource"})
	public DataSource jdbcDataSource() {
		final BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName(DRIVER_CLASS);
		bds.setUrl(OBSERVER_URL);
		//bds.setConnectionProperties(DEFAULT_PROPS);
		return bds;
	}
}
