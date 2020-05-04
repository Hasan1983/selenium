package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MotorsPage;
import pages.SavedPage;
import reporting.TestLogger;

public class TestSavedPage extends CommonApi {

    @Test
    public void lookingSaved(){
        TestLogger.log(getClass().getSimpleName() + ": " +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SavedPage savedPage = PageFactory.initElements(driver, SavedPage.class);
        savedPage.readNValidateSaved(driver);
    }
}
