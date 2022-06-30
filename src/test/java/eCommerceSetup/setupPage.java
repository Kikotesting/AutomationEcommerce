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

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class setupPage {

    public WebDriver browser;

    // Manage web-driver browser version
    @BeforeAll
    static void beforeAllTest() {
        WebDriverManager.chromedriver().setup();
    }

    // initialize new browser for each test and navigate to main website
    @BeforeEach
    void beforeEachTest() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.navigate().to("http://automationpractice.com/");
    }

    // Clear cookies and Kill the browser after finish the test
    @AfterEach
    void afterEach() {
        browser.manage().deleteAllCookies();
        browser.quit();
    }

    public void scrollEndPage() {
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
