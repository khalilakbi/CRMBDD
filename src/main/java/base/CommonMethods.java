package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonMethods {
    public static WebDriver driver;
    public static WebDriverWait wait;


    public void driverInit(String browser) {

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 30);

    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void typeText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public String getInnerTextFromElement(WebElement element) {
        return element.getText().trim();// trim() trim white space from beginning and end
    }

    public void hoverOverOnElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
    }


}
