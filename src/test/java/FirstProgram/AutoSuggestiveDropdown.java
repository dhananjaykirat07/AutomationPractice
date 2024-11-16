package FirstProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		WebElement autosuggestdd= driver.findElement(By.id("autosuggest"));
		
		autosuggestdd.sendKeys("India");
		
		Thread.sleep(2000);
//		
//		autosuggestdd.sendKeys(Keys.ARROW_DOWN);
//		
//		autosuggestdd.sendKeys(Keys.ARROW_DOWN);
//		
		Thread.sleep(2000);
//		
		autosuggestdd.sendKeys(Keys.ENTER);
		
//		List<WebElement> autossgt =driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
//
//		for(int i=0;i< autossgt.size();i++) 
//		{
//			
//         if(autossgt.get(i).getText().equals("India"))
//         {
//        	 autossgt.get(i).click();
//         }
//	
//      System.out.println(autossgt.get(1).getText());
//      
//		}
//		
		Thread.sleep(2000);
		
		driver.quit();	

	}

}
