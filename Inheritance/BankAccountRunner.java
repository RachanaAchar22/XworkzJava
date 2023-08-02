package com.xworkz.Inheritance;

public class BankAccountRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in BankAccountRunner");
		BankAccount bankaccount1=new BankAccount();
		BankAccount bankaccount2=new SavingAccount();
		BankAccount bankaccount=new CheckingAccount();
		bankaccount1.account();
		System.out.println(bankaccount1.accountNo);
		
		SavingAccount savingaccount1=new SavingAccount();
		SavingAccount savingaccount2=new CheckingAccount();
		savingaccount1.AccountInfo();
		System.out.println(savingaccount1.balance);
		
		CheckingAccount checkingaccount=new CheckingAccount();
		checkingaccount.CheckInfo();
		System.out.println(checkingaccount.holderName);
	}

}
