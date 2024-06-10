package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallDriverClass {
	public static WebDriver driver;
	//call driver again and again
		public static void driverCalling(String url) {
			
		    driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}

		
		public static void closedriver() {
			
			driver.quit();
			
		}
		
		
}
