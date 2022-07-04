import eCommercePages.ContactUsPage;
import eCommercePages.HomePage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestsContactUsPage extends setupPage {
    ContactUsPage objContactUsPage;
    HomePage objHomePage;

    @Test
    @Tag("ContactUs Overview")
    void veryContactUsPageElements_TC1() throws InterruptedException {
        objContactUsPage = new ContactUsPage(browser);
        objHomePage = new HomePage(browser);

        objHomePage.clickContactUsMenu_horizontalNav();
        objContactUsPage.OverviewHeadElements_ContactUsPage();
    }
    @Test
    @Tag("ContactUs Overview")
    void verySelectingSubject_ContactUsPage_TC2() throws InterruptedException {
        objContactUsPage = new ContactUsPage(browser);
        objHomePage = new HomePage(browser);

        objHomePage.clickContactUsMenu_horizontalNav();
        objContactUsPage.SubjectSelect_ContactUsPage();
    }
    @Test
    @Tag("ContactUs Overview")
    void veryTypingMessagesAndSend_ContactUsPage_TC3() throws InterruptedException {
        objContactUsPage = new ContactUsPage(browser);
        objHomePage = new HomePage(browser);

        objHomePage.clickContactUsMenu_horizontalNav();
        objContactUsPage.TypingTextMessage_ContactUsPage();
    }


}
