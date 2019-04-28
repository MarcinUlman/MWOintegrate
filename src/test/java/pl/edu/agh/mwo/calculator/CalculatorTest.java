package pl.edu.agh.mwo.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAddFunction(){
        Assert.assertEquals(4, calculator.add(2 ,2));
    }

    @Test
    public void testSubtractFunction(){
        Assert.assertEquals(6, calculator.subtract(8 ,2));
    }

    @Test
    public void testMultiplyFunction(){
        Assert.assertEquals(6, calculator.multiply(2 ,3));
    }

    @Test
    public void testDivideFunction(){
        Assert.assertEquals(6, calculator.divide(13 ,2));
    }

//    @Test(expected = ArithmeticException)
//    public void testDivideBuZero(){
//
//    }

    @Test
    public void testAvgFunction(){
        Assert.assertEquals(7, calculator.avg(13 ,2));
    }
}


