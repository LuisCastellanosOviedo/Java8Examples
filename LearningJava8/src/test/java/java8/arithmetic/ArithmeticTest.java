package java8.arithmetic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by luis on 4/17/2017.
 */
public class ArithmeticTest {

    @Test
    public void testSinParentesis(){
        assertEquals(14,Arithmetic.operandos());
    }

    @Test
    public void testConParentesis() {
        assertEquals(48,Arithmetic.operandosParentesis());
    }

    @Test
    public void testNumericPromotion() throws Exception {
        assertEquals(Integer.class,Arithmetic.numericPromotion().getClass());
        assertEquals(new Integer(4),Arithmetic.numericPromotion());
    }
}
