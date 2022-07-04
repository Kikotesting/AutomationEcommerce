package eCommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
    WebDriver browser;
    // Page factory construction
    public WomenPage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }
}
