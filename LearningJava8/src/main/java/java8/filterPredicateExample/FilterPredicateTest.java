package java8.filterPredicateExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by LuisCO on 27/12/2017.
 */
public class FilterPredicateTest {


    public static <T> List<T> genericFilter(List<T> list, Predicate<T> pred){
        List<T> res = new ArrayList<>();

        for (T t:list) {
            if(pred.test(t)){
                res.add(t);
            }
        }
         return res;
    }

}
