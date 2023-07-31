package app;

public class HomeTown {
	public String name;
	public int pinCode;
	public Area[] area;
	
	public HomeTown(String name,int pinCode,Area[] area)
	{
		this.name=name;
		this.pinCode=pinCode;
		this.area=area;
	}
	public void printInfo() {
		System.out.println("Invoking printInfo in HomeTown");
		System.out.println("Name :"+this.name);
		System.out.println("Pincode :"+this.pinCode);
		for(int index=0;index<this.area.length;index++) {
			Area ref=area[index];
			System.out.println(ref);
		}
	}

}
