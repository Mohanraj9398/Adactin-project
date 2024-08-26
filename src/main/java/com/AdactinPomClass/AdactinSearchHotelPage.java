package com.AdactinPomClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.AdactinBaseClass.AdactinBaseClass;
import com.AdactinInterface.AdactinSearchHotelElements;
import com.Pom_Managerfiles.Pom_PageObjectManager;

public class AdactinSearchHotelPage extends AdactinBaseClass implements AdactinSearchHotelElements{
	
	Pom_PageObjectManager pm = new Pom_PageObjectManager();
	
	public static WebDriver SearchHotelDriver;
	
	@FindBy(id = location_id)
	private WebElement location;
	
	@FindBy(name = hotels_name)
	private WebElement hotels;
	
	@FindBy(id = roomType_id)
	private WebElement roomtype;
	
	@FindBy(name = numberOfRoom_name)
	private WebElement numberofroom;
	
	@FindBy(id = checkIn_id)
	private WebElement checkin;
	
	@FindBy(name = checkOut_name)
	private WebElement checkout;
	
	@FindBy(id = adults_id)
	private WebElement adults;
	
	@FindBy(name = children_name)
	private WebElement children;
	
	@FindBy(id = "Submit")
	private WebElement searchBtn;
	
	public AdactinSearchHotelPage(WebDriver driver) {
		
		SearchHotelDriver = driver;
		
		PageFactory.initElements(driver,this);
	}
	
	public void getSearchHotels() throws Exception {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		selectDropdown(location, "text", pm.getConfigDataReader().getLocation());
		selectDropdown(hotels, "text", pm.getConfigDataReader().getHotels());
		selectDropdown(roomtype, "text", pm.getConfigDataReader().getRoomType());
		selectDropdown(numberofroom, "text", pm.getConfigDataReader().getnoOfRooms());
		inputPassing(checkout, pm.getConfigDataReader().getChechInDate());
		inputPassing(checkout, pm.getConfigDataReader().getChechOutDate());
		selectDropdown(adults, "text", pm.getConfigDataReader().getAsPerAdultRoom());
		selectDropdown(children, "text", pm.getConfigDataReader().getChildrenPerRoom());
		clickOnElement(SearchHotelDriver, searchBtn);
		
			
		}
}
