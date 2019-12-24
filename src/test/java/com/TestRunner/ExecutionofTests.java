package com.TestRunner;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.FrameWork_CommonMethods.Browser;
import com.TestCases.Udemy_Project;

public class ExecutionofTests extends Browser {
    @Test
	public static  void testexecution() throws InterruptedException{
		
		
		
		//Browser.getBrowser("Chrome");
         Browser br = new Browser();
                 br.getBrowser("Chrome");
                 Thread.sleep(5000);
                 
                 
               
          Udemy_Project ref = PageFactory.initElements(driver, Udemy_Project.class);         
                               ref.udemy_login();
                               System.out.println("Test");
                 
                 
	}

}
