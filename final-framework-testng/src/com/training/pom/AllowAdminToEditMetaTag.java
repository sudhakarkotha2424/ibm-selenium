package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllowAdminToEditMetaTag {
	private WebDriver driver; 
	
	public AllowAdminToEditMetaTag(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='text-right']//button[@type='submit']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//li[@id='catalog'] //a //i[@class='fa fa-tags fa-fw']")
	private WebElement clicatlg; 
	
	@FindBy(xpath="//a[contains(text(),'Categories')]")
	private WebElement clicat;
	
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	private WebElement cliedt;
		
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement title;
	
	@FindBy(id="input-meta-description1")
	private WebElement desc;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement clksav;
	

	
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
		this.clicatlg.click(); 
		
	}
		
	public void clicatger() {
		this.clicat.click(); 
		
	}
	public void Clickedit() {
		this.cliedt.click(); 
		
	}
	public void clicksave() {
		this.clksav.click(); 
		
	}
	public void sendtitle(String title) {
		this.title.clear(); 
		this.title.sendKeys(title); 
	}
	public void senddesc(String desc) {
		this.title.clear(); 
		this.title.sendKeys(desc); 
	}
}
