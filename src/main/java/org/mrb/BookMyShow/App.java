package org.mrb.BookMyShow;

import org.mrb.BookMyShow.entity.Movie;
import org.mrb.BookMyShow.repository.MovieRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  Movie m = new Movie();
    	  m.setAltKey(325);
    	  m.setMovieName("Avatar");
    	  m.setActorName("jack");
    	  m.setActressName("nautri");
    	  m.setReleaseDate("01-01-2022");
    	  m.setRating(4.6);
    	  m.setBudget(23564945.365);
    	  
    	 // MovieRepository repository = new MovieRepository();
//    	  repository.saveOrUpdate(m);
    	     MovieRepository repository = new MovieRepository();
    	  Movie byId = repository.findMovieById(325);
    	  System.out.println(byId);
    	  
    }
}
