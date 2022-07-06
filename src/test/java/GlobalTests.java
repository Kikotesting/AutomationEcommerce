import eCommercePages.GlobalPage;
import eCommercePages.HomePage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GlobalTests extends setupPage {
    GlobalPage objGlobalPage;

    @Test
    @Tag("Buy a product")
    @DisplayName("User can select dresses by descending price")
    void chooseDresses() throws InterruptedException {
        objGlobalPage = new GlobalPage(browser);
        Actions actions = new Actions(browser);
        Thread.sleep(2000);
        actions.moveToElement(objGlobalPage.menuWomen);
        actions.perform();
        Thread.sleep(1000);
        objGlobalPage.clickMenuWomen();
        Thread.sleep(3000);
        scrollToWebElement(objGlobalPage.menuWomen_pageHeading);
        Thread.sleep(3000);
        scrollToPixels(200);
        Thread.sleep(1000);
        scrollToPixels(400);
        Thread.sleep(1000);
        scrollEndPage();
        Thread.sleep(1000);
        scrollToWebElement(objGlobalPage.menuWomen_pageHeading);
        Thread.sleep(1000);
        objGlobalPage.menuWomen_sortByFilter.click();
        Select select = new Select(objGlobalPage.menuWomen_sortByFilter);
        select.selectByValue("price:desc");
        objGlobalPage.menuWomen_sortByFilter.click();
        Thread.sleep(2000);
    }


}
