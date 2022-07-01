package eCommercePages;

import CustomScripts.Highlighter;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import static java.util.concurrent.TimeUnit.SECONDS;

public class HomePage {

    WebDriver browser;
    // Page factory construction
    public HomePage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }

    ///////////////////////////////////////////////////////////
    // Top horizontal bar: number, contactus menu, signIn menu
    @FindBy (xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/span")
    WebElement callUsNumber;
    public void checkCallUsNumberText(){
        String  getCallUsNumber = callUsNumber.getText();
        Highlighter.highlightElement(browser, callUsNumber);
        Assertions.assertEquals("Call us now: 0123-456-789", getCallUsNumber);
    }
    @FindBy (id = "contact-link")
    WebElement contactUsMenu;
    public void checkContactUsMenuText(){
        contactUsMenu.isDisplayed();
        Highlighter.highlightElement(browser, contactUsMenu);
        String  getContactMenuText = contactUsMenu.getText().trim();
        Assertions.assertEquals("Contact us", getContactMenuText);
        System.out.println("Button text and element are verified!");
    }
    public void clickContactUsMenu() throws InterruptedException {
        Highlighter.highlightElement(browser,contactUsMenu);
        contactUsMenu.click();
        System.out.println("Click ContactUs Menu");
    }
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    WebElement customerServiceHeading_CustomUsPage;
    @FindBy(xpath = "//*[@id=\"center_column\"]/form")
    WebElement messageForm_CustomUsPage;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailField_CustomUsPage;
    @FindBy(xpath = "//*[@id=\"id_order\"]")
    WebElement orderReferenceField_CustomUsPage;
    @FindBy(xpath = "//*[@id=\"message\"]")
    WebElement textArea_CustomUsPage;
    @FindBy(xpath = "//*[@id=\"id_contact\"]")
    WebElement subjectSelectingField_CustomUsPage;

    @FindBy(xpath = "//*[@id=\"uniform-fileUpload\"]")
    WebElement uploaderField_CustomUsPage;
    @FindBy(xpath = "//*[@id=\"uniform-fileUpload\"]/span[2]")
    WebElement uploaderAttachFileButton;
    public void overViewContactUsMenu() throws InterruptedException {
        Thread.sleep(2000);
        customerServiceHeading_CustomUsPage.isDisplayed();
        Highlighter.highlightElement(browser,customerServiceHeading_CustomUsPage);
        Thread.sleep(1000);
        messageForm_CustomUsPage.isDisplayed();
        Highlighter.highlightElement(browser,messageForm_CustomUsPage);
        Thread.sleep(1000);
        emailField_CustomUsPage.isDisplayed();
        Highlighter.highlightElement(browser,emailField_CustomUsPage);
        Thread.sleep(1000);
        orderReferenceField_CustomUsPage.isDisplayed();
        Highlighter.highlightElement(browser,orderReferenceField_CustomUsPage);
        Thread.sleep(1000);
        textArea_CustomUsPage.isDisplayed();
        Highlighter.highlightElement(browser,textArea_CustomUsPage);
        Thread.sleep(1000);

        subjectSelectingField_CustomUsPage.isDisplayed();
        Highlighter.highlightElement(browser,subjectSelectingField_CustomUsPage);
        subjectSelectingField_CustomUsPage.click();
        Select select = new Select(subjectSelectingField_CustomUsPage);
        select.selectByValue("2");
        boolean isSelectedTwo = subjectSelectingField_CustomUsPage.isSelected();
        Thread.sleep(1000);
        select.deselectByValue("2");
        select.selectByValue("1");
        boolean isSelectedOne = subjectSelectingField_CustomUsPage.isSelected();
        Thread.sleep(1000);
        select.deselectByValue("1");

        uploaderField_CustomUsPage.isDisplayed();
        Highlighter.highlightElement(browser,uploaderField_CustomUsPage);
        Thread.sleep(1000);

        System.out.println("ContactUsMenu_Overview page is complete!");
    }
    @FindBy (className = "login")
    WebElement signInMenu;
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    WebElement Authentication_SignInMenu;
    @FindBy(xpath = "//*[@id=\"create-account_form\"]/h3")
    WebElement createAccountSection_SignInMenu;
    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    WebElement createAnAccountButton_SignInMenu;
    @FindBy(xpath = "//*[@id=\"create-account_form\"]/div/p")
    WebElement emailAddress_SignInMenu;
    @FindBy(xpath = "//*[@id=\"login_form\"]/h3")
    WebElement alreadyRegistered_SignInMenu;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailAddressField_alreadyRegistered_SignInMenu;
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElement passwordField_alreadyRegistered_SignInMenu;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    WebElement signInSubmitButton_SignInMenu;
    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
    WebElement breadcrumb_SignInMenu;


    public void checkSignInMenuText(){
        Highlighter.highlightElement(browser, signInMenu);
        String  getSignInMenuText = signInMenu.getText().trim();
        Assertions.assertEquals("Sign in", getSignInMenuText);
    }
    public void clickSignInMenu() throws InterruptedException {
        signInMenu.isDisplayed();
        Highlighter.highlightElement(browser,signInMenu);
        signInMenu.click();
        System.out.println("Click SignIn menu");
    }
    public void overViewSignInMenu() throws InterruptedException {
        Authentication_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,Authentication_SignInMenu);
        Thread.sleep(1000);
        createAccountSection_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,createAccountSection_SignInMenu);
        Thread.sleep(1000);
        emailAddress_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,emailAddress_SignInMenu);
        Thread.sleep(1000);
        createAnAccountButton_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,createAnAccountButton_SignInMenu);
        Thread.sleep(1000);
        alreadyRegistered_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,alreadyRegistered_SignInMenu);
        Thread.sleep(1000);
        emailAddressField_alreadyRegistered_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,emailAddressField_alreadyRegistered_SignInMenu);
        Thread.sleep(1000);
        passwordField_alreadyRegistered_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,passwordField_alreadyRegistered_SignInMenu);
        Thread.sleep(1000);
        signInSubmitButton_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,signInSubmitButton_SignInMenu);
        Thread.sleep(1000);
        breadcrumb_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,breadcrumb_SignInMenu);
        Thread.sleep(1000);
        System.out.println("SignInMenu_Overview page is complete!");
    }
    ///////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////
    // EDITORIAL - Module
    @FindBy (xpath = "//*[@id=\"editorial_block_center\"]/h1")
    WebElement bottomHeadingOneBottom;
    public void veryBottomHeader(){
        Highlighter.highlightElement(browser, bottomHeadingOneBottom);
        String  getHeadingOneBottom = bottomHeadingOneBottom.getText();
        Assertions.assertEquals("Automation Practice Website", getHeadingOneBottom);
    }
    @FindBy (xpath = "//*[@id=\"editorial_block_center\"]/h2")
    WebElement bottomHeadingTwoBottom;
    public void veryBottomHeaderTwo(){
        Highlighter.highlightElement(browser, bottomHeadingTwoBottom);
        String  getHeadingTwoBottom = bottomHeadingTwoBottom.getText();
        Assertions.assertEquals("Practice Selenium", getHeadingTwoBottom);
    }
    @FindBy (xpath = "//*[@id=\"editorial_block_center\"]/div/p")
    WebElement bottomParagraph;
    public void veryBottomParagraph(){
        Highlighter.highlightElement(browser, bottomParagraph);
        String  getBottomParagraph = bottomParagraph.getText();
        Assertions.assertEquals("This sample ecommerce website is being used by www.seleniumframework.com website to help pracitce exercises on a real-time ecommerce website. Different workflows for adding products to cart, checking out car, making payments etc. workflows will be automated using Automation scripts and this website is a candidate for the same. Please contact support@seleniumframework.com for any further questions. Thanks.", getBottomParagraph);
    }
    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    // CMSinfo - Module
    @FindBy(xpath = "//*[@id=\"icon-truck\"]")
    public WebElement comeVisitUsIcon;
    public void veryComeVisitUsIcon(){
        Highlighter.highlightElement(browser, comeVisitUsIcon);
        comeVisitUsIcon.isDisplayed();
        System.out.println("Icon is visible");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/h3")
    WebElement ComeVisitUsHeading;
    public void veryComeVisitUsHeading(){
        Highlighter.highlightElement(browser, ComeVisitUsHeading);
        String  getComeVisitUsHeading = ComeVisitUsHeading.getText();
        Assertions.assertEquals("Come Visit Us", getComeVisitUsHeading);
        System.out.println("Heading is correct and visible!");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/p")
    WebElement ComeVisitUsParagraph;
    public void veryComeVisitUsParagraph(){
        Highlighter.highlightElement(browser, ComeVisitUsParagraph);
        String  getComeVisitUsParagraph = ComeVisitUsParagraph.getText();
        Assertions.assertEquals("We are located in Research Triangle Park, North Carolina, USA", getComeVisitUsParagraph);
        System.out.println("Paragraph is correct and visible!");
    }
    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    // MainMENU - Pages
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement menuWomen;
    public void navigateToMenuWomen() throws InterruptedException {
        Actions actions = new Actions(browser);
        Thread.sleep(2000);
        actions.moveToElement(menuWomen);
        actions.perform();
        Thread.sleep(2000);
    }
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement menuDresses;
    public void navigateToMenuDresses() throws InterruptedException {
        Actions actions = new Actions(browser);
        Thread.sleep(2000);
        actions.moveToElement(menuDresses);
        actions.perform();
        Thread.sleep(2000);
    }
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement menuTShirts;
    public void navigateToMenuTShirts() throws InterruptedException {
        Actions actions = new Actions(browser);
        Thread.sleep(2000);
        actions.moveToElement(menuTShirts);
        actions.perform();
        Thread.sleep(2000);
    }
    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    // FOOTER - NewsLetter: Heading, InputBar, subscribedButton
    @FindBy (xpath = "//*[@id=\"newsletter_block_left\"]/h4")
    WebElement footerNewsLetterHeading;
    public void veryFooterNewsLetterHeading(){
        Highlighter.highlightElement(browser, footerNewsLetterHeading);
        String  getFooterNewsLetterHeading = footerNewsLetterHeading.getText();
        Assertions.assertEquals("Newsletter", getFooterNewsLetterHeading);
    }
    @FindBy (id = "newsletter-input")
    WebElement newsLetterInputBar;
    public void clickNewsLetterInputBar(){
        newsLetterInputBar.click();
    }
    public void typingInNewsLetterInputBar(){
        Highlighter.highlightElement(browser,newsLetterInputBar);
        newsLetterInputBar.sendKeys("kik2o3@mail.bg");
    }
    @FindBy (xpath = "//*[@id=\"newsletter_block_left\"]/div/form/div/button")
    WebElement newsLetterSubmitButton;
    public void pressNewsLetterSubmitButton(){
        Highlighter.highlightElement(browser,newsLetterSubmitButton);
        newsLetterSubmitButton.click();
    }
    @FindBy(xpath = "//*[@id=\"columns\"]/p")
    WebElement subscribedMessage;
    public void verifySubscribedMessage(){
        Highlighter.highlightElement(browser,subscribedMessage);

        String getActualSubscribedMessage = subscribedMessage.getText();

        String companySubscribedMessage = "Newsletter : You have successfully subscribed to this newsletter.";
        String companyRegisteredMessage = "Newsletter : This email address is already registered.";

        if (getActualSubscribedMessage == companySubscribedMessage ){
            System.out.println("First condition is true");
            Assertions.assertEquals(companySubscribedMessage, getActualSubscribedMessage);
        }else {
            System.out.println("Second condition is true");
            Assertions.assertEquals(companyRegisteredMessage, getActualSubscribedMessage);
        }

    }

    // FOOTER - Follow us: Facebook, Twiter, Youtube - links
    @FindBy (xpath = "//*[@id=\"social_block\"]/h4")
    WebElement footerFollowUsHeading;
    public void veryFooterFollowUsHeading(){
        Highlighter.highlightElement(browser, footerFollowUsHeading);
        String  getFooterFollowUsHeading = footerFollowUsHeading.getText();
        Assertions.assertEquals("Follow us", getFooterFollowUsHeading);
    }
    @FindBy (xpath = "//*[@id=\"social_block\"]/ul/li[1]/a")
    WebElement footerLinkFacebook;
    public void veryLinkFooterFacebook() throws InterruptedException {
        footerLinkFacebook.isDisplayed();
        Highlighter.highlightElement(browser,footerLinkFacebook);
        if (browser.getPageSource().contains("https://www.facebook.com/groups/525066904174158/")){
            // method Keys.chord
            String clicklinkFacebook = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerLinkFacebook.sendKeys(clicklinkFacebook);
            //List with the views
            ArrayList<String> facebookView = new ArrayList<>(browser.getWindowHandles());
            //Switch to open tab
            browser.switchTo().window(facebookView.get(1));
            Thread.sleep(2000);
            browser.close();
            //Switch to first tab
            browser.switchTo().window(facebookView.get(0));
            Thread.sleep(2000);
            System.out.println("Link is ok:" + "Facebook");
        }else {
            System.out.println("Not contains the referal link!");
        }
    }
    @FindBy (xpath = "//*[@id=\"social_block\"]/ul/li[2]/a")
    WebElement footerLinkTwiter;
    public void veryLinkFooterTwitter() throws InterruptedException {
        footerLinkTwiter.isDisplayed();
        Highlighter.highlightElement(browser,footerLinkTwiter);
        if (browser.getPageSource().contains("https://twitter.com/seleniumfrmwrk")){
            // method Keys.chord
            String clicklinkTwiter = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerLinkTwiter.sendKeys(clicklinkTwiter);
            //List with the views
            ArrayList<String> twiterView = new ArrayList<>(browser.getWindowHandles());
            //Switch to open tab
            browser.switchTo().window(twiterView.get(1));
            Thread.sleep(3000);
            browser.close();
            //Switch to first tab
            browser.switchTo().window(twiterView.get(0));
            Thread.sleep(3000);
            System.out.println("Link is ok:" + "Twitter");
        }else {
            System.out.println("Not contains the referal link!");
        }

    }
    @FindBy (xpath = "//*[@id=\"social_block\"]/ul/li[3]/a")
    WebElement footerLinkYouTube;
    public void veryLinkFooterYouTube() throws InterruptedException {
        footerLinkYouTube.isDisplayed();
        Highlighter.highlightElement(browser,footerLinkYouTube);
        if (browser.getPageSource().contains("https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA")){
            // method Keys.chord
            String clicklinkTwiter = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerLinkYouTube.sendKeys(clicklinkTwiter);
            //List with the views
            ArrayList<String> YoutubeView = new ArrayList<>(browser.getWindowHandles());
            //Switch to open tab
            browser.switchTo().window(YoutubeView.get(1));
            Thread.sleep(2000);
            browser.close();
            //Switch to first tab
            browser.switchTo().window(YoutubeView.get(0));
            Thread.sleep(2000);
            System.out.println("Link is ok:" + "Youtube");
        }else {
            System.out.println("Not contains the referal link!");
        }

    }



}
