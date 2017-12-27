package java8.filterPredicateExample;

import java8.predicateExapmple.CarVO;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Created by LuisCO on 27/12/2017.
 */
public class FilterPredicateUtTest {

    private List<CarVO> carList;

    @Before
    public void setUp()
    {
        carList= Arrays.asList(new CarVO("name1","Black"),new CarVO("name2","Red"));
    }


    @Test
    public void testfilterRedCars() throws Exception {

        assertEquals("name2",FilterPredicateTest.genericFilter(carList, c -> c.getColor().equals("Red")).get(0).getName());
    }

    @Test
    public void testFilterByname() throws Exception {
        assertEquals("name1",FilterPredicateTest.<CarVO>genericFilter(carList, c -> c.getName().equals("name1")).get(0).getName());
    }
}
