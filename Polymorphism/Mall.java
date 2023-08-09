package com.xworkz.Polymorphism;

public class Mall {

	public void store() {
		System.out.println("Invoking no-args in Mall");
	}

	public void store(String mallName) {
		System.out.println("Invoking String in Mall");
	}

	public void store(String mallName, String location) {
		System.out.println("Invoking String in Mall");
	}

	public void store(String mallName, String location, int noOfPeople) {
		System.out.println("Invoking String,int in Mall");
	}

	public void store(String mallName, String location, int noOfPeople, boolean parkingArea) {
		System.out.println("Invoking String,int,boolean in Mall");
	}

	public void store(String mallName, String location, int noOfPeople, boolean parkingArea, int noOfFloor) {
		System.out.println("Invoking String,int,boolean,int in Mall");
	}

}
