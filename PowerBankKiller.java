class PowerBankKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in powerbankkiller");
		PowerBank powerBank1=new PowerBank();
		System.out.println(powerBank1.brand);
		System.out.println(powerBank1.battery);
		System.out.println(powerBank1.price);
		System.out.println(powerBank1.charging);
		System.out.println(powerBank1.capacity);
		
		System.out.println("\n");
		powerBank1.brand="Ambrane";
		powerBank1.battery="Rechargeble";
		powerBank1.price=2000f;
		powerBank1.charging="single device";
		powerBank1.capacity="2mAh";
		System.out.println(powerBank1.brand);
		System.out.println(powerBank1.battery);
		System.out.println(powerBank1.price);
		System.out.println(powerBank1.charging);
		System.out.println(powerBank1.capacity);
		
		System.out.println("==============================");
		PowerBank powerBank2=new PowerBank();
		System.out.println(powerBank2.brand);
		System.out.println(powerBank2.battery);
		System.out.println(powerBank2.price);
		System.out.println(powerBank2.charging);
		System.out.println(powerBank2.capacity);
		
		System.out.println("\n");
		powerBank2.brand="Boat";
		powerBank2.battery="Rechargeble";
		powerBank2.price=3000f;
		powerBank2.charging="Multiple device";
		powerBank2.capacity="3mAh";
		System.out.println(powerBank2.brand);
		System.out.println(powerBank2.battery);
		System.out.println(powerBank2.price);
		System.out.println(powerBank2.charging);
		System.out.println(powerBank2.capacity);
		
		
		
	}
}