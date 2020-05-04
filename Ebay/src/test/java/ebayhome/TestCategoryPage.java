package ebayhome;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CategoryPage;

public class TestCategoryPage extends CommonApi {
    @Test
    public void lookingForCategory(){
        CategoryPage categoryPage= PageFactory.initElements(driver,CategoryPage.class);
        categoryPage.readNValidateCategory(driver);
    }

}
