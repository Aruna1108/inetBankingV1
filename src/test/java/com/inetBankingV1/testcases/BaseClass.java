package com.inetBankingV1.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL ="https://demo.guru99.com/V1/html/Managerhomepage.php";
	public String username = "mngr621298";
	public String password = "mYrEbYq";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	

}
