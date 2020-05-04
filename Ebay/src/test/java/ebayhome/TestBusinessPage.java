package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BusinessPage;

public class TestBusinessPage extends CommonApi {
    @Test
    public void LookingBusiness(){
        BusinessPage businessPage= PageFactory.initElements(driver,BusinessPage.class);
        businessPage.readBusinessPage(driver);
    }

}
