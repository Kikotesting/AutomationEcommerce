package eCommerceGlobalElements;
import CustomScripts.Highlighter;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elementsPage {
    WebDriver browser;

    // Page factory construction
    public elementsPage (WebDriver browser){
        this.browser = browser;
        PageFactory.initElements(browser,this);
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/span")
    WebElement callUsNumber;
    public void checkCallUsNumberText(){
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


    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement menuDresses;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")
    WebElement menuDressesCasual;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    WebElement menuDressesEvening;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
    WebElement menuDressesSummer;

    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement menuTShirts;

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




}
