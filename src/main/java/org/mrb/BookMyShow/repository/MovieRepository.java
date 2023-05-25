package org.mrb.BookMyShow.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mrb.BookMyShow.dto.MovieDto;
import org.mrb.BookMyShow.entity.Movie;
import org.mrb.BookMyShow.util.SessionFactoryUtil;

public class MovieRepository {

	  public void saveOrUpdate(Movie movie) {
			SessionFactory sessionFactory = SessionFactoryUtil.getsessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.merge(movie);
			transaction.commit();
	  }
	  
	  public Movie findMovieById(long altkey) {
		   
		     SessionFactory sessionFactory = SessionFactoryUtil.getsessionFactory();
		     Session session = sessionFactory.openSession();
		     return session.get(Movie.class, altkey);
	  }
	  public void update(MovieDto dto) {
		   Movie movie = findMovieById(dto.getAltKey());
		   if(movie!=null) {
			   movie.setBudget(dto.getBuget());
			   movie.setRating(dto.getRating());
			   saveOrUpdate(movie);
		   }
	  }
}
