package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassAssignment1 {

	

	public static void main(String[] args) {
		
					
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver ();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Login
	driver.get("https://acme-test.uipath.com/account/login");
	
	//Enter Username
	driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
	//Enter Password
	driver.findElementById("password").sendKeys("leaf@12");
	//Click on Login
	driver.findElementById("buttonLogin").click();
	
	
	//Mouse Over
	WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
	Actions builder = new Actions(driver);
	builder.moveToElement(ele).perform();
	driver.findElementByLinkText("Search for Vendor").click();
	
	driver.findElementById("vendorName").sendKeys("Blue Lagoon");
	driver.findElementById("buttonSearch").click();
	
	WebElement findElementByXPath = driver.findElementByXPath("//td[text()='France']");
	
	driver.findElementByLinkText("Log Out").click();
	driver.close();
	
		
		
		
		
		
		
		
		

	}

}
