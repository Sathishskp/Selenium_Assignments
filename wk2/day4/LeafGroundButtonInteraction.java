package wk2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch URL

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");

		// Click the Button and verify Title

		driver.findElement(By.xpath("//span[text()='Click']")).click();
		WebElement title = driver.findElement(By.xpath("//div[@class='route-bar-breadcrumb']"));
		String t = title.getText();
		System.out.println("The Title Page Name is = " + t);

		// Navigate the browser to back

		driver.navigate().back();

		// Button is Enabled/Disabled
		WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[2]")); 
		boolean enabled = button.isEnabled();
		System.out.println("Confirm is the button is Enabled = " + enabled);


		// Find the position of the button

		WebElement position = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		Point p = position.getLocation();
		System.out.println("Position of the Submit button = "+ p);
		
		// Find the Background color of button
		
		WebElement color = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		String c = color.getCssValue("color");
		System.out.println("Color of the Save button is = "+ c);
		
		//Find the height and width
		
		WebElement height = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		Dimension h = height.getSize();
		System.out.println("Height and Width button size is = " + h);
		
		driver.close();
	}

}
