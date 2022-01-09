package com.training.jwa;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 *test google using selenium in chrome
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tufai\\Downloads\\chromedri\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
