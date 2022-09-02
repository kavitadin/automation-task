package StepDefinitions.DemoSteps;

import com.connect_group.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoSteps_POM {

        WebDriver driver = null;
        LoginPage login;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("=== I am inside browser_is_open ===");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

   @And("User clicks on Monthly payment")
    public void user_is_on_login_page() {
       driver.navigate().to("https://www.landrover.co.uk/offers-and-finance/finance-calculator.html");

    }
//    @When("^user enters(.*) and (.*)$")
//    public void user_enters_username_and_password(String username, String Password);
//    login = new loginPage(driver);
//    login.enterUsername(username);
//    login.enterPassword(password);
//    Thread.sleep(1000);
//}
//@And("user is able to change the Monthly payment amount to $750")
//public void change amount to $750
//        login {
//
//        }
//@Then
//public void user_is_navigated_to_the_home_page()Throws InterruptedException
//Assert.assertTrue(login.checkLogOutIsDisplayed());
//Thread.sleep(1000);
//driver.close();
}








