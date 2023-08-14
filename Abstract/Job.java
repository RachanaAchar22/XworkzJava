package com.xworkz.Abstract;

public abstract class Job {
	
	public void skills()
	{
		System.out.println("Invoking Skills in Job");
	}
	public void language()
	{
		System.out.println("Invoking language in Job");
	}
	public void goal()
	{
		System.out.println("Invoking goal in Job");
	}
	public void learning()
	{
		System.out.println("Invoking laerning in Job");
	}
	public void mentorship()
	{
		System.out.println("Invoking mentorship in Job");
	}
	public abstract void creativity();
	public abstract void volunteering();
	public abstract void leadership();
	public abstract void tasks();
	public abstract void timeManagement();

}
