package FirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://web.whatsapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);

	}

}
