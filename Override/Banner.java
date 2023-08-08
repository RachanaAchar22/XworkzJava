package com.xworkz.override;

public class Banner extends Flex{
	
	@Override
	public void Information() {
		System.out.println("invoking banner in Flex");
		super.Information();
	}

}
