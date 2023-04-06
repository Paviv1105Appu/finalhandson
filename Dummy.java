package finalassesment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Dummy {
	WebDriver driver;
	String url="https://www.makemytrip.com/";
	
	@BeforeTest(enabled = true)
	public void Testcase1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(enabled = true,priority = 0)
	public void holidaypackage() {
		driver.findElement(By.xpath("//span[@class=\"chNavText darkGreyText\"]")).click();
		WebElement fromCity=driver.findElement(By.id("fromCity"));
		fromCity.click();
		fromCity.sendKeys("Bangalore");
		WebElement fromCityDropdown = driver.findElement(By.xpath("//input[@value=\"Bangalore\"]"));
		fromCityDropdown.click();
		
		WebElement tocity = driver.findElement(By.id("toCity"));
		tocity.click();
		tocity.sendKeys("Singapore");
		driver.findElement(By.id("searchBtn")).click();;
		
	}
	
   @Test(enabled = true,priority = 1)
   public void Testcase2() throws AWTException {
	   Robot ro=new Robot();
       ro.keyPress(KeyEvent.VK_PAGE_DOWN);
       driver.close();
   }
}


