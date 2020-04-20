package search;

import amazon.AmazonHomePage;
import amazon.TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends AmazonHomePage {



    @Test
    public void testTypingOnSearchBox()throws InterruptedException{

        List<String> list = TestData.getListOfItems();
        for(int i=0; i<list.size(); i++){
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(2000);

        }

    }



}
