package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ToysPage {
    HomePage homePage=null;

    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9)")
    public static WebElement ToysTabWebElement;

    public void readToys(WebDriver driver){
        homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnToysTab();
    }

}
