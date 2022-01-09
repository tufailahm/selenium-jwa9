package com.training.jwa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *test google using selenium in chrome
 *
 */
public class AmazonTest 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriver driver=null;
    	String browserName="chrome";
 
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\tufai\\Downloads\\chromedri\\chromedriver.exe");
    	if(browserName.equals("chrome")) {
    		WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
    	}
    	else if(browserName.equals("edge")) {
    		WebDriverManager.edgedriver().setup();
             driver = new EdgeDriver();
    	}
    	
        driver.get("http://www.amazon.in");
        driver.manage().window().maximize();
        //locators
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        Thread.sleep(3000);
        //hands on 
        driver.close();
        
    }
}
