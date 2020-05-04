package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
    HomePage homePage = null;
    @FindBy(how=How.XPATH,using = "//*[@id=\"mainContent\"]/section[1]/div[1]/a")
    public static WebElement ShopWorryFreeWebElement;
    public static WebElement getShopWorryFreeWebElement(){return ShopWorryFreeWebElement;}

    @FindBy(how=How.XPATH,using = "//*[@id=\"s0-25-9-0-1[0]-0-1\"]/ul/li[3]/div/div[2]/a/h3")
    public static WebElement BissellPowerWebElement;
    public static WebElement getBissellPowerWorryFreeWebElement() { return BissellPowerWebElement; }

    public void readNValidateElectronics(WebDriver driver) {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnElectronicsTab();
        getShopWorryFreeWebElement().click();
        getBissellPowerWorryFreeWebElement().click();

    }
}
