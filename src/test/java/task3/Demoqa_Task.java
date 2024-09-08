package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoqa_Task {

	WebDriver driver;
	
	@Test
	
	void test() {
		
	 driver=new ChromeDriver();
	 driver.get("https://demoqa.com/automation-practice-form");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("firstName")).sendKeys("sangeetha");
	 driver.findElement(By.id("lastName")).sendKeys("Perumalla");
	 driver.findElement(By.id("userEmail")).sendKeys("sangeetha123@gmail.com");
	 driver.findElement(By.xpath("custom-control-input").sendkeys(""))
	 
	 
	 
	 
	 
	 
	 
		
	}
}

