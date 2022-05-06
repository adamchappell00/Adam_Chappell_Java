import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();
    // --- TEST FOR INTEGER METHODS -- //
    @Test
    public void testAdditionWithTwoIntegers(){
        assertEquals(2, calc.add(1,1));
        assertEquals(20, calc.add(11,9));
        assertEquals(11, calc.add(7,4));
    }

    @Test
    public void testSubtractionWithTwoIntegers(){
        assertEquals(-29, calc.subtract(23,52));
        assertEquals(7, calc.subtract(11,4));
        assertEquals(3, calc.subtract(7,4));
    }

    @Test
    public void testMultiplicationWithTwoIntegers(){
        assertEquals(68, calc.multiply(34,2));
        assertEquals(20, calc.multiply(4,5));
        assertEquals(12, calc.multiply(3,4));
    }

    @Test
    public void testDivisionWithTwoIntegers(){
        assertEquals(4, calc.divide(12,3));
        assertEquals(1, calc.divide(12,7));
        assertEquals(10, calc.divide(40,4));
        assertEquals(4, calc.divide(12,3));
    }

    // --- TEST FOR OVERLOADED METHODS WITH DOUBLES --- //

    @Test
    public void testAdditionWithTwoDoubles(){
        assertEquals(5.69, calc.add(3.4,2.3), .01);
        assertEquals(20.4, calc.add(11.3,9.1), .001);
        assertEquals(11.24, calc.add(7.02,4.22), .001);
    }

    @Test
    public void testSubtractionWithTwoDoubles(){
        assertEquals(5.0, calc.subtract(5.5,0.5), 0.01);
        assertEquals(11.17, calc.subtract(17.9,6.73),.001);
        assertEquals(4.2, calc.subtract(18.97,14.77), .001);
    }

    @Test
    public void testMultiplicationWithTwoDoubles(){
        assertEquals(29.48, calc.multiply(6.7, 4.4), 0.0001);
        assertEquals(1.44, calc.multiply(1.2,1.2), .001);
        assertEquals(5.1, calc.multiply(1.7,3), .001);
    }

    @Test
    public void testDivisionWithTwoDoubles(){
        assertEquals(4.909, calc.divide(10.8, 2.2), 0.0001);
        assertEquals(1.11, calc.divide(3.33, 3), .001);
        assertEquals(11.24, calc.divide(138.7016,12.34), .001);
    }

}
