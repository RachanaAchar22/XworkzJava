class CricketMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in cricketMain");
		Cricket cricket=new Cricket();
		System.out.println("---------------------------");
		
		Cricket cricket1=new Cricket(11,"chinnaswamy","rohith sharma");
		System.out.println(cricket1.noOfPlayers);
		System.out.println(cricket1.stadiumName);
		System.out.println(cricket1.name);
		
	}
	
}