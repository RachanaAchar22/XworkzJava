package app;

public class Corporator {
	public Building[] buildings;
	public String corporatorName;
	
	public Corporator(Building[] building, String name)
	{
		this.buildings=buildings;
		this.corporatorName=corporatorName;
		
	}
	public void printInfo() {
		System.out.println("Invoking printInfo in corporator");
		System.out.println("Corporator Name :"+this.corporatorName);
		for(int index=0;index<this.buildings.length;index++) {
			Building ref=buildings[index];
			System.out.println(ref);
		}
	}
}
