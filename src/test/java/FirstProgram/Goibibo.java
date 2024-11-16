package FirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
		from.click();
		
		from.sendKeys("mumbai");
		Thread.sleep(2000);
		//from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement to =driver.findElement(By.xpath("//input[@placeholder='To Station']"));
		to.click();
		to.sendKeys("goa");
		Thread.sleep(2000);
		//to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		WebElement datepick =driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']"));
		datepick.click();
		
		WebElement search=driver.findElement(By.xpath("//button[@class='btn btn-search filled primary lg inactive button']"));
		search.click();
		
		Thread.sleep(15000);
		driver.quit();
	}

}
