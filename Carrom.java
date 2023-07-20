class Carrom{
	String name;
	float price;
	String coinColor;
	String material;
	int noOfPlayers;
	
	Carrom()
	{
		System.out.println("Invoking No arg constructor of Carrom");
		
	}
	Carrom(String name)
	{
		System.out.println("Invoking string constructor of carrom");
		System.out.println("Name :"+name);
		this.name=name;
	
	}
	Carrom(String name,float price)
	{
		System.out.println("Invoking string, float constructor of carrom");
		System.out.println("Name :"+name);
		System.out.println("price :"+price);
		this.name=name;
		this.price=price;
	}
	Carrom(String name,float price, String coinColor)
	{
		System.out.println("Invoking string, float constructor of carrom");
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
		System.out.println("CoinColor :"+coinColor);
		this.name=name;
		this.price=price;
		this.coinColor=coinColor;
	}
	Carrom(String name,float price, String coinColor,String material)
	{
		System.out.println("Invoking string, float constructor of carrom");
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
		System.out.println("CoinColor :"+coinColor);
		System.out.println("Material :"+material);
		this.name=name;
		this.price=price;
		this.coinColor=coinColor;
		this.material=material;
	}
	Carrom(String name,float price, String coinColor,String material,int noOfPlayers)
	{
		System.out.println("Invoking string, float constructor of carrom");
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
		System.out.println("CoinColor :"+coinColor);
		System.out.println("Material :"+material);
		System.out.println("NoOfPlayers :"+noOfPlayers);
		this.name=name;
		this.price=price;
		this.coinColor=coinColor;
		this.material=material;
		this.noOfPlayers=noOfPlayers;
	}
}