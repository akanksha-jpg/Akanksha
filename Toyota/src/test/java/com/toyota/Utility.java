package com.toyota;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Utility {
	@Test
	public static void takeSnapShot(WebDriver driver,String screenshotname) throws Exception
	{

	        try {
	//Convert web driver object to TakeScreenshot

	TakesScreenshot ts =((TakesScreenshot)driver);

	//Call getScreenshotAs method to create image file

	        File source=ts.getScreenshotAs(OutputType.FILE);
	          FileUtils.copyFile(source,new File("./screenshot/"+screenshotname+".png"));

	System.out.println("Take screenshot");
	} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}


	}
	  
