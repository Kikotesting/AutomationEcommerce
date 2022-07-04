package eCommercePages;

import CustomScripts.Highlighter;
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

    // SignIn OverviewPage - Heading and Breadcrumb
    @FindBy (xpath = "//*[@id=\"columns\"]/div[1]")
    WebElement overviewSignInPage_Breadcrumb;
    @FindBy (xpath = "//*[@id=\"create-account_form\"]/h3")
    WebElement overviewSignInPage_AuthHeading;
    @FindBy (xpath = "//*[@id=\"center_column\"]/h1")

    // SignIn OverviewPage - Create account

    WebElement overviewSignInPage_HeadCreateAnAccount;
    @FindBy (xpath = "//*[@id=\"create-account_form\"]/div/p")
    WebElement overviewSignInPage_CreateAnAccountText;
    @FindBy (xpath = "//*[@id=\"create-account_form\"]/div/div[2]/label")
    WebElement overviewSignInPage_EmailLabel;
    @FindBy (xpath = "//*[@id=\"email_create\"]")
    WebElement overviewSignInPage_EmailField;
    @FindBy (xpath = "//*[@id=\"SubmitCreate\"]/span")
    WebElement overviewSignInPage_CreateAccountButton;

    // SignIn OverviewPage - Already Registered

    @FindBy (xpath = "//*[@id=\"login_form\"]/h3")
    WebElement overviewSignInPage_HeadAlreadyRegistered;
    @FindBy (xpath = "//*[@id=\"email\"]")
    WebElement overviewSignInPage_EmailAddressField;
    @FindBy (xpath = "//*[@id=\"passwd\"]")
    WebElement overviewSignInPage_PasswordField;
    @FindBy (xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
    WebElement overviewSignInPage_ForgotPasswordLink;
    @FindBy (xpath = "//*[@id=\"SubmitLogin\"]/span")
    WebElement overviewSignInPage_SignInButton;

    public void overviewHeadElements_SignInPage() throws InterruptedException {
        overviewSignInPage_Breadcrumb.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_Breadcrumb);
        Thread.sleep(1000);
        overviewSignInPage_AuthHeading.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_AuthHeading);
        Thread.sleep(1000);
    }
    public void overviewCreate_SignInPage() throws InterruptedException {
        overviewSignInPage_HeadCreateAnAccount.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_HeadCreateAnAccount);
        Thread.sleep(1000);
        overviewSignInPage_CreateAnAccountText.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_CreateAnAccountText);
        Thread.sleep(1000);
        overviewSignInPage_EmailLabel.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_EmailLabel);
        Thread.sleep(1000);
        overviewSignInPage_EmailField.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_EmailField);
        Thread.sleep(1000);
        overviewSignInPage_CreateAccountButton.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_CreateAccountButton);
        Thread.sleep(1000);
        System.out.println("Create module is complete!");
    }
    public void overviewRegistered_SignInPage() throws InterruptedException {
        overviewSignInPage_HeadAlreadyRegistered.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_HeadAlreadyRegistered);
        Thread.sleep(1000);
        overviewSignInPage_EmailAddressField.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_EmailAddressField);
        Thread.sleep(1000);
        overviewSignInPage_PasswordField.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_PasswordField);
        Thread.sleep(1000);
        overviewSignInPage_ForgotPasswordLink.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_ForgotPasswordLink);
        Thread.sleep(1000);
        overviewSignInPage_SignInButton.isDisplayed();
        Highlighter.highlightElement(browser,overviewSignInPage_SignInButton);
        Thread.sleep(1000);
        System.out.println("Registered module is complete!");
    }


}
