package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("Button[class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);
		Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("div[class='_1kidPb']>*:first-child")).click();
		//Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("div[class='_1kidPb']>*:last-child")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div[class='_1kidPb']>*:nth-child(2)")).click();
		Thread.sleep(4000);
		
		//driver.findElement(By.cssSelector("Div[class='_1kidPb']>*:last-of-type")).click();
		//Thread.sleep(3000);
		
		
	//	driver.findElement(By.xpath(""))
		
		
		

	}

}
