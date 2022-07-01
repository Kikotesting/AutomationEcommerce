import KikoCustom.Highlighter;
import eCommercePages.HomePage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestsHomePage extends setupPage{
    HomePage objHomePage;

    @Test
    @Tag("Text")
    @DisplayName("Verified the headings and paragraph")
    void checkBottomHeadingsAndParagraph(){
        // Create object from HomePage
        objHomePage = new HomePage(browser);
        scrollEndPage();
        objHomePage.veryBottomHeader();
        objHomePage.veryBottomHeaderTwo();
        objHomePage.veryBottomParagraph();
    }

    @Test
    @Tag("CMSinfo")
    @DisplayName("Verified icon,heading and text in Cmsinfo block")
    void checkCMS_Elements(){
        objHomePage = new HomePage(browser);
        objHomePage.veryComeVisitUsIcon();
        objHomePage.veryComeVisitUsHeading();
        objHomePage.veryComeVisitUsParagraph();
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

    @Test
    @Tag("Main Menu")
    @DisplayName("Hover the MainMenu buttons")
    void checkMainMenuButtons(){
        objHomePage = new HomePage(browser);
        objHomePage.navigateToMenuWomen();
        objHomePage.navigateToMenuDresses();
        objHomePage.navigateToMenuWomen();
        objHomePage.navigateToMenuTShirts();
        objHomePage.navigateToMenuWomen();
        objHomePage.navigateToMenuDresses();
        objHomePage.navigateToMenuTShirts();
    }







}
