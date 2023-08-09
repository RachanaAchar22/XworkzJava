package com.xworkz.Polymorphism;

public class Temple {

	public void Pray() {
		System.out.println("Invoking no-args in Pray");
	}

	public void Pray(String name) {
		System.out.println("Invoking String in Pray");
	}

	public void Pray(String name, String devotion) {
		System.out.println("Invoking String in Pray");
	}

	public void Pray(String name, String devotion, int noOfPeople) {
		System.out.println("Invoking String,int in Pray");
	}

	public void Pray(String name, String devotion, int noOfPeople, String communication) {
		System.out.println("Invoking String,int in Pray");
	}

	public void Pray(String name, String devotion, int noOfPeople, String communication, String rituals) {
		System.out.println("Invoking String,int in Pray");
	}

}
