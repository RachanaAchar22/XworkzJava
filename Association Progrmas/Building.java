package app;

public class Building {
	public Floor[] floors;
	public Lift[] lifts;
	
	public Building(Floor[] floors,Lift[] lifts)
	{
		this.floors=floors;
		this.lifts=lifts;
	}
	public void printInfo() {
		System.out.println("Invoking printInfo in Building");
		for(int index=0;index<this.floors.length;index++) {
			Floor ref=floors[index];
			System.out.println(ref);
		}
		for(int index=0;index<this.lifts.length;index++) {
			Lift ref1=lifts[index];
			System.out.println(ref1);
		}
	}
	

}
