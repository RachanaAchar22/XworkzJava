package com.xworkz.Polymorphism;

public class Library {

	public void book() {
		System.out.println("Invoking no-args in Book");
	}

	public void book(String name) {
		System.out.println("Invoking String in Book");
	}

	public void book(String name, String authorName) {
		System.out.println("Invoking String in Book");
	}

	public void book(String name, String authorName, int noOfPages) {
		System.out.println("Invoking String,int in Book");
	}

	public void book(String name, String authorName, int noOfPages, String format) {
		System.out.println("Invoking String,int,String in Book");
	}

	public void book(String name, String authorName, int noOfPages, String format, int year) {
		System.out.println("Invoking String,int,String,int in Book");
	}

}
