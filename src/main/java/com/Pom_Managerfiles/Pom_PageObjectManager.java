package com.Pom_Managerfiles;

import com.AdactinBaseClass.AdactinBaseClass;
import com.AdactinPomClass.AdactinLoginPage;
import com.AdactinPomClass.AdactinSearchHotelPage;
import com.AdactinPomClass.AdactinSelectHotelPage;
import com.ReaderFile.AdactinConfigReader;

public class Pom_PageObjectManager extends AdactinBaseClass  {

	
	private AdactinLoginPage login;
	private AdactinConfigReader reader;
	private AdactinSearchHotelPage searchHotels;
	private AdactinSelectHotelPage selectHotel;
	
	
	public AdactinLoginPage getAdactinLoginpage() {
		
		if (login == null) {
			
			login = new AdactinLoginPage(driver);			
		}
		return login;
	}
	
	public AdactinConfigReader getConfigDataReader() {
		
		if (reader == null) {
			
			reader = new AdactinConfigReader();
		}
		return reader;	
	}
	
	public AdactinSearchHotelPage getSearchHotelData() {
		
		if (searchHotels == null) {
			
			searchHotels = new AdactinSearchHotelPage(driver);
		}
		return searchHotels;
	}
	
	public AdactinSelectHotelPage getadaAdactinSelectHotelPage() {
		
		if (selectHotel == null) {
			
			selectHotel = new AdactinSelectHotelPage(driver);
		}
		return selectHotel;
	}
	

}
	

