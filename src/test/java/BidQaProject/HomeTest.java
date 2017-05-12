package BidQaProject;

import PageResources.PageResource;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by femi on 5/7/17.
 */
public class HomeTest {
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
    @Test
    public void homeTest() throws Exception
    {
        pageResource=new PageResource(driver);
       // pageResource.getHomePagefactory().loginClick();

        //System.out.println("pageresources="+pageResource);
        //System.out.println("page Home="+pageResource.getHomePage());
        //System.out.println("page home  menu="+pageResource.getHomePage().menuBtn());
        //pageResource.getHomePage().menuBtn().click();
        //clicking on login menu
        pageResource.getHomePage().logClick().click();



    }
}
