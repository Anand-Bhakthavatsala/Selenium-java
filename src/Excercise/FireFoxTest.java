package Excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.print("Hello World");
		
		//create driver object for chrome driver
		
		System.setProperty("webdriver.gecko.driver", "C:\\Anand\\software\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://www.google.com");
	//	System.out.print(driver.getTitle());
	//	Thread.sleep(2000);
		System.out.println("Page title is - "+ driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	//	driver.get("https://www.seleniumhq.org");
		driver.navigate().to("https://www.facebook.com");
	//	System.out.println("Page title is - "+ driver.getTitle());
		Thread.sleep(1000);
		driver.navigate().back();
	//	driver.navigate().back(); //forward is to navigate to the next (->) page
		driver.close(); //quite is another method */
		System.out.println("Test execution is Done");
	}

}
