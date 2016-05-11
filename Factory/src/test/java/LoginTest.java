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

public class LoginTest {

    private WebDriver driver;

    private void assertSignedUp() {
        new WebDriverWait(driver, 30000).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".header-avatar")));
    }

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.pandadoc.com/");
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }

    @Test
    public void loginTest() {
        HomePage homePage = new HomePage(driver);
        homePage.login();
        assertSignedUp();
    }
}
