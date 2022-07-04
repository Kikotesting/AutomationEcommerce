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

public class HomePage{

    WebDriver browser;
    // Page factory construction
    public HomePage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }





    /*public void overViewContactUsMenu() throws InterruptedException {
        Thread.sleep(2000);
        customerServiceHeading_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,customerServiceHeading_ContactUsPage);
        Thread.sleep(1000);
        messageForm_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,messageForm_ContactUsPage);
        Thread.sleep(1000);
        emailField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,emailField_ContactUsPage);
        Thread.sleep(1000);
        orderReferenceField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,orderReferenceField_ContactUsPage);
        Thread.sleep(1000);
        textArea_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,textArea_ContactUsPage);
        Thread.sleep(1000);

        subjectSelectingField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,subjectSelectingField_ContactUsPage);
        subjectSelectingField_ContactUsPage.click();
        Select select = new Select(subjectSelectingField_ContactUsPage);
        select.selectByValue("2");
        Thread.sleep(1000);
        subjectSelectingField_ContactUsPage.click();
        select.selectByValue("1");
        Thread.sleep(1000);
        subjectSelectingField_ContactUsPage.click();
        select.selectByValue("0");
        Thread.sleep(1000);
        subjectSelectingField_ContactUsPage.click();

        uploaderField_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,uploaderField_ContactUsPage);
        Thread.sleep(1000);

        uploaderAttachFileButton_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,uploaderAttachFileButton_ContactUsPage);
        Thread.sleep(1000);

*//*        sendSubmitButton_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,sendSubmitButton_ContactUsPage);
        Thread.sleep(1000);
        sendSubmitButton_ContactUsPage.click();*//*

        System.out.println("ContactUsMenu_Overview page is complete!");
    }*/

    /*public void overViewSignInMenu() throws InterruptedException {
        Authentication_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,Authentication_SignInMenu);
        Thread.sleep(1000);
        breadcrumb_SignInMenu.isDisplayed();
        Highlighter.highlightElement(browser,breadcrumb_SignInMenu);
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
        forgotPassword_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,forgotPassword_ContactUsPage);
        Thread.sleep(1000);
        System.out.println("SignInMenu_Overview page is complete!");
    }*/
    ///////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////
    // SearchBox - Module

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    WebElement searchTextResult;
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
    WebElement searchResultFound;
/*    public void invalidDataSearch(){
        Highlighter.highlightElement(browser,searchBox);
        searchBox.isDisplayed();
        searchBox.click();
        searchBox.sendKeys("Kiko");
        searchBox_SubmitButton.click();
        String searchedText = searchTextResult.getText();
        Highlighter.highlightElement(browser,searchTextResult);
        Assertions.assertEquals("No results were found for your search \"Kiko\"",searchedText);
        System.out.println("No data for this search!");
    }
    public void validDataSearch(){
        Highlighter.highlightElement(browser,searchBox);
        searchBox.isDisplayed();
        searchBox.click();
        searchBox.sendKeys("dresses");
        searchBox_SubmitButton.click();
        System.out.println("Locate the searchBox and clicked!");
        searchResultFound.isDisplayed();
        Highlighter.highlightElement(browser,searchResultFound);
        String searchedText = searchResultFound.getText();
        System.out.println(searchedText);
    }*/


    /**
     * Editorial module:
     */
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

    /**
     * CMSinfo module:
     */
    @FindBy(xpath = "//*[@id=\"icon-truck\"]")
    public WebElement comeVisitUsIcon_CMSInfo;
    public void veryComeVisitUsIcon(){
        Highlighter.highlightElement(browser, comeVisitUsIcon_CMSInfo);
        comeVisitUsIcon_CMSInfo.isDisplayed();
        System.out.println("Icon is visible");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/h3")
    WebElement ComeVisitUsHeading_CMSInfo;
    public void veryComeVisitUsHeading(){
        Highlighter.highlightElement(browser, ComeVisitUsHeading_CMSInfo);
        String  getComeVisitUsHeading = ComeVisitUsHeading_CMSInfo.getText();
        Assertions.assertEquals("Come Visit Us", getComeVisitUsHeading);
        System.out.println("Heading is correct and visible!");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/p")
    WebElement ComeVisitUsParagraph_CMSInfo;
    public void veryComeVisitUsParagraph(){
        Highlighter.highlightElement(browser, ComeVisitUsParagraph_CMSInfo);
        String  getComeVisitUsParagraph = ComeVisitUsParagraph_CMSInfo.getText();
        Assertions.assertEquals("We are located in Research Triangle Park, North Carolina, USA", getComeVisitUsParagraph);
        System.out.println("Paragraph is correct and visible!");
    }
    @FindBy (xpath = "//*[@id=\"cmsinfo_block\"]/div[2]/h3")
    WebElement customBlockHeading_CMSInfo;
    @FindBy (xpath = "//*[@id=\"cmsinfo_block\"]/div[2]/p[1]/strong")
    WebElement customBlockHeadingStrong_CMSInfo;
    @FindBy (xpath = "//*[@id=\"cmsinfo_block\"]/div[2]/p[2]")
    WebElement customBlockParagraph_CMSInfo;
    public void veryCustomBlockText(){
        Highlighter.highlightElement(browser, customBlockHeading_CMSInfo);
        customBlockHeading_CMSInfo.isDisplayed();
        Highlighter.highlightElement(browser, customBlockHeadingStrong_CMSInfo);
        customBlockHeadingStrong_CMSInfo.isDisplayed();
        Highlighter.highlightElement(browser, customBlockParagraph_CMSInfo);
        customBlockParagraph_CMSInfo.isDisplayed();
        String  getCustomBlockHeadingText = customBlockHeading_CMSInfo.getText();
        Assertions.assertEquals("Custom Block", getCustomBlockHeadingText);
    }
    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////

    /**
     * FOOTER - NewsLetter:
     * 1. Heading
     * 2. InputBar
     * 3. subscribedButton
     */
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
    public void typingInNewsLetterInputBar(String emailData){
        Highlighter.highlightElement(browser,newsLetterInputBar);
        newsLetterInputBar.sendKeys(emailData);
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
        if (getActualSubscribedMessage.equals(companySubscribedMessage)){
            System.out.println("First condition is true\n" + companySubscribedMessage);

        }else if (getActualSubscribedMessage.equals(companyRegisteredMessage)){
            System.out.println("Second condition is true\n" + companyRegisteredMessage);
        }else {
            System.out.println("??????");
        }

    }
    ///////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////

    /**
     * FOOTER - Follow us links:
     * 1. Heading
     * 2. Facebook link
     * 3. Twiter link
     * 4. Youtube link
     */
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
    ////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////

}
