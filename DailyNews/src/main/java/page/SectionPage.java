package page;

import Base.CommonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SectionPage {

    HomePage homePage=null;

   @FindBy(how= How.CSS, using ="#app-bar-topics-button > span")
    public static WebElement SectionTabWebElement;

   @FindBy(how= How.CSS, using ="#sub-1 > a")
   // @FindBy(how= How.CSS, using ="#sections-menu > div > div > div.placeholder-topics-list > ul li:nth-child(2)")
    public static WebElement CoronaVirusTabWebElement;
    public static WebElement getCoronaVirusTabWebElement() { return CoronaVirusTabWebElement; }

    @FindBy(how=How.XPATH, using = "//*[@id=\"sub-3\"]/a")
    public static WebElement SPortsTabWebElement;
    public static WebElement getSPortsTabWebElement() { return SPortsTabWebElement; }



    public void readSectionPage(WebDriver driver)  {
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnSectionTab();
        getCoronaVirusTabWebElement().click();

    }

}
