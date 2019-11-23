package com.toyota;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Utilitynavigations extends Base  {
  @Test
  public void utilitynavigation() throws Exception{
	   
	driver.findElement(By.partialLinkText("FAQ")).click();  
	Utility.takeSnapShot(driver, "supportpage");
	Thread.sleep(2000);
	
	driver.findElement(By.partialLinkText("Certified Used Vehicles")).click();  
	Utility.takeSnapShot(driver, "Certified Used Vehicle page ");
	Thread.sleep(2000);
	
	driver.findElement(By.partialLinkText("Owners")).click();
	Utility.takeSnapShot(driver, "Owners");
	Thread.sleep(2000);

	//driver.findElement(By.partialLinkText("Espaňol")).click();
	//Utility.takeSnapShot(driver, "Espanol");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='zipcode has-icon-pencil zipcode-cta']")).click();  
	Utility.takeSnapShot(driver, "Zipcode");
	Thread.sleep(2000);
	
	

	
	  
	  
	  
  }
}
