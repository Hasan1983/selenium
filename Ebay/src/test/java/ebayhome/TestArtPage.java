package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ArtPage;


public class TestArtPage extends CommonApi {
    @Test
    public void lookingArt() {
        ArtPage artPage = PageFactory.initElements(driver, ArtPage.class);
        artPage.readNValidateArt(driver);
    }
}
