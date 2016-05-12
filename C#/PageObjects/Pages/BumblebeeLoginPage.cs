using Bumblebee.Implementation;
using Bumblebee.Interfaces;
using Bumblebee.Setup;
using OpenQA.Selenium;

namespace PageObjects.Pages
{
    public class BumblebeeLoginPage : WebBlock
    {
        public BumblebeeLoginPage(Session session) : base(session) { }

        public ITextField<BumblebeeLoginPage> UserInput
        {
            get { return new TextField<BumblebeeLoginPage>(this, By.Name("id_username")); }
        }

        public ITextField<BumblebeeLoginPage> PasswordInput
        {
            get { return new TextField<BumblebeeLoginPage>(this, By.Name("id_password")); }
        }

        public IClickable LoginButton
        {
            get { return new Clickable(this, By.TagName("main_action_form_button")); }
        }
    }
}
