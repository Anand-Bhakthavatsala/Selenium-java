package Excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxFBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Anand\\software\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");		
		driver.findElement(By.id("email")).sendKeys("Anand");
		driver.findElement(By.name("pass")).sendKeys("don't know");
		driver.findElement(By.linkText("Forgotten account?")).click();

	}

}
