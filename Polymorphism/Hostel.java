package com.xworkz.Polymorphism;

public class Hostel {

	public void students() {
		System.out.println("Invoking no-arg in Hostel");
	}

	public void students(String Name) {
		System.out.println("Invoking String in Hostel");
	}

	public void students(String Name, int noOfStudents) {
		System.out.println("Invoking String,int in Hostel");
	}

	public void students(String Name, int noOfStudents, String location) {
		System.out.println("Invoking String,int in Hostel");
	}

	public void students(String Name, int noOfStudents, String location, int noOfFloors) {
		System.out.println("Invoking String,int,String  in Hostel");
	}

	public void students(String Name, int noOfStudents, String location, int noOfFloors, String room) {
		System.out.println("Invoking String,int,String  in Hostel");
	}

}
