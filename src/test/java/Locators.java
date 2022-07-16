import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",    "C:/Users/saied rahman/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.cssSelector("body > div > header > div.header-top > div > div > div.top-right.clearfix > div:nth-child(3) > a")).click();
		driver.findElement(By.id("email")).sendKeys("saiddurrahman@gmail.com");
		driver.findElement(By.id("password")).sendKeys("said123");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.cssSelector("body > main > div > div")).getText());
		driver.findElement(By.linkText("Forgot Password")).click();
		
		
		
		
		
		
	}

}
