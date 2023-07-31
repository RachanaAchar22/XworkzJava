package app;

public class Area {
	 public String name;
	 public Corporator corporator;
	 
	 public Area(String name,Corporator corporator)
	 {
		 this.name=name;
		 this.corporator=corporator;
	 }
	 public void printInfo() {
		 System.out.println("Invoking printInfo in Area");
		 System.out.println("Name :"+this.name);
		 System.out.println("Corporator Name :"+this.corporator);
		 corporator.printInfo();
	 }

}
