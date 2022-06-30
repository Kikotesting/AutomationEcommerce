package eCommercePages;

import KikoCustom.Highlighter;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;

public class HomePage {

    WebDriver browser;
    // Page factory construction
    public HomePage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }
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

    // CMSinfo - Module
    @FindBy(xpath = "//*[@id=\"icon-truck\"]")
    WebElement comeVisitUsIcon;
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
    // FOOTER - NewsLetter social module
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
    @FindBy (xpath = "//*[@id=\"social_block\"]/h4")
    WebElement footerFollowUsHeading;
    public void veryFooterFollowUsHeading(){
        Highlighter.highlightElement(browser, footerFollowUsHeading);
        String  getFooterFollowUsHeading = footerFollowUsHeading.getText();
        Assertions.assertEquals("Follow us", getFooterFollowUsHeading);
    }


    @FindBy (xpath = "//*[@id=\"social_block\"]/ul/li[1]/a")
    WebElement footerLinkFacebook;
    public void linkFooterFaceebok() throws InterruptedException {
        footerLinkFacebook.isDisplayed();
        if (browser.getPageSource().contains("https://www.facebook.com/groups/525066904174158/")){
            // method Keys.chord
            String clicklinkFacebook = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerLinkYouTube.sendKeys(clicklinkFacebook);
            Thread.sleep(3000);
            //List with the views
            ArrayList<String> w = new ArrayList<>(browser.getWindowHandles());
            //Switch to open tab
            browser.switchTo().window(w.get(1));
            Thread.sleep(3000);
            //Switch to first tab
            browser.switchTo().window(w.get(0));
            Thread.sleep(3000);
            System.out.println("Link is ok:" + "Facebook");
        }else {
            System.out.println("Not contains the referal link!");
        }
    }
    @FindBy (xpath = "//*[@id=\"social_block\"]/ul/li[2]/a")
    WebElement footerLinkTwiter;
    public void linkFooterTwitter(){
        footerLinkTwiter.isDisplayed();
        if (browser.getPageSource().contains("https://twitter.com/seleniumfrmwrk")){
            System.out.println("Link:" + "Twitter");
            String clicklinkTwitter = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerLinkYouTube.sendKeys(clicklinkTwitter);
        }else {
            System.out.println("Not contains the referal link!");
        }
    }
    @FindBy (xpath = "//*[@id=\"social_block\"]/ul/li[3]/a")
    WebElement footerLinkYouTube;
    public void linkFooterYouTube(){
        footerLinkYouTube.isDisplayed();
        if (browser.getPageSource().contains("https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA")){
            System.out.println("Link:" + "YouTube");
            String clicklinkYouTube = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerLinkYouTube.sendKeys(clicklinkYouTube);
        }else {
            System.out.println("Not contains the referal link!");
        }
    }





























    @FindBy (xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/span/strong")
    WebElement callUsNumber;
    public void veryCallUsNumber(){
        Highlighter.highlightElement(browser, callUsNumber);
        String  getCallUsNumber = callUsNumber.getText();
        Assertions.assertEquals("0123-456-789", getCallUsNumber);
    }

    // Contact link menu
    @FindBy (id = "contact-link")
    WebElement contactMenu;
    public void veryContactUsMenu(){
        Highlighter.highlightElement(browser, contactMenu);
        String  getCallUsNumber = callUsNumber.getText();
        Assertions.assertEquals("0123-456-789", getCallUsNumber);
    }

    // SignIn link menu
    @FindBy (className = "login")
    WebElement signInMenu;
    public void verySignInMenu(){
        Highlighter.highlightElement(browser, callUsNumber);
        String  getCallUsNumber = callUsNumber.getText();
        Assertions.assertEquals("0123-456-789", getCallUsNumber);
    }



}
