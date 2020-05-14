package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchPage extends CommonApi {
    @Test
    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException{
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }


   /* @Test
    public void searchItems1()throws Exception, IOException, SQLException, ClassNotFoundException{
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.searchItemsAndSubmitButton1();
    }


    @Test
    public void searchItems2()throws Exception, IOException, SQLException, ClassNotFoundException{
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.searchItemsAndSubmitButton2();
    }*/
}



