package dress;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DressPage extends CommonApi {
    @Test
     public void a() {
        driver.findElement(By.xpath("//body[@id='index']")).click();
    }
      public void selectItem(){
        a();
        String Item=driver.findElement(By.cssSelector(".product_list.grid.row li:nth-child(1)")).getText();
        System.out.println(Item);
    }

}
