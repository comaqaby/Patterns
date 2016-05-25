package com.epam.jdi.uitests.testing.career.page_objects.site.pages;

import com.epam.jdi.uitests.testing.career.page_objects.site.sections.EpamCoreSection;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 10/22/2015.
 */
public class HomePage extends WebPage {
    @FindBy(css="div.tabs-ui[data-path*='/content/epam/en/jcr:content/content_container/section_4/section-par/tabs']")
    public EpamCoreSection epamCoreSection;
}

