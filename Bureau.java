class Bureau{
	static String brand;
	static String type;
	String color;
	double price;
	
	Bureau(String color,double price)
	{
		System.out.println("Invoking String,double in Bureau");
		this.color=color;
		this.price=price;
	}
	static{
		brand="Ercol";
		type="BookCase";
	}
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Bureau");
		System.out.println("Brand name is :"+brand);
		System.out.println("Type information :"+type);
	}
	void printInstance()
	{
		System.out.println("Invoking printInstance in Bureau");
		System.out.println("ColoInfo is :"+this.color);
		System.out.println("Price "+this.price);
	}
}