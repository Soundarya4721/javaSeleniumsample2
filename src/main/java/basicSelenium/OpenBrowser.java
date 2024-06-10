package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chrome
		WebDriver driver=new ChromeDriver(); //driver
		System.out.println("Opened the browser");
		driver.manage().window().maximize(); //maximize the window
		System.out.println("Maximised the browser");
		driver.get("https://www.facebook.com/"); //open the url\
		System.out.println("opened the url");
		driver.quit();
		
		//firefox
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.google.com/");
		driver1.manage().window().maximize(); //maximize the window
		driver1.quit();
		
		//edge
		WebDriver driver2=new EdgeDriver();
        driver2.get("https://www.facebook.com/");  
        driver2.manage().window().maximize(); //maximize the window
		driver2.quit();
		
		




	}

}
