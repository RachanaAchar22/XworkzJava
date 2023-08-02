package com.xworkz.Inheritance;

public class Employee extends JobRole{

	public String EmployeName;
	
	public Employee()
	{
		System.out.println("Invoking no-arguments in Employee");
	}
	public void employeeInfo()
	{
		System.out.println("Invoking employeeInfo in Employee");
	}
}
