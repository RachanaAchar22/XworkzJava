package com.xworkz.Abstract;

public abstract class Socialmedia {
	
	public void userName()
	{
		System.out.println("Invoking userName in socialMedia");
	}
	public void profile()
	{
		System.out.println("Invoking profile in socialmedial");
	}
	public void status()
	{
		System.out.println("Invoking status in socialmedia");
	}
	public void groups()
	{
		System.out.println("Invoking groups in socialmedia");
	}
	public void stories()
	{
		System.out.println("Invoking stories in socialmedia");
	}
	public abstract void post();
	public abstract void privacy();
	public abstract void statusviews();
	public abstract boolean notification();
	public abstract void sharePhoto();

}
