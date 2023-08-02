package com.xworkz.Inheritance;

public class CompanyRunner{

	public static void main(String[] args) {
		
		System.out.println("Invoking main in Comapny");
		
		Company company1=new Company();
		Company company2=new Founder();
		Company company3=new Ceo();
		Company company4=new Job();
		Company company5=new JobRole();
		Company company6=new Employee();
		Company company7=new FullTime();
		Company company8=new PartTimeEmploye();
		Company company9=new Salary();
		company1.companyInfo();
		System.out.println(company1.companyName);
		
		Founder founder1=new Founder();
		Founder founder2=new Ceo();
		Founder founder3=new Job();
		Founder founder4=new JobRole();
		Founder founder5=new Employee();
		Founder founder6=new FullTime();
		Founder founder7=new PartTimeEmploye();
		Founder founder8=new Salary();
		founder1.founderInfo();
		System.out.println(founder1.year);
		
		Ceo ceo1=new Ceo();
		Ceo ceo2=new Job();
		Ceo ceo3=new JobRole();
		Ceo ceo4=new Employee();
		Ceo ceo5=new FullTime();
		Ceo ceo6=new PartTimeEmploye();
		Ceo ceo7=new Salary();
		ceo1.CeoInfo();
		System.out.println(ceo1.ceoName);
		
		Job job1=new Job();
		Job job2=new JobRole();
		Job job3=new Employee();
		Job job4=new FullTime();
		Job job5=new PartTimeEmploye();
		Job job6=new Salary();
		job1.JobInfo();
		System.out.println(job1.salary);
		
		JobRole jobrole1=new JobRole();
		JobRole jobrole2=new Employee();
		JobRole jobrole3=new FullTime();
		JobRole jobrole4=new PartTimeEmploye();
		JobRole jobrole5=new Salary();
		jobrole1.jobRoleInfo();
		System.out.println(jobrole1.roleName);
		
		Employee employee1=new Employee();
		Employee employee2=new FullTime();
		Employee employee3=new PartTimeEmploye();
		Employee employee4=new Salary();
		employee1.employeeInfo();
		System.out.println(employee1.EmployeName);
		
		FullTime fulltime1=new FullTime();
		FullTime fulltime2=new PartTimeEmploye();
		FullTime fulltime3=new Salary();
		fulltime1.fullTimeInfo();
		System.out.println(fulltime1.timing);
		
		PartTimeEmploye parttime1=new PartTimeEmploye();
		PartTimeEmploye parttime2=new Salary();
		parttime1.PartTimeEmployeInfo();
		System.out.println(parttime1.employeId);
		
		Salary salary=new Salary();
		salary.SalaryInfo();
		System.out.println(salary.salary);			
		
	}

}
