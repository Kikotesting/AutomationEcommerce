package eCommercePages;

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
        String  getHeadingOneBottom = headingOneBottom.getText();
        Assertions.assertEquals("Automation Practice Website", getHeadingOneBottom);
    }

    @FindBy (xpath = "//*[@id=\"editorial_block_center\"]/h2")
    WebElement headingTwoBottom;

    @FindBy (xpath = "//*[@id=\"editorial_block_center\"]/div/p")
    WebElement paragraphBottom;

    @FindBy (xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/span/strong")
    WebElement callUsNumber;

    // Contact link menu
    @FindBy (id = "contact-link")
    WebElement contactMenu;

    // SignIn link menu
    @FindBy (className = "login")
    WebElement signInMenu;



}
