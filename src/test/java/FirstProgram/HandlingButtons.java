package FirstProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		//All are for findElemnt
		
//		WebElement rb1= driver.findElement(By.xpath("//input[@value='radio1']"));
//		rb1.click();	
//		System.out.println(rb1.isSelected());
//		
//		
//		System.out.println();
//		
//		
//		Thread.sleep(2000);
//		
//		WebElement rb2= driver.findElement(By.xpath("//input[@value='radio2']"));
//		rb2.click();
//
//		System.out.println(rb1.isDisplayed());
//		
//		System.out.println();
//		Thread.sleep(2000);
//		
//		WebElement rb3= driver.findElement(By.xpath("//input[@value='radio3']"));
//		rb3.click();
//
//		System.out.println(rb1.isEnabled());
//		
//		System.out.println();
//		
//		Thread.sleep(5000);
//		
//		driver.close();
//		
//		driver.quit();
		
		
		
//		All are For findElements
		
		List<WebElement> allrb= driver.findElements(By.xpath("//input[@class='radioButton']"));
		
//		for(int i=0; i<allrb.size();i++) {
//			
//			Thread.sleep(2000);
//			allrb.get(i).click();
//			
//			System.out.println(allrb.get(i).isDisplayed());
//			System.out.println(allrb.get(i).isSelected());
//			System.out.println(allrb.get(i).isEnabled());
		
		//For Each Loop
		
		for(WebElement k:allrb)
		{
			k.click();
			
			System.out.println(k.isDisplayed());
			
			System.out.println(k.isEnabled());
			
			System.out.println(k.isSelected());

			
			Thread.sleep(1000);
			
			
		}
		     driver.close();
		
             driver.quit();
		}
	}


