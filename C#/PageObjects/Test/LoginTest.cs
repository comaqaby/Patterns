using Bumblebee.Extensions;
using Bumblebee.Setup;
using Bumblebee.Setup.DriverEnvironments;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;
using PageObjects.Helpers;
using PageObjects.Pages;

namespace PageObjects.Test
{
    public class LoginTest
    {
        private const string BaseUrl = "https://www.pandadoc.com/";
        private readonly string User = Creds.User;
        private readonly string Pass = Creds.Pass;

        [Test]
        public void SimpleLoginFactoryTest()
        {
            IWebDriver driver = new FirefoxDriver();
            driver.Navigate().GoToUrl(BaseUrl);
            var loginPage = new LoginFactoryPage(driver);
            loginPage.Login(User, Pass);
            Assertions.AssertSignedUp(driver);
        }

        [Test]
        public void SimpleLoginTest()
        {
            IWebDriver driver = new FirefoxDriver();
            driver.Navigate().GoToUrl(BaseUrl);
            var loginPage = new LoginPage(driver);
            loginPage.Login(User, Pass);
            Assertions.AssertSignedUp(driver);
        }

        [Test]
        public void HtmlLoginTest()
        {
            IWebDriver driver = new FirefoxDriver();
            driver.Navigate().GoToUrl(BaseUrl);
            var loginPage = new HtmlLoginPage(driver);
            loginPage.Login(User, Pass);
            Assertions.AssertSignedUp(driver);
        }

        [Test]
        public void given_valid_credentials_when_logging_in_then_logged_in()
        {
            Threaded<Session>
              .With<Firefox>()
              .NavigateTo<BumblebeeLoginPage>(BaseUrl)
              .UserInput.EnterText(User)
              .PasswordInput.EnterText(Pass)
              .LoginButton.Click<LoggedInPage>()
              .VerifyPresenceOf("User avatar", By.CssSelector(".header-avatar"));
        }
    }
}
