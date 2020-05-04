package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.GardenPage;

public class TestGardenPage extends CommonApi {
    @Test
    public void lookingGarden(){
        GardenPage gardenPage= PageFactory.initElements(driver,GardenPage.class);
        gardenPage.read(driver);
    }
}
