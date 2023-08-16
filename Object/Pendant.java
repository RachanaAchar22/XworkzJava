package com.xworkz.app.Object;

public class Pendant {
	
	private String shape;
	private double price;
	private String material;
	private String shopeName;
	private String color;
	private String location;
	private String theme;
	private int size;
	private boolean gemStone;
	private boolean engraving;
	private boolean matchingSet;
	private boolean message;
	
	public Pendant()
	{
		System.out.println("Invoking no-args in Pendant");
	}

	public Pendant(String shape, double price, String material, String shopeName, String color, String location,
			String theme, int size, boolean gemStone, boolean engraving, boolean matchingSet, boolean message) {
		super();
		this.shape = shape;
		this.price = price;
		this.material = material;
		this.shopeName = shopeName;
		this.color = color;
		this.location = location;
		this.theme = theme;
		this.size = size;
		this.gemStone = gemStone;
		this.engraving = engraving;
		this.matchingSet = matchingSet;
		this.message = message;
	}

	@Override
	public String toString() {
		return "shape=" + shape + ", price=" + price + ", material=" + material + ", shopeName=" + shopeName
				+ ", color=" + color + ", location=" + location + ", theme=" + theme + ", size=" + size + ", gemStone="
				+ gemStone + ", engraving=" + engraving + ", matchingSet=" + matchingSet + ", message=" + message + "";
	}
	

}
