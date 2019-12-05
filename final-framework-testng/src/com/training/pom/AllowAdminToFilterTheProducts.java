package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllowAdminToFilterTheProducts {
	private WebDriver driver; 
	
	public AllowAdminToFilterTheProducts(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username") 	private WebElement userName; 
	@FindBy(id="input-password") 	private WebElement password;
	@FindBy(xpath="//div[@class='text-right']//button[@type='submit']") 	private WebElement loginBtn; 
	@FindBy(xpath="//li[@id='catalog'] //a //i[@class='fa fa-tags fa-fw']") 	private WebElement clicakoncatlog;
	//click on catalog
	@FindBy(xpath="//a[contains(text(),'Products')]") 	private WebElement clickonProducts;
	//click on product
	@FindBy(xpath="//input[@id='input-name']") 	private WebElement ProductText;
	// Send product text
	@FindBy(xpath="//input[@id='input-price']") 	private WebElement price;
	// Send product price
	@FindBy(id="input-model") 	private WebElement ProduModel;
	// Send product model
	@FindBy(id="input-quantity") 	private WebElement Produquantity;
	// Send product quantity
	@FindBy(xpath="//select[@id='input-status'] /option[2]") 	private WebElement Produstatus;
	// Send product status
	@FindBy(id="button-filter") 	private WebElement ClickFilterBtn;
	// Click on filter button
	
	
	
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

	public void clicatLog() {
		this.clicakoncatlog.click(); 
		
	}
		
	public void clickonProducts() {
		this.clickonProducts.click(); 
		
	}
	
	public void sendProductText(String ProductText) {
		this.ProductText.clear(); 
		this.ProductText.sendKeys(ProductText); 
	}
	
	
	public void sendprice(String price) {
		this.price.clear(); 
		this.price.sendKeys(price); 
	}
	
	public void sendquantity(String Produquantity) {
		this.Produquantity.clear(); 
		this.Produquantity.sendKeys(Produquantity); 
	}
	public void sendModel(String ProduModel) {
		this.ProduModel.clear(); 
		this.ProduModel.sendKeys(ProduModel); 
	}
		
	public void selectstatus() {
		this.Produstatus.click();
}
	
	public void clickonfilterBtn() {
		this.ClickFilterBtn.click(); 
	}
}
