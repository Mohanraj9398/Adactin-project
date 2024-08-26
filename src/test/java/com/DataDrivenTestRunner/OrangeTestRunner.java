package com.DataDrivenTestRunner;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Utility.OrangeHRM;

public class OrangeTestRunner extends OrangeHRM {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String orangeUserName = orangePerticularData(1, 0);
		String orangePassword = orangePerticularData(1, 1);
		
		driver.findElement(By.name("username")).sendKeys(orangeUserName);
		driver.findElement(By.name("password")).sendKeys(orangePassword);
		
	}	
}
