package org.mrb.BookMyShow.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mrb.BookMyShow.entity.Movie;

public class SessionFactoryUtil {
   
	   private static SessionFactory sessionFactory=null;
	   
	   static {
		  // Configuration configuration = new Configuration();
		    Configuration configuration = new Configuration();
		   configuration.setProperties(MysqlConnectionProperties.getConncetion());
		   configuration.addAnnotatedClass(Movie.class);
		   sessionFactory= configuration.buildSessionFactory();
	   }
	   
	   public static  SessionFactory getsessionFactory() {
		   return sessionFactory;
	   }
}
