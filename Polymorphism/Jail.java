package com.xworkz.Polymorphism;

public class Jail extends PoliceStation{
	
	@Override
	public void criminal() {
		System.out.println("Jail overrides PoliceStation");
		super.criminal();
	}

	@Override
	public void criminal(String name, String location) {
		super.criminal(name, location);
	}

	@Override
	public void criminal(String name, String location, int noOfCriminals) {
		super.criminal(name, location, noOfCriminals);
	}

	@Override
	public void criminal(String name, String location, int noOfCriminals, String crimeName) {
		super.criminal(name, location, noOfCriminals, crimeName);
	}

	@Override
	public void criminal(String name, String location, int noOfCriminals, String crimeName, String criminalName) {
		super.criminal(name, location, noOfCriminals, crimeName, criminalName);
	}

}
