package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HomeLinkTest extends CommonApi {
    @Test
    public void Home(){
        List<WebElement> ebay=driver.findElements(By.tagName("a"));
        System.out.println(ebay.size());


    }
}
