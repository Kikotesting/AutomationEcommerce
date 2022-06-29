package eCommercePages;

import KikoCustom.Highlighter;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver browser;
    // Page factory construction
    public HomePage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }

    // Editorial Module
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
    @FindBy (xpath = "//*[@id=\"editorial_block_center\"]/div/p/text()")
    WebElement bottomParagraph;
    public void veryBottomParagraph(){
        Highlighter.highlightElement(browser, bottomParagraph);
        String  getBottomParagraph = bottomParagraph.getText();
        Assertions.assertEquals("This sample ecommerce website is being used by www.seleniumframework.com website to help pracitce exercises on a real-time ecommerce website. Different workflows for adding products to cart, checking out car, making payments etc. workflows will be automated using Automation scripts and this website is a candidate for the same. Please contact support@seleniumframework.com for any further questions. Thanks.", getBottomParagraph);
    }

    // FOOTER - NewsLetter social module
    @FindBy (xpath = "//*[@id=\"newsletter_block_left\"]/h4")
    WebElement footerNewsLetterHeadings;


    @FindBy (xpath = "//*[@id=\"social_block\"]/h4")
    WebElement footerFollowUs;
    @FindBy (linkText = "https://www.facebook.com/groups/525066904174158/")
    WebElement footerLinkFacebook;
    @FindBy (linkText = "https://twitter.com/seleniumfrmwrk")
    WebElement footerLinkTwiter;
    @FindBy (linkText = "https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA")
    WebElement footerLinkYouTube;





























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
