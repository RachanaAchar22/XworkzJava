package com.xworkz.override;

public class ProteusAmoeba extends Amoeba{
	
	@Override
	public void locomotion() {
		System.out.println("ProteusAmoeba overrides the  Amoeba");
		super.locomotion();
	}
	

}
