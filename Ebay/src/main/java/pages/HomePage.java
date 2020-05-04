package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class HomePage {

    @FindBy(how = How.CSS, using = ".hl-cat-nav__container li:nth-child(2)")
    public static WebElement SavedTabWebElement;

    @FindBy(how = How.CSS, using = ".hl-cat-nav__container li:nth-child(3)")
    public static WebElement MotorsTabWebElement;

    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(4)")
     public static WebElement FashionTabWebElement;

     @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(5)")
     public static WebElement ElectronicsTabWebElement;

    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(6)")
    public static WebElement ArtTabWebElement;

    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(7)")
    public static WebElement GardenTabWebElement;

    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8)")
    public static WebElement SportsTabsWebElement;

    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9)")
    public static WebElement ToysTabWebElement;

    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(10)")
    public static WebElement BusinessTabWebElement;

    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11)")
    public static WebElement MusicTabWebElement;

    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(12)")
    public static WebElement DealsTabWebElement;
    @FindBy(how=How.CSS,using = "#gh-ug-flex > a")
    public static WebElement RegisterTabWebElement;

    public static WebElement getSavedTabWebElement() { return SavedTabWebElement; }
    public static WebElement getMotorsTabWebElement() { return MotorsTabWebElement; }
    public static WebElement getFashionTabWebElement() { return FashionTabWebElement; }
    public static WebElement getElectronicsTabWebElement() { return ElectronicsTabWebElement; }
    public static WebElement getArtTabWebElement() { return ArtTabWebElement; }
    public static WebElement getGardenTabWebElement() { return GardenTabWebElement; }
    public static WebElement getSportsTabWebElement() { return SportsTabsWebElement; }
    public static WebElement getToysTabWebElement() { return ToysTabWebElement; }
    public static WebElement getBusinessTabWebElement() { return BusinessTabWebElement; }
    public static WebElement getMusicTabWebElement() { return MusicTabWebElement; }
    public static WebElement getDealsTabWebElement() { return DealsTabWebElement; }
    public static WebElement getRegisterTabWebElement() { return RegisterTabWebElement; }

    public void clickOnSavedTab() { getSavedTabWebElement().click(); }
    public void clickOnMotorsTab() { getMotorsTabWebElement().click(); }
    public void clickOnFashionTab() { getFashionTabWebElement().click(); }
    public void clickOnElectronicsTab() { getElectronicsTabWebElement().click();}
    public void clickOnArtTab() { getArtTabWebElement().click(); }
    public void clickOnGardenTab() { getGardenTabWebElement().click();}
    public void clickOnSportsTab() { getSportsTabWebElement().click();}
    public void clickOnToysTab() { getToysTabWebElement().click();}
    public void clickOnBusinessTab() { getBusinessTabWebElement().click();}
    public void clickOnMusicTab() { getMusicTabWebElement().click();}
    public void clickOnDealsTab() { getDealsTabWebElement().click();}
    public void clickOnRegister() { getRegisterTabWebElement().click();}

}
