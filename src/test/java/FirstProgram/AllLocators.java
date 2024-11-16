package FirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 WebElement un = driver.findElement(By.xpath("//input[@placeholder='Username']"));
         un.click();
         un.sendKeys("Admin");
         Thread.sleep(1000);
         
         WebElement pw = driver.findElement(By.xpath("//input[@placeholder='Password']"));
         pw.click();
         pw.sendKeys("admin123");
         
        WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
        Login.click();
         
        
         driver.quit();
	}

}
