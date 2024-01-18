package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		
      WebDriver driver = new ChromeDriver();		
	
      // method1: get()  ---> launching web application
         driver.get("https://www.flipkart.com");
	  
      // method2: getTitle() ---> fetches the title of the webpage
	     String title = driver.getTitle();
	     System.out.println(title);
	  
	  // method3:-getPageSource()--->fetches source code of the webpage
	     String source = driver.getPageSource();
	     System.out.println(source);
	  
	  // method4:-getCurrentUrl()--->fetches current url of the webpage
	     String URL = driver.getCurrentUrl();
	     System.out.println(URL);
	  
	  // method5:-manage()--->maximize(),minimize,fullscreen() of the webpage
	  /* Options opt = driver.manage();
	     Window win = opt.window();
	     win.maximize(); */
	  
	     driver.manage().window().maximize();
	  
	     driver.manage().window().fullscreen();
	  
      // method6:-closes single tab/window ,driver currently focusing
         driver.close();
       
      // method 7:-closes all the tabs/windows including browser
         driver.quit(); 
	}
}
