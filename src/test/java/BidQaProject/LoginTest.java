package BidQaProject;

import DataProviderClass.Data_Provider;
import PageResources.PageResource;
import Pages.HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by femi on 5/9/17.
 */
public class LoginTest {
    private WebDriver driver;
    private PageResource pageResource;
    @BeforeTest
    public void setup() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "/Users/femi/Documents/workspace/femina/driver/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1650, 1680));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://test.bidqa.com/");
    }
    @Test(dataProviderClass = Data_Provider.class,dataProvider = "BidqaDataProvider")
    public void loginTest(String username,String password) throws InterruptedException {
        pageResource=new PageResource(driver);
        pageResource.getHomePage().logClick().click();
        Thread.sleep(1000);
        pageResource.getLoginPage().userName().sendKeys(username);
        pageResource.getLoginPage().loginPassword().sendKeys(password);
        pageResource.getLoginPage().signIn().click();
    }
}
