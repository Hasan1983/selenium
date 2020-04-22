package facebookhome;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SignUpTest extends CommonApi {

    @Test
    public void testSignUp(){
        driver.findElement(By.xpath("*//input[starts-with(@id,'u_0_')]")).sendKeys("Sign Up", Keys.ENTER);
    }

}
