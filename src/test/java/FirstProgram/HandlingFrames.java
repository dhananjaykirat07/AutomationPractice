package FirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://ui.vision/demo/webtest/frames/");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hey, Hello...");
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame(1);
		 driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Good Evening, Do a great work..!");
         
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(2000);
		 driver.switchTo().frame(2);
		 driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("How was your Day??");
         
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(2000);
		 driver.switchTo().frame(3);
		 driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("What are you doing that is Beneficial or not!!");
         
		 System.out.println("😍🤣💖😜😎😎");
		 
		 
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(0);
		 WebElement Frame1 =driver.findElement(By.xpath("//input[@name='mytext1']"));
		 Frame1.clear();
		 Frame1.sendKeys("<❤️Main Jhukega Nahi Saala❤️>");
		 Frame1.isDisplayed();
		 
		 Thread.sleep(5000);
		 
		 driver.quit();
	}

}
