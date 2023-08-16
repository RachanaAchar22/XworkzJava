package com.xworkz.app.Object;

public class MainRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Logo");
		Logo logo=new Logo();
		System.out.println(logo);
		Logo logo1=new Logo("X-workz","Orange",5.5f,3.5f,"Company");
		System.out.println(logo1);
		Logo logo2=new Logo("A.I.T","Yellow",3f,2f,"Collage");
		
		System.out.println("-----------------------------------");
		System.out.println("Invoking main in Karchief");
		Karchief karchief=new Karchief();
		System.out.println(karchief);
		Karchief karchief1=new Karchief("Cotton","White",50,true,"Hexafun",20,10);
		System.out.println(karchief1);
		Karchief karchief2=new Karchief("Nylon","Pink",40,true,"Caruso",25,15);
		System.out.println(karchief2);
		
		System.out.println("-----------------------------------");
		System.out.println("Invoking main in Flag");
		Flag flag=new Flag();
		System.out.println(flag);
		Flag flag1=new Flag("India",91,500);
		System.out.println(flag1);
		Flag flag2=new Flag("Canada",1,600);
		System.out.println();
		
		System.out.println("-----------------------------------");
		System.out.println("Invoking main in Cave");
		Cave cave=new Cave();
		System.out.println(cave);
		Cave cave1=new Cave("Maharashtra","Ellora","Sunlight","Dravidian","Krishna",true,true,true,"natural rock","Waghora");
		System.out.println(cave1);
		Cave cave2=new Cave("Badami","Badami","Sunlight","Artwork","Chalukyan king",true,true,true,"Rock","Ganga");
		System.out.println(cave2);
		
		System.out.println("-----------------------------------");
		System.out.println("Invoking main in Pendant");
		Pendant pendant=new Pendant();
		System.out.println(pendant);
		Pendant pendant1=new Pendant("Round",2000,"Gold","Mahalakshmi","Golden","Rajajinagar","god",5,true,false,true,false);
		System.out.println(pendant1);
		Pendant pendant2=new Pendant("Suare",1500,"Silver","Shree Lakshmi","white","Vijayanagar","Nature",3,true,false,true,true);
		System.out.println(pendant2);
		
		

	}

}
