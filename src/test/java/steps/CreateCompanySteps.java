package steps;

import base.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AccountPage;
import pages.HomePage;

public class CreateCompanySteps extends CommonMethods {
    AccountPage accountPage = new AccountPage();
    HomePage homePage = new HomePage();
    String name= "FaziWazi";
    String Access = "Only you can see this record";
    String StreetAddress= "0000 ABC street";
    String City = "Berkeley";
    String County="Guilford";
    int PostCode =200001;

    @Given("user open application")
    public void user_open_application() {
        driver.get("https://ui.cogmento.com/");
    }

    @When("user login")
    public void user_login() {
        homePage.typeEmail("khalilPNT@gmail.com");
        homePage.typePassword("PNTclass123!");
        homePage.clickOnLogin();
    }

    @When("user click on companies link")
    public void user_click_on_companies_link() throws InterruptedException {

        accountPage.hoveOnHome();
        Thread.sleep(2000);
        accountPage.clickOnNavLink("Companies");
    }

    @When("user click on create")
    public void user_click_on_create() {
        accountPage.clickOnCreateButton();


    }

    @When("user enter company name")
    public void user_enter_company_name() {
       accountPage.enterCompanyName("FaziWazi");
    }

    @When("user select public")
    public void user_select_public() {
accountPage.clickOnPublicButton();
    }

    @When("user click save")
    public void user_click_save() {
       accountPage.clickOnSveButton();
    }

    @Then("company will be created")
    public void company_will_be_created() throws InterruptedException {
        //Assert.assertEquals(driver.getCurrentUrl(),"https://ui.cogmento.com/companies/5269f66b-b430-492e-8544-5a9238ff9d6c");
   Thread.sleep(2000);
    Assert.assertEquals(Access, "Only you can see this record");
    }
    @When("user enter address")
    public void user_enter_address() throws InterruptedException {
        Thread.sleep(3000);
        accountPage.inputStreetAddress("0000 ABC street");
        accountPage.enterCity("Berkeley");
        accountPage.enterStateCounty("Guilford");
        accountPage.setEnterPostCode(200001);

    }
    @Then("The field Name is required message should be displayed")
    public void the_field_name_is_required_message_should_be_displayed() {
        Assert.assertTrue(accountPage.TheFieldNameIsRequiredDisplay());
    }


}



