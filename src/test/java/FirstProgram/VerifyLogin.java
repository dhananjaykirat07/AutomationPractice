package FirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();  //to Launch the browser
		
		driver.get("https://www.aajtak.in/"); // to launch the URL
		
		driver.manage().window().maximize(); // to maximize the browser's window
		
		Thread.sleep(1000);
		
		String Expected_Title ="Hindi news, हिंदी न्यूज़ , Hindi Samachar, हिंदी समाचार, Latest News in Hindi, Breaking News in Hindi, ताजा ख़बरें, Aaj Tak News";
		
		String Actual_Title=driver.getTitle(); //to fetch the title of webpage
		
		if (Actual_Title!=null && Expected_Title.equalsIgnoreCase(Actual_Title) ) {
			
			System.out.println("The Title is correct");
			System.out.println("Pass");
		}
		else {
				System.out.println("The Title is incorrect");
				System.out.println("Fail");
			}	
		driver.close();
		}
	}
	


