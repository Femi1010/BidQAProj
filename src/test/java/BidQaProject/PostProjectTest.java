package BidQaProject;

import DataProviderClass.Data_Provider;
import PageResources.PageResource;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.jvm.hotspot.debugger.Page;

import java.util.concurrent.TimeUnit;

/**
 * Created by femi on 5/9/17.
 */
public class PostProjectTest
{
    private WebDriver driver;
    private PageResource pageResource;
    String searchprojecttitle="";
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
    public void postNewProject(String username,String password,String projtitle,String projdesc,String tagname,String subloc, String address) throws InterruptedException
    {
        PageResource pageResource=new PageResource(driver);
        //click on login menu
        pageResource.getHomePage().logClick().click();
        //providing login credential
        pageResource.getLoginPage().userName().sendKeys(username);
        pageResource.getLoginPage().loginPassword().sendKeys(password);
        //click on sign in
        pageResource.getLoginPage().signIn().click();
        //click on postnew project link
        pageResource.getMyAccoutPostProjectPage().postProjectLink().click();
        //enter project title
        pageResource.getMyAccoutPostProjectPage().projectTitle().sendKeys(projtitle);
        //assigning project title to search
        searchprojecttitle=projtitle;
        //enter project decsription
        pageResource.getMyAccoutPostProjectPage().projectDescription().sendKeys(projdesc);
        //scrolling down the window
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        //Select category
        pageResource.getMyAccoutPostProjectPage().selectCategory().click();
        //enter tag
        pageResource.getMyAccoutPostProjectPage().enterTag().sendKeys(tagname);
        //select the skill
        pageResource.getMyAccoutPostProjectPage().selectSkill().click();
        //select project budget
        pageResource.getMyAccoutPostProjectPage().projectBudget().click();
        Select bugetselect=new Select(pageResource.getMyAccoutPostProjectPage().projectBudget());
        bugetselect.selectByVisibleText("Per Hour ($1 - $10)");
        //choose date
        pageResource.getMyAccoutPostProjectPage().projectEndingDate().click();
        pageResource.getMyAccoutPostProjectPage().chooseProjectDate().click();
        //Select country
        pageResource.getMyAccoutPostProjectPage().selectCountry().click();
        Select selectcountry=new Select(pageResource.getMyAccoutPostProjectPage().selectCountry());
        selectcountry.selectByVisibleText("United States");
        Thread.sleep(3000);
        //selecting state or city
        pageResource.getMyAccoutPostProjectPage().selectState().click();
        Thread.sleep(3000);
        Select selectstate=new Select(pageResource.getMyAccoutPostProjectPage().selectState());
        selectstate.selectByVisibleText("California");
        Thread.sleep(3000);
        //Input sublocation
        pageResource.getMyAccoutPostProjectPage().enterSubLocation().sendKeys(subloc);
        //Enter Address
        pageResource.getMyAccoutPostProjectPage().enterAddress().sendKeys(address);
        //Click on Next button
        pageResource.getMyAccoutPostProjectPage().clickNext().click();
        //click on featured project
        pageResource.getMyAccoutPostProjectPage().chooseFeaturedProject().click();
        //click on next button
        pageResource.getMyAccoutPostProjectPage().optionNextClick().click();
        Thread.sleep(1000);
        //click on next button from preview tab
        pageResource.getMyAccoutPostProjectPage().previewNextClick().click();
        Thread.sleep(1000);
        //click accept Terms
        pageResource.getMyAccoutPostProjectPage().acceptTerms().click();
        //clicking on paypal button
        pageResource.getMyAccoutPostProjectPage().payByPaypalBtn().click();
        Thread.sleep(1000);
        //switch to iframe
        driver.switchTo().frame("injectedUl");
        Thread.sleep(1000);
        //enter paypay login cfredential
        pageResource.getMyAccoutPostProjectPage().paypalEmail().sendKeys("femi.qa@gmail.com");
        pageResource.getMyAccoutPostProjectPage().paypalPassword().sendKeys("paypal123");
        //click payapl button
        pageResource.getMyAccoutPostProjectPage().paypalLogin().click();
        driver.switchTo().defaultContent();
        Thread.sleep(12000);
        //click payapal button to confirm
        pageResource.getMyAccoutPostProjectPage().confirmPaypalBtn().click();
        Thread.sleep(5000);
        jse.executeScript("window.scrollBy(0,250)", "");
        pageResource.getMyAccoutPostProjectPage().returnToMerchant().click();
        Thread.sleep(3000);
        //verifying project title
        Assert.assertEquals(projtitle,pageResource.getMyAccoutPostProjectPage().projTitleAssertion().getText().contains(projtitle));
        //clicking logout
        pageResource.getHomePage().logoutClick().click();
    }
    @Test(dataProviderClass = Data_Provider.class,dataProvider = "BidqaDataProvider")
    public void qaEngineerProjectBidding(String username,String password) throws InterruptedException {
        pageResource=new PageResource(driver);
        //Click on login link
        pageResource.getHomePage().logClick().click();
        Thread.sleep(1000);
        //Provide qa engineer username and password
        pageResource.getLoginPage().userName().sendKeys(username);
        pageResource.getLoginPage().loginPassword().sendKeys(password);
        //click on sign in button
        pageResource.getLoginPage().signIn().click();
        //enetr project title to search
        pageResource.getMyAccoutPostProjectPage().projSeacrh().sendKeys(searchprojecttitle);
        //click on search
        pageResource.getMyAccoutPostProjectPage().projSearchEnter().click();
        Thread.sleep(3000);
        pageResource.getMyAccoutPostProjectPage().readMore().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //click on submit proposal
        pageResource.getMyAccoutPostProjectPage().submitProposal().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //inputting bid amount
        pageResource.getMyAccoutPostProjectPage().bidAmount().sendKeys("10");
        //Enetr number of days to complete the project
        pageResource.getMyAccoutPostProjectPage().daysToComplete().sendKeys("2");
        //ENTER project description
        pageResource.getMyAccoutPostProjectPage().bidDescription().sendKeys("bid description sample");
        //click on checkbox
        pageResource.getMyAccoutPostProjectPage().proposalCheckbox().click();
        //click on palce bid button
        pageResource.getMyAccoutPostProjectPage().placeBidBtn().click();





    }




}
