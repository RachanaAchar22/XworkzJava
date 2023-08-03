package com.xworkz.Casting;

public class ShowroomUtil {
	
	public static void run(Showroom showroom)
	{
		System.out.println("Invoking run in ShowroomUtil");
		System.out.println(showroom.location);
		showroom.showroomInfo();
		if(showroom instanceof WatchShowroom)
		{
			System.out.println("Showroom is WatchShowroom");
			WatchShowroom watchShowroom=(WatchShowroom)showroom;
			System.out.println(watchShowroom.address);
			watchShowroom.watchShowroomInfo();
		}
		if(showroom instanceof MobileShowroom)
		{
			System.out.println("Showroom is MobileShowroom");
			MobileShowroom mobileShowroom=(MobileShowroom)showroom;
			System.out.println(mobileShowroom.mobileName);
			mobileShowroom.mobileShowroomInfo();
		}
	}

}
