using OpenQA.Selenium;

namespace PageObjects.Pages
{
    public class LoginPage
    {
        private readonly IWebDriver _driver;

        public LoginPage(IWebDriver driver)
        {
            _driver = driver;
        }

        private IWebElement UserNameInput
        {
            get { return _driver.FindElement(By.Id("id_username")); }
        }

        private IWebElement PasswordInput
        {
            get { return _driver.FindElement(By.Id("id_password")); }
        }

        private IWebElement LoginButton
        {
            get { return _driver.FindElement(By.Id("main_action_form_button")); }
        }

        public void Login(string user, string pass)
        {
            UserNameInput.SendKeys(user);
            PasswordInput.SendKeys(pass);
            LoginButton.Click();
        }
    }
}
