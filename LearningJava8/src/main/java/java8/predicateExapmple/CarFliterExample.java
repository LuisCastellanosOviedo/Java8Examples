package java8.predicateExapmple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by LuisCO on 26/12/2017.
 */
public class CarFliterExample {



    public static boolean filterBalckColor(CarVO carVO){
        return carVO.getColor().equals("Black");
    }

    public static boolean filterRedColor(CarVO carVO){
        return carVO.getColor().equals("Red");
    }

    public static <T> List<T> filterCarsByColor(List<T> cars, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for (T c:cars) {
            if(predicate.test(c)){
                result.add(c);
            }
        }

        return result;
    }

}
