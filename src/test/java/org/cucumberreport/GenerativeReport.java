package org.cucumberreport;

import java.io.File;
import java.util.List;
import java.util.LinkedList;



import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class GenerativeReport {
	
	public static void generateReport(String json) {
		
		File f=new File("target/cucumber-html-reports");
		
		Configuration configuration=new Configuration(f,"Practice Login Function");
		
		configuration.addClassifications("Platform", "Eclipse JDK 1.8");
		
		configuration.addClassifications("version", "2.1");
		
		configuration.addClassifications("BDD", "cucumber+Junit");
		
		List<String> list=new LinkedList<>();
		
		list.add(json);
		
		ReportBuilder reportbuilder=new ReportBuilder(list,configuration);
		
		reportbuilder.generateReports();		
		
		
	}


}
