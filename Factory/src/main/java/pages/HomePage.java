package pages;

import helpers.Creds;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(css = "a[href*=\"login\"]")
    private static WebElement loginButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
