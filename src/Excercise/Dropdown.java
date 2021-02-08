package Excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.print("Hello World");
		
		//create driver object for chrome driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Anand\\Selenium\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
	//	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org");		
	//	driver.get("https://www.google.com");
	//	System.out.print(driver.getTitle());
		Thread.sleep(2000);
		System.out.println("Page title is - "+ driver.getTitle());
		String title=driver.getTitle();
//		driver.get("https://www.facebook.com");
	//	driver.get("https://www.seleniumhq.org");
/*	if (title.equals("Google1"))
		System.out.println("test Pass");
	else 
		System.out.println("test fail"); */
	
			
	//	System.out.println("Page title is - "+ driver.getTitle());
		
	//	driver.navigate().back(); //forward is to navigate to the next (->) page
		driver.close(); //quite is another method */
	}

}
