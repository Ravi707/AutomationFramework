package com.FrameWork_CommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
    public static WebDriver driver; 
	public  void  getBrowser(String browname)
	{
      try 
      {
    	  if (browname.equalsIgnoreCase("Chrome"))
    	  {
    	 System.setProperty("webdriver.chrome.driver","E:\\Sample_Project\\SampleProject_001\\Browsers\\chromedriver.exe");
    		  driver = new ChromeDriver();
    		  driver.manage().window().maximize();
    		  driver.get("https://www.udemy.com/");
    		  
    	  }
    	  
    		  else if (browname.equalsIgnoreCase("FireFox"))
    		  {
    			  System.setProperty("webdriver.gecko.driver","\\Sample_Project\\SampleProject_001\\Browsers\\geckodriver.exe");
        		  driver = new FirefoxDriver();
        		  driver.manage().window().maximize();
        		  driver.get("https://www.google.com/gmail/");
        		  
    		  }
    		  else if(browname.equalsIgnoreCase("IE"))
    		  {
    			  System.setProperty("webdriver.ie.driver","\\Sample_Project\\SampleProject_001\\Browsers\\IEDriverServer.exe");
        		  driver = new InternetExplorerDriver();
        		  driver.manage().window().maximize();
        		  driver.get("https://www.google.com/gmail/");
        		  
    		 }
    		  else
    		  {
    			System.out.println("go for opera");  
    		  }
      
      }
      catch (Exception ex)
      {
    	System.out.println(" get message");
      }
      
	}
	}
	
	
	
	 
      
       
    
       
      