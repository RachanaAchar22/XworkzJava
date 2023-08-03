package com.xworkz.Casting;

public class BrowserRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main  BrowserRunner");
		Browser browser=new Browser();
		ChromeBrowser chromebrowser=new ChromeBrowser();
		OperaBrowser operabrowser=new OperaBrowser();
		FireFox firefox=new FireFox();
		MicrosoftEdge microsoft=new MicrosoftEdge();
		BrowserUtil.search(chromebrowser);
		System.out.println("-------------------------");
		BrowserUtil.search(operabrowser);
		System.out.println("-------------------------");
		BrowserUtil.search(firefox);
		System.out.println("-------------------------");
		BrowserUtil.search(microsoft);
		

	}

}
