import eCommercePages.HomePage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestsHomePage extends setupPage{
    HomePage objHomePage;

    @Test
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
    }




    @Test
    @Tag("Main Menu")
    @DisplayName("Hover the MainMenu buttons")
    void checkMainMenuButtons() throws InterruptedException {
        objHomePage = new HomePage(browser);
        objHomePage.navigateToMenuWomen();
        objHomePage.navigateToMenuDresses();
        objHomePage.navigateToMenuTShirts();
    }


    @Test
    @Tag("Searchbox Module")
    @DisplayName("Search box functionality")
    void checkValidSearchData() throws InterruptedException {
        objHomePage = new HomePage(browser);
        objHomePage.validDataSearch();
        Thread.sleep(2000);
    }
    @Test
    @Tag("Searchbox Module")
    @DisplayName("Search box functionality")
    void checkInvalidSearchData() throws InterruptedException {
        objHomePage = new HomePage(browser);
        objHomePage.invalidDataSearch();
        Thread.sleep(2000);
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
    @Tag("Bottom Page Text")
    @DisplayName("Verified the headings and paragraph on HomePage")
    void checkBottomHeadingsAndParagraph(){
        // Create object from HomePage
        objHomePage = new HomePage(browser);
        scrollEndPage();
        objHomePage.veryBottomHeader();
        objHomePage.veryBottomHeaderTwo();
        objHomePage.veryBottomParagraph();
    }



    @Test
    @Tag("Footer elements")
    @DisplayName("NewsLetter module")
    void checkFooterNewsLetter_SocialModule_TC1(){
        // Create object from HomePage
        objHomePage = new HomePage(browser);
        scrollEndPage();
        objHomePage.veryFooterNewsLetterHeading();
        objHomePage.clickNewsLetterInputBar();
        objHomePage.typingInNewsLetterInputBar();
        objHomePage.pressNewsLetterSubmitButton();
        objHomePage.verifySubscribedMessage();
    }

    @Test
    @Tag("Footer elements")
    @DisplayName("NewsLetter module 2")
    void checkFooterNewsLetter_SocialModule_TC2(){
        // Create object from HomePage
        objHomePage = new HomePage(browser);
        scrollEndPage();
        objHomePage.veryFooterFollowUsHeading();
    }

    @Test
    @Tag("Footer elements")
    @DisplayName("FollowUs module")
    void checkFooterFollowUs_Module_TC3() throws InterruptedException {
        objHomePage = new HomePage(browser);
        objHomePage.veryLinkFooterFacebook();
        Thread.sleep(2000);
        objHomePage.veryLinkFooterTwitter();
        Thread.sleep(2000);
        objHomePage.veryLinkFooterYouTube();
        Thread.sleep(2000);
    }




}
