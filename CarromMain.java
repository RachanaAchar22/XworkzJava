class CarromMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking main on carrom");
		Carrom carrom1=new Carrom();
		System.out.println(carrom1.name);
		System.out.println(carrom1.price);
		System.out.println(carrom1.coinColor);
		System.out.println(carrom1.material);
		System.out.println(carrom1.noOfPlayers);
		
		System.out.println("--------------------------");
		Carrom carrom2=new Carrom("Surco ellora youth");
		System.out.println(carrom2.name);
		
		System.out.println("--------------------------");
		Carrom carrom3=new Carrom("Surco ellora youth",1000);
		System.out.println(carrom3.name);
		System.out.println(carrom3.price);
		
		System.out.println("--------------------------");
		Carrom carrom4=new Carrom("Surco ellora youth",1000,"Black");
		System.out.println(carrom4.name);
		System.out.println(carrom4.price);
		System.out.println(carrom4.coinColor);
		
		System.out.println("--------------------------");
		Carrom carrom5=new Carrom("Surco ellora youth",1000,"Red","wood");
		System.out.println(carrom5.name);
		System.out.println(carrom5.price);
		System.out.println(carrom5.coinColor);
		System.out.println(carrom5.material);
		
		System.out.println("--------------------------");
		Carrom carrom6=new Carrom("Surco ellora youth",1000,"Red","wood",4);
		System.out.println(carrom6.name);
		System.out.println(carrom6.price);
		System.out.println(carrom6.coinColor);
		System.out.println(carrom6.material);
		System.out.println(carrom6.noOfPlayers);
		
	}
}