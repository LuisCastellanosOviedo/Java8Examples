package java8.streams;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Created by LuisCO on 6/01/2018.
 */
public class StreamsTest {

        private List<Dish> menu;
        private List<Integer> numbers;

    @Before
    public void setUp() throws Exception {
        menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                 new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );

        numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
    }

    @Test
    public void highcaloriesDishes() throws Exception {
        assertEquals(3,StreamsUtil.threeDishesHighCalories(menu).stream().count());
    }

    @Test
    public void vegetariasnDishes() throws Exception {
        assertEquals(4,StreamsUtil.vegetarianDishes(menu).stream().count());
        assertEquals("french fries",StreamsUtil.vegetarianDishes(menu).get(0));
    }

    @Test
    public void getDistinctNumbers() throws Exception {
        assertEquals(2,StreamsUtil.getDistinctValues(numbers).stream().count());
        assertEquals(new Integer(2) , StreamsUtil.getDistinctValues(numbers).get(0));
    }

    @Test
    public void skipVegetarianDishes() throws Exception {
        assertEquals(2,StreamsUtil.skipVegetariasDishes(menu).stream().count());
    }
}
