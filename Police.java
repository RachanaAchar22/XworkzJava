class Police{
	String policeName="Shobith";
	int age=30;
	int experience=8;
	Police()
	{
		System.out.println("policename is:"+this.policeName);
		System.out.println("age is:"+this.age);
		System.out.println("Experience is:"+this.experience);
	}
	Police (String policeName,int age,int experience)
	{
		this.policeName=policeName;
		this.age=age;
		this.experience=experience;
		System.out.println("policename is:"+this.policeName);
		System.out.println("age is:"+this.age);
		System.out.println("Experience is:"+this.experience);
	}
}