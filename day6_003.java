package com.example.bike;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class day6_003 {
	public static void main( String[] args ) throws InterruptedException{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("harsha1234@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("harsha@123456");
	WebElement computer=driver.findElement(By.xpath("//*[@id=\"user-registration-form-310\"]/form/div[1]/div/div[3]/ul/li[1]/label"));
	computer.click();
	driver.findElement(By.xpath("//*[@id=\"user-registration-form-310\"]/form/div[2]/button")).click();
	
    }
}
