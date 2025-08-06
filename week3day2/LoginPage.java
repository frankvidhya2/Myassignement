package week3day2;

public class LoginPage extends BasePage {
	
    public void performCommonTasks() {
        System.out.println("LoginPage: Performing common tasks.");
    }

	public static void main(String[] args) {
		BasePage BasePageoptions = new BasePage();
		BasePageoptions.findElement();
		BasePageoptions.clickElement();
		BasePageoptions.enterText();
		BasePageoptions.performCommonTasks();
		
		LoginPage pageoptions = new LoginPage();
		pageoptions.findElement();
		pageoptions.clickElement();
		pageoptions.enterText();
		pageoptions.performCommonTasks();
		
		 System.out.println("--------------");
		
	}

}
