package search;

import Base.CommonApi;
import hardData.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class CnnLookup extends CommonApi {

   @Test

    public void searchNews()throws InterruptedException{
        List<String> list = TestData.getListOfItems();
           for (int i=0; i<list.size(); i++){
            driver.findElement(By.cssSelector("//input[@class='cnn-search__input")).clear();
            driver.findElement(By.xpath(" //input[@class='cnn-search__input']")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(2000);

    }
}
}
