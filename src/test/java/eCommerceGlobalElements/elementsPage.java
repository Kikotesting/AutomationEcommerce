package eCommerceGlobalElements;
import CustomScripts.Highlighter;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elementsPage {
    WebDriver browser;
    Actions actions;

    // Page factory construction
    public elementsPage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }

    /**
     * Top horizontal bar: callUsNumber, contactUs menu, signIn menu
     *
     * 1. Check callUs number is Displayed=>Equals to expected Number=>Verified
     * 2. Check contactUs menu is Displayed then click!=>
     * 3. Check signIn menu is Displayed then click!=>
     */
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/span")
    WebElement callUsNumber;
    public void checkCallUsNumberText(){
        callUsNumber.isDisplayed();
        String  getCallUsNumber = callUsNumber.getText();
        Highlighter.highlightElement(browser, callUsNumber);
        Assertions.assertEquals("Call us now: 0123-456-789", getCallUsNumber);
        System.out.println("Call number is verified!");
    }

    @FindBy (id = "contact-link")
    WebElement contactUsMenu;
    public void clickContactUsMenu(){
        contactUsMenu.isDisplayed();
        Highlighter.highlightElement(browser,contactUsMenu);
        contactUsMenu.click();
        System.out.println("Click ContactUs menu");
    }
    @FindBy (className = "login")
    WebElement signInMenu;
    public void clickSignInMenu(){
        signInMenu.isDisplayed();
        Highlighter.highlightElement(browser,signInMenu);
        signInMenu.click();
        System.out.println("Click SignIn menu");
    }
    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////

    /**
     * Search box field functionality
     */
    @FindBy(id = "search_query_top")
    public WebElement searchBox;
    @FindBy(name = "submit_search")
    WebElement searchBox_SubmitButton;
    public void clickSearchBox(){
        searchBox.isDisplayed();
        Highlighter.highlightElement(browser,searchBox);
        searchBox.click();
        System.out.println("Click SearchBox field");
    }
    public void enterSearchValidData(String validText){
        Highlighter.highlightElement(browser,searchBox);
        searchBox.clear();
        searchBox.sendKeys(validText);
    }
    public void enterSearchInvalidData(String invalidText){
        Highlighter.highlightElement(browser,searchBox);
        searchBox.clear();
        searchBox.sendKeys(invalidText);
    }
    public void clickSearchBoxSubmitButton(){
        searchBox_SubmitButton.click();
    }
    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////






    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement menuWomen;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
    WebElement menuWomenTopsTShirts;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a")
    WebElement menuWomenTopsBlouses;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a")
    WebElement menuWomenDressesCasual;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[2]/a")
    WebElement menuWomenDressesEvening;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a")
    WebElement menuWomenDressesSummer;
    public void navigateToMenuWomen() throws InterruptedException {
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
    }




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







}
