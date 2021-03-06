package com.qa.TestBase;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.Testutil;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

public TestBase() {
	FileInputStream propfile;
	prop = new Properties();
	try {

		propfile = new FileInputStream("C:\\Users\\nazee\\eclipse\\RESTAPI\\Makemytrip\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(propfile);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {

		e.printStackTrace();
	}
}


	public static void browser_initialization() {
		String browserName =prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
				
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}



	}


	

	
	