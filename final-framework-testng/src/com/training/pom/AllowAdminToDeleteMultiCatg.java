package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllowAdminToDeleteMultiCatg {
	private WebDriver driver; 
	
	public AllowAdminToDeleteMultiCatg(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"form-category\"]/div/table/tbody/tr[4]/td[1]/input")
	private WebElement checkbox;
	@FindBy(xpath="//*[@id=\"form-category\"]/div/table/tbody/tr[5]/td[1]/input")
	private WebElement checkbox1;
	
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
	public void checkbox1() {
		this.checkbox1.click(); 
		
	}
	public void checkbx() {
		this.checkbox.click(); 
		
	}
	public void deleterecd() {
		this.delete.click(); 
		
	}
}
