package com.xworkz.override;

public class Tank extends Drum{
	
	@Override
	public void hold() {
		System.out.println("Tank overrides the Drum");
		super.hold();
	}

}
