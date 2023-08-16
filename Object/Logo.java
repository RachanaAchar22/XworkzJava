package com.xworkz.app.Object;

public class Logo {
	
	private String name;
	private String color;
	private float length;
	private float width;
	private String type;
	
	public Logo(){
		System.out.println("Invoking no-args in Logo");
	}

	public Logo(String name, String color, float length, float width, String type) {
		super();
		this.name = name;
		this.color = color;
		this.length = length;
		this.width = width;
		this.type = type;
	}

	@Override
	public String toString() {
		return "name=" + name + ", color=" + color + ", length=" + length + ", width=" + width + ", type=" + type
				+ "";
	}
	
}
