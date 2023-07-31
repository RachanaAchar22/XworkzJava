package app;

public class Ingredient {
	public String name;
	public int quantity;
	public double cost;
	
	public Ingredient(String name, int quantity,double cost) {
		
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	public void printInfo()
	{
		System.out.println("Ingredients Info");
		System.out.println("Ingredients Name :"+this.name);
		System.out.println("Quantity :"+this.quantity);
		System.out.println("Cost :"+this.cost);
	}

}
