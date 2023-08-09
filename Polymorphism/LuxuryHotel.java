package com.xworkz.Polymorphism;

public class LuxuryHotel extends Hotel {

	@Override
	public void food() {
		System.out.println("LuxuryHotel overrides the Hotel");
		super.food();
	}

	@Override
	public void food(String name) {
		super.food(name);
	}

	@Override
	public void food(String name, double price) {
		super.food(name, price);
	}

	@Override
	public void food(String name, double price, int quantity) {
		super.food(name, price, quantity);
	}

	@Override
	public void food(String name, double price, int quantity, String location) {
		super.food(name, price, quantity, location);
	}

	@Override
	public void food(String name, double price, int quantity, String location, boolean tasty) {
		super.food(name, price, quantity, location, tasty);
	}

}
