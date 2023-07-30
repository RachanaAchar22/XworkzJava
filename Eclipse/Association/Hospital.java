package com.xworkz.Association;

public class Hospital {
	public Doctor doctor;
	public Nurse nurse;
	public Patient patient;
	
	public void doctorInfo(){
		System.out.println("Invoking doctorInfo in doctor");
		{
			if(this.doctor!=null) {
		
			this.doctor.qualification();
		}
		else {
			System.err.println("doctor is null cannot invoke method DoctorInfo");
		}
		}
		
		{
			if(this.nurse!=null) {
		
			this.nurse.specialization();
		}
		else {
			System.err.println("nurse is null cannot invoke method nurseInfo");
		}
		}
		
		{
			if(this.patient!=null) {
		
			this.patient.name();
		}
		else {
			System.err.println("Patient is null cannot invoke method patientInfo");
		}
		}
	
	}
	public void doctorAddress() {
		System.out.println("Invoking doctorAddress in doctor");
		
		{
			if(this.doctor!=null) {
		
			this.doctor.salary();
		}
		else {
			System.err.println("doctor is null cannot invoke method DoctorAddress");
		}
		}
		
		{
			if(this.nurse!=null) {
		
			this.nurse.name();
		}
		else {
			System.err.println("nurse is null cannot invoke method nurseAddress");
		}
		}
		
		{
			if(this.patient!=null) {
		
			this.patient.typeOfDisease();
		}
		else {
			System.err.println("Patient is null cannot invoke method patientAddress");
		}
	}
	}

}
