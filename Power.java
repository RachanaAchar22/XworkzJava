class Power{
	static String type;
	static String measured;
	String produce;
	String use;
	
	Power(String produce,String use)
	{
		System.out.println("Invoking String const in Power");
		this.produce=produce;
		this.use=use;
	}
	static{
		type="Electrical Power";
		measured="Watts";
	}
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Power");
		System.out.println("Power type :"+type);
		System.out.println("Power measured in :"+measured);
	}
	void printInstance()
	{
		System.out.println("Invoking printInstance in Power");
		System.out.println("Power produce :"+this.produce);
		System.out.println("Power use :"+this.use);
	}
}