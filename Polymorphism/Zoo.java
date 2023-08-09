package com.xworkz.Polymorphism;

public class Zoo {

	public void zooInfo() {
		System.out.println("Invoking no-args in Zoo");
	}

	public void zooInfo(String zooName) {
		System.out.println("Invoking String in Zoo");
	}

	public void zooInfo(String zooName, String location) {
		System.out.println("Invoking String in Zoo");
	}

	public void zooInfo(String zooName, String location, int entryFee) {
		System.out.println("Invoking String,int in Zoo");
	}

	public void zooInfo(String zooName, String location, double entryFee, int noOfAnimals) {
		System.out.println("Invoking String,double,int in Zoo");
	}

	public void zooInfo(String zooName, String location, double entryFee, int noOfAnimals, int noOfBirds) {
		System.out.println("Invoking String,double,int in Zoo");
	}

}
