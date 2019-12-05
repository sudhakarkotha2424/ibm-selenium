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
import com.training.pom.AllowAdminToEditMetaTag;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_039Allows_admin_to_Edit_Metatag {

	private WebDriver driver;
	private String baseUrl;
	private AllowAdminToEditMetaTag AllowAdminToEditMetaTag;
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
		AllowAdminToEditMetaTag = new AllowAdminToEditMetaTag(driver); 
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
		AllowAdminToEditMetaTag.sendUserName("admin");
		AllowAdminToEditMetaTag.sendPassword("admin@123");
		AllowAdminToEditMetaTag.clickLoginBtn(); 
		AllowAdminToEditMetaTag.clicatLog();
		Thread.sleep(1000);
		AllowAdminToEditMetaTag.clicatger();
		Thread.sleep(1000);
		AllowAdminToEditMetaTag.Clickedit();
		Thread.sleep(1000);
		AllowAdminToEditMetaTag.sendtitle("vlue BLZ 05");
		AllowAdminToEditMetaTag.senddesc("Uniform for students");
		AllowAdminToEditMetaTag.clicksave();
		//AllowAdminToEditMetaTag.checkbx();
		//AllowAdminToEditMetaTag.deleterecd();
		//Alert alertwindow= driver.switchTo().alert();
		//alertwindow.accept();	
		//System.out.println("Category successfully deleted");
		//screenShot.captureScreenShot("First");
	}
}

