package eCommercePages;

import eCommerceSetup.setupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalPage extends setupPage {
    WebDriver browser;
    public GlobalPage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public WebElement menuWomen;
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    public WebElement menuWomen_pageHeading;
    @FindBy(xpath = "//*[@id=\"selectProductSort\"]")
    public WebElement menuWomen_sortByFilter;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
    WebElement menuWomen_TopsTShirts;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a")
    WebElement menuWomen_TopsBlouses;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a")
    WebElement menuWomen_DressesCasual;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[2]/a")
    WebElement menuWomen_DressesEvening;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a")
    WebElement menuWomen_DressesSummer;
    public void clickMenuWomen(){
        menuWomen.click();
    }

/*    public void navigateToMenuWomen() throws InterruptedException {
        Thread.sleep(1000);
        actions.moveToElement(menuWomen);
        actions.perform();
        System.out.println("Hover the WomenMENU");
        Thread.sleep(1000);

        menuWomenTopsTShirts.isDisplayed();
        actions.moveToElement(menuWomenTopsTShirts);
        actions.perform();
        System.out.println("Hover the WomenMENU->Tops-Tshirts");
        Thread.sleep(1000);
        menuWomenTopsBlouses.isDisplayed();
        actions.moveToElement(menuWomenTopsBlouses);
        actions.perform();
        System.out.println("Hover the WomenMENU->Tops-Blouses");
        Thread.sleep(1000);

        actions.moveToElement(menuWomenDressesCasual);
        actions.perform();
        System.out.println("Hover the WomenMENU->Dresses-Casual");
        Thread.sleep(1000);
        actions.moveToElement(menuWomenDressesEvening);
        actions.perform();
        System.out.println("Hover the WomenMENU->Dresses-Evening");
        Thread.sleep(1000);
        actions.moveToElement(menuWomenDressesSummer);
        actions.perform();
        System.out.println("Hover the WomenMENU->Dresses-Summer");
        Thread.sleep(1000);
    }*/
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement menuDresses;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")
    WebElement menuDressesCasual;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    WebElement menuDressesEvening;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
    WebElement menuDressesSummer;
    public void navigateToMenuDresses() throws InterruptedException {
        Actions actions = new Actions(browser);
        Thread.sleep(1000);
        actions.moveToElement(menuDresses);
        actions.perform();
        System.out.println("Hover the DressesMENU");
        Thread.sleep(1000);

        actions.moveToElement(menuDressesCasual);
        actions.perform();
        System.out.println("Hover the DressesMENU->Casual");
        Thread.sleep(1000);
        actions.moveToElement(menuDressesEvening);
        actions.perform();
        System.out.println("Hover the DressesMENU->Evening");
        Thread.sleep(1000);
        actions.moveToElement(menuDressesSummer);
        actions.perform();
        System.out.println("Hover the DressesMENU->Summer");
        Thread.sleep(1000);
    }
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement menuTShirts;
    public void navigateToMenuTShirts() throws InterruptedException {
        Actions actions = new Actions(browser);
        Thread.sleep(2000);
        actions.moveToElement(menuTShirts);
        actions.perform();
        System.out.println("Hover the Tshirts Menu");
        Thread.sleep(2000);
    }
    ///////////////////////////////////////////////////////////
}
