package com.dgaml.alarms;

import java.io.IOException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.stereotype.Component;

/**
 * Deprecates hibernate.cfg.xml files as
 * <hibernate-config><sessionFactory><mapping> All here
 * 
 * @author amrjamil
 *
 */
@Component
@EnableAutoConfiguration
public class AppDataSource {

	@Autowired
	private ResourceLoader rl;

	@Bean
	@ConfigurationProperties("app.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() throws IOException {
		HibernateJpaSessionFactoryBean sessionFactoryBean = new HibernateJpaSessionFactoryBean();
		/**
		 * Mapping of Entities will be done with annotations
		 */
		// sessionFactoryBean.setMappingLocations(loadResources());
//		sessionFactoryBean.setDataSource(dataSource());
		return sessionFactoryBean;
	}

	// /**
	// * This is of how making mapping though HBM FILE
	// *
	// * @return
	// */
	// public Resource[] loadResources() {
	// Resource[] resources = new Resource[1];
	// // resources = ResourcePatternUtils.getResourcePatternResolver(rl)
	// // .getResources("classpath:/hibernate/*.hbm.xml");
	// ClassPathResource file = new ClassPathResource("User.hbm.xml");
	// resources[0] = file;
	// return resources;
	// }
	//

}
