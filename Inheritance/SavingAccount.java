package com.xworkz.Inheritance;

public class SavingAccount extends BankAccount {
	
	public double balance;
	public SavingAccount()
	{
		System.out.println("Invoking no-argument in SavingAccount");
		
	}
	
	public void AccountInfo()
	{
		System.out.println("Invoking accountInfo in saving Account");
	}

}
