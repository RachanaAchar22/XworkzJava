package com.xworkz.app.Object;

public class Flag {
	
	private String country;
	private int code;
	private double price;
	
	public Flag()
	{
		System.out.println("Invoking no-args in Flag");
	}

	public Flag(String country, int code, double price) {
		super();
		this.country = country;
		this.code = code;
		this.price = price;
	}

	@Override
	public String toString() {
		return "country=" + country + ", coder=" + code + ", price=" + price + "";
	}
	
	
	

}
