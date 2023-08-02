package com.xworkz.Inheritance;

public class DeviceRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in DeviceRunner");
		
		Device device1=new Device();
		Device device2=new Computer();
		Device device3=new Desktop();
		Device device4=new Laptop();
		Device device5=new Tab();
		device1.deviceInfo();
		System.out.println(device1.type);
		
		Computer computer1=new Computer();
		Computer computer2=new Desktop();
		Computer computer3=new Laptop();
		Computer computer4=new Tab();
		computer1.computerInfo();
		System.out.println(computer1.version);
		
		Desktop desktop1=new Desktop();
		Desktop desktop2=new Laptop();
		Desktop desktop3=new Tab();
		desktop1.DesktopInfo();
		System.out.println(desktop1.type);
		
		Laptop laptop1=new Laptop();
		Laptop laptop2=new Tab();
		laptop1.laptopInfo();
		System.out.println(laptop1.laptopName);
		
		Tab tab1=new Tab();
		tab1.tabInfo();
		System.out.println(tab1.tabName);
		
		
	}

}
