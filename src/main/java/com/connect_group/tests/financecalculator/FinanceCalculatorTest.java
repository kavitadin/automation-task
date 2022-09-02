//package com.connect_group.tests.financecalculator;
//
//import com.connect_group.pages.financecalculator.FilterByPage;
//import com.connect_group.pages.financecalculator.ModelSelectPage;
//import com.connect_group.pages.financecalculator.PersonalisedQuotePage;
//import com.connect_group.tests.BaseTest;
//import io.cucumber.java.en.Given;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class FinanceCalculatorTest extends BaseTest {
//
//  private ModelSelectPage modelSelectPage;
//  private FilterByPage filterByPage;
//  private PersonalisedQuotePage personalisedQuotePage;
//
//  @BeforeEach
//  void setupAndNavigateToUrl() {
//    modelSelectPage = new ModelSelectPage(driver);
//    filterByPage = new FilterByPage(driver);
//    personalisedQuotePage = new PersonalisedQuotePage(driver);
//
//    open("https://www.landrover.co.uk/offers-and-finance/finance-calculator.html");
//  }
//
//  @Test
//  void FinanceCalculatorTest() {
//
//    assertTrue(modelSelectPage.isInitialized());
//
//
//
//         }
//
//
//  }
//
//
//
//
//
//
//  // TODO: Complete the each of the tests under the "Tasks to Complete" section of the README.md
//
