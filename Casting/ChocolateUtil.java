package com.xworkz.Casting;

public class ChocolateUtil {
	
	public static void taste(Chocolate chocolate)
	{
		System.out.println("Invoking taste in ChocolateUtil");
		System.out.println(chocolate.color);
		if(chocolate instanceof DarkChocolate)
		{
			System.out.println("Chocolate is DarkChocolate");
			DarkChocolate  darkChocolate=(DarkChocolate)chocolate;
			System.out.println(darkChocolate.price);
			darkChocolate. darkChocolateInfo();
		}
		if(chocolate instanceof CaramelChocolate)
		{
			System.out.println("Chocolate is CaramelChocolate");
			CaramelChocolate  caramelChocolate=(CaramelChocolate)chocolate;
			System.out.println(caramelChocolate.flavour);
			caramelChocolate. caramelChocolateInfo();
		}
	}

}
