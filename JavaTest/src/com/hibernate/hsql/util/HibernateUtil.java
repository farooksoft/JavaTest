package com.hibernate.hsql.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static final Logger LOGGER = Logger.getLogger("HibenrateTutorial");
	
	private static volatile SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		
		if(sessionFactory == null){
			//multi threading case
			synchronized (HibernateUtil.class) {
				//double checking
				if(sessionFactory == null){
					LOGGER.debug("No sessionfactory exists, hence creating new");
					Configuration configuration = new Configuration().configure(HibernateUtil.class.getResource("/hibernate.cfg.xml"));
					StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		            serviceRegistryBuilder.applySettings(configuration.getProperties());
		            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
		            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		            LOGGER.debug("Created session factory");
				}
			}
		}
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown(){
		getSessionFactory().close();
		LOGGER.debug("Closed session factory");
	}
}
