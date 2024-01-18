package practice;


public class LaunchingEmptyBrowser {

	public static void main(String[] args) {
		  
			// older approach and is not used in real time
			//case1: Selenium version: 3.141.59 and chromedriver.exe
			
		/*	String key = "webdriver.chrome.driver";
			String value = "./chromedriver.exe";
			
			System.setProperty(key, value);
			WebDriver driver = new ChromeDriver();	
		*/
			
			//case2: Selenium version: 3.141.59 , webdrivermanager: 5.6.3
		//	WebDriverManager.chromedriver().setup();
		//	WebDriver driver = new ChromeDriver();
			
			//WebDriverManager.edgedriver().setup();
			//WebDriver driver = new EdgeDriver();
			
			//case3: Selenium version 4.16.1
			// WebDriver driver=newChromeDriver();
			
		    // WebDriver driver = new EdgeDriver();

		    // WebDriver driver = new FirefoxDriver();
		 	
		    // WebDriver driver = new InternetExplorerDriver();
						
			

	}

}
