package com.xworkz.Polymorphism;

public class Hospital {

	public void treatment() {
		System.out.println("invoking no-arg in Treatment");
	}

	public void treatment(String name) {
		System.out.println("invoking String in Treatment");
	}

	public void treatment(String name, String decease) {
		System.out.println("invoking String in Treatment");
	}

	public void treatment(String name, String decease, double feez) {
		System.out.println("invoking String,double in Treatment");
	}

	public void treatment(String name, String decease, double feez, String location) {
		System.out.println("invoking String,double,String in Treatment");
	}

	public void treatment(String name, String decease, double feez, String location, int noOfPatients) {
		System.out.println("invoking String,double,String in Treatment");
	}
}
