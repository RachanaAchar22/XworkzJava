package com.xworkz.Abstract;

public abstract class Ticket {

	public int ticketNumber()
	{
		System.out.println("Invoking ticketNumber in Ticket");
		return 50;
	}
	public boolean status()
	{
		System.out.println("Invoking status in Ticket");
		return true;
	}
	public void level()
	{
		System.out.println("Invoking level in Ticket");
	}
	public void event()
	{
		System.out.println("Invoking event in Ticket");
	}
	public double cost()
	{
		System.out.println("Invoking cost in Ticket");
		return 350;
	}
	public abstract void starttime();
	public abstract void venue();
	public abstract void stop();
	public abstract void validation();
	public abstract void reservation();
}
