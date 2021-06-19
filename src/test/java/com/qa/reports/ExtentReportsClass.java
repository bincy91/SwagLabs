package com.qa.reports;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportsClass {
	
	ExtentHtmlReporter html;
	ExtentTest test;
	
	private static ExtentReports extent;
	
	private static ExtentReports createInstance() 
	{ 
	  String fileName = getReportName();
	  String directory = System.getProperty("user.dir") + "./reports/";
	  new File(directory).mkdirs();
	  String path = directory +fileName;
	  ExtentHtmlReporter html = new ExtentHtmlReporter(path);
	  html = new ExtentHtmlReporter("./reports/extent.html");
	  html.config().setEncoding("utf-8");
	  html.config().setDocumentTitle("Automation Reports");
	  html.config().setReportName("Automation Test Results");
	  html.config().setTheme(Theme.STANDARD);
	  
	  ExtentReports extent = new ExtentReports();
	  extent.attachReporter(html);
	   
	  return extent;
	}
		
		public static String getReportName()
		{
			Date d = new Date();
			String fileName = "AutomationReport_" + "-" + d.toString().replace(":","-").replace(" ","_") + ".png";
			return fileName;
		}
		
}
