package week1.day2;


import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1FB {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElementById("email").sendKeys("8800688733");
		driver.findElementById("pass").sendKeys("880068");
		driver.findElementById("loginbutton").click(); 
		driver.findElementById("userNavigationLabel").click();
		
		
		
		
		
	}
	
	

}
