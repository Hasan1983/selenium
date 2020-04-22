package search;

import Base.CommonApi;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CnnNews extends CommonApi {

    @Test
    public void find(){

        String expectedTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        String actualTitle = "Search CNN - Videos, Pictures, and News - CNN.com";
        softAssert.assertEquals( actualTitle,expectedTitle,"Title did not match. So you need to double check");
        softAssert.assertAll();
        System.out.println(actualTitle);
        System.out.println(expectedTitle);

    }

}
