package pages;

import Base.CommonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    HomePage homePage=null;

    @FindBy(how = How.CSS,using = "#firstname")
    public static WebElement FirstNameTabWebElement;
    public static WebElement getFirstNameTabWebElement(){ return FirstNameTabWebElement; }

    @FindBy(how = How.CSS,using = "#lastname")
    public static WebElement LastNameTabWebElement;
    public static WebElement getLastNameTabWebElement(){ return LastNameTabWebElement; }

    @FindBy(how = How.CSS,using = "#email")
    public static WebElement EmailTabWebElement;
    public static WebElement getEmailTabWebElement(){ return EmailTabWebElement; }

    @FindBy(how = How.CSS,using = "#PASSWORD")
    public static WebElement PasswordTabWebElement;
    public static WebElement getPasswordTabWebElement(){ return PasswordTabWebElement; }

    @FindBy(how = How.CSS,using = "#ppaFormSbtBtn")
    public static WebElement CreateAccountTabWebElement;
    public static WebElement getCreateAccountTabWebElement(){ return CreateAccountTabWebElement; }

    public void ReadNValidate(WebDriver driver) throws InterruptedException {
        homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnRegister();
        getFirstNameTabWebElement().sendKeys("rabi");
        getLastNameTabWebElement().sendKeys("Islam");
        getEmailTabWebElement().sendKeys("abcdef@yahoo.com");
        getPasswordTabWebElement().sendKeys("Hul1234@");
        CommonApi.sleepFor(5);
        getCreateAccountTabWebElement().click();

    }



}
