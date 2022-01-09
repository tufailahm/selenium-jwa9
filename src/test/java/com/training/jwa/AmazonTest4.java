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

class AmazonTest4 {

	WebDriver driver = null;
	String browserName = "chrome";


	@BeforeEach
	void setUp() throws Exception {

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

	}

	@AfterEach
	void tearDown() throws Exception {
		driver.close();
	}

	@Test
	void test() throws InterruptedException {
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		// locators
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		//Thread.sleep(3000);
		//
		//String actual= driver.getCurrentUrl().toString();
		//String expected="https://www.amazon.in/s?k=iphone&crid=3KSIVM4W1A5SN&sprefix=iphone%2Caps%2C282&ref=nb_sb_noss";
		//assertEquals(expected,actual);
		assertTrue(driver.findElement(By.xpath("//*[@id=search]/span/div/span/h1/div/div[1]/div/div/span[1]")).isDisplayed());

	}


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	
}
