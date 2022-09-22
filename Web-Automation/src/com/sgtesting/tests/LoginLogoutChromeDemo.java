package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutChromeDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		Launchbrowser();
		navigate() ;
		login() ;
		minimizeFlyoutwindow();
		logout() ;
		closeapplication();

	}
	
	private static void Launchbrowser() 
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void login() 
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//if no attributes than go for xpath
			Thread.sleep(5000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyoutwindow() 
	{
		try 
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout() 
	{
		try 
		{
			//oBrowser.findElement(By.linkText("Logout")).click();
			//oBrowser.findElement(By.id("logoutLink")).click();
			//oBrowser.findElement(By.className("logout")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		   
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
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
