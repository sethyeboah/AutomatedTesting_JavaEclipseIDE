package frontEndTesting_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class SearchTextOnGoogle {
	//Use the WebDriverManager to Setup/Create a chromeDriver before running tests
	@BeforeClass
	public static void setupChromeDriver() {
		WebDriverManager.chromedriver().setup();
	}
	
	@Test
	public static void searchInGoogleSearchBox() {
		// Define the web driver to use - Not needed if using WebDriverManager
//		System.setProperty("webdriver.chrome.driver","C:\\Git Repositories\\AutomatedTesting_JavaEclipseIDE\\Automated_Testing\\resources\\chromedriver.exe");
		
		// Open a new instance of Chrome
		WebDriver driver = new ChromeDriver();
		
		// Go to website
		driver.get("https://www.google.com/");
		
		// Input text in search box using Xpath
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Facebook Login");
		searchBox.submit();
	}
	

//	public static void main(String[] args) {
//		searchInGoogleSearchBox();
//	}
}
