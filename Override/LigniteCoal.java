package com.xworkz.override;

public class LigniteCoal extends Coal {

	@Override
	public void burn() {
		System.out.println("LignitCoal overrides the Coal");
		super.burn();
	}
}
