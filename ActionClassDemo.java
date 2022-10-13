package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassDemo {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions a=new Actions(driver);
		
		WebElement click1=driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		a.click(click1).perform();
		
		WebElement dclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		a.doubleClick(dclick).perform();
		
		WebElement rclick= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		a.contextClick(rclick).perform();
		
		a.contextClick(click1).perform();
		

	}

}
