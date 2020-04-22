package facebookhome;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LinkTest2 extends CommonApi {
    @Test
    public void linkFb(){

        List<WebElement> facebook=driver.findElements(By.tagName("a"));
        System.out.println(facebook.size());

        for(int i=0;i<facebook.size();i++){

            String linkText=facebook.get(i).getText();
            System.out.println(linkText);



        }





    }
}
