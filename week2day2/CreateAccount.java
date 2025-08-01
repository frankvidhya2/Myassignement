package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		// EdgeDriver driver=new EdgeDriver();

		// Load the url - get
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();
		
        // Enter thr username
		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRMSFA link
		driver.findElement(By.partialLinkText("CRM")).click();

		// Click on the Accounts link
		driver.findElement(By.linkText("Accounts")).click();

		// Click on the Create Lead link
		driver.findElement(By.linkText("Create Account")).click();

		// Enter account name
		driver.findElement(By.id("accountName")).sendKeys("Vidhya");

		// Step1: Find the dropdown element
		WebElement industryElement = driver.findElement(By.name("industryEnumId"));
		WebElement ownershipElement = driver.findElement(By.name("ownershipEnumId"));
		WebElement sourceElement = driver.findElement(By.name("dataSourceId"));

		// Step2: Select-Create an Object
		Select dropdown = new Select(industryElement);
		Select dropdown1 = new Select(ownershipElement);
		Select dropdown2 = new Select(sourceElement);

		// Step3: Use the method to Select - 3 Methods
		dropdown1.selectByVisibleText("S-Corporation");
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		dropdown.selectByIndex(3);

		// Enter description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// Step1: Find the dropdown element
		WebElement marketElement = driver.findElement(By.name("marketingCampaignId"));
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));

		// Step2: Select-Create an Object
		Select dropdown3 = new Select(marketElement);
		Select dropdown4 = new Select(stateElement);

		// Step3: Use the method to Select - 3 Methods
		dropdown3.selectByIndex(6);
		dropdown4.selectByValue("TX");

		// Click on the Create Account button
		driver.findElement(By.className("smallSubmit")).click();

		// close the window
		driver.quit();

	}

}
