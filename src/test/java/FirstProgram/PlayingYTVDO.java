package FirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayingYTVDO {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=kmjeMrjOjFA");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement bn = driver.findElement(By.xpath("//button[@title='Play (k)']"));
		
		WebElement mx = driver.findElement(By.xpath("//button[@title='Full screen (f)']"));
		
		bn.click();
		mx.click();
			
		//driver.close();
		
		//driver.quit();
	}

}
