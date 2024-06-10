package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); //driver
		System.out.println("Opened the browser");
		driver.manage().window().maximize(); //maximize the window
		System.out.println("Maximised the browser");
		driver.get("https://www.facebook.com/"); //open the url\
		System.out.println("opened the url");
		//Enter emaild
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("soumibunny796@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sasidharsasi");
				
		driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
		
		
		
		

	}

}
