package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement all= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//Select dropdown=new Select(all);
		//dropdown.selectByVisibleText("Baby");
		
		//Select dropdown=new Select(all);
		//dropdown.selectByIndex(8);
		
		Select dropdown=new Select(all);
		dropdown.selectByValue("search-alias=baby");
		}

}
