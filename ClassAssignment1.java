package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassAssignment1 {

	private static final TimeUnit SECONDS = null;

	public static void main(String[] args) {
		
					
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver ();
	//Login
	driver.get("https://acme-test.uipath.com/account/login");
	
	//
	driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
	driver.findElementById("password").sendKeys("leaf@12");
	driver.findElementById("buttonLogin").click();
	
	
	driver.manage().timeouts().implicitlyWait(30, SECONDS);
	WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
	Actions builder = new Actions(driver);
	builder.moveToElement(ele).perform();
	driver.findElementByLinkText("Search for Vendor").click();
	
		
		
		
		
		
		
		
		

	}

}
