package com.xworkz.Casting;

public class ZooUtil {
	
	public static void ticket(Zoo zoo)
	{
		System.out.println("Invoking ticket in zooUtil");
		System.out.println(zoo.name);
		if(zoo instanceof StateZoo)
		{
			System.out.println("Zoo is StateZoo");
			StateZoo  stateZoo=(StateZoo)zoo;
			System.out.println(stateZoo.entryFee);
			stateZoo. stateZooInfo();
		}
		if(zoo instanceof NationalZoo)
		{
			System.out.println("Zoo is NationalZoo");
			NationalZoo  nationalZoo=(NationalZoo)zoo;
			System.out.println(nationalZoo.location);
			nationalZoo. nationalZooInfo();
		}
	}

}
