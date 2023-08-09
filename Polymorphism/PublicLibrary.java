package com.xworkz.Polymorphism;

public class PublicLibrary extends Library {
	@Override
	public void book() {
		System.out.println("PublicLibrary overrides Library");
		super.book();
	}

	@Override
	public void book(String name) {
		super.book(name);
	}

	@Override
	public void book(String name, String authorName) {
		super.book(name, authorName);
	}

	@Override
	public void book(String name, String authorName, int noOfPages) {
		super.book(name, authorName, noOfPages);
	}

	@Override
	public void book(String name, String authorName, int noOfPages, String format) {
		super.book(name, authorName, noOfPages, format);
	}

	@Override
	public void book(String name, String authorName, int noOfPages, String format, int year) {
		super.book(name, authorName, noOfPages, format, year);
	}

}
