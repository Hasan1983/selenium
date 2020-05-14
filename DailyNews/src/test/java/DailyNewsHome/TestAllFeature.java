package DailyNewsHome;

import Base.CommonApi;
import feature.AllFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestAllFeature extends CommonApi {
    @Test
    public void allFeature() throws IOException {

        AllFunctionality allFunctionality= PageFactory.initElements(driver,AllFunctionality.class);
        allFunctionality.runAllTheFeatureTest(driver);

    }

}
