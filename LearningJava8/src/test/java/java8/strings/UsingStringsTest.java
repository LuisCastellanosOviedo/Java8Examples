package java8.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by luis on 4/17/2017.
 */
public class UsingStringsTest {

    @Test
    public void testConcat() throws Exception {
        assertEquals("AVION-*-",UsingStrings.chainingStrings("avion"));

    }
}
