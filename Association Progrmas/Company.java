package app;

public class Company {
	public String name;
	public String ceo;
	public String originCompany;
	
	public Company(String name,String ceo, String originCompany)
	{
		this.name=name;
		this.ceo=ceo;
		this.originCompany=originCompany;
	}
	public void printInfo()
	{
		System.out.println("Company Info");
		System.out.println("Company Name :"+this.name);
		System.out.println("Company CEO :"+this.ceo);
		System.out.println("OriginCompany :"+this.originCompany);
	}

}
