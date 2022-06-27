package eCommerceSetup;
import eCommercePages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eCommerceSetup {

    WebDriver browser;

    // Manage web-driver browser version
    @BeforeAll
    static void beforeAllTest(){
        WebDriverManager.chromedriver().setup();
    }

    // initialize new browser for each test and navigate to main website
    @BeforeEach
    void beforeEachTest(){
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.navigate().to("http://automationpractice.com/");
    }

    // Clear cookies and Kill the browser after finish the test
    @AfterEach
    void afterEach(){
        browser.manage().deleteAllCookies();
        browser.quit();
    }

    HomePage objHomePage;

    @Test
    @DisplayName("Check!")
    void verifyHomePage(){
        objHomePage = new HomePage(browser);
        objHomePage.veryBottomHeader();
    }
}
