package app;

public class Floor {
	public String name;
	public int no;
	
	public Floor(String name, int no)
	{
		this.name=name;
		this.no=no;
	}
	public void printInfo() {
		System.out.println("Invoking printInfo in Floor");
		System.out.println("Name :"+this.name);
		System.out.println("Floor No :"+this.no);
	}

}
