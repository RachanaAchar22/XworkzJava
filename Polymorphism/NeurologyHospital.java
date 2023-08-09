package com.xworkz.Polymorphism;

public class NeurologyHospital extends Hospital{
	@Override
	public void treatment() {
		System.out.println("NeurologyHospital overrides Hospital");
		super.treatment();
	}
	@Override
	public void treatment(String name) {
		super.treatment(name);
	}
	@Override
	public void treatment(String name, String decease) {
		super.treatment(name, decease);
	}
	@Override
	public void treatment(String name, String decease, double feez) {
		super.treatment(name, decease, feez);
	}
	@Override
	public void treatment(String name, String decease, double feez, String location) {
		super.treatment(name, decease, feez, location);
	}
	@Override
	public void treatment(String name, String decease, double feez, String location, int noOfPatients) {
		super.treatment(name, decease, feez, location, noOfPatients);
	}
}
