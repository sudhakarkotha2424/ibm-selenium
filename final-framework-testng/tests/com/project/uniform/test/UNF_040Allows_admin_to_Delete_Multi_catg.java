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
import com.training.pom.AllowAdminToDeleteMultiCatg;
import com.training.pom.AllowAdminToEditMetaTag;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_040Allows_admin_to_Delete_Multi_catg {

	private WebDriver driver;
	private String baseUrl;
	private AllowAdminToDeleteMultiCatg AllowAdminToDeleteMultiCatg;
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
		AllowAdminToDeleteMultiCatg = new AllowAdminToDeleteMultiCatg(driver); 
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
		AllowAdminToDeleteMultiCatg.sendUserName("admin");
		AllowAdminToDeleteMultiCatg.sendPassword("admin@123");
		AllowAdminToDeleteMultiCatg.clickLoginBtn(); 
		AllowAdminToDeleteMultiCatg.clicatLog();
		Thread.sleep(1000);
		AllowAdminToDeleteMultiCatg.clicatger();
		Thread.sleep(1000);
		AllowAdminToDeleteMultiCatg.checkbx();
		AllowAdminToDeleteMultiCatg.checkbox1();
		Thread.sleep(1000);//*[@id="form-category"]/div/table/tbody/tr[3]/td[1]/input
		AllowAdminToDeleteMultiCatg.deleterecd();
		Alert alertwindow= driver.switchTo().alert();
		alertwindow.accept();	
		System.out.println("Category successfully deleted");
		//screenShot.captureScreenShot("First");
	}
}

