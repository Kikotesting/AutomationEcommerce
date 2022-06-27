import eCommercePages.HomePage;
import eCommerceSetup.eCommerceSetup;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests extends eCommerceSetup{
    HomePage objHomePage;

    @Test
    @DisplayName("Check!")
    void verifyHomePage(){
        objHomePage = new HomePage(browser);
        objHomePage.veryBottomHeader();
    }
}
