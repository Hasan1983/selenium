package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MusicPage;

public class TestMusicPage extends CommonApi {
    @Test
    public void LookingForMusic(){
        MusicPage musicPage= PageFactory.initElements(driver,MusicPage.class);
        musicPage.ListenMusic(driver);
    }
}
