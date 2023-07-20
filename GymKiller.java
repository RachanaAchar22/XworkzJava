class GymKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in GymKiller");
		Gym gym1=new Gym();
		System.out.println(gym1.trainer);
		System.out.println(gym1.trinee);
		System.out.println(gym1.cost);
		System.out.println(gym1.duration);
		System.out.println(gym1.component);
		
		System.out.println("\n");
		gym1.trainer="Shobith";
		gym1.trinee="Rachana";
		gym1.cost=6000.0f;
		gym1.duration="one month";
		gym1.component="Dumbbell";
		System.out.println(gym1.trainer);
		System.out.println(gym1.trinee);
		System.out.println(gym1.cost);
		System.out.println(gym1.duration);
		System.out.println(gym1.component);
		
		System.out.println("==============================");
		Gym gym2=new Gym();
		System.out.println(gym2.trainer);
		System.out.println(gym2.trinee);
		System.out.println(gym2.cost);
		System.out.println(gym2.duration);
		System.out.println(gym2.component);
		
		System.out.println("\n");
		gym2.trainer="Abhi";
		gym2.trinee="Chaya";
		gym2.cost=8000.0f;
		gym2.duration="two month";
		gym2.component="Barbell";
		System.out.println(gym2.trainer);
		System.out.println(gym2.trinee);
		System.out.println(gym2.cost);
		System.out.println(gym2.duration);
		System.out.println(gym2.component);
		
	}
}