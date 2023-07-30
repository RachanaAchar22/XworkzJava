package com.xworkz.app;

public class MainRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in mainRunner");
		Minister minister=new Minister();
		Experience ref=minister.experience;
		String ref1=minister.name;
		System.out.println(ref);
		System.out.println(ref1);
		
		System.out.println("-------------------------------");
		Constituency constituency=minister.constituency;
		Population ref2=constituency.population;
		int ref3=constituency.cno;
		System.out.println(ref2);
		System.out.println(ref3);+
		
		
		System.out.println("-------------------------------");
		IndiraCanteen indiracanteen=constituency.indiraCanteen;
		LunchPrice ref4=indiracanteen.lunchPrice;
		float ref5=indiracanteen.breakFastPrice;
		System.out.println(ref4);
		System.out.println(ref5);
		
	}

}
