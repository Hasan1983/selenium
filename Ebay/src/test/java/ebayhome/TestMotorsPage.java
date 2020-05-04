package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MotorsPage;

public class TestMotorsPage extends CommonApi {
    @Test
    public void lookingMotors(){
        MotorsPage motorsPage = PageFactory.initElements(driver,MotorsPage.class);
        motorsPage.readNValidateMotors(driver);
    }
}
