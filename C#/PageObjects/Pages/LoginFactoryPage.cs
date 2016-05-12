using OpenQA.Selenium;
using OpenQA.Selenium.Support.PageObjects;

namespace PageObjects.Pages
{
    public class LoginFactoryPage
    {
        [FindsBy(How = How.Id, Using = "id_username")]
        private IWebElement UserNameInput;

        [FindsBy(How = How.Id, Using = "id_password")]
        private IWebElement PasswordInput;

        [FindsBy(How = How.Id, Using = "main_action_form_button")]
        private static IWebElement LoginButton;

        public LoginFactoryPage(IWebDriver driver) {
            PageFactory.InitElements(driver, this);
        }

        public void Login(string username, string password) {
            UserNameInput.SendKeys(username);
            PasswordInput.SendKeys(password);
            LoginButton.Click();
        }
    }
}
