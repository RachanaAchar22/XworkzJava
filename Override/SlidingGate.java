package com.xworkz.override;

public class SlidingGate extends Gate {

	@Override
	public void Control() {
		System.out.println("SlidingGate overrides the gate");
		super.Control();
	}

}
