package com.xworkz.Polymorphism;

public class Block extends Street {

	@Override
	public void light() {
		System.out.println("Block overrides Street");
		super.light();
	}

	@Override
	public void light(String color) {
		super.light(color);
	}

	@Override
	public void light(String color, int noOfLight) {
		super.light(color, noOfLight);
	}

	@Override
	public void light(String color, int noOfLight, int noOfPoles) {
		super.light(color, noOfLight, noOfPoles);
	}

	@Override
	public void light(String color, int noOfLight, int noOfPoles, double poleHeight) {
		super.light(color, noOfLight, noOfPoles, poleHeight);
	}

	@Override
	public void light(String color, int noOfLight, int noOfPoles, double poleHeight, String streetName) {
		super.light(color, noOfLight, noOfPoles, poleHeight, streetName);
	}

}
