package com.xworkz.Association;

public class Shope {

	public SalesMan salesMan;
	public void name() {
		System.out.println("Invoking name in shop");
		if(this.salesMan!=null) {
			this.salesMan.name();
		}
		else {
			System.out.println("Salesman is null, cannot invoke name");
		}
	}
	public void salesInfo() {
		System.out.println("Invoking salesInfo in shop");
		if(this.salesMan!=null) {
			this.salesMan.product();
		}
		else {
			System.out.println("Salesman is null, cannot invoke name");
		}
	}
	
}
