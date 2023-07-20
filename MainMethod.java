class MainMethod{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in wood");
		Wood wood=new Wood("table",500d,"Birch",7.5f,5.5f);
		Wood wood1=new Wood("chair",500d,"Birch");
		Wood wood2=new Wood("window");
		
		System.out.println("--------------------------------");
		System.out.println("Invoking main in Mall");
		Mall mall=new Mall("LuLu mall","market","mejestic");
		Mall mall1=new Mall("Lulu mall","cloths shop","mejestic",20);
		Mall mall2=new Mall("Lulu mall","Dominos","mejestic",30,100,"8Hour",true);
		
		System.out.println("--------------------------------");
		System.out.println("Invoking main in park");
		Park park=new Park("Cubbon park","Vidhana Souda",100,"Picnic area","7Hours",4,"games",true,50);
		Park park1=new Park("Cubbon park","Vidhana Souda",100,"Picnic area","7Hours",4);
		Park park2=new Park("Cubbon park","Vidhana souda",100);
	}
	
}