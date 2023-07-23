class Butterfly{
	static int wings;
	static String collect;
	String produce;
	String color;
	
	Butterfly(String produce,String color)
	{
		System.out.println("Invoking string const in Butterfly");
		this.produce=produce;
		this.color=color;
	}
	static{
		wings=4;
		collect="pollen";
	}
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Butterfly");
		System.out.println("Wings :"+wings);
		System.out.println("Butterfly collect :"+collect);
	}
	void printInstance()
	{
		System.out.println("Invoking printInstance in Butterfly");
		System.out.println("Butterfly produce :"+this.produce);
		System.out.println("Butterfly color :"+this.color);
	}
}