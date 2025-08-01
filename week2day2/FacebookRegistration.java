package week2day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		
		// Load the url - get
		driver.get("https://en-gb.facebook.com/");
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// click Create Account button
		driver.findElement(By.linkText("Create new account")).click();

		// enter first name
		driver.findElement(By.name("firstname")).sendKeys("Vidhya");

		// enter surname
		driver.findElement(By.name("lastname")).sendKeys("Shree");
		
		// select day in date of birth
		WebElement dayelement = driver.findElement(By.id("day"));
		Select dropdown = new Select(dayelement);
		dropdown.selectByValue("20");

		// select month in date of birth
		WebElement monthelement = driver.findElement(By.id("month"));
		Select dropdown1 = new Select(monthelement);
		dropdown1.selectByVisibleText("Oct");

		// select year in date of birth
		WebElement yearelement = driver.findElement(By.id("year"));
		Select dropdown2 = new Select(yearelement);
		dropdown2.selectByValue("1993");
		
		// select gender
		WebElement femaleRadio = driver.findElement(By.id("sex"));
		femaleRadio.click();

		// enter email or mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("v6964840@gmail.com");

		// enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Vidhya123@");



	}

}
