package week3day2;

public class LoginTestData extends TestData {

    public void enterusername() {
        System.out.println("Enter the username");
    }

    public void enterpassword() {
        System.out.println("Enter the password");
    }

    public static void main(String[] args) {
        LoginTestData loginOptions = new LoginTestData();
        loginOptions.enterusername();
        loginOptions.enterpassword();
        loginOptions.enterCredentials();      // inherited from TestData
        loginOptions.navigateToHomePage();    // inherited from TestData
    }
}