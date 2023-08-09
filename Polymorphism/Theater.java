package com.xworkz.Polymorphism;

public class Theater {

	public void ticket() {
		System.out.println("Invoking no-args in Ticket");
	}

	public void ticket(String name) {
		System.out.println("Invoking String in Ticket");
	}

	public void ticket(String name, double feez) {
		System.out.println("Invoking String,double in Ticket");
	}

	public void ticket(String theaterName, double feez, int noOfpeople) {
		System.out.println("Invoking String,double,int in Ticket");
	}

	public void ticket(String theaterName, double feez, int noOfpeople, String location) {
		System.out.println("Invoking String,double,int in Ticket");
	}

	public void ticket(String theaterName, double feez, int noOfpeople, String location, String movieName) {
		System.out.println("Invoking String,double,int in Ticket");
	}

}
