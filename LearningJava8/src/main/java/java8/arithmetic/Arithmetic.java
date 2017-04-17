package java8.arithmetic;

/**
 * Created by luis on 4/17/2017.
 */
public class Arithmetic {

    public static int operandos (){

        return 2 * 5 + 3 * 4 - 8;
    }

    public static int operandosParentesis(){
        return  2 * ((5 + 3) * 4-8);
    }


    public static Object numericPromotion(){
        short a =2;
        short b = 2;
        return a+b;
    }
}
