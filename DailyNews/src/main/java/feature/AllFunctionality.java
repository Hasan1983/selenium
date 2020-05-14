package feature;


import datasource.FetchTheStep;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.HomePage;
import page.NewYorkPage;
import page.SectionPage;


import java.io.IOException;

public class AllFunctionality {

    HomePage homePage = null;
    NewYorkPage newYorkPage = null;
    SectionPage sectionsPage = null;

    public void NewYorkMenu(WebDriver driver){
        homePage = PageFactory.initElements(driver, HomePage.class);
      //  signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        homePage.clickOnNewYorkTab();
       // signUpPage.enterEmailAddress("abc123@gmail.com");
       // signUpPage.clickOnSignUp();
    }

    public void clickOnSectionTab(WebDriver driver){
        homePage = PageFactory.initElements(driver, HomePage.class);
       homePage.clickOnSectionTab();
    }
    public void sectionsMenu(WebDriver driver){
        clickOnSectionTab(driver);
       //sectionsPage = PageFactory.initElements(driver, SectionsPage.class);
       // sectionsPage.goToMetroPage(driver).clickOnHeadLineNews();
       // clickOnSectionMenu(driver);
       // sectionsPage.goToBusinessPage(driver).clickOnHeadLineNews();
       // clickOnSectionMenu(driver);
       // sectionsPage.goToEntertainmentPage(driver).clickOnHeadLineNews();
    }
    public void runAllTheFeatureTest(WebDriver driver) throws IOException {
        FetchTheStep fetchTheStep = new FetchTheStep();
        String [] featureSteps = fetchTheStep.getDataFromExcelFileForFeaturesChoice();
        for(int i=0; i<featureSteps.length; i++){
            select(featureSteps[i],driver);
        }
    }

    public void select(String featureName, WebDriver driver)throws IOException{
        switch(featureName){
            case "NEW YORK":
                NewYorkMenu(driver);
                break;
            case "SECTIONS":
                sectionsMenu(driver);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
}
