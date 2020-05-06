package pages;

import Base.CommonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class RegisterPage {
    HomePage homePage=null;

    @FindBy(how = How.CSS,using = "#firstname")
    public static WebElement FirstNameTabWebElement;
    public  WebElement getFirstNameTabWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return FirstNameTabWebElement; }

        @FindBy(how = How.CSS,using = "#lastname")
    public static WebElement LastNameTabWebElement;
    public  WebElement getLastNameTabWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return LastNameTabWebElement; }

    @FindBy(how = How.CSS,using = "#email")
    public static WebElement EmailTabWebElement;
    public WebElement getEmailTabWebElement(){
       TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return EmailTabWebElement; }

    @FindBy(how = How.CSS,using = "#PASSWORD")
    public static WebElement PasswordTabWebElement;
    public WebElement getPasswordTabWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return PasswordTabWebElement; }

    @FindBy(how = How.CSS,using = "#ppaFormSbtBtn")
    public static WebElement CreateAccountTabWebElement;
    public WebElement getCreateAccountTabWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return CreateAccountTabWebElement; }

    public void ReadNValidate(WebDriver driver) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnRegister();
        getFirstNameTabWebElement().sendKeys("rabi");
        getLastNameTabWebElement().sendKeys("Islam");
        getEmailTabWebElement().sendKeys("abcdef@yahoo.com");
        getPasswordTabWebElement().sendKeys("Hul1234@");
       // CommonApi.sleepFor(2);
       // getCreateAccountTabWebElement().click();

    }



}
