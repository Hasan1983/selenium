package datasuply;

import datasources.ConnectToExcelFile;
import datasources.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {



   public static ConnectToExcelFile excelFile = new ConnectToExcelFile();
    public static String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/data/nyp-test-steps.xls";
       // String path=System.getProperty("");
        String [] data = excelFile.fileReader2(path,0);
        return data;
    }

/*

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

*/

}
