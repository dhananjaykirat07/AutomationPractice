package FirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAClickJet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement roundtrip=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/label"));
		
		roundtrip.click();
		
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		from.click();
		
		Thread.sleep(1000);
		
		WebElement departureCity =driver.findElement(By.xpath("//a[@value='GOI']"));
		departureCity.click();
		
		Thread.sleep(1000);
		
    	WebElement to =driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction"));
		to.click();
		
        Thread.sleep(2000);
        
//        WebElement ArrivalCity =driver.findElement(By.xpath("//a[@value='JAI']"));
//		ArrivalCity.click();
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();",ArrivalCity);
//        
//		Thread.sleep(2000);
		
//        WebElement depdate = driver.findElement(By.id("ctl00_mainContent_view_date1"));
//        depdate.click();
//        
//        WebElement pdate = driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']"));
//        pdate.click();
        
        WebElement checkbox  = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_StudentDiscount']"));
        
        checkbox.click();
        
        WebElement linkcheck = driver.findElement(By.linkText("Special Assistance"));
        linkcheck.click();
//        
		Thread.sleep(3000);
		
		driver.quit();
	}

}
