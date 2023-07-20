class WirelessKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in WirelessKiller");
		WirelessController controller1=new WirelessController();
		System.out.println(controller1.battery);
		System.out.println(controller1.compatibility);
		System.out.println(controller1.technology);
		System.out.println(controller1.input);
		System.out.println(controller1.function);
		
		System.out.println("\n");
		controller1.battery="USB-cable";
		controller1.compatibility="pcs";
		controller1.technology="Wi-Fi";
		controller1.input="Button";
		controller1.function="Jumping";
		System.out.println(controller1.battery);
		System.out.println(controller1.compatibility);
		System.out.println(controller1.technology);
		System.out.println(controller1.input);
		System.out.println(controller1.function);
		
		System.out.println("==============================");
		WirelessController controller2=new WirelessController();
		System.out.println(controller2.battery);
		System.out.println(controller2.compatibility);
		System.out.println(controller2.technology);
		System.out.println(controller2.input);
		System.out.println(controller2.function);
		
		System.out.println("\n");
		controller2.battery="Replaceble";
		controller2.compatibility="mobile device";
		controller2.technology="Bluetooth";
		controller2.input="triggers";
		controller2.function="shooting";
		System.out.println(controller2.battery);
		System.out.println(controller2.compatibility);
		System.out.println(controller2.technology);
		System.out.println(controller2.input);
		System.out.println(controller2.function);
		
		
	}
}