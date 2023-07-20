class HeadLight{
	String color="red";
	String vehicle="bike";
	float price=200.0f;
	
	HeadLight()
	{
		System.out.println("Color :"+this.color);
		System.out.println("Vehicle :"+this.vehicle);
		System.out.println("Price :"+this.price);
	}
	
	HeadLight(String color,String vehicle,float price)
	{
		this.color=color;
		this.vehicle=vehicle;
		this.price=price;
		System.out.println("Color :"+this.color);
		System.out.println("Vehicle :"+this.vehicle);
		System.out.println("Price :"+this.price);
		
	}
	
	
	
}