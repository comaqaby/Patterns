using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.UI;

namespace PageObjects.Helpers
{
    public class Assertions
    {
        public static void AssertSignedUp(IWebDriver driver)
        {
            new WebDriverWait(driver, TimeSpan.FromSeconds(30)).Until(ExpectedConditions.ElementIsVisible(By.CssSelector(".header-avatar")));
        }
    }
}
