package org.mrb.BookMyShow.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_info")
public class Movie  implements Serializable{

	    @Id
	    @Column(name="alt_key")
	    private long altKey;
	    
	    @Column(name="movie_name")
	    private String movieName;
	    
	    @Column(name="actor_name")
	    private String actorName;
	    
	    @Column(name="actress_name")
	    private String actressName;
	    
	    @Column(name="release_date")
	    private String releaseDate;
	    
	    @Column(name="rating")
	    private double rating;
	    
	    @Column(name="budget")
	    private double budget;

		public long getAltKey() {
			return altKey;
		}

		public void setAltKey(long altKey) {
			this.altKey = altKey;
		}

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public String getActorName() {
			return actorName;
		}

		public void setActorName(String actorName) {
			this.actorName = actorName;
		}

		public String getActressName() {
			return actressName;
		}

		public void setActressName(String actressName) {
			this.actressName = actressName;
		}

		public String getReleaseDate() {
			return releaseDate;
		}

		public void setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
		}

		public double getRating() {
			return rating;
		}

		public void setRating(double rating) {
			this.rating = rating;
		}

		public double getBudget() {
			return budget;
		}

		public void setBudget(double budget) {
			this.budget = budget;
		}

		@Override
		public String toString() {
			return "Movie [altKey=" + altKey + ", movieName=" + movieName + ", actorName=" + actorName
					+ ", actressName=" + actressName + ", releaseDate=" + releaseDate + ", rating=" + rating
					+ ", budget=" + budget + "]";
		}
	    
	    
}
