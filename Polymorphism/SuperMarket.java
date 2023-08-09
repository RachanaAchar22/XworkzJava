package com.xworkz.Polymorphism;

public class SuperMarket extends Market {
	@Override
	public void purchase() {
		System.out.println("SuperMarket overrides Market");
		super.purchase();
	}

	@Override
	public void purchase(String productName) {
		super.purchase(productName);
	}

	@Override
	public void purchase(String productName, double price) {
		super.purchase(productName, price);
	}

	@Override
	public void purchase(String productName, double price, int quantity) {
		super.purchase(productName, price, quantity);
	}

	@Override
	public void purchase(String productName, double price, int quantity, String brand) {
		super.purchase(productName, price, quantity, brand);
	}

	@Override
	public void purchase(String productName, double price, int quantity, String brand, String location) {
		super.purchase(productName, price, quantity, brand, location);
	}

}
