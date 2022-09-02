package com.connect_group.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

//This class with store all the locators and methods of login page

 public class LoginPage {
    private WebDriver driver;


     //By searchbox =  By.xpath("//*[@id=\"fincalc-quickQuote\"]/div/div/div/div[2]/div[2]/button[2]");
     By Button = By.id("dropdown_button");
          public LoginPage(WebDriver driver) {
              this.driver = driver;
              if (!driver.getTitle().equals("https://www.landrover.co.uk/offers-and-finance/finance-calculator.html#/fbmp/overview")) {
                  throw new IllegalStateException("This is not login page. The Current Page is" + driver.getCurrentUrl());
              }
          }
         public void clickButton() {
              driver.findElement(Button).click();
         }
 }



