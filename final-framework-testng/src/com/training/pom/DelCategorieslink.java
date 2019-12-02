package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelCategorieslink {
	private WebDriver driver; 
	
	public DelCategorieslink(WebDriver driver) {
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
	
	@FindBy(xpath="//input[@name='selected[]'] [@value='521']")
	private WebElement checkbox;
	
	@FindBy(xpath="//i[@class='fa fa-trash-o']")
	private WebElement delete;

	
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
	public void checkbx() {
		this.checkbox.click(); 
		
	}
	public void deleterecd() {
		this.delete.click(); 
		
	}
}
