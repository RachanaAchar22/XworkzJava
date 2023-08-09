package com.xworkz.Polymorphism;

public class PoliceStation {

	public void criminal() {
		System.out.println("Invoking no-args in PoliceStation");
	}

	public void criminal(String name) {
		System.out.println("Invoking String in PoliceStation");
	}

	public void criminal(String name, String location) {
		System.out.println("Invoking String in PoliceStation");
	}

	public void criminal(String name, String location, int noOfCriminals) {
		System.out.println("Invoking String,int in PoliceStation");
	}

	public void criminal(String name, String location, int noOfCriminals, String crimeName) {
		System.out.println("Invoking String,int in PoliceStation");
	}

	public void criminal(String name, String location, int noOfCriminals, String crimeName, String criminalName) {
		System.out.println("Invoking String,int in PoliceStation");
	}

}
