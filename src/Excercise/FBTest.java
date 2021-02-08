package Excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub			
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");		
		driver.findElement(By.id("email")).sendKeys("test");
		driver.findElement(By.name("pass")).sendKeys("don't know");
		driver.findElement(By.linkText("Forgotten account?")).click();

	}

}
