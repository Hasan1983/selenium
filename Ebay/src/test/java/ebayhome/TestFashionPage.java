package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.FashionPage;

public class TestFashionPage extends CommonApi {
    @Test
    public void lookingFashion(){
        FashionPage f= PageFactory.initElements(driver,FashionPage.class);
        f.readNValidateFashion(driver);

    }



}
