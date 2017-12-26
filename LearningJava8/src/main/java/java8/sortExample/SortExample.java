package java8.sortExample;

import java.util.List;

/**
 * Created by LuisCO on 26/12/2017.
 */
public class SortExample {


    public static  List<String> listSorted(List<String> list){
        list.sort((x,y)-> x.compareTo(y));
        return list;
    }
}
