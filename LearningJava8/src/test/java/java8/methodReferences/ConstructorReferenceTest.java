package java8.methodReferences;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by LuisCO on 27/12/2017.
 */
public class ConstructorReferenceTest {

    private List<String> weights;

    @Before
    public void setUp() throws Exception {
        weights = Arrays.asList("3","4","5");
    }

    @Test
    public void testConstrcutorByReference() throws Exception {
        assertEquals(3,ConstructorReference.createFruits(weights,Banana::new).size());
        assertEquals(Banana.class.getName(),ConstructorReference.createFruits(weights,Banana::new).get(0).getClass().getName());
    }
}
