package com.Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
@Test
public void loginTest1() {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nurul vai");
	WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
	password.clear();
	password.sendKeys("Tanita");
	driver.findElement(By.xpath("button[@name='login']")).click();
	
}
	

}
