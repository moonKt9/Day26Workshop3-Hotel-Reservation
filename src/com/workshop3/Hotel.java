package com.workshop3;

public class Hotel {
	
	private String Name;
	private String Rating;
	private String Rate;
	@Override
	public String toString() {
		return "Hotel [Name=" + Name + ", Rating=" + Rating + ", Rate=" + Rate + ", getName()=" + getName()
				+ ", getRating()=" + getRating() + ", getRate()=" + getRate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRating() {
		return Rating;
	}
	public void setRating(String rating) {
		Rating = rating;
	}
	public String getRate() {
		return Rate;
	}
	public void setRate(String rate) {
		Rate = rate;
	}
	
	

}
