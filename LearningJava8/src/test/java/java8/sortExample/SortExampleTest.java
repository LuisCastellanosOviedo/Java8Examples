package java8.sortExample;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Created by LuisCO on 26/12/2017.
 */
public class SortExampleTest {


    @Test
    public void testCompareList() throws Exception {
        List<String> strings = Arrays.asList("c","b","a");
        assertEquals(Arrays.asList("a","b","c"), SortExample.listSorted(strings));
    }
}
