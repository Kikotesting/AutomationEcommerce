package eCommercePages;

import KikoCustom.Highlighter;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver browser;

    public HomePage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }

    @FindBy (xpath = "//*[@id=\"editorial_block_center\"]/h1")
    WebElement headingOneBottom;
    public void veryBottomHeader(){
        Highlighter.highlightElement(browser, headingOneBottom);
        String  getHeadingOneBottom = headingOneBottom.getText();
        Assertions.assertEquals("Automation Practice Website", getHeadingOneBottom);
    }
    @FindBy (xpath = "//*[@id=\"editorial_block_center\"]/h2")
    WebElement headingTwoBottom;
    public void veryBottomHeaderTwo(){
        Highlighter.highlightElement(browser, headingTwoBottom);
        String  getHeadingTwoBottom = headingTwoBottom.getText();
        Assertions.assertEquals("Practice Selenium", getHeadingTwoBottom);
    }

    @FindBy (xpath = "//*[@id=\"editorial_block_center\"]/div/p")
    WebElement paragraphBottom;
    public void veryBottomParagraph(){
        Highlighter.highlightElement(browser, paragraphBottom);
        String  getParagraphBottom = paragraphBottom.getText();
        Assertions.assertEquals("This sample ecommerce website is being used by www.seleniumframework.com website to help pracitce exercises on a real-time ecommerce website. Different workflows for adding products to cart, checking out car, making payments etc. workflows will be automated using Automation scripts and this website is a candidate for the same. Please contact support@seleniumframework.com for any further questions. Thanks.", getParagraphBottom);
    }

    @FindBy (xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/span/strong")
    WebElement callUsNumber;

    // Contact link menu
    @FindBy (id = "contact-link")
    WebElement contactMenu;

    // SignIn link menu
    @FindBy (className = "login")
    WebElement signInMenu;



}
