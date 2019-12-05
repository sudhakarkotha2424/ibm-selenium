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
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_042Allows_admin_to_Add_Products {

	private WebDriver driver;
	private String baseUrl;
	private AllowAdminToAddProducts AllowAdminToAddProducts;
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
		AllowAdminToAddProducts = new AllowAdminToAddProducts(driver); 
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
		AllowAdminToAddProducts.sendUserName("admin");
		AllowAdminToAddProducts.sendPassword("admin@123");
		AllowAdminToAddProducts.clickLoginBtn(); 
		//Click on Login button
		AllowAdminToAddProducts.clicatLog();
		//Click on Category log
		Thread.sleep(1000);
		AllowAdminToAddProducts.clickonProducts();
		//Click on Products
		AllowAdminToAddProducts.clickonAddnew();
		//Click on Add new
		AllowAdminToAddProducts.sendProductName("Shirt");
		//Send product name
		AllowAdminToAddProducts.sendMetatitle("Shirt for girls");
		//Send Meta title
		AllowAdminToAddProducts.clickondatatab();
		//Click on data tab
		AllowAdminToAddProducts.sendModel("SHG-010");
		//Send Meta title
		AllowAdminToAddProducts.sendPrice("750");
		//Send Meta title
		AllowAdminToAddProducts.sendQuantity("50");
		//Send Meta title
		AllowAdminToAddProducts.clickonLinktab();
		//Click on Link tab
		AllowAdminToAddProducts.clickonCateg();
		//Click on Category
		AllowAdminToAddProducts.sendCategory("Shirt");
		//Send Category
		AllowAdminToAddProducts.ClickSave();
		//Click Save
								
		System.out.println("Product Successfully Added");
		
	}
}

