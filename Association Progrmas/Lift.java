package app;

public class Lift {
	public int liftNo;
	
	public Lift(int liftNo)
	{
		this.liftNo=liftNo;
	}
	public void printinfo()
	{
		System.out.println("Invoking printInfo in Lift");
		System.out.println("Lift Number :"+this.liftNo);
	}

}
