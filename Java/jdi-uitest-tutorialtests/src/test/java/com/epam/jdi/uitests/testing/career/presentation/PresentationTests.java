package com.epam.jdi.uitests.testing.career.presentation;

import com.epam.jdi.uitests.testing.career.common.tests.TestsBase;
import com.epam.jdi.uitests.testing.career.page_objects.enums.HomeTabs;
import com.epam.jdi.uitests.testing.career.page_objects.site.sections.EpamCoreSection;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.web.matcher.testng.Check;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static com.epam.jdi.uitests.testing.career.page_objects.enums.Preconditions.HOME_PAGE;
import static com.epam.jdi.uitests.testing.career.page_objects.site.EpamSite.*;


public class PresentationTests extends TestsBase {
    @BeforeMethod
    public void before(Method method) throws IOException {
        isInState(HOME_PAGE, method);
    }

    public static class HomeTabsTextToCheck {
        public static final  String WHOWEARE="We are more than developers." +
                " We are the experts that will take your business into the digital future.";
        public final static String WHATWEDO="We transform businesses through the art of digitization." +
                " Our expertise spans multiple disciplines," +
                " providing our clients with software solutions that dramatically drive results and outcomes.";
        public final static String WHOWESERVE="The right technology translates business strategies into results." +
                " We deliver domain-specific, transformative software solutions that reshape the way you do business.";
    }

    public void textToTest(HomeTabs tab, EpamCoreSection epamCoreSection){
        switch (tab) {
            case WHOWEARE:
                chooseTab(epamCoreSection.whoWeAre, epamCoreSection.whoWeAreText, HomeTabsTextToCheck.WHOWEARE);
                break;
            case WHATWEDO:
                chooseTab(epamCoreSection.whatWeDo, epamCoreSection.whatWeDoText, HomeTabsTextToCheck.WHATWEDO);
                break;
            case WHOWESERVE:
                chooseTab(epamCoreSection.whoWeServe, epamCoreSection.whoWeServeText, HomeTabsTextToCheck.WHOWESERVE);
                break;
        }
    }

    public void chooseTab(Button tab, Text text, String textToCheck){
        tab.highlight();
        tab.click();
        text.highlight();
        new Check("Tab text").areEquals(textToCheck,
                text.getText());
    }

    @Test
    public void presentationComplexTest() {
        homePage.checkOpened();
        textToTest(HomeTabs.WHATWEDO, homePage.epamCoreSection);
        textToTest(HomeTabs.WHOWEARE, homePage.epamCoreSection);
        textToTest(HomeTabs.WHOWESERVE, homePage.epamCoreSection);
    }


    @Test
    public void presentationSimpleTest() {
        homePage.checkOpened();
        homePage.epamCoreSection.whoWeAre.highlight();
        homePage.epamCoreSection.whoWeAreText.highlight();
        new Check("Tab text").areEquals("" +
                "We are more than developers. We are the experts that will take your business into the digital future.",
                homePage.epamCoreSection.whoWeAreText.getText());
        homePage.epamCoreSection.highlight();
        homePage.epamCoreSection.whoWeServe.highlight();
        homePage.epamCoreSection.whoWeServe.click();
    }
}
