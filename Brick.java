class Brick{
	static String load;
	static String insulation;
	double price;
	String use;
	
	Brick (double price,String use)
	{
		System.out.println("Invoking double, String const in Brick");
		this.price=price;
		this.use=use;
	}
	static{
		load="Buildings";
		insulation="Thermal";
	}
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Brick");
		System.out.println("Brick distribute loads in :"+load);
		System.out.println("Brick provide  :"+insulation);
	}
	void printInstance()
	{
		System.out.println("Invoking printInstance in Brick");
		System.out.println("Price of Brick :"+this.price);
		System.out.println("use :"+this.use);
	}
}