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


*//*        sendSubmitButton_ContactUsPage.isDisplayed();
        Highlighter.highlightElement(browser,sendSubmitButton_ContactUsPage);
        Thread.sleep(1000);
        sendSubmitButton_ContactUsPage.click();*//*

        System.out.println("ContactUsMenu_Overview page is complete!");
    }*/

    /*public void overViewSignInMenu() throws InterruptedException {

    }*/

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/span")
    WebElement horizontalNavCallUsNowNumber;
    public void checkCallUsNumberText_horizontalNav(){
        horizontalNavCallUsNowNumber.isDisplayed();
        String  getCallUsNumber = horizontalNavCallUsNowNumber.getText();
        Highlighter.highlightElement(browser, horizontalNavCallUsNowNumber);
        Assertions.assertEquals("Call us now: 0123-456-789", getCallUsNumber);
        System.out.println("Call number is visible!");
    }

    @FindBy (id = "contact-link")
    WebElement contactUsMenu_horizontalNav;
    public void clickContactUsMenu_horizontalNav(){
        contactUsMenu_horizontalNav.isDisplayed();
        Highlighter.highlightElement(browser,contactUsMenu_horizontalNav);
        contactUsMenu_horizontalNav.click();
        System.out.println("Click ContactUs menu");
    }
    @FindBy (className = "login")
    WebElement signInMenu_HorizontalNav;
    public void clickSignInMenu_HorizontalNav(){
        signInMenu_HorizontalNav.isDisplayed();
        Highlighter.highlightElement(browser,signInMenu_HorizontalNav);
        signInMenu_HorizontalNav.click();
        System.out.println("Click SignIn menu");
    }
    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////


    /**
     * Search box field elements
     * 1. Search box field
     * 2. Typing Valida Data
     * 3. Typing Invalid Data
     * 4. Click Search button
     */
    @FindBy(id = "search_query_top")
    public WebElement searchBox;
    @FindBy(name = "submit_search")
    WebElement searchBox_SubmitButton;
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
    WebElement searchResultFound;
    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    WebElement searchResultNotFound;
    public void clickField_SearchBox(){
        searchBox.isDisplayed();
        Highlighter.highlightElement(browser,searchBox);
        searchBox.click();
        System.out.println("Click SearchBox field");
    }
    public void enterValidData_SearchBox(String validText){
        Highlighter.highlightElement(browser,searchBox);
        searchBox.clear();
        searchBox.sendKeys(validText);
    }
    public void enterInvalidData_SearchBox(String invalidText){
        Highlighter.highlightElement(browser,searchBox);
        searchBox.clear();
        searchBox.sendKeys(invalidText);
    }
    public void clickSubmitButton_SearchBox(){
        searchBox_SubmitButton.click();
    }
    public void searchResultFound_SearchBox(){
        Highlighter.highlightElement(browser,searchResultFound);
        searchResultFound.isDisplayed();
        String searchedText = searchResultFound.getText();
        System.out.println(searchedText);
    }
    public void searchResultNotFound_SearchBox(){
        Highlighter.highlightElement(browser,searchResultNotFound);
        searchResultNotFound.isDisplayed();
        String actualSearchedResult = searchResultNotFound.getText();
        Assertions.assertEquals("No results were found for your search \"purko\"",actualSearchedResult);
        System.out.println("No data for this search!");
    }
    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////

    /**
     * EDITORIAL module:
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
     * CMSinfo module Two:
     * 1. Come Visit Us
     * 2. Call Us
     * 3. How to pay
     */
    // Come to Visit US
    @FindBy(xpath = "//*[@id=\"icon-truck\"]")
    public WebElement comeVisitUsIcon_CMSInfo;
    public void veryComeVisitUsIcon_CMSInfo(){
        Highlighter.highlightElement(browser, comeVisitUsIcon_CMSInfo);
        comeVisitUsIcon_CMSInfo.isDisplayed();
        System.out.println("Icon is visible");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/h3")
    WebElement comeVisitUsHeading_CMSInfo;
    public void veryComeVisitUsHeading_CMSInfo(){
        Highlighter.highlightElement(browser, comeVisitUsHeading_CMSInfo);
        String  getComeVisitUsHeading = comeVisitUsHeading_CMSInfo.getText();
        Assertions.assertEquals("Come Visit Us", getComeVisitUsHeading);
        System.out.println("Heading is correct and visible!");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/p")
    WebElement comeVisitUsParagraph_CMSInfo;
    public void veryComeVisitUsParagraph_CMSInfo(){
        Highlighter.highlightElement(browser, comeVisitUsParagraph_CMSInfo);
        String  getComeVisitUsParagraph = comeVisitUsParagraph_CMSInfo.getText();
        Assertions.assertEquals("We are located in Research Triangle Park, North Carolina, USA", getComeVisitUsParagraph);
        System.out.println("Paragraph is correct and visible!");
    }
    // Call Us
    @FindBy(xpath = "//*[@id=\"icon-phone\"]")
    public WebElement callUsIcon_CMSInfo;
    public void veryCallUsIcon_CMSInfo(){
        Highlighter.highlightElement(browser, callUsIcon_CMSInfo);
        callUsIcon_CMSInfo.isDisplayed();
        System.out.println("Icon is visible");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/h3")
    public WebElement callUsHeading_CMSInfo;
    public void veryCallUsHeading_CMSInfo(){
        Highlighter.highlightElement(browser, callUsHeading_CMSInfo);
        callUsHeading_CMSInfo.isDisplayed();
        System.out.println("Heading is correct and visible!");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/p")
    WebElement callUsParagraph_CMSInfo;
    public void veryCallUsParagraph_CMSInfo(){
        Highlighter.highlightElement(browser, callUsParagraph_CMSInfo);
        String  getComeVisitUsParagraph = callUsParagraph_CMSInfo.getText();
        Assertions.assertEquals("We appreciate your call. Please visit Selenium Framework", getComeVisitUsParagraph);
        System.out.println("Paragraph is correct and visible!");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/p/a")
    WebElement callUsParagraphButton_CMSInfo;
    public void clickCallUsParagraphButton_CMSInfo() throws InterruptedException {
        Highlighter.highlightElement(browser, callUsParagraphButton_CMSInfo);
        callUsParagraphButton_CMSInfo.click();
        Thread.sleep(2000);
        System.out.println("Paragraph button is clicked!");
    }

    // How to Pay Dues
    @FindBy(xpath = "//*[@id=\"icon-credit-card\"]")
    public WebElement howToPayDuesIcon_CMSInfo;
    public void veryHowToPayDuesIconCMSInfo(){
        howToPayDuesIcon_CMSInfo.isDisplayed();
        Highlighter.highlightElement(browser, howToPayDuesIcon_CMSInfo);
        howToPayDuesIcon_CMSInfo.isDisplayed();
        System.out.println("Icon is visible");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[3]/div/h3")
    WebElement howToPayDuesHeading_CMSInfo;
    public void veryHowToPayDuesHeading_CMSInfo(){
        Highlighter.highlightElement(browser, howToPayDuesHeading_CMSInfo);
        String  getHowToPayDuesHeading_CMSInfo = howToPayDuesHeading_CMSInfo.getText();
        Assertions.assertEquals("How to Pay dues", getHowToPayDuesHeading_CMSInfo);
        System.out.println("Heading is correct and visible!");
    }
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[3]/div/p")
    WebElement howToPayDuesParagraph_CMSInfo;
    public void veryHowToPayDuesParagraph_CMSInfo(){
        Highlighter.highlightElement(browser, howToPayDuesParagraph_CMSInfo);
        String  getHowToPayDuesParagraph_CMSInfo = howToPayDuesParagraph_CMSInfo.getText();
        Assertions.assertEquals("You can pay us by calling or use our online pay channels", getHowToPayDuesParagraph_CMSInfo);
        System.out.println("Paragraph is correct and visible!");
    }
    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////

    /**
     * CMS Info module Three:
     * 1. Heading 1
     * 2. Heading 2 bold
     * 3. Paragraph
     */
    @FindBy (xpath = "//*[@id=\"cmsinfo_block\"]/div[2]/h3")
    WebElement customBlockHeading_CMSInfo;
    public void veryCustomBlockHeading_CMSInfo(){
        customBlockHeading_CMSInfo.isDisplayed();
        Highlighter.highlightElement(browser, customBlockHeading_CMSInfo);
        String  getCustomBlockHeading_CMSInfo = customBlockHeading_CMSInfo.getText();
        Assertions.assertEquals("Custom Block", getCustomBlockHeading_CMSInfo);
        System.out.println("Bold Heading is correct and visible!");
    }
    @FindBy (xpath = "//*[@id=\"cmsinfo_block\"]/div[2]/p[1]/strong")
    WebElement customBlockHeadingBold_CMSInfo;
    public void veryCustomBlockHeadingBold_CMSInfo(){
        customBlockHeadingBold_CMSInfo.isDisplayed();
        Highlighter.highlightElement(browser, customBlockHeadingBold_CMSInfo);
        String  getCustomBlockHeadingBold_CMSInfo = customBlockHeadingBold_CMSInfo.getText();
        Assertions.assertEquals("This is a custom block of text", getCustomBlockHeadingBold_CMSInfo);
        System.out.println("Bold Heading is correct and visible!");
    }
    @FindBy (xpath = "//*[@id=\"cmsinfo_block\"]/div[2]/p[2]")
    WebElement customBlockParagraph_CMSInfo;
    public void veryCustomBlockParagraph_CMSInfo(){
        customBlockParagraph_CMSInfo.isDisplayed();
        Highlighter.highlightElement(browser, customBlockParagraph_CMSInfo);
        String  getCustomBlockParagraphText_CMSInfo = customBlockParagraph_CMSInfo.getText();
        Assertions.assertEquals("Selenium Framework website was designed solely to help folks get over the fear of Automation. The website was an inspiration from the fact that there is no website that can bridge the gaps between the differences among various programming languages and help non-programmers get a taste of Automation.", getCustomBlockParagraphText_CMSInfo);
        System.out.println("Paragraph is correct and visible!");
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
    WebElement footerHeading_FollowUs;
    public void veryFooterFollowUsHeading(){
        Highlighter.highlightElement(browser, footerHeading_FollowUs);
        String  getFooterFollowUsHeading = footerHeading_FollowUs.getText();
        Assertions.assertEquals("Follow us", getFooterFollowUsHeading);
    }
    @FindBy (xpath = "//*[@id=\"social_block\"]/ul/li[1]/a")
    WebElement footerFacebookLink_FollowUs;
    public void veryLinkFooterFacebook() throws InterruptedException {
        footerFacebookLink_FollowUs.isDisplayed();
        Highlighter.highlightElement(browser,footerFacebookLink_FollowUs);
        if (browser.getPageSource().contains("https://www.facebook.com/groups/525066904174158/")){
            // method Keys.chord
            String clicklinkFacebook = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerFacebookLink_FollowUs.sendKeys(clicklinkFacebook);
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
    WebElement ooterTwitterLink_FollowUs;
    public void veryLinkFooterTwitter() throws InterruptedException {
        ooterTwitterLink_FollowUs.isDisplayed();
        Highlighter.highlightElement(browser,ooterTwitterLink_FollowUs);
        if (browser.getPageSource().contains("https://twitter.com/seleniumfrmwrk")){
            // method Keys.chord
            String clicklinkTwiter = Keys.chord(Keys.CONTROL, Keys.ENTER);
            ooterTwitterLink_FollowUs.sendKeys(clicklinkTwiter);
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
    WebElement footerYouTubeLink_FollowUs;
    public void veryLinkFooterYouTube() throws InterruptedException {
        footerYouTubeLink_FollowUs.isDisplayed();
        Highlighter.highlightElement(browser,footerYouTubeLink_FollowUs);
        if (browser.getPageSource().contains("https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA")){
            // method Keys.chord
            String clicklinkTwiter = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerYouTubeLink_FollowUs.sendKeys(clicklinkTwiter);
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

    /**
     * FOOTER - Store information:
     * 1. Address
     * 2. Call us now
     * 3. Email
     */
    @FindBy (xpath = "//*[@id=\"block_contact_infos\"]/div/ul/li[1]")
    WebElement footerAddress_StoreInfo;
    public void veryFooterAddress_StoreInfo(){
        Highlighter.highlightElement(browser, footerAddress_StoreInfo);
        String  getFooterNewsLetterHeading = footerAddress_StoreInfo.getText();
        Assertions.assertEquals("Selenium Framework, Research Triangle Park, North Carolina, USA", getFooterNewsLetterHeading);
    }
    @FindBy (xpath = "//*[@id=\"block_contact_infos\"]/div/ul/li[2]")
    WebElement footerCallUsNow_StoreInfo;
    public void veryFooterCallUsNow_StoreInfo(){
        Highlighter.highlightElement(browser, footerCallUsNow_StoreInfo);
        String  getFooterNewsLetterHeading = footerCallUsNow_StoreInfo.getText();
        Assertions.assertEquals("Call us now: (347) 466-7432", getFooterNewsLetterHeading);
    }
    @FindBy (xpath = "//*[@id=\"block_contact_infos\"]/div/ul/li[3]")
    WebElement footerEmail_StoreInfo;
    public void veryFooterEmail_StoreInfo(){
        Highlighter.highlightElement(browser, footerEmail_StoreInfo);
        String  getFooterNewsLetterHeading = footerEmail_StoreInfo.getText();
        Assertions.assertEquals("Email: support@seleniumframework.com", getFooterNewsLetterHeading);
    }
    ////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////

}
