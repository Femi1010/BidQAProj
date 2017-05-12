package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;

/**
 * Created by femi on 5/9/17.
 */
public class MyAccoutPostProjectPage
{
    WebDriver driver;
    public MyAccoutPostProjectPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement postProjectLink()
    {
        return driver.findElement(By.linkText("Post New Project"));

    }
    public WebElement projectTitle()

    {
        return driver.findElement(By.name("project_title"));
    }
    public WebElement projectDescription()

    {
        return driver.findElement(By.name("project_description"));
    }
    public WebElement selectCategory()
    {
        return driver.findElement(By.xpath("//input[@value='5051'][@name='project_cat_cat_multi[]']"));
    }
    public WebElement enterTag()
    {
        return driver.findElement(By.name("project_tags"));
    }
    public WebElement selectSkill()
    {
        return driver.findElement(By.xpath("//input[@name='project_skill_cat_multi[]'][@value='32']"));
    }
    public WebElement projectBudget()
    {
        return driver.findElement(By.name("budgets"));
    }
    public WebElement projectEndingDate()
    {
        return driver.findElement(By.id("ending"));
    }
    public WebElement chooseProjectDate()
    {
        return driver.findElement(By.linkText("29"));
    }
    public WebElement selectCountry()
    {
        return driver.findElement(By.id("do_input_new"));
    }
    public WebElement selectState()
    {
        return driver.findElement(By.name("subloc"));
    }
    public WebElement enterSubLocation()
    {
        return driver.findElement(By.name("subloc2"));
    }
    public WebElement enterAddress()
    {
        return driver.findElement(By.name("project_location_addr"));
    }
    public WebElement clickNext()
    {
        return driver.findElement(By.name("project_submit1"));
    }
    public WebElement chooseFeaturedProject()
    {
    return driver.findElement(By.name("featured"));
    }
    public WebElement optionNextClick()
    {
        return driver.findElement(By.name("project_submit2"));
    }
    public WebElement previewNextClick()
    {
        return driver.findElement(By.linkText("Next Step →"));
        //return driver.findElement(By.xpath("//a[@href='http://test.bidqa.com/post-new/?post_new_step=4&projectid=4803']"));
    }
    public WebElement acceptTerms()
    {
        return driver.findElement(By.id("cb-payment"));
    }
    public WebElement payByPaypalBtn()
    {
        return driver.findElement(By.xpath("//a[contains(@href,'http://test.bidqa.com/?p_action=paypal_listing')]"));

    }
    public WebElement paypalEmail()
    {
        return driver.findElement(By.id("email"));
    }
    public WebElement paypalPassword()
    {
        return driver.findElement(By.id("password"));
    }
    public WebElement paypalLogin()
    {
        return driver.findElement(By.id("btnLogin"));
    }
    public WebElement confirmPaypalBtn()
    {
        return driver.findElement(By.id("confirmButtonTop"));
    }
    public WebElement returnToMerchant()
    {
        return driver.findElement(By.id("merchantReturnBtn"));
    }
    public WebElement projTitleAssertion()
    {
        return driver.findElement(By.xpath("//div[@class='mm_inn mm_inn21']"));
    }
    public WebElement projSeacrh()
    {
        return  driver.findElement(By.id("my-top-search-input"));
    }
    public  WebElement projSearchEnter()
    {
        return driver.findElement(By.id("my-top-submit-input"));
    }
    public WebElement readMore()
    {
        return driver.findElement(By.linkText("Read More"));
    }
    public WebElement submitProposal()
    {
        return driver.findElement(By.id("submit-proposal-id"));
    }
    public WebElement bidAmount()
    {
        return driver.findElement(By.id("bid"));
    }
    public WebElement daysToComplete()
    {
        return driver.findElement(By.id("days_done"));
    }
    public WebElement bidDescription()
    {
        return driver.findElement(By.name("description2"));
    }
    public WebElement proposalCheckbox()
    {
        return driver.findElement(By.id("submits_crt_check"));
    }
    public WebElement placeBidBtn()
    {
        return driver.findElement(By.id("submits_crt"));
    }




}
