package Excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.print("Hello World");
		
		//create driver object for chrome driver
		
		System.setProperty("webdriver.gecko.driver", "C:\\Anand\\software\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver(); //classname objname = new classname();
		
	//	WebDriver driver = new FirefoxDriver();
	//	driver.get("https://www.seleniumhq.org");	
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.get("http://www.yahoo.com");
	//	driver.navigate().back();
		Thread.sleep(3000); //sleep for 3 secs
		System.out.print(driver.getCurrentUrl());
		String title = driver.getPageSource();
		
		System.out.print(driver.getPageSource());
		driver.quit();
		
		
	//	driver.close();
	
		
	
	}

}
