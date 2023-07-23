class Candle{
	static String provide;
	static String use;
	double price;
	String decoration;
	
	Candle(double price,String decoration)
	{
		System.out.println("Invoking String, double const in Candle");
		this.price=price;
		this.decoration=decoration;
	}
	static{
		provide="Lighting";
		use="functions";
	}
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Candle");
		System.out.println("Candle provide :"+provide);
		System.out.println("candle use  :"+use);
		
	}
	void printInstance()
	{
		System.out.println("Invoking printInstance in Candle");
		System.out.println("Price of Candle :"+this.price);
		System.out.println("Decoration :"+this.decoration);
	}
}