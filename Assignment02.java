package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//2. https://www.globalsqa.com/demo-site/datepicker/
//- Select current date
//- Select 5 Oct date

public class Assignment02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@id='DropDown DatePicker']")).click();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//driver.findElement(By.xpath("//select[@class='ui-datepicker-month']//preceding::input")).click();
		
		Thread.sleep(3000);
		
	}

}
