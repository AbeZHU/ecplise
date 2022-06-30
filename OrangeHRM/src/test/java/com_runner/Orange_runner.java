package com_runner;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com_POM_manager.Pom_manager;
import com_baseclass.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com_features_orange", dryRun=false, glue="com_stepDefinition", monochrome=true)
public class Orange_runner {
	public static WebDriver driver;
	@BeforeClass
	public static void getBrowser() {
		driver=BaseClass.openB("chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Pom_manager.driver = Orange_runner.driver;
}

}
