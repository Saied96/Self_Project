import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intro {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		//for chromedriver
		System.setProperty("webdriver.chrome.driver",    "/C:/Users/saied rahman/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		// For firefox 
		//System.setProperty("webdriver.gecko.driver",    "/C:/Users/saied rahman/utilities/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://rahulshettyacademy.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		//for edgedriver
		//System.setProperty("webdriver.edge.driver",    "/C:/Users/saied rahman/utilities/msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
				//driver.get("https://rahulshettyacademy.com/");
				//System.out.println(driver.getTitle());
				//System.out.println(driver.getCurrentUrl());
				//driver.close();
		
	}

}
