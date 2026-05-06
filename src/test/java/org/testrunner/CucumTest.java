package org.testrunner;

import org.cucumberreport.GenerativeReport;
import org.junit.runner.RunWith;
import org.junit.AfterClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\featurefile\\LoginPage.feature",
glue = "org.stepdefff",
plugin = "json:target\\jsonreport.json",
tags="@regression"
		)
public class CucumTest {
	
@AfterClass
public static void generateReport()
{
    System.out.println("REPORT GENERATION STARTED");  // 👈 ADD THIS

	GenerativeReport.generateReport("target/jsonreport.json");
}

}
