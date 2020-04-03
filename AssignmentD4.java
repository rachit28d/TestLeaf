package week1.day3;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentD4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver ();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElementById("username").sendKeys("demosalesmanager");
			driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Leads").click();  
			driver.findElementByLinkText("Find Leads").click(); 
			driver.findElementByXPath("//span[text()='Email']").click();
			driver.findElementByName("emailAddress").sendKeys("babu@testleaf.com");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			WebElement findElementByXPath = driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[3]/div[1]/a[1]");
			String text = findElementByXPath.getText();
			
		
			System.out.println(text);
			Thread.sleep(4000);
			driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]").click();
			
			driver.findElementByLinkText("Duplicate Lead").click();
			
			Thread.sleep(4000);
			
			String title = driver.getTitle();
			
			if (title == ("Duplicate Lead | opentabs CRM")) {
						System.out.println("Title of the page is :"+ title);
					}

	}

}
