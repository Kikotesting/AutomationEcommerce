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
    @FindBy(xpath = "//*[@id=\"desc_contact2\"]")
    WebElement paragraphCustomerService_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"desc_contact1\"]")
    WebElement paragraphWebMaster_ContactUsPage;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailField_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"id_order\"]")
    WebElement orderReferenceField_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"uniform-fileUpload\"]")
    WebElement attachField_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"submitMessage\"]/span/i")
    WebElement sendSubmitButton_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"message\"]")
    WebElement textMessage_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    WebElement checkedTextMessageAfter_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
    WebElement checkedErrorTextAfter_ContactUsPage;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/fieldset/h3")
    public WebElement scrollToForm_ContactUsPage;



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
        textMessage_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,textMessage_ContactUsPage);
        Thread.sleep(1000);
        System.out.println("ContactUs Page elements are checked!");
    }
    public void SelectingCustomerService_ContactUsPage() throws InterruptedException {
        subjectSelectingField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,subjectSelectingField_ContactUsPage);
        subjectSelectingField_ContactUsPage.click();
        System.out.println("Click subjectSelecting");
        Thread.sleep(1000);
        Select select = new Select(subjectSelectingField_ContactUsPage);
        select.selectByValue("2");
        subjectSelectingField_ContactUsPage.click();
        Thread.sleep(2000);
        System.out.println("Select CustomService");

    }
    public void SelectingWebMaster_ContactUsPage() throws InterruptedException {
        subjectSelectingField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,subjectSelectingField_ContactUsPage);
        subjectSelectingField_ContactUsPage.click();
        System.out.println("Click subjectSelecting");

        Select select = new Select(subjectSelectingField_ContactUsPage);
        select.selectByValue("1");
        subjectSelectingField_ContactUsPage.click();
        Thread.sleep(2000);
        System.out.println("Select WebMaster");

    }
    public void SetEmail_ContactUsPage(String text){
        Assertions.assertTrue(emailField_ContactUsPage.isDisplayed());
        emailField_ContactUsPage.click();
        System.out.println("text: " + text);
        emailField_ContactUsPage.sendKeys(text);
    }
    public void SetMessage_ContactUsPage(String text){
        Assertions.assertTrue(textMessage_ContactUsPage.isDisplayed());
        textMessage_ContactUsPage.click();
        System.out.println("text: " + text);
        textMessage_ContactUsPage.sendKeys(text);
    }
    public void ClickSendSubmitButton_ContactUsPage(){
        sendSubmitButton_ContactUsPage.click();
    }
    public void TextMessageAfter_ContactUsPage(){
        Assertions.assertTrue(checkedTextMessageAfter_ContactUsPage.isDisplayed());
        String actualMessage = checkedTextMessageAfter_ContactUsPage.getText();
        Highlighter.highlightElement(browser,checkedTextMessageAfter_ContactUsPage);
        Assertions.assertEquals("Your message has been successfully sent to our team.",actualMessage);
        System.out.println("Successfully message sent!");
    }
    public void ErrorMessageAfter_ContactUsPage(){
        Assertions.assertTrue(checkedErrorTextAfter_ContactUsPage.isDisplayed());
        String actualMessage = checkedErrorTextAfter_ContactUsPage.getText();
        Highlighter.highlightElement(browser,checkedErrorTextAfter_ContactUsPage);
        Assertions.assertEquals("There is 1 error",actualMessage);
        System.out.println("Error!");
    }

}
