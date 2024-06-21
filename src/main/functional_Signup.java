package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class functional_Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://dev.eservicepro.com/authentication/signup");
		driver.findElement(By.id("mat-input-2")).sendKeys("Testing-1");
		driver.findElement(By.name("email")).sendKeys("testing1@gmail.com");
//		driver.findElement(By.id("mat-input-4")).sendKeys("111111");
//		driver.findElement(By.id("mat-input-5")).sendKeys("111111");
//		driver.findElement(By.cssSelector("input[id*='mat-mdc-checkbox-1-input']")).click();
		driver.findElement(By.xpath("//div[@class='container-auth-form-btn']")).click();



		
		
		
		

		

	}

}
