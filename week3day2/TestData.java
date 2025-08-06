package week3day2;

public class TestData {
	
	//methods
	public void enterCredentials() {
		System.out.println("enter all the credentials");
	}

	public void  navigateToHomePage() {
		System.out.println("navigate to homepage ");
	}
	
	public static void main(String[] args) {
		TestData dataoptions = new TestData();
		dataoptions.enterCredentials();
		dataoptions.navigateToHomePage();
	}

}
