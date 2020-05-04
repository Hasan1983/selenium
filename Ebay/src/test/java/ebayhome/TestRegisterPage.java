package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class TestRegisterPage extends CommonApi {
    @Test
    public void doRegister() throws InterruptedException {
        RegisterPage registerPage= PageFactory.initElements(driver,RegisterPage.class);
        registerPage.ReadNValidate(driver);
    }
}
