package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class functional_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://dev.eservicepro.com/authentication/signin");
		driver.findElement(By.id("mat-input-0")).sendKeys("nasru912.21@gmail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("1111");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
