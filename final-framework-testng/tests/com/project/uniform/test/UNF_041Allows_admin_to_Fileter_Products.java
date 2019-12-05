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
import com.training.pom.AllowAdminToFilterTheProducts;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_041Allows_admin_to_Fileter_Products {

	private WebDriver driver;
	private String baseUrl;
	private AllowAdminToFilterTheProducts AllowAdminToFilterTheProducts;
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
		AllowAdminToFilterTheProducts = new AllowAdminToFilterTheProducts(driver); 
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
		AllowAdminToFilterTheProducts.sendUserName("admin");
		AllowAdminToFilterTheProducts.sendPassword("admin@123");
		AllowAdminToFilterTheProducts.clickLoginBtn(); 
		//Click on Login button
		AllowAdminToFilterTheProducts.clicatLog();
		//Click on Category log
		Thread.sleep(1000);
		AllowAdminToFilterTheProducts.clickonProducts();
		//Click on Products
		AllowAdminToFilterTheProducts.sendProductText("Blazer");
		//send product text
		AllowAdminToFilterTheProducts.clickonfilterBtn();
		//click on filter button
		AllowAdminToFilterTheProducts.sendprice("24.0000");
		//send product price
		AllowAdminToFilterTheProducts.clickonfilterBtn();
		//click on filter button
		AllowAdminToFilterTheProducts.selectstatus();
		//send product status
		AllowAdminToFilterTheProducts.clickonfilterBtn();
		//click on filter button
		AllowAdminToFilterTheProducts.sendModel("fsdfsdfds");
		//send product Model
		AllowAdminToFilterTheProducts.clickonfilterBtn();
		//click on filter button
		AllowAdminToFilterTheProducts.sendquantity("20");
		//send product Quantity
		AllowAdminToFilterTheProducts.clickonfilterBtn();
		//click on filter button
		Thread.sleep(1000);
		System.out.println("Filter Test Succussfully executed ");
		
	}
}

