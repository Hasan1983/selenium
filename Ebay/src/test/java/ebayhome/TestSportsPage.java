package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.GardenPage;
import pages.SportsPage;

public class TestSportsPage extends CommonApi {
    @Test
    public void LookingSpoRtsGood(){
        SportsPage sportsPage=PageFactory.initElements(driver,SportsPage.class);
        sportsPage.ReadSportGood(driver);

    }
}
