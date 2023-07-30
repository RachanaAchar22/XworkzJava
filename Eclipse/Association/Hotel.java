package com.xworkz.Association;

public class Hotel {
	public Cook cook;
	public void HotelInfo() {
		System.out.println("Invoking HotelInfo in hotel");
		if(this.cook!=null) {
			this.cook.salary();
		}
		else {
			System.err.println("Cook is null cannot invoke HotelInfo");
		}
	}
	public void cookInfo() {
		System.out.println("Invoking cookInfo in hotel");
		if(this.cook!=null) {
			this.cook.experience();
		}
		else {
			System.err.println("Cook is null cannot invoke cookInfo");
		}
	}
	

}
