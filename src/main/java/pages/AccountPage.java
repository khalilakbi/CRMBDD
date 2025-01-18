package pages;

import base.CommonMethods;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "(//button[@class='ui linkedin button'])[3]")
    WebElement clickCreateButton;
    // @FindBy(xpath = "(//div[@class='ui right corner labeled input'])[1]")
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/input")
    WebElement enterCompanyName;
    @FindBy(xpath = "//button[@class='ui small fluid positive toggle button']")
    WebElement unlockButton;
    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement saveButton;
   // @FindBy(xpath = "//input[text()='Street Address']")
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div/div[1]/div/input")
    WebElement enterStreetAddress;
    @FindBy(xpath = "// input[@placeholder='City']")
    WebElement enterCity;
    @FindBy(xpath = "//input[@placeholder='State / County']")
    WebElement enterStateCounty;
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement enterPostCode;
    @FindBy(xpath = "//span[@class='inline-error-msg']")
    WebElement TheFieldNameIsRequiredMSG
    ;


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

    public void clickOnCreateButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@class='ui linkedin button'])[3]")));
        clickOnElement(clickCreateButton);
    }

    public void enterCompanyName(String name) {
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='ui right corner labeled input'])[1]")));
        // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='ui right corner labeled input'])[1]")));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/input")));
        enterCompanyName.sendKeys("FaziWazi");
    }

    public void clickOnPublicButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='ui small fluid positive toggle button']")));
        clickOnElement(unlockButton);
    }

    public void clickOnSveButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='ui linkedin button']")));
        clickOnElement(saveButton);
    }

    public void inputStreetAddress(String StreetAddress) {
       // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[text()='Street Address']")));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div/div[1]/div/input")));
        enterStreetAddress.sendKeys("0000 ABC street");

    }

    public void enterCity(String City) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("// input[@placeholder='City']")));
        enterCity.sendKeys("Berkely");

    }
public void enterStateCounty(String StateCounty){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='State / County']")));
enterStateCounty.sendKeys("Guilford");

    }
    public void setEnterPostCode(int Postcode){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Post Code']")));
   enterPostCode.sendKeys("200001");
    }
    public boolean TheFieldNameIsRequiredDisplay() {
        wait.until(ExpectedConditions.visibilityOf(TheFieldNameIsRequiredMSG));
        return TheFieldNameIsRequiredMSG.isDisplayed();
    }

}
