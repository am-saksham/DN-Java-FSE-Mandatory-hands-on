package com.exercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 5);
        
        assertEquals("10 + 5 should equal 15", 15, result);
        System.out.println("JUnit is successfully set up and the test passed!");
    }
}