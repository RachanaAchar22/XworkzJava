class OilMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking main on oil");
		Oil oil=new Oil();
		System.out.println(oil.name);
		System.out.println(oil.brand);
		System.out.println(oil.quantity);
		
		System.out.println("------------------------");
		Oil oil1=new Oil("Sun Flower");
		System.out.println(oil1.name);
		System.out.println(oil1.brand);
		System.out.println(oil1.quantity);
		
		System.out.println("------------------------");
		Oil oil2=new Oil("palm","gold winner");
		System.out.println(oil2.name);
		System.out.println(oil2.brand);
		System.out.println(oil2.quantity);
		
		System.out.println("------------------------");
		Oil oil3=new Oil("palm","gold winner",1);
		System.out.println(oil3.name);
		System.out.println(oil3.brand);
		System.out.println(oil3.quantity);
		
	}
}