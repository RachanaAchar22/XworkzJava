package com.xworkz.watchman;

public class Watchman {
	public Gun gun;
	
	public void secure()
	{
		System.out.println("Invoking secure in watchman");
		gun.Shoot();
	}
}