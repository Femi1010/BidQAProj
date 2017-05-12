package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by femi on 5/7/17.
 */
public class RegistrationPage
{
    private WebDriver driver;
    public RegistrationPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement setUserName()
    {
        return driver.findElement(By.xpath("//input[@id='user_login']"));
    }
    public WebElement setEmail()
    {
        return driver.findElement(By.id("user_email"));
    }
    public WebElement setPassword()
    {
        return driver.findElement(By.id("pass1"));
    }
    public WebElement setRepeatPassword()
    {
       return driver.findElement(By.id("pass2"));
    }
    public WebElement setUserType()
    {
        return driver.findElement(By.id("user_tp"));
    }
    public WebElement setCaptchaCheck()
    {
        return  driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]"));
    }
    public WebElement registerClick()
    {
        return driver.findElement(By.id("submits"));
    }
}
