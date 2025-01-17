package pages;

import base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComposeNewEmail extends CommonMethods {
    public ComposeNewEmail() {PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//span[text()='Email']")
    WebElement Email;

    public void ClickOnEmail(){
        wait.until(ExpectedConditions.visibilityOf(Email));
        clickOnElement(Email);
    }
}
