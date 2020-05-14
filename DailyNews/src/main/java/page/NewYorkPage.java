package page;

import Base.CommonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewYorkPage {

    HomePage homePage=null;

    @FindBy(how= How.XPATH, using="//*[@id=\"app-bar\"]/div/div[2]/div/ul/li[1]/a")
    public static WebElement NewYorkTabWebElement;

    @FindBy(how= How.XPATH, using="//*[@id=\"f0aEv3EBF9yqRr\"]/ul/li/div/div/div[2]/div[1]/h2/a")
    public static WebElement HeadlineTabWebElement;
    public static WebElement getHeadlineTabWebElement() { return HeadlineTabWebElement; }

   @FindBy(how= How.XPATH, using="//*[@id=\"f0N7LYRBF9yqRr\"]/ul/li/div/div/div[2]/div[1]/ul/li/a")
    public static WebElement EducationTabWebElement;
    public static WebElement getEducationTabWebElement() { return EducationTabWebElement; }

    public void readNValidateNewYork(WebDriver driver){
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnNewYorkTab();
        //getHeadlineTabWebElement().click();
       // CommonApi.navigateBack();
       // getEducationTabWebElement();



    }
}
