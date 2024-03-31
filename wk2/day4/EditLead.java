package wk2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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
		
		// Create Lead
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Conduent");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sathish Kumar");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Palanikumar");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Electronics");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("All Electronics stocks available");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("sathishpbe@gmail.com");
		WebElement ele = driver.findElement(By.xpath("(//select[@class='inputBox'])[6]"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("California");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		// Edit Lead
		
		driver.findElement(By.xpath("//a[.='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Every sunday is holiday");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		// Get Title
		
		String title1 = driver.getTitle();
		System.out.println(title1);
	}

}
