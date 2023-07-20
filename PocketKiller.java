class PocketKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in PocketKiller");
		Pocket pocket1=new Pocket();
		System.out.println(pocket1.money);
		System.out.println(pocket1.pocketcolor);
		System.out.println(pocket1.card);
		System.out.println(pocket1.cost);
		System.out.println(pocket1.brand);
		
		System.out.println("\n");
		pocket1.money=5000.0f;
		pocket1.pocketcolor="Black";
		pocket1.card="ATM card";
		pocket1.cost=60.0f;
		pocket1.brand="Fossil";
		System.out.println(pocket1.money);
		System.out.println(pocket1.pocketcolor);
		System.out.println(pocket1.card);
		System.out.println(pocket1.cost);
		System.out.println(pocket1.brand);
		
		System.out.println("==============================");
		System.out.println("Running main in PocketKiller");
		Pocket pocket2=new Pocket();
		System.out.println(pocket2.money);
		System.out.println(pocket2.pocketcolor);
		System.out.println(pocket2.card);
		System.out.println(pocket2.cost);
		System.out.println(pocket2.brand);
		
		System.out.println("\n");
		pocket2.money=7000.0f;
		pocket2.pocketcolor="grey";
		pocket2.card="ATM card";
		pocket2.cost=50.0f;
		pocket2.brand="Gucci";
		System.out.println(pocket2.money);
		System.out.println(pocket2.pocketcolor);
		System.out.println(pocket2.card);
		System.out.println(pocket2.cost);
		System.out.println(pocket2.brand);
		
	}
	
}