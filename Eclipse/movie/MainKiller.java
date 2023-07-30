package com.xworkz.movie;

public class MainKiller {
	public static void main(String[] args) {
		System.out.println("Invoking main in MainKiller");
		Movie movie=new Movie();
		Language ref=movie.language;
		String ref1=movie.name;
		System.out.println(ref);
		System.out.println(ref1);
		
		System.out.println("-----------------------------");
		Producer producer=movie.producer;
		MobileNo ref2=producer.mobileNo;
		double ref3=producer.budget;
		System.out.println(ref2);
		System.out.println(ref3);
		
		System.out.println("-----------------------------");
		Auditor auditor=producer.auditor;
		AdharNo ref4=auditor.adharNo;
		System.out.println(ref4);
		
		System.out.println("-----------------------------");
		Company company=auditor.company;
		Location ref5=company.location;
		String ref6=company.name;
		System.out.println(ref5);
		System.out.println(ref6);
		
	}

}
