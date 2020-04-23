package amazon;

import java.util.ArrayList;
import java.util.List;

public class TestData {


    public static List<String> getListOfItems(){
        List<String> list = new ArrayList<String>();
        list.add("java books");
        list.add("tooth paste");
        list.add("coffee");
        list.add("laptop");
        list.add("honey");

        return list;
    }

    public void readDataBaseItemsForAmazon(){
        System.out.println("Reading.....");
    }


}
