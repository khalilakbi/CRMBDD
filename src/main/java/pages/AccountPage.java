package pages;

import base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AccountPage extends CommonMethods {
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    //Web Element
    @FindBy(xpath = "//a//span[text()='Home']")
    WebElement homeIcon;
    @FindBy(xpath = "//div[@id='main-nav']//a//span")
    List<WebElement> navLink;

    //methods
    public void hoveOnHome() {
        wait.until(ExpectedConditions.visibilityOf(homeIcon));
        hoverOverOnElement(homeIcon);
    }

    public void clickOnNavLink(String link) {
        for (WebElement element : navLink) {
            if (getInnerTextFromElement(element).equals(link)) {
                clickOnElement(element);
                break;
            }
        }
    }

}
