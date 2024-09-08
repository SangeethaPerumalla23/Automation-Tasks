package Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Add_To_Cart {
	
	WebDriver driver;
	
	@Test
	void testlogin() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
		
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("sangeetha");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("perumalla");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("502325");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		
		
		
	}

}
