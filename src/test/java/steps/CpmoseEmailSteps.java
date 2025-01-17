package steps;

import base.CommonMethods;
import io.cucumber.java.en.When;
import pages.ComposeNewEmail;
import pages.HomePage;

public class CpmoseEmailSteps extends CommonMethods {

    @When("user click on Email Element")
    public void user_click_on_Email_Element() {
        ComposeNewEmail composeNewEmail = new ComposeNewEmail();
        composeNewEmail.ClickOnEmail();

    }


}
