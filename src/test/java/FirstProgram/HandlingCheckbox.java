package FirstProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement hcb1 = driver.findElement(By.id("checkBoxOption1"));
		hcb1.click();
		
		Thread.sleep(2000);
		
		System.out.println(hcb1.isDisplayed());
		hcb1.click();
		System.out.println(hcb1.isSelected());
		
		System.out.println(hcb1.isEnabled());
		
		System.out.println();
		
		Thread.sleep(2000);
		
		WebElement hcb2 = driver.findElement(By.id("checkBoxOption2"));
		hcb2.click();
		Thread.sleep(2000);
		
		System.out.println(hcb2.isDisplayed());
		hcb2.click();
		System.out.println(hcb2.isSelected());
		
		System.out.println(hcb2.isEnabled());
		
		System.out.println();
		Thread.sleep(2000);
		
		WebElement hcb3 = driver.findElement(By.id("checkBoxOption3"));
		hcb3.click();
		
		Thread.sleep(2000);
		System.out.println(hcb3.isDisplayed());
		hcb3.click();
		System.out.println(hcb3.isSelected());
		System.out.println(hcb3.isEnabled());
		
		System.out.println();
		
		List <WebElement> allCheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
//		for(WebElement k:allCheckBoxes) {
//			
//			k.click();
//			Thread.sleep(1000);
//		}
		
		for(int i=0; i<allCheckBoxes.size();i++) {
			
			allCheckBoxes.get(i).click();
	
			Thread.sleep(1000);
		}

		
        Thread.sleep(5000);
        
		driver.close();
		driver.quit();
		
	}

} 
