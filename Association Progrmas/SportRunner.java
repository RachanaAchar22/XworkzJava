package app;

public class SportRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in SportRunner");
		String name="Cricket";
		Floor floor1=new Floor("Ground",1);
		Floor floor2=new Floor("First",2);
		Floor floor3=new Floor("Second",3);
		Floor floor4=new Floor("Third",4);
		Floor floor5=new Floor("Fourth",5);
		Floor floor6=new Floor("Fifth",6);
		Floor floor7=new Floor("Sixth",7);
		Floor[] floor= {floor1,floor2,floor3,floor4,floor5,floor6,floor7};
		
		Lift lift1=new Lift(3);
		Lift lift2=new Lift(4);
		Lift[] lift= {lift1,lift2};
		
		Building building1=new Building(floor,lift);
		Building building2=new Building(floor,lift);
		Building[] building= {building1,building2};
		
		Corporator corporator=new Corporator(building,"Xworkz");
		
		Area area1=new Area("Rajajinagar",corporator);
		Area area2=new Area("Vijayanagr",corporator);
		Area area3=new Area("malleswaram",corporator);
		Area area4=new Area("chikpete",corporator);
		Area area5=new Area("kengeri",corporator);
		Area[] area= {area1,area2,area3,area4,area5};
		
		HomeTown homeTown=new HomeTown("Bangalure",577101,area);
		
		Player player1=new Player(building,"Virat Kohli","10 years",homeTown);
		Player player2=new Player(building,"Rohit","15 years",homeTown);
		Player player3=new Player(building,"Dhoni","20 years",homeTown);
		Player player4=new Player(building,"rahul","15 years",homeTown);
		Player player5=new Player(building,"jadeja","12 years",homeTown);
		Player[] players= {player1,player2,player3,player4,player5};
		
		Sport sport=new Sport(name,player);
		Sport.printInfo();
		area1.printInfo();
	}

}
