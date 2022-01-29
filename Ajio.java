package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.*;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@name=\'searchVal\']")).sendKeys("Bags");
		driver.findElement(By.xpath("//div/button/span[@class = 'ic-search']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//div[@class ='facet-linkhead'
		// ]/label[contains(text(),'Fashion Bags')]")).click();
		String items = driver.findElement(By.xpath("//div[@class='filter']/div[@class='length']")).getText();
		System.out.println("Total number of items: " + items);

		System.out.println("List of Brands");

		List<WebElement> brandNameList = driver.findElements(By.className("brand"));
		System.out.println("Brand list size: " + brandNameList.size());

		for (WebElement webelement : brandNameList)

		{
			String text = webelement.getText();
			System.out.println(text);
		}

		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println("Size: " + bagNameList.size());

		for (WebElement webelement : bagNameList)

		{
			String text = webelement.getText();
			System.out.println(text);
		}
		driver.close();

	}

}
