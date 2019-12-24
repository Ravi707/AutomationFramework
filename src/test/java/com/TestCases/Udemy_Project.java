package com.TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FrameWork_CommonMethods.Browser;

public class Udemy_Project extends Browser {

	/*Author: Ravi
	 *Date  :12/21/2019 
*Description:Gmail login web objects  
	 */
	//public  WebDriver driver;
	@FindBy(xpath= "//button[@class='btn btn-quaternary']")public static WebElement LogIn;
	@FindBy(xpath= "//*[@class='loginbox-v4__content']//div[2]/a")public static WebElement congoogle;
	@FindBy(xpath=" //input[@id='identifierId']")public static WebElement uid;
	@FindBy(xpath="//*[@id='identifierNext']/span")public static WebElement Next;
	@FindBy(xpath=" //input[@name='password']")public static WebElement password;
	@FindBy(xpath="//*[@id='passwordNext']/span")public static WebElement Next1;
	
	
	//=============================================================================>--->
	public  void udemy_login() throws InterruptedException
	{
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	  		LogIn.click();
		Thread.sleep(5000);
		congoogle.click();
		Thread.sleep(5000);
		Set<String> ids = driver.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String ParentID	 = it.next();
	        String ChildID  = it.next();
	        driver.switchTo().window(ChildID);
	        System.out.println(driver.getTitle());
	        Thread.sleep(3000);
		uid.sendKeys("selenium.java143@gmail.com");
		Next.click();
	    Thread.sleep(3000);
	    password.sendKeys("java@143");
	    Next1.click();
	  
	
	}  
	
	
	
	
}
