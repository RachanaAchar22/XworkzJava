class Helmet{
	static String brand;
	static String type;
	String color;
	double price;
	
	Helmet(String color,double price)
	{
		System.out.println("Invoking String, double const in Helmet");
		this.color=color;
		this.price=price;
	}
	static{
		brand="Rapido";
		type="Full";
	}
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Helmet");
		System.out.println("Helmet brand :"+brand);
		System.out.println("Helmet type :"+type);
		
	}
	void printInstance()
	{
		System.out.println("Invoking printInstance in Helmet");
		System.out.println("Helmet color :"+this.color);
		System.out.println("Helmet price :"+this.price);
	}
	
}