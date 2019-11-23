package com.toyota;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selectvehicle extends Base {
  @Test
  public void selectvehicle () throws Exception {
	  driver.findElement(By.xpath("//div[@class='main-navigation-bar']//li[2]//button[1]")).click();  
		Utility.takeSnapShot(driver, "Select Vehicle");
		Thread.sleep(10000);
	
		driver.findElement(By.xpath("//button[contains(text(),'Cars & Minivan')]")).click();  
	
		Utility.takeSnapShot(driver, "Cars  & Minivan");
		Thread.sleep(10000);
		
		
	 driver.findElement(By.xpath("//li[1]//div[1]//ul[1]//li[1]//a[1]//div[1]//p[2]//sup[1]")).click();  
		Utility.takeSnapShot(driver, "Disclaimer");
		driver.findElement(By.xpath("//button[@class='btn-close circle']")).click();
		Thread.sleep(10000);
	

		driver.findElement(By.xpath("//button[contains(text(),'Trucks')]")).click();
		Utility.takeSnapShot(driver, "Trucks");			
		driver.findElement(By.xpath("//li[2]//div[1]//ul[1]//li[1]//a[1]//div[1]//p[4]//sup[1]")).click();
		Utility.takeSnapShot(driver, "Trucks Disclaimer");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='btn-close circle']")).click();
		Thread.sleep(10000);

		
		driver.findElement(By.xpath("//button[contains(text(),'Crossovers & SUVs')]")).click();
		Utility.takeSnapShot(driver, "Crossovers & SUVS");		
		driver.findElement(By.xpath("//li[3]//div[1]//ul[1]//li[1]//a[1]//div[1]//p[4]//sup[2]")).click();
		Utility.takeSnapShot(driver, "Disclaimer 43");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='btn-close circle']")).click();
		Thread.sleep(10000);

		
		driver.findElement(By.xpath("//button[contains(text(),'Hybrids & Fuel Cell')]")).click();
		Utility.takeSnapShot(driver,"Hybrids & Fuel Cell");		
		driver.findElement(By.xpath("//li[@class='js_slide active']//div[@class='slide-wrapper']//ul[@class='vehicles']//li//sup[@class='is-loaded'][contains(text(),'36')]")).click();
		Utility.takeSnapShot(driver,"Disclaimer 36");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='btn-close circle']")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[contains(text(),'Upcoming Vehicles')]")).click();
		Utility.takeSnapShot(driver,"upcoming vehicle");
		Thread.sleep(10000);


		Actions actions = new Actions(driver);
		WebElement viewmoreinfo = driver.findElement(By.xpath("//body[@class='default-marquee is-full-marquee-loaded']/div[@class='desktop-dropdown']/div[@class='dropdown-view-wrapper expanded']/div[@class='dropdown-view expanded']/div[@class='select-vehicle loaded']/div[@class='slider js_slider']/div[@class='frame js_frame']/ul[@class='series slides js_slides']/li[@class='js_slide active']/div[@class='slide-wrapper']/ul[@class='vehicles']/li[1]/div[1]/*[1]"));
		actions.moveToElement(viewmoreinfo).perform();
		Thread.sleep(10000);
		
		driver.findElement(By.partialLinkText("View More Info")).click();
		
		
		}
}
