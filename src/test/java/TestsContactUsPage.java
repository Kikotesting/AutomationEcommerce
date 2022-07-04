import eCommercePages.ContactUsPage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestsContactUsPage extends setupPage {
    ContactUsPage objContactUsPage;

    @Test
    @Tag("ContactUs Overview")
    void verySignInOverviewPageElements() throws InterruptedException {
        objContactUsPage = new ContactUsPage(browser);
    }
}
