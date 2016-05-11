package pages;

import helpers.Creds;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {
    private static final By LOGIN_BUTTON = By.cssSelector("a[href*=\"login\"]");

    public void login() {
        login(Creds.username, Creds.password);
    }

    private LoginPage clickLoginButton() {
        $(LOGIN_BUTTON).click();
        return page(LoginPage.class);
    }

    private void login(String username, String password) {
        LoginPage loginPage = clickLoginButton();
        loginPage.login(username, password);
    }
}
