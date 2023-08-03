package com.xworkz.Casting;

public class ShowroomRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main ShowroomRunner");
		Showroom showroom=new Showroom();
		WatchShowroom watchshowroom=new WatchShowroom();
		MobileShowroom mobileshowroom=new MobileShowroom();
		ShowroomUtil.run(mobileshowroom);
		ShowroomUtil.run(watchshowroom);
		
	}

}
