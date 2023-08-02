package com.xworkz.Inheritance;

public class CheckingAccount extends SavingAccount {
	
	public String holderName;
	
	public CheckingAccount()
	{
		System.out.println("Invoking no-argument const of Checking Account");
	}
	
	public void CheckInfo() 
	{
		System.out.println("Invoking checkInfo in checkingAccount");
	}

}
