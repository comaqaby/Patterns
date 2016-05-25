package com.epam.jdi.uitests.testing.career.page_objects.site.sections;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.testing.career.page_objects.entities.JobSearchFilter;
import com.epam.jdi.uitests.testing.career.page_objects.enums.JobCategories;
import com.epam.jdi.uitests.testing.career.page_objects.enums.Locations;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 10/22/2015.
 */
public class EpamCoreSection extends Section {

    @FindBy(css="div.tab-1>div.text>div.text-ui >p>span.font-size-26")
    public Text whoWeAreText;

    @FindBy(css="div.tab-2>div.text>div.text-ui >p>span.font-size-26")
    public Text whatWeDoText;

    @FindBy(css="div.tab-3>div.text>div.text-ui >p>span.font-size-26")
    public Text whoWeServeText;

    @FindBy(xpath="//div[.='Who we serve']")
    public Button whoWeServe;

    @FindBy(xpath="//div[.='Who we are']")
    public Button whoWeAre;

    @FindBy(xpath="//div[.='What we do']")
    public Button whatWeDo;

}
