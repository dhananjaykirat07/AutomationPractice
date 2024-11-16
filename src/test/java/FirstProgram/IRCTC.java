package FirstProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC {


	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement from =driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
        from.click();
        from.sendKeys("csmt");
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);
        
        Thread.sleep(3000);
        
        WebElement to = driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
        to.click();
        to.sendKeys("Pune");
     
        to.sendKeys(Keys.ARROW_DOWN);
        to.sendKeys(Keys.ENTER);
        
        
        Thread.sleep(3000);
//        WebElement calender= driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
//        calender.click();
//        
//        String Sdate="19";
//        List<WebElement> datepick =driver.findElements(By.xpath("//td[@class='ng-tns-c58-10 ng-star-inserted']"));
//        
//        for(WebElement day:datepick) {
//        	day.getText().equals(Sdate);
//        	day.click();
//        }
       
        WebElement Classes =driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down']"));
        Classes.click();
        
        WebElement AC = driver.findElement(By.xpath("//li[@aria-label='AC First Class (1A) ']"));
        AC.click();
        
//        Select dd =new Select(Classes);
//        
//        dd.selectByIndex(2);
//        dd.selectByValue("AC First Class (1A)");
       
        WebElement CheckBox = driver.findElement(By.xpath("//label[@for='dateSpecific']"));
        CheckBox.click();
        
        WebElement Search =driver.findElement(By.xpath("//button[@label='Find Trains']"));
        Search.click();
        
        Thread.sleep(5000);
        driver.quit();
        
	}

}
