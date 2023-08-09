package com.xworkz.Polymorphism;

public class Pub {

	public void pubInfo() {
		System.out.println("Invoking no-args in Pub");
	}

	public void pubInfo(String pubName) {
		System.out.println("Invoking String in Pub");
	}

	public void pubInfo(String pubName, String location) {
		System.out.println("Invoking String in Pub");
	}

	public void pubInfo(String pubName, String location, String pubTiming) {
		System.out.println("Invoking String in Pub");
	}

	public void pubInfo(String pubName, String location, String pubTiming, int noOfPeoples) {
		System.out.println("Invoking String,int in Pub");
	}

	public void pubInfo(String pubName, String location, String pubTiming, int noOfPeoples, int noOfServers) {
		System.out.println("Invoking String,int in Pub");
	}
}
