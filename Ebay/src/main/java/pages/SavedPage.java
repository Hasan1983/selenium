package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SavedPage {
    HomePage homePage=null;
    @FindBy(how = How.CSS, using = ".hl-cat-nav__container li:nth-child(2)")
    public static WebElement SavedTabWebElement;


    public void readNValidateSaved(WebDriver driver) {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSavedTab();
    }
}
