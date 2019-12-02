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
import com.training.pom.DelCategorieslink;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_012DelCategorie {

	private WebDriver driver;
	private String baseUrl;
	private DelCategorieslink DelCategorieslink;
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
		DelCategorieslink = new DelCategorieslink(driver); 
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
		DelCategorieslink.sendUserName("admin");
		DelCategorieslink.sendPassword("admin@123");
		DelCategorieslink.clickLoginBtn(); 
		DelCategorieslink.clicatLog();
		Thread.sleep(1000);
		DelCategorieslink.clicatger();
		Thread.sleep(1000);
		DelCategorieslink.checkbx();
		DelCategorieslink.deleterecd();
		Alert alertwindow= driver.switchTo().alert();
		alertwindow.accept();	
		System.out.println("Category successfully deleted");
		screenShot.captureScreenShot("First");
	}
}

