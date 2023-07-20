class StadiumKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in stadiumKiller");
		Stadium stadium1=new Stadium();
		System.out.println(stadium1.players);
		System.out.println(stadium1.game);
		System.out.println(stadium1.name);
		System.out.println(stadium1.people);
		System.out.println(stadium1.playerName);
		
		System.out.println("\n");
		stadium1.players=11;
		stadium1.game="ckicket";
		stadium1.name="chinnaswamy";
		stadium1.people=10000;
		stadium1.playerName="virat kohli";
		System.out.println(stadium1.players);
		System.out.println(stadium1.game);
		System.out.println(stadium1.name);
		System.out.println(stadium1.people);
		System.out.println(stadium1.playerName);
		
		System.out.println("==============================");
		Stadium stadium2=new Stadium();
		System.out.println(stadium2.players);
		System.out.println(stadium2.game);
		System.out.println(stadium2.name);
		System.out.println(stadium2.people);
		System.out.println(stadium2.playerName);
		
		System.out.println("\n");
		stadium2.players=18;
		stadium2.game="Hockey";
		stadium2.name="Eden Gardens";
		stadium2.people=20000;
		stadium2.playerName="Sreejesh";
		System.out.println(stadium2.players);
		System.out.println(stadium2.game);
		System.out.println(stadium2.name);
		System.out.println(stadium2.people);
		System.out.println(stadium2.playerName);
		
	}
}