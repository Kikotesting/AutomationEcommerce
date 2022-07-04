import eCommerceGlobalElements.elementsPage;
import eCommercePages.HomePage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestsHomePage extends setupPage{
    HomePage objHomePage;
    elementsPage objelementsPage;

    /*@Test
    @Tag("HorizontalBar Menu")
    @DisplayName("Verified the Call us number, ContactUs button and page, SignIn button and page")
    void checkHorizontalBarMenu() throws InterruptedException {
        objHomePage = new HomePage(browser);
        Thread.sleep(1000);
        objHomePage.checkCallUsNumberText();

        objHomePage.checkContactUsMenuText();
        objHomePage.clickContactUsMenu();
        Thread.sleep(2000);
        scrollToWebElement(objHomePage.scrollToSeeOverviewContactUs);
        objHomePage.overViewContactUsMenu();
        Thread.sleep(2000);
        browser.navigate().back();
        Thread.sleep(2000);

        objHomePage.checkSignInMenuText();
        objHomePage.clickSignInMenu();
        Thread.sleep(2000);
        scrollToWebElement(objHomePage.scrollToSeeOverviewSignIn);
        objHomePage.overViewSignInMenu();
        Thread.sleep(2000);
    }*/

    @Test
    @Tag("Main Menu")
    @DisplayName("Hover the MainMenu buttons")
    void checkMainMenuButtons(){
        objHomePage = new HomePage(browser);
        objelementsPage = new elementsPage(browser);


    }


    @Test
    @Tag("Searchbox Module")
    @DisplayName("Search box functionality")
    void checkValidSearchData() throws InterruptedException {

    }
    @Test
    @Tag("Searchbox Module")
    @DisplayName("Search box functionality")
    void checkInvalidSearchData() throws InterruptedException {

    }

    @Test
    @Tag("CMSInfo Module")
    @DisplayName("Verified icon,heading and text in CmsInfo block")
    void checkCMS_Elements(){
        objHomePage = new HomePage(browser);
        scrollToWebElement(objHomePage.comeVisitUsIcon_CMSInfo);

        objHomePage.veryComeVisitUsIcon();
        objHomePage.veryComeVisitUsHeading();
        objHomePage.veryComeVisitUsParagraph();
        objHomePage.veryCustomBlockText();
    }


    @Test
    @Tag("Editorial module - bottom text")
    void checkBottomHeadingsAndParagraph_TC1(){
        // Create object from HomePage
        objHomePage = new HomePage(browser);

        scrollEndPage();
        System.out.println("Scrolling to the End of the page!");
        objHomePage.veryBottomHeader();
        objHomePage.veryBottomHeaderTwo();
        objHomePage.veryBottomParagraph();
    }


    /**
     * Footer elements tests:
     * 1. NewsLetter modules
     * 2. FollowUs modules
     */
    @Test
    @Tag("Footer elements - NewsLetter module")
    void checkFooterNewsLetter_SocialModule_TC1(){
        // Create object from HomePage
        objHomePage = new HomePage(browser);
        scrollEndPage();
        objHomePage.veryFooterNewsLetterHeading();
        objHomePage.clickNewsLetterInputBar();
        objHomePage.typingInNewsLetterInputBar("Pesho2@mail.bg");
        objHomePage.pressNewsLetterSubmitButton();
        objHomePage.verifySubscribedMessage();
    }
    @Test
    @Tag("Footer elements - NewsLetter module 2")
    void checkFooterNewsLetter_SocialModule_TC2(){
        // Create object from HomePage
        objHomePage = new HomePage(browser);
        scrollEndPage();
        objHomePage.veryFooterFollowUsHeading();
    }
    @Test
    @Tag("Footer elements - FollowUs module")
    void checkFooterFollowUs_Module_TC1() throws InterruptedException {
        objHomePage = new HomePage(browser);
        objHomePage.veryLinkFooterFacebook();
        Thread.sleep(2000);
        objHomePage.veryLinkFooterTwitter();
        Thread.sleep(2000);
        objHomePage.veryLinkFooterYouTube();
        Thread.sleep(2000);
    }




}
