package com.Pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Baseclass.BaseClass;
import com.ReaderFile.ConfigReader;

public class AdminPagePom extends BaseClass {
	
	public WebDriver AdminPageDriver;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']" )
	private WebElement loginBtn;
		
	public AdminPagePom(WebDriver driver) {
		
		AdminPageDriver = driver;
		
		PageFactory.initElements(driver,this);
	}
	
	public void getEmail() throws IOException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		ConfigReader cs = new ConfigReader();
		
		clearInputs(AdminPageDriver,email);
		
		inputPassing(AdminPageDriver, email, cs.getEmail());
		
	}
		
	public void getPassword() throws IOException {
		
		ConfigReader cs = new ConfigReader();
		
		clearInputs(AdminPageDriver,password);
		
		inputPassing(AdminPageDriver, password, cs.getPassword() );
		
	}
	
	public void getLoginBtn() throws IOException {
		
		clickOnElement(AdminPageDriver, loginBtn);
	}
}
	