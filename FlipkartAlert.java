package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		
		//FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//div[text()='Travel']")).click();
		
		try {
		driver.switchTo().alert().accept();
		}
		catch(NoAlertPresentException ex)
		{
			System.out.println("Exception handled " + ex);
			System.out.println("Further code is ready yo execute");
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Round Trip']")).click();
		
		
	}
	

}
