import eCommercePages.HomePage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

public class GlobalTests extends setupPage {
    HomePage objHomePage;

    @Test
    @Tag("Buy a product")
    @DisplayName("User can choose dresses to buy")
    void chooseDresses() throws InterruptedException {
        objHomePage = new HomePage(browser);
        Actions actions = new Actions(browser);
        objHomePage.menuDresses.click();
        scrollToPixels(200);
        scrollToPixels(200);
        scrollToWebElement(objHomePage.menuDresses_Subcategory);
/*
        objHomePage.menuWomen_SortByFilter.click();
        Select select = new Select(objHomePage.menuWomen_SortByFilter);
        select.selectByValue("position:asc");
        objHomePage.menuWomen_SortByFilter.click();
        Thread.sleep(2000);
        scrollToPixels(200);
        scrollToPixels(200);*/



    }


}
