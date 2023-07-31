package app;

public class ToothPasteRunner{

	public static void main(String[] args) {
		System.out.println("Invoking main in ToothPaste");
		String name="Colgate vedshakti";
		String brand="Colgate";
		String company="Colgate Company";
		Company company1=new Company(company,"Rachana","Bangaluru");
		Ingredient ingredient1=new Ingredient("Silica",15,300);
		Ingredient ingredient2=new Ingredient("Glycerien",20,200);
		Ingredient ingredient3=new Ingredient("Sorbitol",30,250);
		Ingredient ingredient4=new Ingredient("Cellulose gum",35,400);
		Ingredient ingredient5=new Ingredient("Carrageenan",40,350);
		Ingredient[] ingredients= {ingredient1,ingredient2,ingredient3,ingredient4,ingredient5};
		
		ToothPaste toothPaste=new ToothPaste(name,brand,company,ingredients);
		toothPaste.printInfo();
		company1.printInfo();
				
	}
}
