import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    private HomePage homePage;

    private void assertSignedUp() {
        $(By.cssSelector(".header-avatar")).waitUntil(Condition.visible, 30000);
    }

    @BeforeMethod
    public void setup() {
        Configuration.timeout = 10000;
        homePage = open("https://www.pandadoc.com/", HomePage.class);
    }

    @Test
    public void loginTest() {
        homePage.login();
        assertSignedUp();
    }
}
