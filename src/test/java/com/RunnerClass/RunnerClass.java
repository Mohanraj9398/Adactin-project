package com.RunnerClass;


import java.io.IOException;
import com.Baseclass.BaseClass;
import com.Pom.AdminPagePom;
import com.ReaderFile.ConfigReader;

public class RunnerClass extends BaseClass{

		public static void main(String[] args) throws IOException {
			
			ConfigReader cs = new ConfigReader();
			
			browserLaunch(cs.getBrowser());
			
			launchingUrl(driver, cs.getUrl());
			
			
			AdminPagePom ad = new AdminPagePom(driver);
			ad.getEmail();
			ad.getPassword();

//			browserLaunch("chrome");
//
//			WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
//			username.sendKeys("Mohan");
//
//			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//			password.sendKeys("Mohan55");
//
//			navigate_Refresh();
//
//			navigate_Back();
//
//			navigate_Forward();
//
//			navigate_To("https://letcode.in/alert");
//
//			ScreenShot();
//
//			WebElement simpleElement = driver.findElement(By.xpath("//button[@id='accept']"));
//			simpleAlert(driver, simpleElement);
//
//			WebElement confirmElement = driver.findElement(By.xpath("//button[@id='confirm']"));
//			confirmAlert(driver, confirmElement);
//
//			WebElement promptElement = driver.findElement(By.xpath("//button[@id='prompt']"));
//			promptAlert(driver, promptElement, "Mohan");
//
//			windowHandle(driver, 3);
//
//			keyboardAction(null);
//
//			gettitle();
//
//			navigate_To("https://www.instagram.com");
//
////			fullScreenshot();
//
//			implicitWait(driver, 10);
//
//			WebElement enable = driver.findElement(By.xpath("//*[@id='loginForm']//div/div[3]"));
//			is_enabled(enable);
//
//			currentUrl();
//
//			javaScriptScrollFunction(0, 400);
//
//			quit();
//
//			// ScreenShot();
//
//			// fullScreenshot();

		}

	}

