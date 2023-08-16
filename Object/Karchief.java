package com.xworkz.app.Object;

public class Karchief {
	
	private String material;
	private String color;
	private double price;
	private boolean mutipleColor;
	private String brand;
	private float length;
	private float width;
	
	public Karchief()
	{
		System.out.println("Invoking no-args in Karchief");
	}

	public Karchief(String material, String color, double price, boolean mutipleColor, String brand, float length,
			float width) {
		super();
		this.material = material;
		this.color = color;
		this.price = price;
		this.mutipleColor = mutipleColor;
		this.brand = brand;
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "material=" + material + ", color=" + color + ", price=" + price + ", mutipleColor="
				+ mutipleColor + ", brand=" + brand + ", length=" + length + ", width=" + width + "";
	}
	
	

}
