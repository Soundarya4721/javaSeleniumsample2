package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); //driver
		System.out.println("Opened the browser");
		driver.manage().window().maximize(); //maximize the window
		System.out.println("Maximised the browser");
		driver.get("https://www.amazon.in/"); //open the url\
		System.out.println("opened the url");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		
	}

}
