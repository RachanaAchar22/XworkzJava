class HeadLightMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in HeadLightMain");
		HeadLight headlight=new HeadLight();
		System.out.println("---------------------------");
		
		HeadLight headlight1=new HeadLight("Orange","Car",300.0f);
		System.out.println(headlight1.color);
		System.out.println(headlight1.vehicle);
		System.out.println(headlight1.price);
		
	}
}