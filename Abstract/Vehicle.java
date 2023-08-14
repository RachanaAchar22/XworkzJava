package com.xworkz.Abstract;

public abstract class Vehicle {
	
	public void transportation()
	{
		System.out.println("Invoking transportation in vehicle");
	}
	public void comfort()
	{
		System.out.println("Invoking comfort in vehicle");
	}
	public void safety()
	{
		System.out.println("Invoking safety in vehicle");
	}
	public void fueEfficiency()
	{
		System.out.println("Invoking fueEfficiency in vehicle");
	}
	public void features()
	{
		System.out.println("invoking features in vehicle");
	}
	public abstract void convenience();
	public abstract void capacity();
	public abstract void control();
	public abstract void connectivity();
	public abstract void durability();
}
