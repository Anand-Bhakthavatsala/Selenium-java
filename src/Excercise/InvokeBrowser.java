package Excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Anand\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		//	WebDriver driver = new FirefoxDriver();
				

	}

}
