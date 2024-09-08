package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOpenCart {
	
	WebDriver driver;
	
	@Test(dataProvider = "SearchData",dataProviderClass = DataSupplier.class)
	void testsearch(String product) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys(product);
		search.submit();
		try {
			
			boolean status = driver.findElement(By.xpath("//span[@class='BUOuZu']")).getText().contains(product);
			Assert.assertTrue(status);//Why  we used contain(products)
			
		} catch (Exception e) {
			System.out.println("No results found");
		}
		
		
	}

}
