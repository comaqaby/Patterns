package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final By USERNAME_INPUT = By.id("id_username");
    private static final By PASSWORD_INPUT = By.id("id_password");
    private static final By LOGIN_BUTTON = By.id("main_action_form_button");

    public void login(String username, String password) {
        $(USERNAME_INPUT).val(username);
        $(PASSWORD_INPUT).val(password);
        $(LOGIN_BUTTON).click();
    }

}
