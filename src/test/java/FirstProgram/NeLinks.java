package FirstProgram;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class NeLinks {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.manage().window().maximize();
			Thread.sleep(2000);

			//It if for selecting Country in the autosuggest dropdown
			
				WebElement ddo = driver.findElement(By.xpath("//input[@id='autosuggest']"));
				ddo.click();
				Thread.sleep(2000);
				ddo.sendKeys("ind");
				Thread.sleep(2000);
				
				//There are two three options are present when we put ind then we create a If Condition 
				
				List<WebElement>options=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
				for(WebElement op:options) 
				
					if(op.getText().equals("India")) {
						System.out.println(op.getText());
						op.click();
				}
				
		Thread.sleep(2000);
		
		
		//It is responsible for selecting the Round Trip.
	    WebElement from = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
	    from.click();
	    
	    Thread.sleep(2000);
		
		//It is responsible for selecting depature city 
				
		WebElement departure = driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
		departure.click();
		//finding the unique xpath to loacte which city we are ging to depart
		WebElement dcity = driver.findElement(By.xpath("//a[@value='GOI']"));
		dcity.click();
		Thread.sleep(2000);
		
		//It is reponsible for selecting Arriving City 
		
		WebElement arrival = driver.findElement(By.xpath("//a[@value='JAI']"));
		//Sometimes click functionality not working properly, in that case we can use implicity wait, explicity wait and Javascript executor
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", arrival);
		Thread.sleep(2000);
		
		//It is responsible for date picking icon 
		
		WebElement datepicker = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		datepicker.click();
		
		Thread.sleep(2000);
		
		//Always select the table of calender so I select the table frame..
		List<WebElement> sdate =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td/a"));
		
		String dt="16";
		
		for(WebElement date:sdate) {
			date.getText().equals(dt);
			System.out.println(date.getText());
			date.click();
			break;
		}
		
		Thread.sleep(2000);
		
		WebElement rdatep =driver.findElement(By.id("ctl00_mainContent_view_date2"));
		rdatep.click();
		
		List<WebElement> adate =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td/a"));
		
		String rd=("20");
		
		for(WebElement rdate:adate) {
			rdate.getText().equals(rd);
			System.out.println(rdate.getText());
			rdate.click();
			break;
		}
		
		Thread.sleep(2000);
		
		WebElement Passengers =driver.findElement(By.id("divpaxinfo"));
		Passengers.click();
		Thread.sleep(2000);
		
		WebElement addAdults =driver.findElement(By.id("hrefIncAdt"));
		for(int i=0;i<1;i++) {
		addAdults.click();
		Thread.sleep(500);
		}
		
		WebElement addChildren =driver.findElement(By.id("hrefIncChd"));
		for(int i=0;i<1;i++) {
			addChildren.click();
			Thread.sleep(500);
		}
		
		WebElement addInfant =driver.findElement(By.id("hrefIncInf"));
		addInfant.click();
		
		Thread.sleep(2000);
		
		WebElement done =driver.findElement(By.id("btnclosepaxoption"));
		done.click();
		
		WebElement cdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
    	Select Currency = new Select(cdropdown);
        Currency.selectByIndex(1);
    	Thread.sleep(2000);
	
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		
		driver.findElement(By.partialLinkText("Special")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("SpecialAssistanceWindow")).click();
		
		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$btn_FindFlights']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		}
		
		}