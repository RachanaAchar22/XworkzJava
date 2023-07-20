class TeacherKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in TeacherKiller");
		Teacher teacher1=new Teacher();
		System.out.println(teacher1.name);
		System.out.println(teacher1.subject);
		System.out.println(teacher1.salary);
		System.out.println(teacher1.qualification);
		System.out.println(teacher1.age);
		
		System.out.println("\n");
		teacher1.name="Chaya";
		teacher1.subject="Maths";
		teacher1.salary=30000.0f;
		teacher1.qualification="M.tech";
		teacher1.age=30;
		System.out.println(teacher1.name);
		System.out.println(teacher1.subject);
		System.out.println(teacher1.salary);
		System.out.println(teacher1.qualification);
		System.out.println(teacher1.age);
		
		System.out.println("==============================");
		Teacher teacher2=new Teacher();
		System.out.println(teacher2.name);
		System.out.println(teacher2.subject);
		System.out.println(teacher2.salary);
		System.out.println(teacher2.qualification);
		System.out.println(teacher2.age);
		
		System.out.println("\n");
		teacher2.name="Nisha";
		teacher2.subject="English";
		teacher2.salary=35000.0f;
		teacher2.qualification="M.com";
		teacher2.age=35;
		System.out.println(teacher2.name);
		System.out.println(teacher2.subject);
		System.out.println(teacher2.salary);
		System.out.println(teacher2.qualification);
		System.out.println(teacher2.age);
		
	}
}