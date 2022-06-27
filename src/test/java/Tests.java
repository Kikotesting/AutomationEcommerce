import KikoCustom.Highlighter;
import eCommercePages.HomePage;
import eCommerceSetup.eCommerceSetup;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class Tests extends eCommerceSetup{
    HomePage objHomePage;

    @Test
    @DisplayName("Check!")
    void verifyHomePage(){
        objHomePage = new HomePage(browser);
        scrollEndPage();
        objHomePage.veryBottomHeader();
        objHomePage.veryBottomHeaderTwo();
        objHomePage.veryBottomParagraph();
    }
}
