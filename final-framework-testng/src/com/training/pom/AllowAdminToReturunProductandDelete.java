package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllowAdminToReturunProductandDelete {
	private WebDriver driver; 
	
	public AllowAdminToReturunProductandDelete(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username") 	private WebElement userName; 
	@FindBy(id="input-password") 	private WebElement password;
	@FindBy(xpath="//div[@class='text-right']//button[@type='submit']") 	private WebElement loginBtn; 
	@FindBy(xpath="//*[@id=\"sale\"]/a/i") 	private WebElement clickonCart;
	//click on shopping cart
	@FindBy(xpath="//*[@id=\"sale\"]/ul/li[3]/a") 	private WebElement clickonreturn;
	//click on Return
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a/i") 	private WebElement Addnew;
	// Click on AddNew
	@FindBy(id="input-order-id") 	private WebElement SendOrderid;
	// Send Order Id
	@FindBy(id="input-customer") 	private WebElement SendCustomer;
	// Send Customer
	@FindBy(id="input-firstname") 	private WebElement Sendfirstname;
	// Send first name
	@FindBy(id="input-lastname") 	private WebElement Sendlastname;
	// Send last name
	@FindBy(id="input-email") 	private WebElement Sendemail;
	// Send email
	@FindBy(id="input-telephone") 	private WebElement Sendetelephone;
	// Send email
	@FindBy(id="input-product") 	private WebElement Senproduct;
	// Send product
	@FindBy(id="input-model") 	private WebElement Senmodel;
	// Send model
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button/i") 	private WebElement clickonsave;
	// Click on save
	@FindBy(xpath="//*[@id=\"form-return\"]/div/table/tbody/tr[1]/td[1]/input") 	private WebElement checkbox;
	// Click on check box
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button/i") 	private WebElement clickondelete;
	// Click on check box
	
		
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void clickonCart() {
		this.clickonCart.click(); 
		
	}
		
	public void clickreturn() {
		this.clickonreturn.click(); 
		
	}
	
	public void Addnewbutton() {
		this.Addnew.click(); 
		
	}
	
	public void sendorderId(String SendOrderid) {
		this.SendOrderid.clear(); 
		this.SendOrderid.sendKeys(SendOrderid); 
	}
	
	
	public void SendCustomer(String SendCustomer) {
		this.SendCustomer.clear(); 
		this.SendCustomer.sendKeys(SendCustomer); 
	}
	
	public void sendFirstName(String Sendfirstname) {
		this.Sendfirstname.clear(); 
		this.Sendfirstname.sendKeys(Sendfirstname); 
	}
	public void SendLastname(String Sendlastname) {
		this.Sendlastname.clear(); 
		this.Sendlastname.sendKeys(Sendlastname); 
	}
	public void SendEmailId(String Sendemail) {
		this.Sendemail.clear(); 
		this.Sendemail.sendKeys(Sendemail); 
	}
	public void SendeTelephone(String Sendetelephone) {
		this.Sendetelephone.clear(); 
		this.Sendetelephone.sendKeys(Sendetelephone); 
	}
	public void SenProduct(String Senproduct) {
		this.Senproduct.clear(); 
		this.Senproduct.sendKeys(Senproduct); 
	}
	public void SendModel(String Senmodel) {
		this.Senmodel.clear(); 
		this.Senmodel.sendKeys(Senmodel); 
	}
	public void ClickonSave() {
		this.clickonsave.click();
}	
	public void clickoncheckbox() {
		this.checkbox.click(); 
	}
	public void clickonDelete() {
		this.clickondelete.click(); 
	}
}
