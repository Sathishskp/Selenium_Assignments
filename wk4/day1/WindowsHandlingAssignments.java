package wk4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingAssignments {

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

		// Click CRM

		driver.findElement(By.xpath("(//a[contains(text(),CRM/SFA)])[2]")).click();

		// Click & Merge Contacts

		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		driver.findElement(By.xpath("//a[.='Merge Contacts']")).click();

		String parentWindow=driver.getWindowHandle();

		//Child Window by using Set and List

		//From Contacts

		driver.findElement(By.xpath("(//input[@name='partyIdFrom'])/following::img[1]")).click();
		Set<String> openWindow = driver.getWindowHandles();
		List<String> childWindow = new ArrayList<String>(openWindow);
		driver.switchTo().window(childWindow.get(1));
		Thread.sleep(4000);

		String title1 = driver.getTitle();
		System.out.println("Child Window title is = "+title1);

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])//a[1]")).click();
		Thread.sleep(4000);
		driver.switchTo().window(childWindow.get(0));

		//To Contacts

		driver.findElement(By.xpath("(//input[@name='partyIdFrom'])/following::img[2]")).click();
		Set<String> openWindow1 = driver.getWindowHandles();
		List<String> childWindow1 = new ArrayList<String>(openWindow1);
		driver.switchTo().window(childWindow1.get(1));
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])//following::a[5]")).click();
		Thread.sleep(4000);
		driver.switchTo().window(childWindow1.get(0));

		// Merge 

		driver.findElement(By.xpath("//a[.='Merge']")).click();
		Thread.sleep(3000);
		//Alert Handling

		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);

		// Get Title

		String title3 = driver.getTitle();
		System.out.println(title3);

	}

}
