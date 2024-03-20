package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mvnrepository {

	WebDriver driver;

	@Test(priority = 1)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng");
		//driver.navigate().to("https://mvnrepository.com/artifact/org.testng/testng");
		//driver.navigate().refresh();
		// driver.navigate().forward();
		// driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public void Serch_Element() throws InterruptedException {
		
		WebElement Ewb = driver.findElement(By.xpath("//input [@id='query']"));
		Ewb.sendKeys("selenium java");
		Ewb = driver.findElement(By.xpath("//input [@type = 'submit']")); 
		Ewb.click();
		
		Thread.sleep(3000);
		
		}
}