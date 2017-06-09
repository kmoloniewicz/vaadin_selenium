package com.vaadin.demo.dashboard.selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class EditUserProfileTest {

	private WebDriver driver;
	
	@BeforeClass
	private void setUp() {
		final File file = new File("driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void openLoginPage() {
		driver.get("https://demo.vaadin.com/dashboard/");

	}
	
	
	@AfterClass	
	private void tearDown() {
		driver.close();
	}
	
}
