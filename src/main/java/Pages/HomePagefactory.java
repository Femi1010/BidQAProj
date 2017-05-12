package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by femi on 5/7/17.
 */
public class HomePagefactory
{
    WebDriver driver;
    @FindBy(xpath="//*[@id='cssmenu']/ul/li[8]/a")
    WebElement login;
    @FindBy(xpath = ".//*[@id='cssmenu']/ul/li[7]/a")
    WebElement registration;
    public HomePagefactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void loginClick()
    {
        login.click();
    }
    public void registrationClick()
    {
          registration.click();
    }

}
