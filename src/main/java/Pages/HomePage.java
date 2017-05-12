package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by femi on 5/7/17.
 */
public class HomePage
{
    private WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement logClick()
    {
        //return driver.findElement(By.linkText("Log In"));
        return driver.findElement(By.xpath("//a[@href='http://test.bidqa.com/wp-login.php']"));
        //return driver.findElement(By.cssSelector("#cssmenu>ul>li>a"));
      // return driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[8]/a"));
       // return driver.findElement(By.cssSelector("a[href='http://test.bidqa.com/wp-login.php'"));
    }
    public WebElement registrationClick()
    {
        return driver.findElement(By.xpath("//a[@href='http://test.bidqa.com/wp-login.php?action=register']"));
    }
    public WebElement logoutClick()
    {
        return driver.findElement(By.xpath("//a[contains(@href,'http://test.bidqa.com/wp-login.php?action=logout')]"));
    }

}
