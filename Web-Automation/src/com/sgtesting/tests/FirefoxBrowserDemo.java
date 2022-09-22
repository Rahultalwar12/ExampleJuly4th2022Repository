package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class FirefoxBrowserDemo {
	
	public static WebDriver oBrowser=null; 
	public static void main(String[] args) {
		
		launchBrowser();
		navigate() ;
		closeApplication() ;
		
		
	}

	private static void launchBrowser() 
	{
		try 
		{
			System.setProperty("webdriver.gecko.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate() 
	{
		try 
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication() 
	{
		try 
		{
			oBrowser.close();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
