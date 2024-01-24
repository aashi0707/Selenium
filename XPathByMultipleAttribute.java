package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByMultipleAttribute {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		// syntax1: And
		//htmltag[@AttributeName="AttributeValue" and @AttributeName="AttributeValue"]
	//	driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\" and @name=\"q\"]")).sendKeys("iphone");
	//	driver.findElement(By.xpath("//button[contains(@aria-label,\"Search\")]")).click();
		
		//syntax2: Or
		//htmltag[@AttributeName="AttributeValue" or @AttributeName="AttributeValue"]
				driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\" or @name=\"q\"]")).sendKeys("iphone");
				driver.findElement(By.xpath("//button[contains(@aria-label,\"Search\")]")).click();
				
		//syntax3: Or
				//htmltag[text()="AttributeValue" or @AttributeName="AttributeValue"]
			//	driver.findElement(By.xpath("//span[text()=\"Mobiles\" or @sdjgv=\"bfh\"]")).click();
				
		List<WebElement> allNames = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
	
		for (WebElement name : allNames) {
			System.out.println(name.getText());
		}
	
	}

}
