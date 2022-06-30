package com_baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_Base {

	public static WebDriver driver;
	public static String title; // static variable to access in any methods
	public static String currentUrl;
	public static String parentHandle;
	public static String parentTitle;
	public static int ssCount;
	public static int ssElementCount;
	public static WebElement relativeElement;
	public static String value1;
	public static String value2;
	public static int xpos;
	public static int ypos;
	
	private Class_Base() {
		
	}
	 
	public static  Class_Base manager(){
		Class_Base bc = new Class_Base();
		return bc;
	}

	public static WebDriver openB(String browserName) {
		try {
			// WebDriver gets the value of the given driver
			if (browserName.equalsIgnoreCase("chrome")) {
				// System.setProperty("webdriver.chrome.driver",".//driver//chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("edge") || browserName.equalsIgnoreCase("msedge")) {
				// System.setProperty("webdriver.edge.driver", ".//driver//msedgedriver.exe");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("fireFox") || browserName.equalsIgnoreCase("gecko")) {
				// System.setProperty("webdriver.firefox.driver", ".//driver//geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("ie") || browserName.equalsIgnoreCase("internetexplorer")) {
				// System.setProperty("webdriver.ie.driver", ".//driver//iedriver.exe");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			// this driver is returned as the local driver
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

	public static void naviAction(String action) {
		try {
			if (action.equalsIgnoreCase("back")) {
				driver.navigate().back();

			} else if (action.equalsIgnoreCase("forward")) {
				driver.navigate().forward();

			} else if (action.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void navigateToStringUrl(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void current(String UrlorTitle) {
		try {
			if (UrlorTitle.equalsIgnoreCase("title")) {
				title = driver.getTitle();

			} else if (UrlorTitle.equalsIgnoreCase("url")) {
				currentUrl = driver.getCurrentUrl();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void get(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void declareParentTab() {
		try {
			parentHandle = driver.getWindowHandle();
			parentTitle = driver.switchTo().window(parentHandle).getTitle();
			System.out.println(parentTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void switchToParent() {
		try {
			driver.switchTo().window(parentHandle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * public static void switchNewWindowOrTab(String type) { try {
	 * if(type.equalsIgnoreCase("windows")) {
	 * driver.switchTo().newWindow(WindowType.WINDOW); }
	 * 
	 * else if(type.equalsIgnoreCase("tab")) {
	 * driver.switchTo().newWindow(WindowType.TAB); } } catch (Exception e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } }
	 */

	public static void driverClose() {
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void driverQuit() {
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * public static void WindowsHandleParent() { String parent =
	 * driver.getWindowHandle(); System.out.println(parentTitle); }
	 */

	public static void tabSwitchNo(int tabIndex) {
		try {
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			// System.out.println(tabs);
			int size = tabs.size();
			// System.out.println(size);
			driver.switchTo().window(tabs.get(0));
			ArrayList<String> falseTabs = new ArrayList<>();
			int count = size - 1;
			falseTabs.add(0, tabs.get(0));
			for (int i = 1; i < size; i++) {
				if (count != 0) {
					falseTabs.add(i, tabs.get(count));
					count--;
				}
			}
			tabs = falseTabs;
			// System.out.println(tabs);
			driver.switchTo().window(tabs.get(tabIndex));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void framesSwitch(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void frameSwitch(String idOrNam) {
		try {
			driver.switchTo().frame(idOrNam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void frameSwitch(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void framedefault() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getSize() {
		try {
			int height = driver.manage().window().getSize().getHeight();
			int width = driver.manage().window().getSize().getWidth();
			System.out.println("width = " + width + "\nheight = " + height);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void setSize(int width, int height) {
		try {
			driver.manage().window().setSize(new Dimension(width, height));
			Dimension size = driver.manage().window().getSize();
			System.out.println(size);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getPosition() {
		try {
			Point position = driver.manage().window().getPosition();
			int xPos = position.getX();
			int yPos = position.getY();
			System.out.println("The position \nXposition = " + xPos + "\nYposition = " + yPos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void setPosition(int xpos, int yPos) {
		try {
			driver.manage().window().setPosition(new Point(xpos, yPos));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void windowManage(String screenMode) {
		try {
			if (screenMode.equalsIgnoreCase("maximize") || screenMode.equalsIgnoreCase("max")) {
				driver.manage().window().maximize();
			}
			// else if(screenMode.equalsIgnoreCase("min") ||
			// screenMode.equalsIgnoreCase("minimize")) {
			// driver.manage().window().minimize();
			// }
			else if (screenMode.equalsIgnoreCase("full") || screenMode.equalsIgnoreCase("fullscreen")) {
				driver.manage().window().fullscreen();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void screenshotFull(int ssCount) throws IOException {
		try {
			TakesScreenshot ss = (TakesScreenshot) driver;
			File srcFile = ss.getScreenshotAs(OutputType.FILE);
			File destFile = new File(".//screenshots//" + ssCount + ".jpg");
			FileUtils.copyFile(srcFile, destFile);
			ssCount++;
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void screenshotElement(WebElement element) throws IOException {
		try {
			TakesScreenshot ss = (TakesScreenshot) driver;
			File srcFile = ss.getScreenshotAs(OutputType.FILE);
			File destFile = new File(".//screenshot//element" + ssElementCount + ".jpg");
			FileUtils.copyFile(srcFile, destFile);
			ssElementCount++;
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * public static void elementRelative(WebElement element, String tagName ,
	 * String near) { try { if(near.equalsIgnoreCase("above")) { relativeElement =
	 * driver.findElement(RelativeLocator.with(By.tagName(tagName)).above(element));
	 * } else if(near.equalsIgnoreCase("below")) { relativeElement =
	 * driver.findElement(RelativeLocator.with(By.tagName(tagName)).below(element));
	 * } else if(near.equalsIgnoreCase("left")) { relativeElement =
	 * driver.findElement(RelativeLocator.with(By.tagName(tagName)).toLeftOf(element
	 * )); } else if(near.equalsIgnoreCase("right")) {
	 * relativeElement.findElement(RelativeLocator.with(By.tagName(tagName)).
	 * toRightOf(element)); } else if(near.equalsIgnoreCase("near")){
	 * relativeElement.findElement(RelativeLocator.with(By.tagName(tagName)).near(
	 * element)); } } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
	public static void getOptions(List<WebElement> options) {
		try {
			for (WebElement option : options) {
				System.out.println(option.getText());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void implicitWait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void explicitWait(int seconds, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			WebElement untilClick = wait.until(ExpectedConditions.elementToBeClickable(element));
			untilClick.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void fluentWait(int timeoutSec, int pollingSec, WebElement element) {
		try {
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeoutSec))
					.pollingEvery(Duration.ofSeconds(pollingSec));

			fluentWait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void alert(String condition, WebElement element, String send) {
		try {
			Alert alertOne = driver.switchTo().alert();
			if (condition.equalsIgnoreCase("accept")) {
				alertOne.accept();
			} else if (condition.equalsIgnoreCase("dismiss")) {
				alertOne.dismiss();
			} else if (condition.equalsIgnoreCase("send")) {
				alertOne.sendKeys(send);
				alertOne.accept();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void alertConfirmation(String text) {
		try {
			Alert alertOne = driver.switchTo().alert();
			if (driver.getPageSource().equalsIgnoreCase(text)) {
				System.out.println(alertOne.getText() + "confirm");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void pageLoadType(String typeName) {
		try {
			ChromeOptions newOp = new ChromeOptions();
			if (typeName.equalsIgnoreCase("none")) {
				newOp.setPageLoadStrategy(PageLoadStrategy.NONE);
			} else if (typeName.equalsIgnoreCase("normal")) {
				newOp.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			} else if (typeName.equalsIgnoreCase("Eager")) {
				newOp.setPageLoadStrategy(PageLoadStrategy.EAGER);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void threadSleep(long mSec) throws InterruptedException {
		try {
			Thread.sleep(mSec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getElementAttri(WebElement element, String cssType) {
		try {
			String tagName = element.getTagName();
			String text = element.getText();
			String cssValue = element.getCssValue(cssType);
			System.out.println("tagName = " + tagName + "\ntext = " + text + "\ncssValue = " + cssValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void enabledDisabled(WebElement element) {
		try {
			System.out.println("Checkbox enabled = " + element.isEnabled());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void selectedUnselected(WebElement element) {
		try {
			System.out.println("Checkbox selection = " + element.isSelected());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void displayedRNot(WebElement element) {
		try {
			System.out.println("Checkbox displayed = " + element.isDisplayed());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void actionP(String clickname, WebElement element) {
		try {
			Actions acS = new Actions(driver);
			acS.moveToElement(element);
			if (clickname.equalsIgnoreCase("left")) {
				acS.click().perform();
			} else if (clickname.equalsIgnoreCase("right")) {
				acS.contextClick().perform();
			} else if (clickname.equalsIgnoreCase("double")) {
				acS.doubleClick().perform();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void dragDrop(WebElement drag, WebElement drop) {
		try {
			Actions acS = new Actions(driver);
			acS.dragAndDrop(drag, drop).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getoptions(WebElement element) {
		try {
			Select dropDown = new Select(element);
			List<WebElement> allOptions = dropDown.getOptions();
			for (WebElement option : allOptions) {
				System.out.println(option.getText());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void setOption(WebElement element, String visibleText) {
		try {
			Select dropDown = new Select(element);
			dropDown.selectByVisibleText(visibleText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void setOption(WebElement element, int index) {
		try {
			Select dropDown = new Select(element);
			dropDown.selectByIndex(index);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void scroll(String upRdown, double span) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if (upRdown.equalsIgnoreCase("up")) {
				js.executeScript("window.scrollBy(0," + span + ")");
			} else if (upRdown.equalsIgnoreCase("down")) {
				js.executeScript("window.scrollBy(0,-" + span + ")");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void scrollWithElement(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView;", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void robotKey(String action) throws AWTException {
		try {
			Robot sunny = new Robot();
			if (action.equalsIgnoreCase("up")) {
				sunny.keyPress(KeyEvent.VK_UP);
				sunny.keyRelease(KeyEvent.VK_UP);
			} else if (action.equalsIgnoreCase("down")) {
				sunny.keyPress(KeyEvent.VK_DOWN);
				sunny.keyRelease(KeyEvent.VK_DOWN);
			} else if (action.equalsIgnoreCase("enter")) {
				sunny.keyPress(KeyEvent.VK_ENTER);
			}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sendKeys(WebElement element, String keys) {
		element.sendKeys(keys);
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void dropdown(WebElement element, String value) {
		Select select2 = new Select(element);
		select2.selectByValue(value);
	}

	public static void radioButton(List<WebElement> element, int value) {
		element.get(value).click();
	}
	
	public static void moveTo(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public static void getValue(WebElement element) {
		value1 = element.getAttribute("value");
	}
	
	public static void getValue2(WebElement element) {
		value2 = element.getAttribute("value");
	}
	
	public static void validateValues(String value, String valuex) {
		if(value==valuex) {
			System.out.println("conditions are met");
		}
	}

	public static void relative(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element, 40, 542);
		ac.click().perform();
	}
	
	public static void getposition(WebElement element) {
		xpos = element.getLocation().getX();
		ypos = element.getLocation().getY();
		System.out.println(xpos+"/n"+ypos);
	}
}
