package com.miral.galenDefination;

import static java.util.Arrays.asList;

import java.io.IOException;

import org.testng.annotations.Test;

import com.galenframework.api.Galen;
import com.galenframework.api.GalenPageDump;
import com.miral.core.Util;

public class ImageComparison extends Util {
	
	  @Test
	public void YasHomePageUIOnDesktop() throws IOException {
		  
		  
		  load("https://yasisland.ae/", 1366,768);
	      checkLayout(System.getProperty("user.dir")+ "/src/test/resources/spec/ImageComparison.spec",asList("Desktop"));
	      new GalenPageDump("some page").dumpPage(driver, System.getProperty("user.dir")+ "/src/test/resources/spec/YasHomepage.spec", "dump/home-page"); 
	  }
	
	

}
