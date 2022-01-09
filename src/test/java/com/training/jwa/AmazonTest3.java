package com.training.jwa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class AmazonTest3 {

	WebDriver driver = null;
	String browserName = "chrome";

	@BeforeEach
	void setUp() throws Exception {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\tufai\\Downloads\\chromedri\\chromedriver.exe");
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	@Test
	void testSearchFunctionality() throws InterruptedException {
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		// locators
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(3000);
		//assert 
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.close();
	}


}
