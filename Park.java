class Park{
	
	String name;
	String location;
	float entryFee;
	String facility;
	String timing;
	int rating;
	String event;
	boolean parkingSpace;
	int visitorsCount;
	
	Park()
	{
		System.out.println("Invoking no-orguments in Park");
	}
	Park(String name)
	{
		System.out.println("Invoking String const in Park");
		this.name=name;
	}
	Park(String name,String location)
	{
		this(name);
		System.out.println("Invoking String const in Park");
		this.location=location;
	}
	Park(String name,String location,float entryFee)
	{
		this(name,location);
		System.out.println("Invoking String,float const in Park");
		this.entryFee=entryFee;
	}
	Park(String name,String location,float entryFee,String facility)
	{
		this(name,location,entryFee);
		System.out.println("Invoking String,float const in Park");
		this.facility=facility;
	}
	Park(String name,String location,float entryFee,String facility,String timing)
	{
		this(name,location,entryFee,facility);
		System.out.println("Invoking String,float const in Park");
		this.timing=timing;
	}
	Park(String name,String location,float entryFee,String facility,String timing,int rating)
	{
		this(name,location,entryFee,facility,timing);
		System.out.println("Invoking String const in Park");
		this.rating=rating;
	}
	Park(String name,String location,float entryFee,String facility,String timing,int rating,String event)
	{
		this(name,location,entryFee,facility,timing,rating);
		System.out.println("Invoking String,float,int const in Park");
		this.event=event;
	}
	Park(String name,String location,float entryFee,String facility,String timing,int rating,String event,boolean parkingSpace)
	{
		this(name,location,entryFee,facility,timing,rating,event);
		System.out.println("Invoking String,float,int const in Park");
		this.parkingSpace=parkingSpace;
	}
	Park(String name,String location,float entryFee,String facility,String timing,int rating,String event,boolean parkingSpace,int visitorsCount)
	{
		this(name,location,entryFee,facility,timing,rating,event,parkingSpace);
		System.out.println("Invoking String,float,int,boolean const in Park");
		this.visitorsCount=visitorsCount;
	}
	
}