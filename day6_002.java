package com.example.bike;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class day6_002 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		String url="https://demo.wpeverest.com/user-registration/guest-registration-form";
		driver.get(url);
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Harsha");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("harsha78945312@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Harsha@12920014");
    	driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]")).click();
    	WebElement datePicker=driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]"));
    	datePicker.click();
    	WebElement month=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select/option[2]"));
    	month.click();
    	WebElement year=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input"));
    	year.click();
    	year.clear();
    	year.sendKeys("2023");
    	WebElement date=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[4]"));
    	date.click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//"+ "*[@id=\"input_box_1665629217\"]")).sendKeys("Indian");
    	WebElement country=driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]/option[103]"));
    	country.click();
    	WebElement phone = driver.findElement(By.name("phone_1665627880"));
    	phone.sendKeys("0919791571");
    	WebElement emergencycontact=driver.findElement(By.name("phone_1665627865"));
    	emergencycontact.sendKeys("0917904310");
    	WebElement datePickers=driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]"));
    	datePickers.click();
    	WebElement months=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/select/option[3]"));
    	months.click();
    	WebElement years=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/div/input"));
    	years.click();
    	years.clear();
    	years.sendKeys("2023");
    	WebElement dates=driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/span[6]"));
    	dates.click();
    	WebElement lengthstay=driver.findElement(By.name("number_box_1665629930"));
    	lengthstay.sendKeys("4");
    	WebElement room=driver.findElement(By.name("input_box_1665630010"));
    	room.sendKeys("2");
    	driver.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]")).sendKeys("photographer");
    	driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"radio_1665628131_None\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"select_1665628361\"]/option[2]")).click();
    	driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
    	Thread.sleep(15000);
    	driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
    	//submit
    	Thread.sleep(15000);
    	WebElement message_el=driver.findElement(By.xpath("//*[@id=\"ur-submit-message-node\"]/ul"));
    	String message=message_el.getText();
    	System.out.println(message);
    	
    	WebElement firstname=driver.findElement(By.xpath("//*[@id=\"first_name\"]")); 
    	firstname.sendKeys("Harsha");
    	boolean rs=firstname.isDisplayed();
    
    	WebElement email=driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
    	email.sendKeys("harha9032gmail.com");
    	boolean res=email.isDisplayed();
    	System.out.println(rs+" "+res);
	}
}
