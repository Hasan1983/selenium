package facebookhome;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginTest extends CommonApi {


    @Test
    public void testTypingOnLogIn() {
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).sendKeys("Log In", Keys.ENTER);

    }

}
