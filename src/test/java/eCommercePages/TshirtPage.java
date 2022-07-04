package eCommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtPage {
    WebDriver browser;

    public TshirtPage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }


}
