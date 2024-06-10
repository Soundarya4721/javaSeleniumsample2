package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Url="https://www.amazon.in/";
		
		WebDriver driver=new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		
		//click on signin button
		WebElement signin=driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']"));
		signin.click();
		
		WebElement verifySignin=driver.findElement(By.xpath("//h1[normalize-space()='Sign in']"));
		
		//Verify
		if(verifySignin.isDisplayed()) {
			
		
			System.out.println(verifySignin.getText());
			
			if(verifySignin.getText().equalsIgnoreCase("Sign in") ){
				
				System.out.println("test is passed");
			}
		}
		
		
		else
		{
			
			System.out.println("Test is failed");
		}
		
		//Enter invalid phone
		WebElement invalidphn=driver.findElement(By.xpath("//input[@id='ap_email']"));
		invalidphn.sendKeys("578997555");		
		
		//click on cntinuebtn
		WebElement continuebtn=driver.findElement(By.xpath("//input[@id='continue']"));
		continuebtn.click();
		
		
		//verify error message
		WebElement errormsgphn=driver.findElement(By.xpath("//h4[normalize-space()='Incorrect phone number']"));
		System.out.println(errormsgphn.isDisplayed());	
		System.out.println(errormsgphn.getText());
		
	
		
		  //Enter invalid email
				WebElement invalidemail=driver.findElement(By.xpath("//input[@id='ap_email']"));
				invalidemail.clear();
				invalidemail.sendKeys("5789975552@gma");		
				
				WebElement continuebtn1=driver.findElement(By.xpath("//input[@id='continue']"));
				//click on cntinuebtn
				continuebtn1.click();
				
				WebElement errormsgemail=driver.findElement(By.xpath("//span[normalize-space()='We cannot find an account with that email address']"));
				System.out.println(errormsgemail.isDisplayed());	
				System.out.println(errormsgemail.getText());
											
				driver.quit();
				
		
	}

}
