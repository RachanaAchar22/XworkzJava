package com.xworkz.override;

public class GoldBangle extends Bangle {

	@Override
	public void sound() {
		System.out.println("Invoking GoldBangle in bangle");
		super.sound();
	}

}
