package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

    public static List<Integer> doubleMapExample(List<Dish> menu){
        return menu.stream().map(Dish::getName).map(String::length).collect(toList());
    }

    public static List<String> flatMapWithDistinct(String[] words){
        return Arrays.stream(words).map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(toList());
    }


    public static Boolean testAnyMatch(List<Dish> dishes){
        return dishes.stream().anyMatch(Dish::isVegetarian);
    }

    public static Boolean testAllMatch(List<Dish> menu){
        return menu.stream().allMatch(d -> d.getCalories()<10000);
    }

    public static Boolean testNoneMatch(List<Dish> menu){
        return menu.stream().noneMatch(d -> d.getCalories()>100000);
    }

    public static Optional<Dish> testFindAny(List<Dish> menu){
        return menu.stream().filter(Dish::isVegetarian).findAny();
    }


    public static Boolean testIsPresent(List<Dish> menu){
        return testFindAny(menu).isPresent();
    }

    public static int testReduceDum(List<Integer> numbers){
        return numbers.stream().reduce(0,(a,b)-> a+b);
    }


    public static Optional<Integer> testMax(List<Integer> numbers){
        return numbers.stream().reduce(Integer::max);
    }
}
