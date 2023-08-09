package com.xworkz.Polymorphism;

public class Tradition extends Temple {

	@Override
	public void Pray() {
		System.out.println("Tradition overrides the temple");
		super.Pray();
	}

	@Override
	public void Pray(String name) {
		super.Pray(name);
	}

	@Override
	public void Pray(String name, String devotion) {
		super.Pray(name, devotion);
	}

	@Override
	public void Pray(String name, String devotion, int noOfPeople) {
		super.Pray(name, devotion, noOfPeople);
	}

	@Override
	public void Pray(String name, String devotion, int noOfPeople, String communication) {
		super.Pray(name, devotion, noOfPeople, communication);
	}

	@Override
	public void Pray(String name, String devotion, int noOfPeople, String communication, String rituals) {
		super.Pray(name, devotion, noOfPeople, communication, rituals);
	}

}
