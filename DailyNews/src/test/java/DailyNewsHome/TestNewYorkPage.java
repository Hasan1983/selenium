package DailyNewsHome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.NewYorkPage;

public class TestNewYorkPage extends CommonApi {
    @Test
    public void lookingForNewYorkNews(){
        NewYorkPage newYorkPage= PageFactory.initElements(driver,NewYorkPage.class);
        newYorkPage.readNValidateNewYork(driver);
    }
}
