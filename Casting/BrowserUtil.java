package com.xworkz.Casting;

public class BrowserUtil {
	
	public static void search(Browser browser)
	{
		System.out.println("Invoking search in BrowserUtil");
		System.out.println(browser.search);
		if(browser instanceof ChromeBrowser)
		{
			System.out.println("Browser is  ChromeBrowser ");
			ChromeBrowser  chromeBrowser=( ChromeBrowser)browser;
			System.out.println(chromeBrowser.storage);
			chromeBrowser. chromeBrowserInfo();
		}
		if(browser instanceof OperaBrowser)
		{
			System.out.println("Browser is  OperaBrowser ");
			OperaBrowser  operaBrowser=(OperaBrowser)browser;
			System.out.println(operaBrowser.speed);
			operaBrowser. operaBrowserInfo();
		}
		if(browser instanceof FireFox)
		{
			System.out.println("Browser is  FireFox");
			FireFox  fireFox=( FireFox)browser;
			System.out.println(fireFox.path);
			fireFox. fireFoxInfo();
		}
		if(browser instanceof MicrosoftEdge)
		{
			System.out.println("Browser is  MicrosoftEdge ");
			MicrosoftEdge  microsoftEdge=( MicrosoftEdge)browser;
			System.out.println(microsoftEdge.cost);
			microsoftEdge.edgeInfo();
		}
		
	}

}
