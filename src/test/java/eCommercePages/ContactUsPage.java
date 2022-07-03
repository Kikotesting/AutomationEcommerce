package eCommercePages;

import CustomScripts.Highlighter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
    WebDriver browser;
    // Page factory construction
    public ContactUsPage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    WebElement heading_ContactUsPage;
    @FindBy(xpath = "//*[@id=\"id_contact\"]")
    WebElement subjectSelectingField_ContactUsPage;
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
    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
    WebElement breadcrumb_ContactUsPage;

}
