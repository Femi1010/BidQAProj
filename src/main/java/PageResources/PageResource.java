package PageResources;

import Pages.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by femi on 5/7/17.
 */
public class PageResource
{
    WebDriver driver;
    HomePage homePage;
    RegistrationPage registrationPage;
    LoginPage loginPage;
    MyAccoutPostProjectPage myAccoutPostProjectPage;
   public HomePagefactory homePagefactory;

    public PageResource(WebDriver driver)
    {
        this.driver=driver;
        homePage=new HomePage(driver);
        registrationPage=new RegistrationPage(driver);
        homePagefactory=new HomePagefactory(driver);
       loginPage=new LoginPage(driver);
       myAccoutPostProjectPage=new MyAccoutPostProjectPage(driver);
    }
    public HomePage getHomePage()
    {
        return homePage;
    }
    public LoginPage getLoginPage()
    {
        return loginPage;
    }

    public RegistrationPage getRegistrationPage()

    {
        return registrationPage;
    }
    public MyAccoutPostProjectPage getMyAccoutPostProjectPage()
    {
        return myAccoutPostProjectPage;
    }


   /* public HomePagefactory getHomePagefactory()
    {
        System.out.println("Entering page Resoureces");
        return homePagefactory;
    }

*/
}
