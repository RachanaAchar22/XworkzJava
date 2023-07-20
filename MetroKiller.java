class MetroKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in MetroKiller");
		Metro metro1=new Metro();
		System.out.println(metro1.name);
		System.out.println(metro1.line1);
		System.out.println(metro1.line2);
		System.out.println(metro1.stationName);
		System.out.println(metro1.ticket);
		
		System.out.println("\n");
		metro1.name="vande matarm";
		metro1.line1="puple";
		metro1.line2="Green";
		metro1.stationName="rajajinagar";
		metro1.ticket="coin";
		System.out.println(metro1.name);
		System.out.println(metro1.line1);
		System.out.println(metro1.line2);
		System.out.println(metro1.stationName);
		System.out.println(metro1.ticket);
		
		System.out.println("==============================");
		Metro metro2=new Metro();
		System.out.println(metro2.name);
		System.out.println(metro2.line1);
		System.out.println(metro2.line2);
		System.out.println(metro2.stationName);
		System.out.println(metro2.ticket);
		
		System.out.println("\n");
		metro2.name="vande matarm";
		metro2.line1="Green";
		metro2.line2="Purple";
		metro2.stationName="KR market";
		metro2.ticket="QR";
		System.out.println(metro2.name);
		System.out.println(metro2.line1);
		System.out.println(metro2.line2);
		System.out.println(metro2.stationName);
		System.out.println(metro2.ticket);
		
		
		
	}
}