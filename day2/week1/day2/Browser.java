package week1.day2;

public class Browser {
	
public String launchBrowser(String browserName)
{
	return browserName;

}

public String loadUrl() {

	return "Url loaded successfully";
}

	public static void main(String[] args) {	
		
		Browser brow = new Browser();
	String bn =	brow.launchBrowser("Chrome");
	
	System.out.println("Browser name is " +bn);
	
	Browser brow1 = new Browser();
	String url = brow1.loadUrl();
	System.out.println(url);
		
	EdgeBrowser brow2 = new EdgeBrowser();
	String newbrow = brow2.BrowserNew("Edge");
	System.out.println("Other browser name is "+ newbrow);
	
}

}
