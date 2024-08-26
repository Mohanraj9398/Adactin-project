package com.DataDrivenTestRunner;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Utility.ReadExcelData;


 public class DataDrivenTestRunner extends ReadExcelData {
	 
	 public static void main(String[] args) throws InvalidFormatException, IOException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		 String uername = raedParticularCell(1, 0);
		 String password = raedParticularCell(1, 1);
		 
		 driver.findElement(By.id("email")).sendKeys(uername);
		 driver.findElement(By.id("pass")).sendKeys(password);
		
	}
}
