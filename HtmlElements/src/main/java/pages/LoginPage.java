package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "id_username")
    private static TextInput usernameInput;

    @FindBy(id = "id_password")
    private static TextInput passwordInput;

    @FindBy(id = "main_action_form_button")
    private static Button loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
