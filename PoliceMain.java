class PoliceMain{
	public static void main(String[] args)
	{
		System.out.println("invoking main in PoliceKiller");
		Police police=new Police();
		
		System.out.println("---------------------------------");
		Police police1=new Police("Sharath",35,14);
		System.out.println(police1.policeName);
		System.out.println(police1.age);
		System.out.println(police1.experience);
	}
}