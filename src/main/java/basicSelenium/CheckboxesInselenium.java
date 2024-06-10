package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxesInselenium extends CallDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallDriverClass.driverCalling("https://artoftesting.com/samplesiteforselenium");
		WebElement elem=CallDriverClass.driver.findElement(By.xpath("//input[@value='Automation']"));
		WebElement elem1=CallDriverClass.driver.findElement(By.xpath("//input[@value='Performance']"));
		if(elem.isEnabled()) {
			
			elem.click();
			System.out.println(elem.isSelected());
			
			elem1.click();
			System.out.println(elem1.isSelected());

			
		}
		
		CallDriverClass.closedriver();
		
		
		
	}

}
