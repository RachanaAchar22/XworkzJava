class Soil{
	static String use;
	static String recycler;
	String maintain;
	String formation;
	
	Soil(String maintain,String formation)
	{
		System.out.println("Invoking String const in Soil");
		this.maintain=maintain;
		this.formation=formation;
	}
	static{
		use="Plant Growth";
		recycler="raw materials";
	}
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Soil");
		System.out.println("Soil used to  :"+use);
		System.out.println("Soil recyclers  :"+recycler);
	}
	void printInstance()
	{
		System.out.println("Invoking printInstance in Soil");
		System.out.println("Soil maintain :"+this.maintain);
		System.out.println("Soil formation :"+this.formation);
	}
}