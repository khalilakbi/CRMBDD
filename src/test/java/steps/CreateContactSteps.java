package steps;

import base.CommonMethods;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.AccountPage;
import pages.HomePage;

public class CreateContactSteps extends CommonMethods {
    @When("user login")
    public void user_login() {
        HomePage homePage = new HomePage();
        homePage.typeEmail("khalilPNT@gmail.com");
        homePage.typePassword("PNTclass123!");
        homePage.clickOnLogin();
    }

    @When("user click on contact link")
    public void user_click_on_contact_link() throws InterruptedException {
        AccountPage accountPage = new AccountPage();
        accountPage.hoveOnHome();
        accountPage.clickOnNavLink("Contacts");

    }
}
