package week3day2;

public class BasePage {
	
	 public void findElement() {
	        System.out.println("BasePage: Finding element");
	    }

	    public void clickElement() {
	        System.out.println("BasePage: Clicking element.");
	    }

	    public void enterText() {
	        System.out.println("BasePage: Entering text in element.");
	    }
	    
	    public void performCommonTasks() {
	        System.out.println("BasePage: Performing common  tasks.");
	    }

	public static void main(String[] args) {
		BasePage BasePageoptions = new BasePage();
		BasePageoptions.findElement();
		BasePageoptions.clickElement();
		BasePageoptions.enterText();
		BasePageoptions.performCommonTasks();
	}

}
