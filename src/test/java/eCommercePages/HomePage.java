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

    ///////////////////////////////////////////////////////////
    // EDITORIAL -  Module
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
