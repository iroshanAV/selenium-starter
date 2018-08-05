package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	WebDriver driver;
	
	public void invokeBrowser() {
        

		
		System.setProperty("webdriver.chrome.driver","H:\\QA\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.edureka.co");
		searchCourse();
		
	}
	
	public void searchCourse() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("homeSearchBarIcon")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		 js.executeScript("window.scrollBy(0,1000)");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
		

	}

}
