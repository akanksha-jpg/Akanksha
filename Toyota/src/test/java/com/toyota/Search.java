package com.toyota;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Search extends Base{
  @Test
  public void search() throws Exception {
	  
	  WebElement search = driver.findElement(By.xpath("//button[@class='search has-icon-search']"));
	  search.click();
	  WebElement search1 = driver.findElement(By.name("keyword"));
	  search1.sendKeys("test");
	  Utility.takeSnapShot(driver, "Enter search");
	  
	  WebElement searchgo = driver.findElement(By.xpath("//button[@class='search-submit-btn visible']"));
	  searchgo.click();
	 
	
  }
}
