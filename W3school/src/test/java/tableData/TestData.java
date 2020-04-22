package tableData;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestData extends CommonApi {

    @Test
     public void readData(){
       /*String tahcolumn1= driver.findElement(By.cssSelector(".w3-table-all.notranslate tr:nth-child(1) th:nth-child(1)")).getText();
       String tahcolumn2= driver.findElement(By.cssSelector(".w3-table-all.notranslate tr:nth-child(1) th:nth-child(2)")).getText();
       String tahcolumn3= driver.findElement(By.cssSelector(".w3-table-all.notranslate tr:nth-child(1) th:nth-child(3)")).getText();
        System.out.println(tahcolumn1+"  "+tahcolumn2+ "  "+" "+tahcolumn3);

        Assert.assertEquals(tahcolumn1,"CustomerID");
        Assert.assertEquals(tahcolumn2,"CustomerName");
        Assert.assertEquals(tahcolumn3,"ContactName");*/

        //String tableData= driver.findElement(By.cssSelector(".w3-table-all.notranslate tr:nth-child(5) td:nth-child(4)")).getText();
       // System.out.println(tableData);

        String tableData= driver.findElement(By.cssSelector(".w3-table-all.notranslate td:nth-child(4)")).getText();
        System.out.println(tableData);


    }
}
