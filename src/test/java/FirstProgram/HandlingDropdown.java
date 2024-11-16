package FirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		driver.manage().window().maximize();
		
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		
		dropdown.click();
		Thread.sleep(2000);
//		
//		WebElement op1 = driver.findElement(By.xpath("//option[@value='option1']"));
//		
//		op1.click();
		
		Select ds =new Select(dropdown);
		
	
		ds.selectByIndex(2);
		Thread.sleep(2000);
		ds.selectByValue("option1");
		Thread.sleep(2000);
		ds.selectByVisibleText("Option3");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
