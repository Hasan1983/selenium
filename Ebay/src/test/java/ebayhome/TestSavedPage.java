package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MotorsPage;
import pages.SavedPage;

public class TestSavedPage extends CommonApi {

    @Test
    public void lookingSaved(){
        SavedPage savedPage = PageFactory.initElements(driver, SavedPage.class);
        savedPage.readNValidateSaved(driver);
    }
}
