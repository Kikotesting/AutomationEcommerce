import eCommercePages.HomePage;
import eCommerceSetup.setupPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestsHomePage extends setupPage{
    HomePage objHomePage;

    /**
     * Horizontal Navigation tests:
     * 1. CallUs Number
     * 2. ContactUs Menu
     * 3. SignIn Menu
     */
    @Test
    @Tag("Horizontal Navigation")
    void veryCallUsNumberHorizontalNav(){
        objHomePage = new HomePage(browser);
        objHomePage.checkCallUsNumberText_horizontalNav();
        System.out.println("Call number is checked!");
    }
    @Test
    @Tag("Horizontal Navigation")
    void veryContactUsMenuHorizontalNav() throws InterruptedException {
        objHomePage = new HomePage(browser);
        objHomePage.clickContactUsMenu_horizontalNav();
        Thread.sleep(2000);
        browser.navigate().back();
        System.out.println("Go again to HomePage!");
    }
    @Test
    @Tag("Horizontal Navigation")
    void verySignInMenuHorizontalNav() throws InterruptedException {
        objHomePage = new HomePage(browser);
        objHomePage.clickSignInMenu_HorizontalNav();
        Thread.sleep(2000);
        browser.navigate().back();
        System.out.println("Go again to HomePage!");
    }
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////


    /**
     * Search box field tests:
     * 1. Search box visible
     * 2. Enter valid data
     * 3. Enter invalid data
     * 4. Click search button
     */
    @Test
    @Tag("SearchBox Module")
    void enterValidDataInSearchBox() {
        objHomePage = new HomePage(browser);

        objHomePage.clickField_SearchBox();
        System.out.println("Searchbar click");
        objHomePage.enterValidData_SearchBox("dresses");
        System.out.println("Enter dresses word");
        objHomePage.clickSubmitButton_SearchBox();
        System.out.println("Click submit Button");
        objHomePage.searchResultFound_SearchBox();
    }
    @Test
    @Tag("SearchBox Module")
    void enterInvalidDataInSearchBox() {
        objHomePage = new HomePage(browser);
        objHomePage.clickField_SearchBox();
        System.out.println("Searchbar click");
        objHomePage.enterInvalidData_SearchBox("purko");
        System.out.println("Enter dresses word");
        objHomePage.clickSubmitButton_SearchBox();
        System.out.println("Click submit Button");
        objHomePage.searchResultNotFound_SearchBox();
    }
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////

    /**
     * CMS information two modules tests:
     * 1. Icons visible
     * 2. Headings text
     * 3. Paragraph text
     */
    @Test
    @Tag("CMSInfo module Two")
    void checkCMS_Elements_Second_TC2() throws InterruptedException {
        objHomePage = new HomePage(browser);
        System.out.println("Scroll to the CMS info block section!");

        objHomePage.veryComeVisitUsIcon_CMSInfo();
        objHomePage.veryComeVisitUsHeading_CMSInfo();
        objHomePage.veryComeVisitUsParagraph_CMSInfo();
        System.out.println("First div is ok!");

        objHomePage.veryCallUsIcon_CMSInfo();
        objHomePage.veryCallUsHeading_CMSInfo();
        objHomePage.veryCallUsParagraph_CMSInfo();
        objHomePage.clickCallUsParagraphButton_CMSInfo();
        browser.navigate().back();
        System.out.println("Second div is ok!");

        objHomePage.veryHowToPayDuesIconCMSInfo();
        objHomePage.veryHowToPayDuesHeading_CMSInfo();
        objHomePage.veryHowToPayDuesParagraph_CMSInfo();
        System.out.println("Third div is ok!");
    }
    @Test
    @Tag("CMSInfo module Three")
    void checkCMS_Elements_Three_TC3(){
        objHomePage = new HomePage(browser);
        System.out.println("Scroll to the CMS info block section!");

        objHomePage.veryCustomBlockHeading_CMSInfo();
        objHomePage.veryCustomBlockHeadingBold_CMSInfo();
        objHomePage.veryCustomBlockParagraph_CMSInfo();
        System.out.println("Headings  and paragraph verified!");
    }
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////

    /**
     * EDITORIAL module tests:
     * 1. Headings text
     * 2. Paragraph text
     */
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
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////

    /**
     * FOOTER elements tests:
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
        Thread.sleep(1000);
        objHomePage.veryLinkFooterTwitter();
        Thread.sleep(1000);
        objHomePage.veryLinkFooterYouTube();
        Thread.sleep(1000);
    }
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////

    /**
     * FOOTER - Store information section:
     * 1. Address
     * 2. Call us now
     * 3. Email
     */
    @Test
    @Tag("Footer elements - Store information")
    void checkFooterStoreInfo_Module_TC1(){
        objHomePage = new HomePage(browser);
        scrollEndPage();
        objHomePage.veryFooterAddress_StoreInfo();
        objHomePage.veryFooterCallUsNow_StoreInfo();
        objHomePage.veryFooterEmail_StoreInfo();
    }
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////


}
