package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  WindowHandling2 {
    
	public static void main(String[] args)  {

        //Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        // Maximize the window and add implicit wait
        driver.manage().window().maximize();
        
        //Add Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        //Click Contacts
        driver.findElement(By.linkText("Contacts")).click();

        // Click Merge Contacts
        driver.findElement(By.linkText("Merge Contacts")).click();

        // Click on the widget icon of 'From Contact'
        driver.findElement(By.xpath("//span[text()='From Contact']/following::a[1]")).click();

        //Switch to new window and select first contact
        Set<String> fromHandles = driver.getWindowHandles();
        List<String> fromList = new ArrayList<>(fromHandles);
        driver.switchTo().window(fromList.get(1));
        driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();
        driver.switchTo().window(fromList.get(0)); // back to main

        //Click on the widget icon of 'To Contact'
        driver.findElement(By.xpath("//span[text()='To Contact']/following::a[1]")).click();

        //Switch to new window and select second contact
        Set<String> toHandles = driver.getWindowHandles();
        List<String> toList = new ArrayList<>(toHandles);
        driver.switchTo().window(toList.get(1));
        driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[2]")).click();
        driver.switchTo().window(toList.get(0)); // back to main

        //Click Merge button
        driver.findElement(By.className("buttonDangerous")).click();

        //Handle alert
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert says: " + alert.getText());
        alert.accept();

        //Verify the title after merge
        String title = driver.getTitle();
        System.out.println("Page title after merge: " + title);

        //Close browser
        driver.quit();
    }
}
