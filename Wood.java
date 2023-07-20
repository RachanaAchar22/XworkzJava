class Wood{
	String material;
	double price;
	String name;
	float length;
	float width;
	
	Wood()
	{
		System.out.println("Invoking no-orguments in wood");
	}
	Wood(String material)
	{
		System.out.println("Invoking string const in wood");
		this.material=material;
	}
	Wood(String material,double price)
	{
		this(material);
		System.out.println("Invoking string,double const in wood");
		this.price=price;
	}
	Wood(String material,double price,String name)
	{
		this(material,price);
		System.out.println("Invoking string,double const in wood");
		this.name=name;
	}
	Wood(String material,double price,String name,float length)
	{
		this(material,price,name);
		System.out.println("Invoking string,double,float const in wood");
		this.length=length;
	}
	Wood(String material,double price,String name,float length,float width)
	{
		this(material,price,name,length);
		System.out.println("Invoking string,double,float const in wood");
		this.width=width;
	}
}