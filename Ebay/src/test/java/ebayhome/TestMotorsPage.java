package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MotorsPage;
import reporting.TestLogger;

public class TestMotorsPage extends CommonApi {
    @Test
    public void lookingMotors(){
        TestLogger.log(getClass().getSimpleName() + ": " +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MotorsPage motorsPage = PageFactory.initElements(driver,MotorsPage.class);
        motorsPage.readNValidateMotors(driver);
    }
}
