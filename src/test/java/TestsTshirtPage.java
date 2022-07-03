import eCommercePages.HomePage;
import eCommerceSetup.setupPage;
import eCommercePages.TshirtPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestsTshirtPage extends setupPage {

    TshirtPage objTshirtPage;


    @Test
    void scrollTshirtMenu (){
        objTshirtPage = new TshirtPage(browser);
        objTshirtPage.clickToMenuTShirt();
    }


}
