package eCommerceSetup;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class setupPage {

    public WebDriver browser;
    public Actions actions;

    // Manage web-driver browser version
    @BeforeAll
    static void beforeAllTest() {
        WebDriverManager.chromedriver().setup();
    }

    // initialize new browser for each test and navigate to main website
    @BeforeEach
    void beforeEachTest() {
        browser = new ChromeDriver();
        Actions actions = new Actions(browser);
        browser.manage().window().maximize();
        browser.navigate().to("http://automationpractice.com/");
    }

    // Clear cookies and Kill the browser after finish the test
    @AfterEach
    void afterEach() {
        browser.manage().deleteAllCookies();
        browser.quit();
    }

    // SCROLLING elements
    public void scrollToPixels(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollBy(0,arguments[0])",pixels);
    }
    public void scrollToWebElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
    public void scrollEndPage() {
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    // SELECT elements
    public void selectElement(WebElement element){
        Select select = new Select(element);
    }

    // Wait for visibility of an element
    public void waitForVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }




}
