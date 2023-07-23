class MainKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking mainkiller in Helmet");
		Helmet helmet=new Helmet("Red",900);
		helmet.printStatic();
		helmet.printInstance();
		
		System.out.println("----------------------------");
		System.out.println("Invoking mainkiller in Candle");
		Candle candle=new Candle(10,"Weddings");
		candle.printStatic();
		candle.printInstance();
		
		System.out.println("----------------------------");
		System.out.println("Invoking mainkiller in Brick");
		Brick brick=new Brick(100,"Foundation walls");
		brick.printStatic();
		brick.printInstance();
		
		System.out.println("----------------------------");
		System.out.println("Invoking mainkiller in Soil");
		Soil soil=new Soil("Air Quality","Structural");
		soil.printStatic();
		soil.printInstance();
		
		System.out.println("----------------------------");
		System.out.println("Invoking mainkiller in Power");
		Power power=new Power("Energy","Physics");
		power.printStatic();
		power.printInstance();
		
		System.out.println("----------------------------");
		System.out.println("Invoking mainkiller in Butterfly");
		Butterfly butterfly=new Butterfly("New seeds","Blue");
		butterfly.printStatic();
		butterfly.printInstance();
		
		System.out.println("----------------------------");
		System.out.println("Invoking mainkiller in Bureau");
		Bureau bureau=new Bureau("Brown",8000);
		bureau.printStatic();
		bureau.printInstance();
		
		
		
	}
}