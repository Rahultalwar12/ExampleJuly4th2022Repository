package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginlogoutfirefox {
    public static WebDriver oBrowser =null;
	public static void main(String[] args) {

		launchbrowser() ;
		navigate();
		login() ;
		TominimizeFlyoutwindow();
		logout();
		closeapplication();
		
	}
	
	private static void launchbrowser() 
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
			Thread.sleep(2000);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void login() 
	{
		try 
		{
			//oBrowser.findElement(By.name("username")).sendKeys("admin");
			//oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.className("textField")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]"
					+ "/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]"
					+ "/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
			
		}
	}
	
	
	private static void TominimizeFlyoutwindow() 
	{
		try 
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout() 
	{
		try 
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try 
		{
			oBrowser.quit();
			//oBrowser.close();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
