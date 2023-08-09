package com.xworkz.Polymorphism;

public class SafariPark extends Zoo {

	@Override
	public void zooInfo() {
		System.out.println("SafariZoo overrides the Zoo");
		super.zooInfo();
	}

	@Override
	public void zooInfo(String zooName) {
		super.zooInfo(zooName);
	}

	@Override
	public void zooInfo(String zooName, String location) {
		super.zooInfo(zooName, location);
	}

	@Override
	public void zooInfo(String zooName, String location, int entryFee) {
		super.zooInfo(zooName, location, entryFee);
	}

	@Override
	public void zooInfo(String zooName, String location, double entryFee, int noOfAnimals) {
		super.zooInfo(zooName, location, entryFee, noOfAnimals);
	}

	@Override
	public void zooInfo(String zooName, String location, double entryFee, int noOfAnimals, int noOfBirds) {
		super.zooInfo(zooName, location, entryFee, noOfAnimals, noOfBirds);
	}

}
