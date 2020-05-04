package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MusicPage {
    HomePage homePage=null;

    @FindBy(how = How.CSS, using = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11)")
    public static WebElement MusicTabWebElement;

    public void ListenMusic(WebDriver driver){
        homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnMusicTab();
    }

}
