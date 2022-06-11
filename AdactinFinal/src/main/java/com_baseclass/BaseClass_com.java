package com_baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_com {

	public static WebDriver driver;
	public static WebElement checkBox;
	public static Select select;
	public static int x;

	// succeeded
	public static WebDriver browserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + ("\\driver\\chromedriver.exe"));
			driver = new ChromeDriver();
			
		}

		else if (browserName.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + ("\\driver\\edgedriver.exe"));
			driver = new EdgeDriver();

		}

		else {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty(("user.dir") + "\\driver\\geckodriver.exe"));
			driver = new FirefoxDriver();
		}

		return driver;
	}

	// succeeded
	public static void close() {
		driver.close();
	}

	// succeeded
	public static void quitBrowser() {
		driver.quit();
	}

	// succeeded
	public static void navigateTo(String navAction, String URL) {

		if (navAction.equalsIgnoreCase("url")) {

			driver.navigate().to(URL);

		}

		else if (navAction.equalsIgnoreCase("forward")) {

			driver.navigate().forward();
		}

		else if (navAction.equalsIgnoreCase("refresh")) {

			driver.navigate().refresh();
		}

		else if (navAction.equalsIgnoreCase("back")) {

			driver.navigate().back();
		}
	}

	// succeeded
	public static void get(String URL) {
		driver.get(URL);

	}

	// succeeded
	public static void alertAccept(String mode, String key) {
		if (mode.equalsIgnoreCase("yes")) {

			driver.switchTo().alert().accept();

		} else if (mode.equalsIgnoreCase("no")) {

			driver.switchTo().alert().dismiss();
		}

		else if (mode.equalsIgnoreCase("keys")) {

			driver.switchTo().alert().sendKeys(key);

			driver.switchTo().alert().accept();
		}

	}

	public static void actionMoveTo(WebElement element, String clickName) {
		Actions acS = new Actions(driver);

		if (clickName.equalsIgnoreCase("rightClick")) {

			acS.contextClick(element).perform();

		}

		else if (clickName.equalsIgnoreCase("click")) {

			acS.click(element).perform();

		}

		else if (clickName.equalsIgnoreCase("doubleClick")) {

			acS.doubleClick(element).perform();
		}

		else {
			acS.moveToElement(element).perform();

		}

	}

	public static void frames(WebElement element, String whichFrame, int index) {

		if (whichFrame.equalsIgnoreCase("switch")) {

			driver.switchTo().frame(element);
		} else if (whichFrame.equalsIgnoreCase("index")) {

			driver.switchTo().frame(index);

		}

		else if (whichFrame.equalsIgnoreCase("exitframe")) {

			driver.switchTo().parentFrame();
		}

	}

	public static void robot(String act) throws AWTException {

		Robot rob = new Robot();

		if (act.equalsIgnoreCase("up")) {
			rob.keyPress(KeyEvent.VK_UP);
			rob.keyRelease(KeyEvent.VK_UP);
		}

		else if (act.equalsIgnoreCase("down")) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}

		else if (act.equalsIgnoreCase("enter")) {
			rob.keyPress(KeyEvent.VK_ENTER);
		}

	}

	public static void dropDown(String visibleText, int index, WebElement element, String value, String method) {

		select = new Select(element);

		if (index >= 0) {
			if (method.equalsIgnoreCase("select")) {

				select.selectByIndex(index);

			} else {
				select.deselectByIndex(index);

			}
		}

		else if (visibleText.equalsIgnoreCase(visibleText)) {

			if (method.equalsIgnoreCase("select")) {

				select.selectByVisibleText(visibleText);
			} else {
				select.deselectByVisibleText(visibleText);
			}

		}

		else if (value.equalsIgnoreCase(value)) {
			if (method.equalsIgnoreCase("select")) {

				select.selectByValue(value);
			} else {
				select.deselectByValue(value);
			}

		}

	}

	public static void getOptions(WebElement element) {
		select = new Select(element);

		List<WebElement> options = select.getOptions();
		for (WebElement opAll : options) {
			System.out.println(opAll.getText());
		}
	}

	public static void getFirstSelectedOptions(WebElement element) {
		select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println(firstSelectedOption);

	}

	public static void getAllSelectedOptions(WebElement element) {
		select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement opAllSelect : allSelectedOptions) {
			System.out.println(opAllSelect.getText());
		}
	}

	public static void isMultiple(WebElement element, int index, String value) {

		select = new Select(element);
		if (select.isMultiple()) {
			select.selectByIndex(index);
			select.selectByValue(value);
		}

	}

	public static void checkBoxClick(WebElement element) {

		element.click();

	}

	public static void checkBoxIsDisplayed(WebElement element) {

		boolean displayed = checkBox.isDisplayed();
		if (displayed == true) {

			element.click();
		} else {
			System.out.println("Check box not displayed");
		}

	}

	public static void checkBoxIsEnabled(WebElement element) {
		boolean enabled = checkBox.isEnabled();
		if (enabled == true) {
			element.click();

		} else {
			System.out.println("Check Box  is not enabled");
		}
	}

	public static void checkBoxIsSelected(WebElement element) {
		boolean selected = checkBox.isSelected();

		if (selected == false) {
			element.click();

		}

	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getAttribute(WebElement element) {
		String attribute = element.getAttribute("def");
		System.out.println(attribute);
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void sendKeys(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void screenShot(int x) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File srcFile = ss.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\noone\\Desktop\\Project\\screenshot\\pic" + x + ".jpg");
		FileUtils.copyFile(srcFile, destFile);

	}

	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void scrollUpOrDown(String navi, double count) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (navi.equalsIgnoreCase("up")) {
			js.executeScript("window.scrollBy(0," + count + ")");
		} else {
			js.executeScript("window.scrollBy(0," + count + ")");
		}

	}

	public static void windowsHandleS() {
		// String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			String titles = driver.switchTo().window(handle).getTitle();
			System.out.println(titles);

		}

	}

	public static void windowTab() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			if (driver.switchTo().window(handle).getTitle().equals(
					"Redmi 9A Sport (Coral Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery : Amazon.in: Electronics")) {
				break;
			}
		}

	}

	public static void dropdown(WebElement element, String value) {
		Select select2 = new Select(element);
		select2.selectByValue(value);
	}

	public static void radioButton(List<WebElement> element, int value) {
		element.get(value).click();
	}

}
