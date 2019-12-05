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
import com.training.pom.AllowAdminToAddProducts;
import com.training.pom.AllowAdminToDeleteMultiCatg;
import com.training.pom.AllowAdminToEditMetaTag;
import com.training.pom.AllowAdminToFilterTheProducts;
import com.training.pom.AllowAdminToReturunProductandDelete;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_081Allows_admin_to_Return_produc_and_delete {

	private WebDriver driver;
	private String baseUrl;
	private AllowAdminToReturunProductandDelete AllowAdminToReturunProductandDelete;
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
		AllowAdminToReturunProductandDelete = new AllowAdminToReturunProductandDelete(driver); 
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
		AllowAdminToReturunProductandDelete.sendUserName("admin");
		AllowAdminToReturunProductandDelete.sendPassword("admin@123");
		AllowAdminToReturunProductandDelete.clickLoginBtn(); 
		//Click on Login button
		AllowAdminToReturunProductandDelete.clickonCart();
		//Click on cart
		Thread.sleep(1000);
		AllowAdminToReturunProductandDelete.clickreturn();
		//Click on returns
		AllowAdminToReturunProductandDelete.Addnewbutton();
		//Click on Add new button
		AllowAdminToReturunProductandDelete.sendorderId("34");
		//Send order id
		AllowAdminToReturunProductandDelete.SendCustomer("Smriti");
		//Send customer
		AllowAdminToReturunProductandDelete.sendFirstName("Smriti");
		//Send first name
		AllowAdminToReturunProductandDelete.SendLastname("Irani");
		//Send last name
		AllowAdminToReturunProductandDelete.SendEmailId("smriti@gmail.com");
		//Send email id
		AllowAdminToReturunProductandDelete.SendeTelephone("9754356363");
		//Send Telephone number
		AllowAdminToReturunProductandDelete.SenProduct("T shirt");
		//Send product
		AllowAdminToReturunProductandDelete.SendModel("SH-002");
		//Send model
		AllowAdminToReturunProductandDelete.ClickonSave();
		//Click on save button
		AllowAdminToReturunProductandDelete.clickoncheckbox();
		//Click on check box
		AllowAdminToReturunProductandDelete.clickonDelete();
		//Click on delete
		Alert alertwindow= driver.switchTo().alert();
		alertwindow.accept();									
		System.out.println("Return Successfully added and Deleted");
		
	}
}

