package com.xworkz.Polymorphism;

public class City {

	public void cityInfo() {
		System.out.println("Invoking no-args in City");
	}

	public void cityInfo(String cityName) {
		System.out.println("Invoking String in City");
	}

	public void cityInfo(String cityName, int pincode) {
		System.out.println("Invoking String,int in City");
	}

	public void cityInfo(String cityName, int pincode, String type) {
		System.out.println("Invoking String,int in City");
	}

	public void cityInfo(String cityName, int pincode, String type, int noOfPeople) {
		System.out.println("Invoking String,int in City");
	}

	public void cityInfo(String cityName, int pincode, String type, int noOfPeople, int noOfTown) {
		System.out.println("Invoking String,int in City");
	}

}
