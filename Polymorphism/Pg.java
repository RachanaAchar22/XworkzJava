package com.xworkz.Polymorphism;

public class Pg extends Hostel {

	@Override
	public void students() {
		System.out.println("Pg overrides the Hostel");
		super.students();
	}

	@Override
	public void students(String Name) {
		super.students(Name);
	}

	@Override
	public void students(String Name, int noOfStudents) {
		super.students(Name, noOfStudents);
	}

	@Override
	public void students(String Name, int noOfStudents, String location) {
		super.students(Name, noOfStudents, location);
	}

	@Override
	public void students(String Name, int noOfStudents, String location, int noOfFloors) {
		super.students(Name, noOfStudents, location, noOfFloors);
	}

	@Override
	public void students(String Name, int noOfStudents, String location, int noOfFloors, String room) {
		super.students(Name, noOfStudents, location, noOfFloors, room);
	}

}
