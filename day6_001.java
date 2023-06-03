package com.example.bike;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class day6_001 {

	 public static void main( String[] args ) throws InterruptedException
	    {
	    	WebDriverManager.edgedriver().setup();
	    	WebDriver driver=new EdgeDriver();
	    	String url="https://demo.opencart.com/index.php?route=account/register&language=en-gb";
	    	driver.get(url);
	    	driver.manage().window().maximize();
	    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Harsha");
	    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("harsha");
	    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("harsha12@gmail.com");
	    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("12345");
	    	JavascriptExecutor js=(JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,1500)","");
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
	    	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
	    	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	    }
}
