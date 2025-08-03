package week3day2;

public class Browser {
	String browserName = "Chrome";
    String browserVersion = "138";
	
    public void openURL() {
        System.out.println(browserName + " is opening a URL...");
    }

    public void closeBrowser() {
        System.out.println(browserName  + " is closing...");
    }

    public void navigateBack() {
        System.out.println("Navigating back to " + browserName);
    }   
        public static void main(String[] args) {
    	Browser Browseroptions = new Browser();
    	Browseroptions.openURL();
    	Browseroptions.closeBrowser();
    	Browseroptions.navigateBack();
    }

     
}


