import eCommercePages.HomePage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestsHomePage extends setupPage{
    HomePage objHomePage;

    @Test
    @Tag("Text")
    void checkBottomHeadingsAndParagraph(){
        // Create object from HomePage
        objHomePage = new HomePage(browser);
        scrollEndPage();
        objHomePage.veryBottomHeader();
        objHomePage.veryBottomHeaderTwo();
        objHomePage.veryBottomParagraph();
    }

    @Test
    void checkFooterElements(){

    }
}
