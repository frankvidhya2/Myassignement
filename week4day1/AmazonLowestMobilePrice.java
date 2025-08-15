package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLowestMobilePrice {

	public static void main(String[] args) {
    
		// Launch Chrome
        ChromeDriver driver = new ChromeDriver();

        // Load Amazon.in
        driver.get("https://www.amazon.in/");

        // Maximize the window
        driver.manage().window().maximize();

        //Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Search for "phones"
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.id("nav-search-submit-button")).click();


        // Locate all price elements 
        // This xpath finds spans with class 'a-price-whole' which holds the price part before decimal
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        // Store prices in a List
        List<Integer> prices = new ArrayList<>();
        
        for (WebElement element : priceElements) {
            String priceText = element.getText().replace(",", "").trim(); // Remove commas
            if (!priceText.isEmpty()) { // avoid empty matches
                try {
                    int price = Integer.parseInt(priceText);
                    prices.add(price);
                } catch (NumberFormatException e) {
                    // Ignore non-numeric values
                }
            }
        }

        //Sort prices in ascending order
        Collections.sort(prices);

        //Print all prices
        System.out.println("All prices sorted ascending: " + prices);

      
        if (!prices.isEmpty()) {
            System.out.println("Lowest Price: ₹" + prices.get(0));
        } else {
            System.out.println("No prices found!");
        }

        //Close browser
        driver.quit();
    }
}
