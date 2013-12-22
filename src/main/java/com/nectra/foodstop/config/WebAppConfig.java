/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nectra.foodstop.config;

import java.util.Properties;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.hibernate.ejb.HibernatePersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 *
 * @author Sharath
 */
@Configuration  
@EnableWebMvc  
@EnableTransactionManagement  
@ComponentScan("com.nectra.foodstop")  
@PropertySource("classpath:config.properties")
//@EnableJpaRepositories("com.nectra.foodstop.repository")  
public class WebAppConfig {  
  
    private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";  
    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";  
    private static final String PROPERTY_NAME_DATABASE_URL = "db.url";  
    private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";  
  
    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";  
    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";  
    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";  
  
    @Resource  
    private Environment env;  
  
    @Bean  
    public DataSource dataSource() {  
        DriverManagerDataSource dataSource = new DriverManagerDataSource();  
  
        dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));  
        dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));  
        dataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));  
        dataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));  
  
        return dataSource;  
    }  
  
//    @Bean  
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        System.out.println("in Entity Manager Factory");
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();  
//        entityManagerFactoryBean.setDataSource(dataSource());  
//        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistence.class);  
//        entityManagerFactoryBean.setPackagesToScan(env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));  
//          
//        entityManagerFactoryBean.setJpaProperties(hibProperties());  
//          
//        return entityManagerFactoryBean;  
//    }  
  
      @Bean
    public LocalSessionFactoryBean sessionFactory() {
          System.out.println("********SessionFactory()************");
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
          System.out.println("sessionFactoryBean:"+sessionFactoryBean);
        sessionFactoryBean.setDataSource(dataSource());
          System.out.println("data source:"+dataSource());
        sessionFactoryBean.setPackagesToScan(env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
        sessionFactoryBean.setHibernateProperties(hibProperties());
          System.out.println("sessionFac:"+sessionFactoryBean.getHibernateProperties());
        return sessionFactoryBean;
    }

    private Properties hibProperties() {  
        System.out.println("Hibernate Properties");
        Properties properties = new Properties();  
        properties.put(PROPERTY_NAME_HIBERNATE_DIALECT, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));  
        properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));  
        return properties;  
    }  
  
    @Bean  
    public HibernateTransactionManager transactionManager() {  
        //JpaTransactionManager transactionManager = new JpaTransactionManager();  
        //transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());  
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;  
    }  
  
    @Bean  
    public UrlBasedViewResolver setupViewResolver() {  
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
        resolver.setPrefix("/WEB-INF/pages/jsp/");  
        resolver.setSuffix(".jsp");  
        resolver.setViewClass(JstlView.class);  
        return resolver;  
    }  
  
}  
