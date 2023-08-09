package com.xworkz.Polymorphism;

public class Bar extends Pub {

	@Override
	public void pubInfo() {
		System.out.println("Bar overrides Pub");
		super.pubInfo();
	}

	@Override
	public void pubInfo(String pubName) {
		super.pubInfo(pubName);
	}

	@Override
	public void pubInfo(String pubName, String location) {
		super.pubInfo(pubName, location);
	}

	@Override
	public void pubInfo(String pubName, String location, String pubTiming) {
		super.pubInfo(pubName, location, pubTiming);
	}

	@Override
	public void pubInfo(String pubName, String location, String pubTiming, int noOfPeoples) {
		super.pubInfo(pubName, location, pubTiming, noOfPeoples);
	}

	@Override
	public void pubInfo(String pubName, String location, String pubTiming, int noOfPeoples, int noOfServers) {
		super.pubInfo(pubName, location, pubTiming, noOfPeoples, noOfServers);
	}

}
