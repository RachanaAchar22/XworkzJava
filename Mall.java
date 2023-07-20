class Mall{
	String name;
	String shop;
	String location;
	int noOfWorker;
	int people;
	String mallHour;
	boolean parkingSpace;
	
	Mall()
	{
		System.out.println("Invoking no-orguments in Mall");
	}
	Mall(String name)
	{
		System.out.println("Invoking String const in Mall");
		this.name=name;
	}
	Mall(String name,String shop)
	{
		this(name);
		System.out.println("Invoking String const in Mall");
		this.shop=shop;
	}
	Mall(String name,String shop,String location)
	{
		this(name,shop);
		System.out.println("Invoking String const in Mall");
		this.location=location;
	}
	Mall(String name,String shop,String location,int noOfWorker)
	{
		this(name,shop,location);
		System.out.println("Invoking String,int const in Mall");
		this.noOfWorker=noOfWorker;
	}
	Mall(String name,String shop,String location,int noOfWorker,int people)
	{
		this(name,shop,location,noOfWorker);
		System.out.println("Invoking String,int const in Mall");
		this.people=people;
	}
	Mall(String name,String shop,String location,int noOfWorker,int people,String mallHour)
	{
		this(name,shop,location,noOfWorker,people);
		System.out.println("Invoking String,int const in Mall");
		this.mallHour=mallHour;
	}
	Mall(String name,String shop,String location,int noOfWorker,int people,String mallHour,boolean parkingSpace)
	{
		this(name,shop,location,noOfWorker,people,mallHour);
		System.out.println("Invoking String,int,boolean const in Mall");
		this.parkingSpace=parkingSpace;
	}
	
}