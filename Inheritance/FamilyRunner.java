package com.xworkz.Inheritance;

public class FamilyRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main FamilyRunner");
		
		Family family1=new Family();
		Family family2=new GreatGrandFather();
		Family family3=new GrandFather();
		Family family4=new Father();
		Family family5=new Son();
		Family family6=new GrandSon();
		Family family7=new GreatGrandSon();
		family1.familyInfo();
		System.out.println(family1.name);
		
		GreatGrandFather greatgrandfather1=new GreatGrandFather();
		GreatGrandFather greatgrandfather2=new GrandFather();
		GreatGrandFather greatgrandfather3=new Father();
		GreatGrandFather greatgrandfather4=new Son();
		GreatGrandFather greatgrandfather5=new GrandSon();
		GreatGrandFather greatgrandfather6=new GreatGrandSon();
		greatgrandfather1.Info();
		System.out.println(greatgrandfather1.age);
		
		GrandFather grandfather1=new GrandFather();
		GrandFather grandfather2=new Father();
		GrandFather grandfather3=new Son();
		GrandFather grandfather4=new GrandSon();
		GrandFather grandfather5=new GreatGrandSon();
		grandfather1.GrandFatherInfo();
		System.out.println(grandfather1.name);
		
		Father father1=new Father();
		Father father2=new Son();
		Father father3=new GrandSon();
		Father father4=new GreatGrandSon();
		father1.FatherInfo();
		System.out.println(father1.noOfSons);
		
		Son son1=new Son();
		Son son2=new GrandSon();
		Son son3=new GreatGrandSon();
		son1.SonInfo();
		System.out.println(son1.sonName);
		
		GrandSon grandson1=new GrandSon();
		GrandSon grandson2=new GrandSon();
		grandson1.GrandSonInfo();
		System.out.println(grandson1.GrandSonName);
		
		GreatGrandSon greatgrandson=new GreatGrandSon();
		greatgrandson.GreatGrandSonInfo();
		System.out.println(greatgrandson.GGSonName);
	
	}

}
