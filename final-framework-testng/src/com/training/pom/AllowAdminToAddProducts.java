package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllowAdminToAddProducts {
	private WebDriver driver; 
	
	public AllowAdminToAddProducts(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='text-right']//button[@type='submit']")
	private WebElement loginBtn; 
		
	@FindBy(xpath="//li[@id='catalog'] //a //i[@class='fa fa-tags fa-fw']") 	private WebElement clicakoncatlog;
	//click on catalog
	@FindBy(xpath="//a[contains(text(),'Products')]") 	private WebElement clickonProducts;
	//click on product
	@FindBy(xpath="//i[@class='fa fa-plus']") 	private WebElement clickonAddnew;
	//click on Add new
	@FindBy(id="input-name1") 	private WebElement Prodname;
	// Send product name
	
	@FindBy(id="input-meta-title1") 	private WebElement metatitle;
	// Send product name
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[2]/a") 	private WebElement clickondatatab;
	//click on data tab
	@FindBy(id="input-model") 	private WebElement Model;
	// Send Model
	@FindBy(id="input-price") 	private WebElement price;
	// Send Price
	@FindBy(id="input-quantity") 	private WebElement quantity;
	// Send Quantity
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[3]/a") 	private WebElement Linktab;
	//click on link tab
	@FindBy(id="input-category") 	private WebElement ClickonCateg;
	//click on Category
	@FindBy(id="input-category") 	private WebElement Category;
	//Send Category
	@FindBy( css = ".fa-save") 	private WebElement SaveBTN;
	//Click on Save button 
	
	
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
		
	public void clickonAddnew() {
		this.clickonAddnew.click(); 
		
	}
	public void sendProductName(String Prodname) {
		this.Prodname.clear(); 
		this.Prodname.sendKeys(Prodname); 
	}
	public void sendMetatitle(String metatitle) {
		this.metatitle.clear(); 
		this.metatitle.sendKeys(metatitle); 
	}
	public void clickondatatab() {
		this.clickondatatab.click(); 
		
	}
	public void sendModel(String Model) {
		this.Model.clear(); 
		this.Model.sendKeys(Model); 
	}
	
	public void sendPrice(String price) {
		this.price.clear(); 
		this.price.sendKeys(price); 
	}
	
	public void sendQuantity(String quantity) {
		this.quantity.clear(); 
		this.quantity.sendKeys(quantity); 
	}
	public void clickonLinktab() {
		this.Linktab.click(); 
		
	}
	public void clickonCateg() {
		this.ClickonCateg.click(); 
		
	}
		
		public void sendCategory(String Category) {
			this.Category.clear(); 
			this.Category.sendKeys(Category); 
		}
	
	public void ClickSave() {
		this.SaveBTN.click(); 
		
	}
	
}
