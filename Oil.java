class Oil{
	String name;
	String brand;
	int quantity;
	
	Oil()
	{
		System.out.println("Invoking No arg constructor of oil");
		String name="local";
		System.out.println(name);
		System.out.println(this.name);
	}
		
		Oil(String name)
		{
			System.out.println("Invoking string constructor of oil");
			System.out.println("Name :"+name);
			this.name=name;
		}
		Oil(String name,String brand)
		{
			System.out.println("Invoking string constructor of oil ");
			System.out.println("Name :"+name);
			System.out.println("Brand :"+brand);
			this.name=name;
			this.brand=brand;
		}
		Oil(String name,String brand,int quantity)
		{
			System.out.println("Invoking String and int constuctor of oil");
			System.out.println("Name :"+name);
			System.out.println("Brand :"+brand);
			System.out.println("Quantity :"+quantity);
			this.name=name;
			this.brand=brand;
			this.quantity=quantity;
		}
}