package java8.predicateExapmple;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by LuisCO on 26/12/2017.
 */
public class CarFliterExampleTest {

    private List<CarVO> carList;

    @Before
    public void setUp(){
        carList = Arrays.asList(new CarVO("name1","Black"),new CarVO("name2","Red"));
    }


    @Test
    public void testPredicateBlackColor() throws Exception {
        assertEquals(1,CarFliterExample.filterCarsByColor(carList,CarFliterExample::filterBalckColor).size());
        assertEquals("Black",CarFliterExample.filterCarsByColor(carList,CarFliterExample::filterBalckColor).get(0).getColor());
    }

    @Test
    public void testPredicateRedColor() throws Exception {
        assertEquals(1,CarFliterExample.filterCarsByColor(carList,CarFliterExample::filterRedColor).size());
        assertEquals("Red",CarFliterExample.filterCarsByColor(carList,CarFliterExample::filterRedColor).get(0).getColor());
    }

    @Test
    public void testBlackWithLambda() throws Exception {
        assertEquals(1,CarFliterExample.filterCarsByColor(carList,(CarVO c) -> c.getColor().equals("Black")).size());
        assertEquals("Black",CarFliterExample.filterCarsByColor(carList,(CarVO c) -> c.getColor().equals("Black")).get(0).getColor());
    }

    @Test
    public void testRedWithLambda() throws Exception {
        assertEquals(1,CarFliterExample.filterCarsByColor(carList,(CarVO c) -> c.getColor().equals("Red")).size());
        assertEquals("Red",CarFliterExample.filterCarsByColor(carList,(CarVO c) -> c.getColor().equals("Red")).get(0).getColor());
    }

}
