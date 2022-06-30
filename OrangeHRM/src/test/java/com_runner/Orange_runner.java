package com_runner;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com_POM_manager.Com_Pom;
import com_baseclass.Class_Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com_features_orange", dryRun=false, glue="com_stepDefinition", monochrome=true)
public class Orange_runner {
	public static WebDriver driver;
	@BeforeClass
	public static void getBrowser() {
		driver=Class_Base.openB("chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Com_Pom.driver = driver;
}

}
