import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirstTest {
	public String baseurl = "https://images.google.com/";
	String driverPath = "C:\\Users\\noone\\eclipse-workspace\\FirstTestNG\\driver\\chromedriver.exe";
	public WebDriver driver;
	String driverInit = "webdriver.chrome.driver";
	public RemoteWebDriver driver2 ;
	
  @Test
  public void verifyHomePage() throws InterruptedException {
	  System.out.println("open browser");
	  System.setProperty(driverInit, driverPath);
	  driver2 = new ChromeDriver();
	  driver2.get(baseurl);
	  driver2.manage().window().maximize();
	  driver2.findElement(By.xpath("//div[@class='ZaFQO']")).click();
	  WebElement add = driver2.findElement(By.xpath("(//a[@class='iOGqzf H4qWMc aXIg1b'])[1]"));
	  add.click();
	  WebElement addfile = driver2.findElement(By.xpath("//input[@id='awyMjb']"));
	  Thread.sleep(7000);
	  addfile.sendKeys("C:\\Users\\noone\\Desktop\\1.png");
	  
	//  driver = new ChromeDriver();
	 // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//  driver.get(baseurl);
	 // String ExpectedTitle = "Welcome: Mercury Tours";
	 // String actualResult = driver.getTitle();
	 // Assert.assertEquals(actualResult, ExpectedTitle);
	//  driver.close();
  }
}
