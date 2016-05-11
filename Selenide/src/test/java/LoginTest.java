import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

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
