package com.connect_group.tests;

import com.connect_group.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestTask1 {
    WebDriver driver;


    @Test
    public void verifyTestTask1(){

        WebDriverManager .chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.landrover.co.uk/offers-and-finance/finance-calculator.html");

        LoginPage login = new LoginPage(driver);
        login.clickButton();


    }
   //Assert.assertTrue(login.checkLogOutIsDisplayed());
    //Thread.sleep(1000);
    //driver.close();
}

