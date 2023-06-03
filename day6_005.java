package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class day6_005 {
  @Test
  public void login()  throws InterruptedException {
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement username=driver.findElement(By.name("username"));
			username.sendKeys("Admin");
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			Thread.sleep(5000);
			WebElement profile=driver.findElement(By.xpath("//p[contains(text(),'Paul Collings')]"));
			profile.click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Logout")).click();
		}
  
}

