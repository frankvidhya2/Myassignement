package week3day2;

public class Chrome extends Browser {
	 
	   public void openIncognito() {
	        System.out.println("Chrome: Opening Incognito mode.");
	    }
	    public void clearCache() {
	        System.out.println("Chrome: Clearing cache.");
	    }     
	public static void main(String[] args) {
		
		Chrome Chromeoptions = new Chrome();
		Chromeoptions.openIncognito();
		Chromeoptions.clearCache();
		Chromeoptions.openURL();
		Chromeoptions.closeBrowser();
    	Chromeoptions.navigateBack();
	}

}
