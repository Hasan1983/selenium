package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.RegisterPage;
import reporting.TestLogger;

public class TestRegisterPage extends CommonApi {
    @Test
    public void doRegister() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RegisterPage registerPage= PageFactory.initElements(driver,RegisterPage.class);
        registerPage.ReadNValidate(driver);
    }
}
