package FirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		WebElement un =driver.findElement(By.id("username"));
		
		Thread.sleep(1000);
		
		un.click();
		
		un.sendKeys("dhananjaykirat");
		
		WebElement pw=driver.findElement(By.id("password"));
		
		Thread.sleep(1000);
		
		pw.click();
		
		pw.sendKeys("Dhananjay@1234");
		
		WebElement login = driver.findElement(By.id("Login"));
		
		Thread.sleep(1000);
		
		login.click();
		
			
	}

}
