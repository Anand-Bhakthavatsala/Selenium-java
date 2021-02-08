package Excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.print("Hello World");
		
		//create driver object for chrome driver
		
		System.setProperty("webdriver.ie.driver", "C:\\Anand\\software\\drivers\\IEDriverServer.exe");
	
		InternetExplorerDriver driver = new InternetExplorerDriver();
	//	WebDriver driver = new EdgeDriver();
				
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		System.out.print(driver.getTitle());	
	//	driver.close();
	}

}
