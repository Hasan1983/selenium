package datasource;


import datasources.ConnectToExcelFile;
import java.io.IOException;

public class FetchTheStep {
    ConnectToExcelFile excelFile = new ConnectToExcelFile();
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/DailyNews/data/DailyNews-test-steps.xls";
        String [] data = excelFile.fileReader2(path,0);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty("user.dir")+"/data/DailyNews-test-steps.xls";
        String [] data = excelFile.fileReader2(path,0);
        return data;
    }
}
