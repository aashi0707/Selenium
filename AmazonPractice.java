package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma"); // IT will not work
		driver.findElement(By.name("field-keywords")).sendKeys("puma");
		
		// linktext() locator
		driver.findElement(By.linkText("Today's Deals")).click();
		
		// PartialLinktext() locator
		driver.findElement(By.partialLinkText("Today's")).click();
	}

}
