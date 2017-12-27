package java8.methodReferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by LuisCO on 27/12/2017.
 */
public class ConstructorReference {



    public static <T> List<T> createFruits(List<String> weights, Function<String,T> func){

        List<T> result = new ArrayList<>();
        for (String c:weights) {
            result.add(func.apply(c));
        }

        return result;
    }
}
