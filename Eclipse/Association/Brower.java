package com.xworkz.Association;

public class Brower {
	public Internet internet;
	public void BrowerType() {
		System.out.println("Invoking Browertype in brower");
		if(this.internet!=null) {
			this.internet.speed();
		}
		else {
			System.err.println("Internet is null cannot invoke BrowerType");
		}
	}
	public void search() {
		System.out.println("Invoking search in brower");
		if(this.internet!=null) {
			this.internet.passWord();
		}
		else {
			System.err.println("Internet is null cannot invoke Search");
		}
	}
	

}
