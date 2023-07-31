package app;

public class ToothPaste {
	
	public String name;
	public String brand;
	public String company;
	public Ingredient[] ingredients;
	
	public ToothPaste(String name,String brand,String company,Ingredient[] ingredients)
	{
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingredients=ingredients;
	}
	public void printInfo()
	{
		System.out.println("ToothPaste Info");
		System.out.println("ToothPaste Name :"+this.name);
		System.out.println("Toothpaste brand :"+this.brand);
		System.out.println("Toothpaste company :"+this.company);
		for(int index=0;index<this.ingredients.length;index++) {
			Ingredient ref=ingredients[index];
			ref.printInfo();
		}
	}
}