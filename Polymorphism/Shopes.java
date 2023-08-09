package com.xworkz.Polymorphism;

public class Shopes extends Mall {
	@Override
	public void store() {
		System.out.println("Shopes overrides the Mall ");
		super.store();
	}

	@Override
	public void store(String mallName) {
		super.store(mallName);
	}

	@Override
	public void store(String mallName, String location) {
		super.store(mallName, location);
	}

	@Override
	public void store(String mallName, String location, int noOfPeople) {
		super.store(mallName, location, noOfPeople);
	}

	@Override
	public void store(String mallName, String location, int noOfPeople, boolean parkingArea) {
		super.store(mallName, location, noOfPeople, parkingArea);
	}

	@Override
	public void store(String mallName, String location, int noOfPeople, boolean parkingArea, int noOfFloor) {
		super.store(mallName, location, noOfPeople, parkingArea, noOfFloor);
	}

}
