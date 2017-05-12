package BidQaProject;

import PageResources.DataClass;
import PageResources.PageResource;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by femi on 5/7/17.
 */
public class RegistrationTest {
    private WebDriver driver;
    private PageResource pageResource;
    private DataClass dataClass;

    @BeforeTest
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/femi/Documents/workspace/femina/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1650, 1680));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://test.bidqa.com/");
    }

    @Test
    public void registrationTest() throws Exception {
        pageResource = new PageResource(driver);
        dataClass = new DataClass();
        Thread.sleep(1000);
        pageResource.getHomePage().registrationClick().click();
        Thread.sleep(3000);
        pageResource.getRegistrationPage().setUserName().sendKeys(dataClass.randomusername);
        Thread.sleep(3000);
        pageResource.getRegistrationPage().setEmail().sendKeys(dataClass.randomemail);
        pageResource.getRegistrationPage().setPassword().sendKeys(dataClass.pword);
        pageResource.getRegistrationPage().setRepeatPassword().sendKeys(dataClass.pword);
        //pageResource.getRegistrationPage().setUserType().clear();
        pageResource.getRegistrationPage().setUserType().click();
        //pageResource.getRegistrationPage().setCaptchaCheck();
        Thread.sleep(8000);
        pageResource.getRegistrationPage().registerClick().click();

    }
}