package com.xworkz.Association;

public class PowerBank {
	public Battery battery;
	public void batteryInfo() {
		System.out.println("Invoking batteryInfo in battery");
		if(this.battery!=null) {
			this.battery.capacity();
		}
		else {
			System.err.println("Battery is full cannot invoke batteryInfo");
		}
	}
	public void batteryName() {
		System.out.println("Invoking batteryname in battery");
		if(this.battery!=null) {
			this.battery.name();
		}
		else {
			System.err.println("Battery is full cannot invoke batteryname");
		}
	}
	
}
