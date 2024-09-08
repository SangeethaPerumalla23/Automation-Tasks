package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Valid_Invalid_credientials {


	
	WebDriver driver;
    @BeforeMethod
	void setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
    }
		
		@Test(dataProvider ="dp")
		void login(String username , String Password) {
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			
			
	}
		
		@DataProvider(name="dp")
		String [][] logindata() {
			
			String data[][]= {
						{"standard_user" , "secret_sauce"},
						{"locked_out_user"	,"secret_sauce"},
						{"problem_user" , "secret_sauce"},
						{"error_user" , "secret_sauce"}
				 
			};
			return data;
		
			
		}
	
}
