package com.xworkz.Polymorphism;

public class Movie extends Theater {

	@Override
	public void ticket() {
		System.out.println("Movie Overrides Theater");
		super.ticket();
	}

	@Override
	public void ticket(String name) {
		super.ticket(name);
	}

	@Override
	public void ticket(String name, double feez) {
		super.ticket(name, feez);
	}

	@Override
	public void ticket(String theaterName, double feez, int noOfpeople) {
		super.ticket(theaterName, feez, noOfpeople);
	}

	@Override
	public void ticket(String theaterName, double feez, int noOfpeople, String location) {
		super.ticket(theaterName, feez, noOfpeople, location);
	}

	@Override
	public void ticket(String theaterName, double feez, int noOfpeople, String location, String movieName) {
		super.ticket(theaterName, feez, noOfpeople, location, movieName);
	}

}
