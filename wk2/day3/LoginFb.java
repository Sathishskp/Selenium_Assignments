package wk2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sathishpbe@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Royal@7800");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
