package FirstProgram;
		
	    import java.util.List;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class AirIndia {

			public static void main(String[] args) throws InterruptedException {
				
				WebDriver driver =new ChromeDriver();
				
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				
				driver.manage().window().maximize();
				
				driver.navigate().refresh();
				
				Thread.sleep(2000);
				
			    WebElement from = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
			    from.click();
//				Thread.sleep(2000);
//				
//				from.sendKeys("mumbai");
//				Thread.sleep(2000);
//				//from.sendKeys(Keys.ARROW_DOWN);
//				from.sendKeys(Keys.ENTER);
//				
//				Thread.sleep(2000);
//				
//				WebElement to =driver.findElement(By.xpath("//input[@data-id='ai-autocomplete-input-TO']"));
//				to.click();
//				to.sendKeys("goa");
//				Thread.sleep(2000);
//				//to.sendKeys(Keys.ARROW_DOWN);
//				to.sendKeys(Keys.ENTER);
//
//				Thread.sleep(2000);
				WebElement datepick =driver.findElement(By.xpath("a[@class=ui-state-default ui-state-highlight']"));
     			datepick.click();
			
				String day ="October 26, 2024";
				
				List<WebElement> ddate=driver.findElements(By.xpath("//div[@role='gridcell']"));
			
				
				for(WebElement nday:ddate) {
					
					nday.getText().equals(day);
					nday.click();
				}
				
				Thread.sleep(15000);
				driver.quit();
			}

		

	}


