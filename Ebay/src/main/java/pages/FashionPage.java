package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FashionPage {
    HomePage homePage=null;
   /* @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(4)")
    public static WebElement FashionTabWebElement;*/

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Shop Mother')]")
    public static WebElement ShopMomWebElement;
    public static WebElement getShopMomWebElement() { return ShopMomWebElement; }

    @FindBy(how = How.XPATH, using = "//*[@id=\"s0-25-9-0-1[0]-0-1\"]/ul/li[1]/div/div[2]/a/h3")
    public static WebElement NecklaceWebElement;
    public static WebElement getNecklaceWebElement() { return NecklaceWebElement; }

    @FindBy(how = How.CSS, using = "#isCartBtn_btn")
    public static WebElement CartWebElement;
    public static WebElement getCartWebElement() { return CartWebElement; }


    public void readNValidateFashion(WebDriver driver) {
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnFashionTab();
        getShopMomWebElement().click();
        getNecklaceWebElement().click();
        getCartWebElement().click();
    }

}
