package DailyNewsHome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.SectionPage;

public class TestSectionPage extends CommonApi {

    @Test
    public void lookingSections()  {
        SectionPage sectionPage= PageFactory.initElements(driver,SectionPage.class);
        sectionPage.readSectionPage(driver);
    }

}
