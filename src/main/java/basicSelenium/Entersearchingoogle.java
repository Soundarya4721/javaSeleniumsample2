package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entersearchingoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); //driver
		System.out.println("Opened the browser");
		driver.manage().window().maximize(); //maximize the window
		System.out.println("Maximised the browser");
		driver.get("https://www.google.com/"); //open the url\
		System.out.println("opened the url");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Ap election results");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[@role='tab'])[2]")).click();
		driver.quit();
	}

}
