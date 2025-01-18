package steps;

import base.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import pages.HomePage;

public class LoginSteps extends CommonMethods {

//    @Given("user open application")
//    public void user_open_application() {
//        driver.get("https://ui.cogmento.com/");
//    }
//
    @When("user enter valid email")
    public void user_enter_valid_email() {
        HomePage homePage = new HomePage();
        homePage.typeEmail("khalilPNT@gmail.com");
    }

    @When("user enter valid password as {string}")
    public void user_enter_valid_password_as(String password) {
        HomePage homePage = new HomePage();
        homePage.typePassword(password);
    }

    @When("user click on login")
    public void user_click_on_login() {
        HomePage homePage = new HomePage();
        homePage.clickOnLogin();

    }

    @Then("account page should be open")
    public void account_page_should_be_open() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://ui.cogmento.com/");
    }


}
