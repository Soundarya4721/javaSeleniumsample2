package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsExmpl extends CallDriverClass{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallDriverClass.driverCalling("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		CallDriverClass.driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		
		CallDriverClass.driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();

		CallDriverClass.closedriver();
		
		
		//
	
		
	}

}
