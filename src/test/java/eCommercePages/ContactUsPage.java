package eCommercePages;

import CustomScripts.Highlighter;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
    WebDriver browser;
    // Page factory construction
    public ContactUsPage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }

    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
    WebElement breadcrumb_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    WebElement heading_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"id_contact\"]")
    WebElement subjectSelectingField_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"desc_contact1\"]")
    WebElement subjectSelectWebmaster_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"desc_contact2\"]")
    WebElement subjectSelectCustomService_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailField_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"id_order\"]")
    WebElement orderReferenceField_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"uniform-fileUpload\"]")
    WebElement attachField_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"submitMessage\"]/span/i")
    WebElement sendSubmitButton_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"message\"]")
    WebElement textAreaMessage_ContactUsPage;

    public void OverviewHeadElements_ContactUsPage() throws InterruptedException {
        breadcrumb_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,breadcrumb_ContactUsPage);
        Thread.sleep(1000);
        heading_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,heading_ContactUsPage);
        Thread.sleep(1000);
        subjectSelectingField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,subjectSelectingField_ContactUsPage);
        Thread.sleep(1000);
        emailField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,emailField_ContactUsPage);
        Thread.sleep(1000);
        orderReferenceField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,orderReferenceField_ContactUsPage);
        Thread.sleep(1000);
        attachField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,attachField_ContactUsPage);
        Thread.sleep(1000);
        sendSubmitButton_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,sendSubmitButton_ContactUsPage);
        Thread.sleep(1000);
        textAreaMessage_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,textAreaMessage_ContactUsPage);
        Thread.sleep(1000);
        System.out.println("ContactUs Page elements are checked!");
    }
    public void SubjectSelect_ContactUsPage() throws InterruptedException {
        subjectSelectingField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,subjectSelectingField_ContactUsPage);
        subjectSelectingField_ContactUsPage.click();
        System.out.println("Click subjectSelecting");

        Select select = new Select(subjectSelectingField_ContactUsPage);
        select.selectByValue("2");
        subjectSelectCustomService_ContactUsPage.isDisplayed();
        Assertions.assertTrue(subjectSelectCustomService_ContactUsPage.isDisplayed());
        Assertions.assertTrue(subjectSelectCustomService_ContactUsPage.isSelected());
        System.out.println("Select CustomService");
        Thread.sleep(1000);

        subjectSelectingField_ContactUsPage.click();
        select.selectByValue("1");
        Assertions.assertTrue(subjectSelectWebmaster_ContactUsPage.isDisplayed());
        Assertions.assertTrue(subjectSelectWebmaster_ContactUsPage.isSelected());
        System.out.println("Select Webmaster");
        Thread.sleep(1000);

        subjectSelectingField_ContactUsPage.click();
        select.selectByValue("0");
        Assertions.assertTrue(subjectSelectingField_ContactUsPage.isDisplayed());
        Assertions.assertTrue(subjectSelectingField_ContactUsPage.isSelected());
        System.out.println("Select Default");
        Thread.sleep(1000);
        subjectSelectingField_ContactUsPage.click();
        System.out.println("Finish!");
    }
    public void TypingTextMessage_ContactUsPage(){
        Assertions.assertTrue(textAreaMessage_ContactUsPage.isDisplayed());
        textAreaMessage_ContactUsPage.click();
        textAreaMessage_ContactUsPage.sendKeys("Welcome\nI am user with knowledge!");
        sendSubmitButton_ContactUsPage.click();
    }

}
