package com_runner_1;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import baseclass_com.BaseClass_com;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,features = "src\\test\\java\\multi_feature",glue = "com_multi_stepdefinition", monochrome=true)
public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void browserSelect() {
		driver= BaseClass_com.browserLaunch("chrome");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
}
