package com.miral.core;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.internal.Utils;


//public static Method captureScreenshoot_method;


public class CustomListener implements ITestListener{
	

		public void onFinish(ITestContext context) {
			System.out.println("Test in a suite finished: "+ context.getName()+ "	and time is: "+getCurrentTime());
			
		}


		public void onStart(ITestContext context) {
			System.out.println("Test in a suite started: "+ context.getName()+ "	and time is: "+getCurrentTime());
			
		}
		

		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		
		public void onTestFailure(ITestResult result) {
			Reporter.log("STATUS : FAIL");
			System.out.println("Test method failed: "+ result.getName()+ "	and time is: "+getCurrentTime());
			
		}

		
		public void onTestSkipped(ITestResult result) {
			System.out.println("Test method skipped: "+ result.getName()+ "	and time is: "+getCurrentTime()); 
			
		}

		
		public void onTestStart(ITestResult result) {
			System.out.println("Test method started: "+ result.getName()+ "	and time is: "+getCurrentTime());    
		 }
			
		

		
		public void onTestSuccess(ITestResult result) {
			Reporter.log("STATUS : PASS");
			System.out.println("Test method success: "+ result.getName()+ " and time is: "+getCurrentTime());
			
		}
		
		public String getCurrentTime(){
		    DateFormat dateFormat = 
		        new SimpleDateFormat("HH:mm:ss:SSS");
		    Date dt = new Date();
		    return dateFormat.format(dt);    
		  }
	}


