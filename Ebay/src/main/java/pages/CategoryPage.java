package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {

HomePage homePage=null;


  @FindBy(how = How.CSS, using = "#gh-shop-a")
    public static WebElement CategoryTabWebElement;
    public static WebElement getCategoryTabWebElement() { return CategoryTabWebElement; }



    public void readNValidateCategory(WebDriver driver){
        getCategoryTabWebElement().click();



    }
}


