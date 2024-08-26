package com.AdactinPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.AdactinBaseClass.AdactinBaseClass;
import com.AdactinInterface.AdactinSelectHotelElements;
import com.Pom_Managerfiles.Pom_PageObjectManager;

public class AdactinSelectHotelPage extends AdactinBaseClass implements AdactinSelectHotelElements {
	
	Pom_PageObjectManager pm = new Pom_PageObjectManager();
	
	public static WebDriver SelectHotelDriver;
	
	@FindBy(id = radioBtn_id)
	private WebElement radioBtn;
	
	@FindBy(id = continueBtn_id)
	private WebElement continueBtn;
	
	
	public  AdactinSelectHotelPage(WebDriver driver) {
		
		SelectHotelDriver = driver;
		
		PageFactory.initElements(driver,this);
	}
	
	public void getSelectHotel() {
		
		clickOnElement(SelectHotelDriver, radioBtn);
		clickOnElement(SelectHotelDriver, continueBtn);
		
	}

}
