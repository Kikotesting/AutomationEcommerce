import eCommercePages.SignInPage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestsSignInPage extends setupPage {
    SignInPage objSignInPage;

    @Test
    @Tag("SignIn Overview")
    void verySignInOverviewPageElements() throws InterruptedException {
        objSignInPage = new SignInPage(browser);
        objSignInPage.overviewHeadElements_SignInPage();
        objSignInPage.overviewCreate_SignInPage();
        objSignInPage.overviewRegistered_SignInPage();
    }

}
