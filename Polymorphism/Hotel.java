package com.xworkz.Polymorphism;

public class Hotel {

	public void food() {
		System.out.println("Invoking no-arg in food");
	}

	public void food(String name) {
		System.out.println("Invoking String in food");
	}

	public void food(String name, double price) {
		System.out.println("Invoking String,double in food");
	}

	public void food(String name, double price, int quantity) {
		System.out.println("Invoking String,double,int in food");
	}

	public void food(String name, double price, int quantity, String location) {
		System.out.println("Invoking String,double,int,String in food");
	}

	public void food(String name, double price, int quantity, String location, boolean tasty) {
		System.out.println("Invoking String,double,int,String,boolean in food");
	}

}
