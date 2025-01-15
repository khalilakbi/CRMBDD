package pages;

import base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends CommonMethods {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //Web element
    @FindBy(name = "email")
    WebElement inputEmail;

    @FindBy(name = "password")
    WebElement inputPassword;

    @FindBy(xpath = "//div[text()='Login']")
    WebElement loginButton;


    // action(methods)
    public void typeEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(inputEmail));
        typeText(inputEmail, email);
    }

    public void typePassword(String password) {
        typeText(inputPassword, password);
    }

    public void clickOnLogin(){
        clickOnElement(loginButton);
    }


}
