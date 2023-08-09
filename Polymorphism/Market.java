package com.xworkz.Polymorphism;

public class Market {

	public void purchase() {
		System.out.println("Invoking no-args in Purchase");
	}

	public void purchase(String productName) {
		System.out.println("Invoking String in Purchase");
	}

	public void purchase(String productName, double price) {
		System.out.println("Invoking String,double in Purchase");
	}

	public void purchase(String productName, double price, int quantity) {
		System.out.println("Invoking String,double,int in Purchase");
	}

	public void purchase(String productName, double price, int quantity, String brand) {
		System.out.println("Invoking String,double,int,String in Purchase");
	}

	public void purchase(String productName, double price, int quantity, String brand, String location) {
		System.out.println("Invoking String,double,int,String in Purchase");
	}

}
