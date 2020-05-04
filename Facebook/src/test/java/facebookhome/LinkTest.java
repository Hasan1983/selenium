package facebookhome;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LinkTest extends CommonApi {
    @Test
    public void link(){
        List<WebElement> facebook=driver.findElements(By.tagName("a"));
        System.out.println(facebook.size());





    }
}
