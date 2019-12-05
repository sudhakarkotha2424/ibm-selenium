package com.project.uniform.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
import com.training.pom.ProductDetailsGetDisplayedInHomeScreen;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_084Product_details_get_displayed_in_home_screen {

	private WebDriver driver;
	private String baseUrl;
	private ProductDetailsGetDisplayedInHomeScreen ProductDetailsGetDisplayedInHomeScreen;
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
		ProductDetailsGetDisplayedInHomeScreen = new ProductDetailsGetDisplayedInHomeScreen(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Chrom\\chromedriver_win32\\Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://uniformm1.upskills.in/");
	
	}
	
	//}
	@Test
	public void validLoginTest() throws InterruptedException {
		ProductDetailsGetDisplayedInHomeScreen.sendUserName("admin");
		ProductDetailsGetDisplayedInHomeScreen.sendPassword("admin@123");
		ProductDetailsGetDisplayedInHomeScreen.clickLoginBtn(); 
		//Click on Login button
		ProductDetailsGetDisplayedInHomeScreen.clicatLog();
		//Click on Category log
		Thread.sleep(1000);
		ProductDetailsGetDisplayedInHomeScreen.clickonProducts();
		//Click on Products
		ProductDetailsGetDisplayedInHomeScreen.clickonAddnew();
		//Click on Add new
		ProductDetailsGetDisplayedInHomeScreen.sendProductName("Shoe");
		//Send product name
		ProductDetailsGetDisplayedInHomeScreen.sendMetatitle("Shoe");
		//Send Meta title
		ProductDetailsGetDisplayedInHomeScreen.clickondatatab();
		//Click on data tab
		ProductDetailsGetDisplayedInHomeScreen.sendModel("SH-014");
		//Send Meta title
		ProductDetailsGetDisplayedInHomeScreen.sendPrice("1800");
		//Send Meta title
		ProductDetailsGetDisplayedInHomeScreen.sendQuantity("20");
		//Send Meta title
		ProductDetailsGetDisplayedInHomeScreen.clickonLinktab();
		//Click on Link tab
		ProductDetailsGetDisplayedInHomeScreen.clickonCateg();
		//Click on Category
		ProductDetailsGetDisplayedInHomeScreen.sendCategory("Sports");
		//Send Category
		ProductDetailsGetDisplayedInHomeScreen.ClickSave();
		//Click Save
		ProductDetailsGetDisplayedInHomeScreen.ClickonLogout();
		//Click Save
								
		System.out.println("Product Successfully Added");
		
	}
}

