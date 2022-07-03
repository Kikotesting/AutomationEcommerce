package eCommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    WebDriver browser;
    // Page factory construction
    public SignInPage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }

    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
    WebElement breadcrumb_SignInMenu;
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    WebElement heading_SignInMenu;
    @FindBy(xpath = "//*[@id=\"create-account_form\"]/h3")
    WebElement createAccountSection_SignInMenu;
    @FindBy(xpath = "//*[@id=\"create-account_form\"]/div/p")
    WebElement emailAddress_SignInMenu;
    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    WebElement createAnAccountButton_SignInMenu;

    @FindBy(xpath = "//*[@id=\"login_form\"]/h3")
    WebElement alreadyRegistered_SignInMenu;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailAddressField_alreadyRegistered_SignInMenu;
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElement passwordField_alreadyRegistered_SignInMenu;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    WebElement signInSubmitButton_SignInMenu;
    @FindBy(xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
    WebElement forgotPasswordLink_SignInMenu;


}
