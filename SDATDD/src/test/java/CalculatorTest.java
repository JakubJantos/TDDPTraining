import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  private Calculator calculator;


    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void sholdAddTwoNumbers() {

        //when
        int result = calculator.add(4,3);

        //then
        assertEquals(7,result);
        System.out.println(result);

    }

    @Test
    public void sholdSubstractTwoNumners(){

        //when
        int result = calculator.substract(4,3);

        //then
        assertEquals(1,result);
        System.out.println(result);
    }

    @Test
    public void sholdMultiplyTwoNumbers(){

        //when
        int result = calculator.multiply(4,4);

        //then
        assertEquals(16, result);
        System.out.println(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sholdNotDewideTwoNumbers(){
        //when

        int resoult = calculator.devide(4,0);
        System.out.println(resoult);
    }

    @Test
    public void sholdDewideTwoNumbers(){
        //when

        int resoult = calculator.devide(4,7);
        System.out.println(resoult);

    }
}
