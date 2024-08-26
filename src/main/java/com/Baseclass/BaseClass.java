package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;

	// BrowserLaunch
	protected static WebDriver browserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();

		return driver;
	}

	// url

	protected static void launchingUrl(WebDriver driver,String urlLink) {
		
		driver.get(urlLink);

	}
	
	//Clear
	protected static void clearInputs(WebDriver driver,WebElement elements) {
		
		elements.clear();
		
	}
	
	
	
	//navigateBack
	protected static void navigate_Back() {

		driver.navigate().back();
	}

	//navigateForward
	protected static void navigate_Forward() {

		driver.navigate().forward();

	}

	//navigateRefresh
	protected static void navigate_Refresh() {

		driver.navigate().refresh();

	}

	//navigateTo
	protected static void navigate_To(String url) {

		driver.navigate().to(url);

	}
	
	//alert
	protected static void simpleAlert(WebDriver driver, WebElement element) {
		element.click();
		driver.switchTo().alert().accept();
		
	}
	
	protected static void promptAlert(WebDriver driver, WebElement element, String value) {
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().accept();
		
	}
	
	protected static void confirmAlert(WebDriver driver, WebElement element) {
		element.click();
		driver.switchTo().alert().accept();
		
	}
	
	//frame
	protected static void frame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);

	}

	protected static void default_Content() {

		driver.switchTo().defaultContent();
	}
	
	//actions
	protected static void action(WebDriver driver, WebElement element, String actionName) {

		Actions action = new Actions(driver);

		if (actionName.equalsIgnoreCase("contextclick")) {

			action.contextClick(element).build().perform();

		} else if (actionName.equalsIgnoreCase("click")) {

			action.click(element).build().perform();

		} else if (actionName.equalsIgnoreCase("doubleclick")) {

			action.doubleClick(element).build().perform();

		} else if (actionName.equalsIgnoreCase("moveToElement")) {

			action.moveToElement(element).build().perform();

		}
	}
		
	//robot
		protected static void keyboardAction(String type) {
			try {
				Robot key = new Robot();
				key.keyPress(KeyEvent.VK_DOWN);
				key.keyRelease(KeyEvent.VK_DOWN);
				key.keyPress(KeyEvent.VK_ENTER);
				key.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				e.printStackTrace();
			}
			}
		
		//windowsHandler
		protected static void windowHandle(WebDriver driver, int i) {
			
			List<String> list = new ArrayList<>(driver.getWindowHandles());
			
			driver.switchTo().window(list.get(i));

		}
			
		//isDisplayed
		protected static boolean is_diplayed(WebElement element) {

				boolean displayed = element.isDisplayed();

				return displayed;

			}
		
       //isEnabled
		protected static boolean is_enabled(WebElement element) {

				boolean enabled = element.isEnabled();

				return enabled;
			}
			
		//isSelected
		protected static void isSelected(WebElement element) {

				System.out.println("Element is selected: " + element.isSelected());

			}
			
		//getTitle	
			protected static void gettitle() {

				String title = driver.getTitle();
				System.out.println("Title is :" + title);

			}
			
        //getCurrenturl
			protected static void currentUrl() {

				String currentUrl = driver.getCurrentUrl();

				System.out.println("Current Url is :" + currentUrl);

			}
			
		//getText
			protected static void getText(WebElement element) {

				System.out.println(element.getText());

			}
			
		//getAttribute
			protected static void getAttribute(WebElement element, String value) {

				System.out.println(element.getAttribute(value));

			}
		
		//implicitWait
			protected static void implicitWait(WebDriver driver, long seconds) {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

			}
			
        //explicitWait
			protected static void explicit_wait(WebDriver driver, WebElement element, String value, Duration seconds ) {

				WebDriverWait wait = new WebDriverWait(driver, seconds);

				if (value.equalsIgnoreCase("alert accept")) {

					wait.until(ExpectedConditions.alertIsPresent()).accept();

				} else if (value.equalsIgnoreCase("alert dismiss")) {

					wait.until(ExpectedConditions.alertIsPresent()).dismiss();

				} else if (value.equalsIgnoreCase("visibility")) {

					wait.until(ExpectedConditions.visibilityOf(element)).click();

				} else if (value.equalsIgnoreCase("all visibility")) {

					wait.until(ExpectedConditions.visibilityOfAllElements(element));

				} else if (value.equalsIgnoreCase("clickable")) {

					wait.until(ExpectedConditions.elementToBeClickable(element)).click();
				}
			
			}
			
		//Screenshot
			protected static void ScreenShot() {
				TakesScreenshot ts = (TakesScreenshot)driver;
				
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				String path = "C:\\Users\\91733\\eclipse-new\\Ipt\\Screenshots\\Amazon.png";
				
				File dest = new File(path);
				
				try {
					FileHandler.copy(source, dest);
				} catch (IOException e) {
					e.printStackTrace();
					
				}
			}
				
		//quit
				protected static void quit() {
					
					driver.quit();
				
			}
				
		//click
				protected static void clickOnElement(WebDriver driver,WebElement element) {

					element.click();
			
			}
				
		//sendKeys
				protected static void inputPassing(WebDriver driver, WebElement element, String value) {
					
					element.sendKeys(value);

				}
				
		//close
				protected static void closeBrowser(WebDriver driver, WebElement element) {
					
					driver.close();

				}
				
		//javaScriptClick
				
				protected static void javaScriptClick(WebDriver driver, WebElement element) {

					JavascriptExecutor js = (JavascriptExecutor) driver;

					js.executeScript("arguments[0].click();", element);
	
				}
		//JavaScriptScrollIntoView		
				
				protected static void javaScriptScroll(WebDriver driver, WebElement element) {

					JavascriptExecutor js = (JavascriptExecutor) driver;

					js.executeScript("arguments[0].scrollIntoView();", element);
				}
				
				
		//JavaScriptScrollFun
				
				protected static void javaScriptScrollFunction(int x, int y) {

					JavascriptExecutor js = (JavascriptExecutor) driver;

					js.executeScript("window.scrollBy(" + x + " , " + y + ")");
					
				}
	
				
				
//			//fullScreeshot	
//				protected static void fullScreenshot(){
//					
//					Screensh take = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//					Screenshot take = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//					try {
//						ImageIO.write(take.getImage(), "PNG", new File(System.getProperty("user.dir") + "\\Screenshots\\Amazonfull.png"));
//					} catch (IOException e) {
//						
//						e.printStackTrace();
//					}
//					
//				}
//				


	}
	
	
	
	
	
	

