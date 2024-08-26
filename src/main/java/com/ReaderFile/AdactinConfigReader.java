package com.ReaderFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AdactinConfigReader {
	
	Properties pr;
	FileInputStream fs;
	
	public Properties getAdactinData() throws Exception {
		
		File file = new File
		("C:\\Users\\Administrator\\eclipse-workspace\\AugestIPTProject\\src\\main\\java\\com\\configProperties\\Adactin.properties");
		
		try {
			fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		pr = new Properties();
		
		pr.load(fs);
		
		return pr;
	}
		
	public String getbrowsername() throws Exception {
		
		String browsername = getAdactinData().getProperty("browser");
		return browsername;
	}
	
	public String getUrl() throws Exception {
		
		String Url = getAdactinData().getProperty("Url");
		return Url;
	}

	public String getUsername() throws Exception {
	
	String username = getAdactinData().getProperty("username");
	return username;
	}

	public String getPassword() throws Exception {
	
	String password = getAdactinData().getProperty("password");
	return password;
	}
	
	public String getLocation() throws Exception {
			
	String locations = getAdactinData().getProperty("location");
	return locations;
	}
	
	public String getHotels() throws Exception {
		
		String hotels = getAdactinData().getProperty("hotel");
		return hotels;
		}
	
	public String getRoomType() throws Exception {
		
		String roomtype = getAdactinData().getProperty("roomtype");
		return roomtype;
		}
	
	public String getnoOfRooms() throws Exception {
		
		String noOfRoom = getAdactinData().getProperty("noOfRooms");
		return noOfRoom;
		}
	
	public String getChechInDate() throws Exception {
		
		String checkIndate = getAdactinData().getProperty("checkindate");
		return checkIndate;
		}
	public String getChechOutDate() throws Exception {
		
		String checkOutdate = getAdactinData().getProperty("checkoutdate");
		return checkOutdate;
		}
	public String getAsPerAdultRoom() throws Exception {
		
		String asPerAdultRoom = getAdactinData().getProperty("asperAdultRoom");
		return asPerAdultRoom;
		}
	
	public String getChildrenPerRoom() throws Exception {
		
		String asPerChildren = getAdactinData().getProperty("childrenPerRoom");
		return asPerChildren;
		
	}
	
	
	
//	public String getCheckInData() throws Exception {
//		
//		String checkindate = getAdactinData().getProperty("checkindate");
//		return checkindate;
//	}
//	
//	public String getCheckOutData() throws Exception {
//		
//		String checkout = getAdactinData().getProperty("checkoutdate");
//		return checkout;
//	}

}
