package com.xworkz.country;

public class MainInfo {

	public static void main(String[] args) {
		System.out.println("invoking main in Maininfo");
		Country country=new Country();
		String ref=country.name;
		Code ref1=country.code;
		President president=country.president;
		PrimeMinister primeMinister=country.primeMinister;
		System.out.println(ref);
		System.out.println(ref1);
		
		System.out.println("------------------------------");
		SecurityHead securityHead=primeMinister.securityhead;
		PersonalAssistant personalAssistant=primeMinister.personalassistant;
		HomeMinister homeminister=primeMinister.homeminister;
		String ref2=securityHead.name;
		Address ref3=securityHead.address;
		System.out.println(ref2);
		System.out.println(ref3);
		String ref4=personalAssistant.name;
		Contact ref5=personalAssistant.contact;
		System.out.println(ref4);
		System.out.println(ref5);
		String ref6=homeminister.name;
		Age ref7=homeminister.age;
		System.out.println(ref6);
		System.out.println(ref7);
		
		

	}

}
