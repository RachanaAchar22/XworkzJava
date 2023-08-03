package com.xworkz.Casting;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ZooRunner");
		System.out.println("------------------------------");
		Zoo zoo=new Zoo();
		StateZoo statezoo=new StateZoo();
		NationalZoo nationalzoo=new NationalZoo();
		ZooUtil.ticket(statezoo);
		System.out.println("------------------------------");
		ZooUtil.ticket(nationalzoo);

	}

}
