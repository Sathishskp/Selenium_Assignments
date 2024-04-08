package wk3.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(4000);

		// Search bags

		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(4000);
		// select mens

		//(//li[@class='rilrtl-list-item'])[1]//div//div//div//div//label
		driver.findElement(By.xpath("(//div[@class='facet-linkhead']//label)[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='facet-linkhead']//label)[4]")).click();
		Thread.sleep(4000);

		WebElement findElement = driver.findElement(By.xpath("//div[@class='length']//strong"));
		String text = findElement.getText();
		System.out.println("Available Bags Quantity is = "+ text);

		// List Of Elements

		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int size = elements.size();
		System.out.println(" Total number of Bags available in this page = "+ size);
		for (int i = 0; i < elements.size(); i++) {
			String text2 = elements.get(i).getText();
			System.out.println("List of Available Bags Brand Name is = "+ text2);
		}

	}

}
