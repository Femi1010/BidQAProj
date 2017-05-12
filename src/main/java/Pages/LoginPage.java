package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by femi on 5/9/17.
 */
public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement userName()
    {
        return  driver.findElement(By.id("log"));
    }
    public WebElement  loginPassword()
    {
        return driver.findElement(By.id("login_password"));
    }
    public  WebElement signIn()
    {
        return driver.findElement(By.id("submits"));
    }
}
