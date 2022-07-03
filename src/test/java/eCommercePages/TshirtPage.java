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

    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement menuTShirts;
    public void clickToMenuTShirt(){
        Actions actions = new Actions(browser);
        actions.moveToElement(menuTShirts);
        actions.build().perform();
    }




}
