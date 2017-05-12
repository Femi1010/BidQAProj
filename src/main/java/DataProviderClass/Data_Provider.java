package DataProviderClass;

import PageResources.DataClass;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

/**
 * Created by femi on 5/10/17.
 */
public class Data_Provider {
    DataClass dataClass=new DataClass();
    @DataProvider(name = "BidqaDataProvider")
    public Object[][] getdata(Method method)
    {
        if (method.getName().equals("loginTest"))
        {
            return new Object[][]
            {
                {"femi","abc123"}
            };
        }
        else if (method.getName().equals("postNewProject"))
        {
            return new Object[][]
                    {
                            {"femi","abc123",dataClass.projtitle,dataClass.projdescription,dataClass.tagname,dataClass.sublocation,dataClass.address}
                    };
        }
        else if(method.getName().equalsIgnoreCase("qaEngineerProjectBidding"))
        {
            return new Object[][]
                    {
                            {"femina","abc123"}
                    };
        }

        else
        {
            System.out.println("Datparovider cannot find data");
            return null;
        }
    }

}
