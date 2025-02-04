package pages;

import base.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class FormPage extends CommonMethods {
    public FormPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Forms']")
    WebElement formsLink;

    public void ClickOnLink(String link) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Forms']")));
        clickOnElement(formsLink);

            }
        }

