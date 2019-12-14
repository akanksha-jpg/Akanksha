package com.toyota;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Utilitynavigations extends Base  {
   
    public String firstWinHandle;
  public String secondWinHandle;
  @Test
  public void utilitynavigation() throws Exception{
		Set <String>handles = driver.getWindowHandles();//To handle multiple windows
		System.out.println("Parent window ids ");
	  
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
	Utility.takeSnapShot(driver, "zipcode overlay");

	Thread.sleep(2000);
	
	Robot robot =new Robot();
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				
	driver.findElement(By.xpath("//input[@placeholder='Zip Code']")).sendKeys("12345");
	Utility.takeSnapShot(driver, "Enter zipcode");

	 Thread.sleep(2000);
	 
	WebElement submit= driver.findElement(By.xpath("//button[@name='button']"));
			submit.click();		
			 Thread.sleep(2000);

	
	}}
	  
	  
  

