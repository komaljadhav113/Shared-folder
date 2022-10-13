package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.input.Input;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.cssSelector("input[id='user-name']"));
		
		username.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		WebElement pwd=driver.findElement(By.cssSelector("input[placeholder='Password']"));
		
		pwd.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.cssSelector("input[id='login-button']"));
		
		login.click();
		
		
		
		
		
		
	

	}

}
