package com.AdactinPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.AdactinBaseClass.AdactinBaseClass;
import com.AdactinInterface.AdactinLoginPageElements;
import com.Pom_Managerfiles.Pom_PageObjectManager;

public class AdactinLoginPage extends AdactinBaseClass implements AdactinLoginPageElements {
	
	Pom_PageObjectManager pm = new Pom_PageObjectManager();
	
	public static WebDriver adctinDriver;
	
	@FindBy(id = user_id )
	private WebElement username;
	
	@FindBy(name = password_name)
	private WebElement password;
	
	@FindBy(xpath = loginID_xpath)
	private WebElement loginBtn;
		
	public AdactinLoginPage(WebDriver driver) {
		
		adctinDriver = driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void getUserName() throws Exception {
		
		inputPassing(username, pm.getConfigDataReader().getUsername());
		
	}
	
	public void getPassword() throws Exception {
		
		inputPassing(password, pm.getConfigDataReader().getPassword());
	}
	
	public void getLoginBtn() {
		
		clickOnElement(adctinDriver, loginBtn);
	}	
		
}
