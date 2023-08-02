package com.xworkz.Inheritance;

public class Laptop extends Desktop {
	public String laptopName;
	
	public Laptop()
	{
		System.out.println("Invoking no-argument in laptop");
	}
	public void laptopInfo()
	{
		System.out.println("Invoking laptopInfo in laptop");
	}
}
