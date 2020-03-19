package clearwater;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Mandrin.extentmanager;


public class Assetname {

	
	public ExtentReports eReport = extentmanager.getInstance();
	public ExtentTest eTest = null;
	
	
	
	public WebDriver driver=null;
	
	
	String browser=null; 
//	public static WebDriver driver;
//	String browser=null; 
	static String URL="https://software.clearwatercompliance.com/"; 
	
		
@Test(priority=1)  
public void Openbrowser() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Bala\\eclipse-workspace\\CW\\Drivers\\chromedriver(1).exe");
	  eTest = eReport.startTest("LaunchBrowser");
  ChromeOptions options = new ChromeOptions();
  eTest.log(LogStatus.INFO, "Browser got maximized");
  options.addArguments("--start-maximized");
//    options.addArguments("--start-maximized");
    driver = new ChromeDriver( options );
    Thread.sleep(10000);
    eTest.log(LogStatus.INFO, "URL is opened in the Chrome browser");
    driver.get(URL);  
        
 }
	
@Test(priority=2)
public void AfterLogin() throws InterruptedException {
	 Thread.sleep(5000);
	  eTest = eReport.startTest("After Login");
	 eTest.log(LogStatus.INFO, "Login Username & Password");
	driver.findElement(By.xpath("//*[@id=\'lEmail\']")).sendKeys("balasubramaniam.b@sybrant.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\'lPass\']")).sendKeys("Vintage@234");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\'signIn\']")).click();
	
			}
@Test(priority=3)
public void Asset() throws InterruptedException {
	  eTest = eReport.startTest("Asset");
	eTest.log(LogStatus.INFO, "Asset Inventory List");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id='sidebar-left']/ul/li[4]/a/span[3]")).click();
	 Thread.sleep(3000);
	 //Click on Asset Inventory List 
	 driver.findElement(By.xpath("//*[@id=\'sidebar-left\']/ul/li[4]/ul/li[1]/a")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")).click();
	 Thread.sleep(3000);
	 WebElement getmenu= 
	 driver.findElement(By.xpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/ul/li[2]/a"));
	 Actions act = new Actions(driver);
	 act.moveToElement(getmenu).perform();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
	 Thread.sleep(4000);
	 
	 	  }

@Test(priority=4)

public void AssetInventoryForm() throws InterruptedException {
	  eTest = eReport.startTest("Asset Form");

	eTest.log(LogStatus.INFO, "Asset Inventory Form");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button/i")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button/i")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"btn btn-success pull-left\"]")).click();
Thread.sleep(2000);
Reporter.log("completed");
driver.findElement(By.xpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input")).sendKeys("PMO");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div/label")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/label/input")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div/input")).sendKeys("5000");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[5]/div/input")).sendKeys("6500");
Thread.sleep(2000);
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(500,500)", "");
Thread.sleep(2000);
}

@AfterClass
public void testClosure() {
	
	if(eReport!=null) {
		
		eReport.endTest(eTest);
		eReport.flush();
	}
	
	if(driver!=null) {
		
		driver.quit();
		
	}
}


}






//driver.findElement(By.xpath("//*[@id='Infrastructure-devices']/div/div[2]/div[1]/div[2]/div/label")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("James");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Cook");
//Thread.sleep(2000);
//JavascriptExecutor jse1 = (JavascriptExecutor) driver;
//jse1.executeScript("window.scrollBy(200,200)", "");
//Thread.sleep(2000);
//
//
//
//driver.findElement(By.xpath("//*[@id='submitButton']/div[4]/div/div/label")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id='submitButton']/div[3]/div/span/span/i")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button")).click();
//Thread.sleep(2000);
////driver.findElement(By.xpath("//*[@id='save_as']")).click();
////Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id='save_as']")).sendKeys("Pre-Production");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id='submitButton']/div[2]/button[1]")).click();
//}
//
//}


//
//
//public void clickByXpath(String xpath) {
//	try {
//		//driver.findElement(By.xpath("//*[@id=\'signIn\']")).click();
//		//driver.findElement(By.xpath("\"//form/a\"")).click();
//
//		driver.findElement(By.xpath(xpath)).click();
//	 } catch (NoSuchElementException expType) {
//
//		expType.printStackTrace();
//
//	} catch (NotFoundException expType) {
//
//		expType.printStackTrace();
//	} catch (WebDriverException expType) {
//
//		expType.printStackTrace();
//	} catch (Exception expType) {
//
//		expType.printStackTrace();
//	}
//}
//
//	}
//
//
//}

