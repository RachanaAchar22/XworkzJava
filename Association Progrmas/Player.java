package app;

public class Player {
	
	public Building building;
	public String name;
	public String experience;
	public HomeTown homeTown;

	public Player(Building building,String name,String experience,HomeTown homeTown)
	{
		this.building=building;
		this.name=name;
		this.experience=experience;
		this.homeTown=homeTown;
	}
	public void printInfo() {
		System.out.println("Invoking printInfo in player");
		System.out.println("Building name :"+this.building);
		System.out.println("Name :"+this.name);
		System.out.println("Experience :"+this.experience);
		System.out.println("Home Town  :"+this.homeTown);
		building.printInfo();
		homeTown.printInfo();
	}
}
