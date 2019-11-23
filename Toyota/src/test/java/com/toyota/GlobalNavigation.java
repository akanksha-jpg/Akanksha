package com.toyota;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GlobalNavigation extends Base {
  @Test
  public void navigation() throws Exception {
	  
	  driver.findElement(By.xpath("//div[@class='main-navigation-bar']//li[2]//button[1]")).click(); 
		Utility.takeSnapShot(driver, "Select Vehicle");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//li[3]//button[1]")).click();  
		Utility.takeSnapShot(driver, "Shopping Tools");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@class='main-navigation-bar']//li[4]//a[1]")).click();  
		Utility.takeSnapShot(driver, "dealers ");
		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[@class='main-navigation-bar']//li[5]//a[1]")).click();  
		Utility.takeSnapShot(driver, "Build & Price");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='main-navigation-bar']//li[6]//a[1]")).click();  
		Utility.takeSnapShot(driver, "Local Special");
		Thread.sleep(4000);
		
	     WebElement zipcode=driver.findElement(By.name("zipcode"));
		zipcode.sendKeys("12345");
		  Utility.takeSnapShot(driver, "Zipcode");
		  WebElement submit = driver.findElement(By.xpath("//button[@name='button']"));
		  submit.click();
		 
		
  }
}
