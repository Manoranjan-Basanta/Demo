package org.mrb.BookMyShow.dto;

import java.io.Serializable;

public class MovieDto implements Serializable {
 
	private long altKey;
	
	private double buget;
	
	private double rating;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public double getBuget() {
		return buget;
	}

	public void setBuget(double buget) {
		this.buget = buget;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
}
