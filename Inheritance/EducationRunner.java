package com.xworkz.Inheritance;

public class EducationRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Invoking main in educationRunner");
		Education education1=new Education();
		Education education2=new Primary();
		Education education3=new Secondary();
		Education education4=new Engineering();
		Education education5=new Ece();
		Education education6=new Telecommunication();
		education1.educationInfo();
		System.out.println(education1.Name );
		
		Primary primary1=new Primary();
		Primary primary2=new Secondary();
		Primary primary3=new Engineering();
		Primary primary4=new Ece();
		Primary primary5=new Telecommunication();
		primary1.primaryInfo();
		System.out.println(primary1.classNo);
		
		Secondary secondary1=new Secondary();
		Secondary secondary2=new Engineering();
		Secondary secondary3=new Ece();
		Secondary secondary4=new Telecommunication();
		secondary1.secondaryInfo();
		System.out.println(secondary1.year);
		
		Engineering engineering1=new Engineering();
		Engineering engineering2=new Ece();
		Engineering engineering3=new Telecommunication();
		engineering1.engineeringInfo();
		System.out.println(engineering1.specialization);
		
		Ece ece1=new Ece();
		Ece ece2=new Telecommunication();
		ece1.eceInfo();
		System.out.println(ece1.duration);
		
		Telecommunication telecommunication=new Telecommunication();
		telecommunication.telecommunicationInfo();
		System.out.println(telecommunication.stream);
		
		
		
		
		
	}

}
