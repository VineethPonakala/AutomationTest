package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
   
		 WebDriver driver = new ChromeDriver();//RTP
			
	     driver.get("https://www.amazon.in/");
	
         driver.manage().window().maximize();
	
	     System.out.println(driver.getTitle());

	     System.out.println(driver.getCurrentUrl());
	     
	     WebElement alldropdown =  driver.findElement(By.id("searchDropdownBox"));
	     
	     Select sel = new Select(alldropdown);
	     
	     List<WebElement> li = sel.getOptions();
	     
	     System.out.println(li.size());
	     
	     for(int i=0; i<li.size(); i++) {
	    	 
	    	 li.get(i).click();
	    	 
	    	 System.out.println(li.get(i).getText());
	     }
         
	}

}
