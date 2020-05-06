package pages;

import datasuply.DataSource;
import hardData.SaveData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPage {

    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.XPATH, using = "//input[@id='gh-btn']")
    public static WebElement submitWebElement;

    public WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public WebElement getSubmitWebElement() {
        return submitWebElement;
    }

    public void clearInputBox() {
        getSearchInputWebElement().clear();
    }

    public void typeItemName(String value) {
        getSearchInputWebElement().sendKeys(value);
    }

    public void clickOnSearch() {
        getSubmitWebElement().click();
    }

   /* public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = SaveData.getListOfItems();
        for (int i = 0; i < list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();
            //verification
        }*/
//}
      /* public void searchItemsAndSubmitButton1()throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = DataSource.getItemsListFromDB();
        for(int i=0; i<list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();
            //verification
        }

         }*/

    public void searchItemsAndSubmitButton2() throws Exception, IOException, SQLException, ClassNotFoundException {
        String[] data = DataSource.getDataFromExcelFile();
        for (int i = 0; i < data.length; i++) {
            typeItemName(data[i]);
            clickOnSearch();
            clearInputBox();
            //verification
        }


        }
    }

