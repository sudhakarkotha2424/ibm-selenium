package com.project.uniform.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Categorieslink;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_011VerifyCategorieslink {

	private WebDriver driver;
	private String baseUrl;
	private Categorieslink Categorieslink;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Categorieslink = new Categorieslink(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	//@AfterMethod
	//public void tearDown() throws Exception {
	//	Thread.sleep(1000);
	//	driver.quit();
	
	//}
	@Test
	public void validLoginTest() throws InterruptedException {
		Categorieslink.sendUserName("admin");
		Categorieslink.sendPassword("admin@123");
		Categorieslink.clickLoginBtn(); 
		Categorieslink.clicatLog();
		Thread.sleep(1000);
		Categorieslink.clicatger();
		Thread.sleep(1000);
		//Categorieslink.checkbx();
		//Categorieslink.deleterecd();
		//Alert alertwindow= driver.switchTo().alert();
		//alertwindow.accept();	
		
		screenShot.captureScreenShot("First");
	}
}

