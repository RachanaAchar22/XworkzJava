class BadmintonKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in BadmintonKiller");
		Badminton badminton1=new Badminton();
		System.out.println(badminton1.noOfPlayers);
		System.out.println(badminton1.playerName);
		System.out.println(badminton1.stadiumName);
		System.out.println(badminton1.brand);
		System.out.println(badminton1.people);
		
		System.out.println("\n");
		badminton1.noOfPlayers=2;
		badminton1.playerName="PV sindhu";
		badminton1.stadiumName="banglure";
		badminton1.brand="Yonex";
		badminton1.people=30000;
		System.out.println(badminton1.noOfPlayers);
		System.out.println(badminton1.playerName);
		System.out.println(badminton1.stadiumName);
		System.out.println(badminton1.brand);
		System.out.println(badminton1.people);
		
		System.out.println("==============================");
		Badminton badminton2=new Badminton();
		System.out.println(badminton2.noOfPlayers);
		System.out.println(badminton2.playerName);
		System.out.println(badminton2.stadiumName);
		System.out.println(badminton2.brand);
		System.out.println(badminton2.people);
		
		System.out.println("\n");
		badminton2.noOfPlayers=2;
		badminton2.playerName="Saina Nehwal";
		badminton2.stadiumName="Hydrabad";
		badminton2.brand="Victor";
		badminton2.people=20000;
		System.out.println(badminton2.noOfPlayers);
		System.out.println(badminton2.playerName);
		System.out.println(badminton2.stadiumName);
		System.out.println(badminton2.brand);
		System.out.println(badminton2.people);
	}
}