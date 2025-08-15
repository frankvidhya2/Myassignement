package week4day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameandAlert {
    
	public static void main(String[] args) {
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// Maximize the browser
		driver.manage().window().maximize();
		
		//Add Implicit  wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Switch to the frame 
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@id,  'iframeResult')]"));
		driver.switchTo().frame(frameElement);
		
		//Click the "Try It" button inside the frame 
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		//click Ok/Cancel in the alert appears
		Alert promptAlert = driver.switchTo().alert();
		String name = "vidhya";
		promptAlert.sendKeys("vidhya");
		promptAlert.accept();
		
		//verifying the text displayed
		String resultText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
	
		if (resultText.contains(name)) {
			System.out.println("Text Displayed - "+ resultText  );
					}
        
		//close browser
		driver.quit();
}
}
