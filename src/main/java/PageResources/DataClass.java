package PageResources;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

/**
 * Created by femi on 5/7/17.
 */
public class DataClass {
    public String randomusername = RandomStringUtils.randomAlphanumeric(7).toLowerCase();
    public String randomemail = randomusername + "@getnada.com";
    public String pword = "pass123";
    public String projtitle=RandomStringUtils.randomAlphanumeric(7).toLowerCase();
    public String projdescription=RandomStringUtils.randomAlphanumeric(15).toLowerCase();
    public String tagname=RandomStringUtils.randomNumeric(5) + "," + RandomStringUtils.randomAlphabetic(5);
    public String sublocation="santa clara";
    public String address="345 caleveras";

}
