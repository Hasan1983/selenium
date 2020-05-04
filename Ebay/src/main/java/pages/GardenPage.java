package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GardenPage {
    HomePage homePage=null;
    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(7)")
    public static WebElement GardenTabWebElement;

    public void read(WebDriver driver){
        homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnGardenTab();
    }
}
