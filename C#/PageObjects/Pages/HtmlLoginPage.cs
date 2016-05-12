using OpenQA.Selenium;
using OpenQA.Selenium.Support.PageObjects;
using Yandex.HtmlElements.Elements;
using Yandex.HtmlElements.Loaders;

namespace PageObjects.Pages
{
    public class HtmlLoginPage
    {
        [FindsBy(How = How.Id, Using = "id_username")]
        private TextInput UserNameInput;

        [FindsBy(How = How.Id, Using = "id_password")]
        private TextInput PasswordInput;

        [FindsBy(How = How.Id, Using = "main_action_form_button")]
        private static Button LoginButton;

        public HtmlLoginPage(IWebDriver driver)
        {
            HtmlElementLoader.PopulatePageObject(this, driver);
        }

        public void Login(string username, string password)
        {
            UserNameInput.SendKeys(username);
            PasswordInput.SendKeys(password);
            LoginButton.Click();
        }
    }
}
