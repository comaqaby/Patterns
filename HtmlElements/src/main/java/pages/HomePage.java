package pages;

import helpers.Creds;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class HomePage {
    private WebDriver driver;

    @FindBy(css = "a[href*=\"login\"]")
    private static Button loginButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void login() {
        login(Creds.username, Creds.password);
    }

    private LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage(driver);
    }

    private void login(String username, String password) {
        LoginPage loginPage = clickLoginButton();
        loginPage.login(username, password);
    }
}
