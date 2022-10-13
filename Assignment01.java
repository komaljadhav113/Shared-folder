package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//Assignment:
//1. https://www.globalsqa.com/samplepagetest/
//- Enter value in all fields and click on submit
//- ignore profile and alert button

public class Assignment01 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='g2599-name']")).sendKeys("Komal");
		
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("komaljadhav113@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='g2599-website']")).sendKeys("https://www.globalsqa.com/samplepagetest/");
		
		WebElement  experience = driver.findElement(By.xpath("//select[@id='g2599-experienceinyears']"));
		
		Select select = new Select(experience);
		
		select.selectByVisibleText("3-5");
		//select.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@value='Automation Testing']")).click();
		
		driver.findElement(By.xpath("//input[@value='Functional Testing']")).click();
		
		driver.findElement(By.xpath("//input[@value='Manual Testing']")).click();
		
		driver.findElement(By.xpath("//input[@value='Graduate']")).click();
		
		driver.findElement(By.xpath("//textarea[@name='g2599-comment']")).sendKeys("Assignment");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		
		//driver.close();
		
		

	}

}