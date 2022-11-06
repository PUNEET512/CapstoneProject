package Capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class heathcareTestNG {
	
@Test
	
	public void openBrowser() throws InterruptedException
	{
	
	System.setProperty( "webdriver.chrome.driver","./BrowserUtils/chromedriver.exe");
	
	WebDriver driver =new ChromeDriver(); 
	
	driver.get("http://localhost:8088/medicare/");
    
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//a[@href=\"/medicare/login\"]")).click();
    
    Thread.sleep(3000);
    WebElement username = driver.findElement(By.id("username"));
    username.click();
    username.sendKeys("kn@gmail.com");
    
    WebElement password = driver.findElement(By.id("password"));
    password.click();
    password.sendKeys("12345");
    
    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@href=\"/medicare/show/all/products\"]")).click();
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@href=\"/medicare/cart/add/1/product\"]")).click();
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@href=\"/medicare/cart/validate\"]")).click();
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
    
    Thread.sleep(3000);
    System.out.println("Product added to cart successfully");
}

}
