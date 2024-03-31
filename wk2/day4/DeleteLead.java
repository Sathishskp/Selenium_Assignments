package wk2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch Browser
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Login application
				
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				String title = driver.getTitle();
				System.out.println(title);
				
				
				driver.findElement(By.xpath("(//a[contains(text(),CRM/SFA)])[2]")).click();
				driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
				
				// Find Lead
				
				driver.findElement(By.xpath("//a[.='Find Leads']")).click();
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sathish");
				driver.findElement(By.xpath("//button[.='Find Leads']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
				//WebElement ele = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]"));
				//String text = ele.getText();
				//System.out.println(" First Lead ID is = "+ text);
				//ele.click();
				Thread.sleep(2000);
				
				// Delete Lead
				
				driver.findElement(By.xpath("//a[.='Delete']")).click();
				
				// Find lead 
				driver.findElement(By.xpath("//a[.='Find Leads']")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10569");
				driver.findElement(By.xpath("//button[.='Find Leads']")).click();
				Thread.sleep(2000);
				
				String text1 = driver.findElement(By.xpath("//div[.='No records to display']")).getText();
				System.out.println(text1);
				
				driver.close();
	}

}
