package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.DealsPage;

public class TestDealsPage extends CommonApi {
    @Test
    public void lookingForDeals(){
        DealsPage dealsPage= PageFactory.initElements(driver,DealsPage.class);
        dealsPage.readDeal(driver);
    }

}
