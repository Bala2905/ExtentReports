package clearwater;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Wrapper {
	public static WebDriver driver;
	String strng = null;
	 String part = null;
	 String product = null;
	 String text = null;
	 String trimtext = null;
	 String text1=null;
	 String refvalue = null;
	 String actvalue = null;
	 String a =null;
	 String p =null;
	 String name = null;
	 String title =null;
	 String time = null;
	public static Dimension Size;
	static String URL="https://software.clearwatercompliance.com/"; 
	
	
	
	
	public void Openbrowser() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Bala\\eclipse-workspace\\CW\\Drivers\\chromedriver(1).exe");
//		  ChromeOptions options = new ChromeOptions();
//	    options.addArguments("--start-maximized");
	    driver = new ChromeDriver();
	    Thread.sleep(10000);
	    driver.get(URL);  
	   }
	 String browser=null;
	   private boolean acceptNextAlert = true;
	 public boolean isAlertPresent() {
	     try {
	       driver.switchTo().alert();
	       return true;
	     } catch (NoAlertPresentException e) {
	       return false;
	     }
	   }
	
	
	public void mouseHoverByXpath(String xpath) {
		try {
			Actions mouseAction = new Actions(driver);
			WebElement we = driver.findElement(By.xpath(xpath));
			mouseAction.moveToElement(we).build().perform();
			System.out.println("The xpath:"+xpath+" is moused over successfully");

		} catch (Exception e) {
//			 TODO Auto-generated catch block
//			e.printStackTrace();
		}
	   }
	
	public void clickByXpath(String xpath) {
		try {
			//driver.findElement(By.xpath("//*[@id=\'signIn\']")).click();
			//driver.findElement(By.xpath("\"//form/a\"")).click();

			driver.findElement(By.xpath(xpath)).click();
		 } catch (NoSuchElementException expType) {

			expType.printStackTrace();

		} catch (NotFoundException expType) {

			expType.printStackTrace();
		} catch (WebDriverException expType) {

			expType.printStackTrace();
		} catch (Exception expType) {

			expType.printStackTrace();
		}
	}
	}
	
	

