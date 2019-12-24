package com.FrameWork_CommonMethods;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Web_Element_ScreenShot {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Sample_Project\\SampleProject_001\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		
	WebElement ele = driver.findElement(By.xpath("//*[@class='notice-streamer__headline']"));
	System.out.println(ele);
	
	TakesScreenshot ts = (TakesScreenshot)ele;
		  File Source  = ts.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy( Source, new File("./ScreenShots/logo.png"));
		  }

}
	