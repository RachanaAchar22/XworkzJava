package com.xworkz.Polymorphism;

public class Town extends City {

	@Override
	public void cityInfo() {
		System.out.println("Town overrides City");
		super.cityInfo();
	}

	@Override
	public void cityInfo(String cityName) {
		super.cityInfo(cityName);
	}

	@Override
	public void cityInfo(String cityName, int pincode) {
		super.cityInfo(cityName, pincode);
	}

	@Override
	public void cityInfo(String cityName, int pincode, String type) {
		super.cityInfo(cityName, pincode, type);
	}

	@Override
	public void cityInfo(String cityName, int pincode, String type, int noOfPeople) {
		super.cityInfo(cityName, pincode, type, noOfPeople);
	}

	@Override
	public void cityInfo(String cityName, int pincode, String type, int noOfPeople, int noOfTown) {
		super.cityInfo(cityName, pincode, type, noOfPeople, noOfTown);
	}

}
