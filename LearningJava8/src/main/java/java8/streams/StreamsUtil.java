package java8.streams;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by LuisCO on 6/01/2018.
 */
public class StreamsUtil {


    public static List<String> threeDishesHighCalories(List<Dish> menu) {
       return menu.stream().filter(d -> d.getCalories()>300).map(Dish::getName).limit(3).collect(toList());
    }

    public static List<String> vegetarianDishes(List<Dish> menu){
        return menu.stream().filter(v -> v.isVegetarian()).map(Dish::getName).collect(toList());
    }


    public static List<Integer> getDistinctValues(List<Integer> numbersList){
        return numbersList.stream().filter(n -> n%2==0).distinct().collect(toList());
    }

    public static List<String> skipVegetariasDishes(List<Dish> menu){
        return menu.stream().filter(v -> v.isVegetarian()).skip(2).map(Dish::getName).collect(toList());
    }
}
