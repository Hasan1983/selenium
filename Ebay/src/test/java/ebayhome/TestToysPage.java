package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ToysPage;

public class TestToysPage extends CommonApi {
    @Test
    public void lookingToys(){
        ToysPage toysPage= PageFactory.initElements(driver,ToysPage.class);
        toysPage.readToys(driver);
    }
}
