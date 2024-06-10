package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); //driver
		System.out.println("Opened the browser");
		driver.manage().window().maximize(); //maximize the window
		System.out.println("Maximised the browser");
		driver.get("https://www.facebook.com/"); //open the url\
		System.out.println("opened the url");
        System.out.println(driver.getCurrentUrl());		 //page url printing
       System.out.println(driver.getPageSource()); 
       driver.navigate().back();
       driver.navigate().forward();
        driver.quit();

	}

}
