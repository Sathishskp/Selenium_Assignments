package wk2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://leafground.com/checkbox.xhtml");
		
		// Basic check box
		
		driver.findElement(By.xpath("//span[.='Basic']")).click();

		// Notification box
		
		driver.findElement(By.xpath("//span[.='Ajax']")).click();
		boolean display = driver.findElement(By.xpath("//span[.='Checked']")).isDisplayed();
		System.out.println("Expected message is displayed = "+display );
		
		//Fav Language
		
		driver.findElement(By.xpath("//label[.='Java']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//div[@class='ui-growl ui-widget'])[2]")).getText();
		System.out.println("Tri State option choosed = "+text);
		
		// click toggle switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(2000);
		String text1 =driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();
		System.out.println("Expected message is displayed = "+text1 );
		Thread.sleep(2000);
		
		//Verify checkbox enable
		boolean enable = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		System.out.println("Button is Enabled = "+enable);
		
		//select dropdown
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("(//label[.='London'])[2]")).click();
		Thread.sleep(2000);
		String city = driver.findElement(By.xpath("//span[.='London']")).getText();
		Thread.sleep(2000);
		System.out.println("Selected city is = "+city);
		driver.close();
	}

}
