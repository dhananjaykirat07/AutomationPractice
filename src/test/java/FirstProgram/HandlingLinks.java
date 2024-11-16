package FirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
//		WebElement hl =driver.findElement(By.linkText("Forgot Your Password?"));
//		hl.click();
		
		WebElement phl =driver.findElement(By.partialLinkText("Try for"));
		phl.click();
		
		driver.close();
	}

}
