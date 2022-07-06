import eCommercePages.ContactUsPage;
import eCommercePages.HomePage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestsContactUsPage extends setupPage {
    ContactUsPage objContactUsPage;
    HomePage objHomePage;


    /**
     * ContactUs Menu tests:
     * 1. Verified all elements
     * 2. Select buttons
     * 3. Message Area
     * 4. Send Button
     * 5. Error messages
     */
    @Test
    @Tag("ContactUs Overview")
    void veryContactUsPageElements_TC1() throws InterruptedException {
        objContactUsPage = new ContactUsPage(browser);
        objHomePage = new HomePage(browser);

        objHomePage.clickContactUsMenu_horizontalNav();
        scrollToPixels(200);
        objContactUsPage.OverviewHeadElements_ContactUsPage();
    }


    @Test
    @Tag("ContactUs Overview")
    void verySelectingCustomerService_ContactUsPage_TC2() throws InterruptedException {
        objContactUsPage = new ContactUsPage(browser);
        objHomePage = new HomePage(browser);

        objHomePage.clickContactUsMenu_horizontalNav();

        scrollToWebElement(objContactUsPage.scrollToForm_ContactUsPage);
        objContactUsPage.SelectingCustomerService_ContactUsPage();
    }
    @Test
    @Tag("ContactUs Overview")
    void verySelectingWebMaster_ContactUsPage_TC3() throws InterruptedException {
        objContactUsPage = new ContactUsPage(browser);
        objHomePage = new HomePage(browser);

        objHomePage.clickContactUsMenu_horizontalNav();

        scrollToWebElement(objContactUsPage.scrollToForm_ContactUsPage);
        objContactUsPage.SelectingWebMaster_ContactUsPage();
    }


    @Test
    @Tag("ContactUs Overview")
    void veryValidSetMessagesForm_ContactUsPage_TC3() throws InterruptedException {
        objContactUsPage = new ContactUsPage(browser);
        objHomePage = new HomePage(browser);

        objHomePage.clickContactUsMenu_horizontalNav();
        scrollToWebElement(objContactUsPage.scrollToForm_ContactUsPage);
        System.out.println("Set Email");
        objContactUsPage.SetEmail_ContactUsPage("Kik8765o@mai.bg");
        System.out.println("Set Text");
        objContactUsPage.SetMessage_ContactUsPage("Welcome\nKiko is here!\nI am writting about...");
        System.out.println("Select");
        objContactUsPage.SelectingCustomerService_ContactUsPage();
        System.out.println("Click SubmitButton");
        objContactUsPage.ClickSendSubmitButton_ContactUsPage();
        System.out.println("Verified Message!");
        objContactUsPage.TextMessageAfter_ContactUsPage();
    }
    @Test
    @Tag("ContactUs Overview")
    @DisplayName("Negative - without populate email field")
    void veryInvalidSetMessagesForm_ContactUsPage_TC4(){
        objContactUsPage = new ContactUsPage(browser);
        objHomePage = new HomePage(browser);

        objHomePage.clickContactUsMenu_horizontalNav();
        scrollToWebElement(objContactUsPage.scrollToForm_ContactUsPage);
        System.out.println("Set Text");
        objContactUsPage.SetMessage_ContactUsPage("Welcome...");
        System.out.println("Click Submit button");
        objContactUsPage.ClickSendSubmitButton_ContactUsPage();
        System.out.println("Verified Error Message!");
        objContactUsPage.ErrorMessageAfter_ContactUsPage();
    }



}
