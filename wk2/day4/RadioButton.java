package wk2.day4;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
						//Launch URL

				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				driver.get("https://www.leafground.com/radio.xhtml");
				
				// Click Radio button
				
				 driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[12]")).click();
				
				 // Unselect Radio Button
				 
				 driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[16]")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//label[.='Chennai']")).click();
				
				 
				 // Initially selected 
				 
				 boolean button = driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[21]")).isSelected();
				 System.out.println(button);
				  
				  
				  
				 WebElement age = driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[24]"));
				  boolean a = age.isSelected();
				  
				  
				  if(a==false) {
					  age.click();
					  System.out.println(a);
				  }
				  
				 
				
				
				 
				 
	}

}
