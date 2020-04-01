package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("zto"); 
		driver.findElementById("createLeadForm_firstName").sendKeys("rto");
		driver.findElementById("createLeadForm_lastName").sendKeys("yto"); 
		driver.findElementByName("submitButton").click();
		
		String actualTitle = driver.getTitle();

		String expectedTitle = "View Lead | opentaps CRM";
		
			if(actualTitle.equals(expectedTitle))
				System.out.println("Title Matched");
			else
				System.out.println("Title didn't match");
			
			
			System.out.println(actualTitle);
			
			driver.close();
		
	}

}
