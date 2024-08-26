package AdactinRunnerClass;

import com.AdactinBaseClass.AdactinBaseClass;
import com.Pom_Managerfiles.Pom_PageObjectManager;


public class AadtiRunnerClass extends AdactinBaseClass {

	public static void main(String[] args) throws Exception {
		
		Pom_PageObjectManager pm = new Pom_PageObjectManager();
		
		
		browserLaunch(pm.getConfigDataReader().getbrowsername());
		
		launchingUrl(driver, pm.getConfigDataReader().getUrl());
		
		pm.getAdactinLoginpage().getUserName();
		pm.getAdactinLoginpage().getPassword();
		pm.getAdactinLoginpage().getLoginBtn();
		pm.getSearchHotelData().getSearchHotels();
		pm.getadaAdactinSelectHotelPage().getSelectHotel();
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
//		browserLaunch("chrome");

//		launchingUrl("https://www.adactinhotelapp.com/index.php");

//		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
//		username.sendKeys("malikbhai");
//
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("basha123");
//
//		navigate_Refresh();
//
//		navigate_Back();
//
//		navigate_Forward();
//
//		navigate_To("https://letcode.in/alert");
//
//		ScreenShot();
//
//		WebElement simpleElement = driver.findElement(By.xpath("//button[@id='accept']"));
//		simpleAlert(driver, simpleElement);
//
//		WebElement confirmElement = driver.findElement(By.xpath("//button[@id='confirm']"));
//		confirmAlert(driver, confirmElement);
//
//		WebElement promptElement = driver.findElement(By.xpath("//button[@id='prompt']"));
//		promptAlert(driver, promptElement, "MalikBasha");
//
//		windowHandle(driver, 3);
//
//		keyboardAction(null);
//
//		gettitle();
//
//		navigate_To("https://www.instagram.com");
//
////		fullScreenshot();
//
//		implicitWait(driver, 10);
//
//		WebElement enable = driver.findElement(By.xpath("//*[@id='loginForm']//div/div[3]"));
//		is_enabled(enable);
//
//		currentUrl();
//
//		javaScriptScrollFunction(0, 400);
//
//		quit();
//
//		// ScreenShot();
//
//		// fullScreenshot();

	}

}


