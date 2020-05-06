package pages;

import Base.CommonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class MotorsPage {
    HomePage homePage=null;
    @FindBy(how = How.CSS, using = ".hl-cat-nav__container li:nth-child(3)")
    public static WebElement MotorsTabWebElement;


    public void readNValidateMotors(WebDriver driver) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnMotorsTab();
    }
}


