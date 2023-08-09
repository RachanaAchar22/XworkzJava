package com.xworkz.Polymorphism;

public class Street {

	public void light() {
		System.out.println("Invoking no-args in light");
	}

	public void light(String color) {
		System.out.println("Invoking String in light");
	}

	public void light(String color, int noOfLight) {
		System.out.println("Invoking String,int in light");
	}

	public void light(String color, int noOfLight, int noOfPoles) {
		System.out.println("Invoking String,int in light");
	}

	public void light(String color, int noOfLight, int noOfPoles, double poleHeight) {
		System.out.println("Invoking String,int,double in light");
	}

	public void light(String color, int noOfLight, int noOfPoles, double poleHeight, String streetName) {
		System.out.println("Invoking String,int,double in light");
	}

}
