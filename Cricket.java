class Cricket{
	
	int noOfPlayers=11;
	String stadiumName="Chinnaswamy";
	String name="virat Kohli";
	
	Cricket()
	{

		System.out.println("Number of players:"+this.noOfPlayers);
		System.out.println("Stadium Name:"+this.stadiumName);
		System.out.println("Name:"+this.name);
		
	}
	Cricket(int noOfPlayers,String stadiumName,String name)
	{
		this.noOfPlayers=noOfPlayers;
		this.stadiumName=stadiumName;
		this.name=name;
		System.out.println("Number of players:"+this.noOfPlayers);
		System.out.println("Stadium Name:"+this.stadiumName);
		System.out.println("Name:"+this.name);
		
	}
	
}