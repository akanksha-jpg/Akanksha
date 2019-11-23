package com.toyota;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mongodb.diagnostics.logging.Loggers;

import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class Base 

{

	public static WebDriver driver;
	String baseUrl="https://www.toyota.com/";
	 @BeforeTest
  public void openBrowser() throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get("https://www.toyota.com/");
	      Utility.takeSnapShot(driver, "homepage");
	 
	 }
	 //Generate Report 
	  @Test
	public void test() {
			
			ExtentHtmlReporter reporter =new ExtentHtmlReporter("C:\\Users\\Shanu\\Toyota\\test-output\\result.html");
			
				ExtentReports extent = new ExtentReports();
				extent.attachReporter(reporter);
				
				ExtentTest logger =  extent.createTest("Toyota");
				logger.log(Status.INFO,"Navigate to base url");
				logger.log(Status.PASS,"Navigate succesfully");
				extent.flush();

				ExtentTest logger1 =  extent.createTest("Search");
				logger1.log(Status.PASS,"search opens ");
				extent.flush();

				ExtentTest logger2 =  extent.createTest("Search");
				logger2.log(Status.PASS,"Enter text");
				extent.flush();

				ExtentTest logger3 =  extent.createTest("Utilitynavigations");
				logger3.log(Status.PASS,"support");
				extent.flush();

				ExtentTest logger4 =  extent.createTest("Utilitynavigations");
				logger4.log(Status.PASS,"certified used vehicle");
				extent.flush();

				
				ExtentTest logger5 =  extent.createTest("Utilitynavigations");
				logger5.log(Status.PASS,"owners");
				extent.flush();

				
				//ExtentTest logger6 =  extent.createTest("Utilitynavigations");
				//logger6.log(Status.INFO,"Espanol");
				
				ExtentTest logger6 =  extent.createTest("Utilitynavigations");
				logger6.log(Status.PASS,"Zipcode");
				extent.flush();

				
				ExtentTest logger7 =  extent.createTest("GlobalNavigation");
				logger7.log(Status.PASS,"Select Vehicle");
				extent.flush();

				ExtentTest logger8 =  extent.createTest("GlobalNavigation");
				logger8.log(Status.PASS,"Shopping Tools");
				extent.flush();

				ExtentTest logger9 =  extent.createTest("GlobalNavigation");
				logger9.log(Status.PASS,"Find a Dealers");
				extent.flush();

				
				ExtentTest logger10 =  extent.createTest("Global Navigation ");
				logger10.log(Status.PASS,"Build and price");
				extent.flush();
				
				ExtentTest logger11 =  extent.createTest("Global Navigation");
				logger11.log(Status.PASS,"Local Specials");
				extent.flush();
				
				ExtentTest logger12 =  extent.createTest("Global Navigation");
				logger12.log(Status.PASS,"zipcode");
				extent.flush();
				
				ExtentTest logger13 =  extent.createTest("Global Navigation");
				logger13.log(Status.PASS,"submit zipcode");					
				extent.flush();
				
			}
	  /* @AfterTest
	  public void teardown(ITestResult result)throws Exception {
		  if(result.getStatus()==ITestResult.FAILURE) {
				logger.log(Status.FAIL,"Testcase is Failed"+result.getName());
				logger.log(Status.FAIL,"Testcase is Failed"+result.getThrowable());

		  }

			extent.flush();		  				*/
	  @AfterTest
	  public void teardown() throws Exception{

		  driver.close();
		  driver.quit();
		  
		  
		  
	  }
	}
