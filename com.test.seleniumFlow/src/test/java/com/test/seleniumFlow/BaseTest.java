package com.test.seleniumFlow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	@Test
	public void base(){
		System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
        driver.close();
	}
}
