package pages;

import base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmailPage extends CommonMethods {
    public EmailPage() {
        PageFactory.initElements(driver, this);
    }

   // @FindBy(xpath = "//button[@class='ui fluid button']")
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/button")
    WebElement composeButton;
    //@FindBy(xpath = "//input[@placeholder='Search']")
   // WebElement inputSearch;



    public void clickOnComposeButton() {
        //hoverOverOnElement(inputSearch);
wait.until(ExpectedConditions.visibilityOf(composeButton));
        clickOnElement(composeButton);
    }
}
