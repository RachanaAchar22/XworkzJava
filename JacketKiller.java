class JacketKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in MethodKiller");
		Jacket jacket1=new Jacket();
		System.out.println(jacket1.color);
		System.out.println(jacket1.size);
		System.out.println(jacket1.brand);
		System.out.println(jacket1.price);
		System.out.println(jacket1.type);
		
		System.out.println("\n");
		jacket1.color="black";
		jacket1.size=28;
		jacket1.brand="peterEngland";
		jacket1.price=1500.0f;
		jacket1.type="cotton";
		System.out.println(jacket1.color);
		System.out.println(jacket1.size);
		System.out.println(jacket1.brand);
		System.out.println(jacket1.price);
		System.out.println(jacket1.type);
		
		System.out.println("==============================");
		Jacket jacket2=new Jacket();
		System.out.println(jacket2.color);
		System.out.println(jacket2.size);
		System.out.println(jacket2.brand);
		System.out.println(jacket2.price);
		System.out.println(jacket2.type);
		
		System.out.println("\n");
		jacket2.color="blue";
		jacket2.size=28;
		jacket2.brand="Belstaff";
		jacket2.price=2000.0f;
		jacket2.type="cotton";
		System.out.println(jacket2.color);
		System.out.println(jacket2.size);
		System.out.println(jacket2.brand);
		System.out.println(jacket2.price);
		System.out.println(jacket2.type);
		
		
	}
}