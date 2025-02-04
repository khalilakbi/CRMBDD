package steps;

import base.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.EmailPage;
import pages.HomePage;

public class EmailSteps extends CommonMethods {

    @When("user click on email link")
    public void user_click_on_email_link() throws InterruptedException {
        AccountPage accountPage = new AccountPage();
        HomePage homePage = new HomePage();
        EmailPage emailPage = new EmailPage();
        accountPage.hoveOnHome();
        Thread.sleep(2000);
        accountPage.clickOnNavLink("Email");

        Thread.sleep(4000);

    }

    @When("user click on compose")
    public void user_click_on_compose() throws InterruptedException {

        AccountPage accountPage = new AccountPage();
        HomePage homePage = new HomePage();
        EmailPage emailPage = new EmailPage();
        Thread.sleep(4000);
        emailPage.clickOnComposeButton();


    }

    @When("user click on Add contact button")
    public void user_click_on_add_contact_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enter first name")
    public void user_enter_first_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enter last name")
    public void user_enter_last_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click on Add button")
    public void user_click_on_add_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
