package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how= How.CSS, using ="#app-bar-topics-button > span")
    public static WebElement SectionTabWebElement;
    @FindBy(how= How.XPATH, using="//*[@id=\"app-bar\"]/div/div[2]/div/ul/li[1]/a")
    public static WebElement NewYorkTabWebElement;
    public static WebElement getSectionTabWebElement() { return SectionTabWebElement; }
    public static WebElement getNewYorkTabWebElement() { return NewYorkTabWebElement; }
    public void clickOnSectionTab() { getSectionTabWebElement().click();}
    public void clickOnNewYorkTab() { getNewYorkTabWebElement().click();}







}
