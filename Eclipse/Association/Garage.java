package com.xworkz.Association;

public class Garage {
	public Mechanic mechanic;
	public void Name() {
		System.out.println("Invoking Name in Garage");
		if(this.mechanic!=null) {
			this.mechanic.Repair();
		}
		else {
			System.err.println("Mechanic is null,cannot invoke name");
		}
		
	}
	public void Address() {
		System.out.println("Invoking address in Garage");
		if(this.mechanic!=null) {
			this.mechanic.WheelService();
		}
		else {
			System.err.println("Mechanic is null,cannot invoke name");
		}
		
	}
	

}
