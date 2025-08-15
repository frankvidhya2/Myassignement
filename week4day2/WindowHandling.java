package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

		public static void main(String[] args) {

			//Initialize ChromeDriver 
			ChromeDriver driver = new ChromeDriver();
			
			// Load the URL
			driver.get("https://www.irctc.co.in/");
			
			//Maximize the browser window
			driver.manage().window().maximize();
			
			// Add an implicit wait 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			//click on the "FLIGHTS" link
			driver.findElement(By.xpath("//a[text()='FLIGHTS']")).click();
			
			//Get  window handles
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        
	        //convert Set to List
	        List<String> window = new ArrayList<String>(allWindowHandles);
	        
	        //switch windows
	        driver.switchTo().window(window.get(1));
	        
	        //print the flights window title
	        String flightWindow = driver.getTitle();        
	        System.out.println("Flights Window : " + flightWindow);
	        
	        //Close the parent tab
	        driver.switchTo().window(window.get(0)).close();
	}

}
