package com.example.calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator c = null;

    @BeforeEach
    public void before () {
        this.c = new Calculator();
    }

    @Test
    public void testAdd() {
        assertAll("addition",
                () -> assertEquals (c.add(10.0,10.0), 20.0, 0.01),
                () -> assertEquals (c.add(0.5,10.0), 10.5, 0.01),
                () -> assertEquals (c.add(-0.5,10.0), 9.5, 0.01),
                () -> assertEquals (c.add(Double.NaN,10.0), Double.NaN, 0.01)
        );
    }

    @Test
    public void testSubtract() {
        assertAll("subtraction",
                () -> assertEquals (c.subtract(10.0,10.0), 0.0, 0.01),
                () -> assertEquals (c.subtract(0.5,10.0), -9.5, 0.01),
                () -> assertEquals (c.subtract(-0.5,10.0), -10.5, 0.01),
                () -> assertEquals (c.subtract(Double.NaN,10.0), Double.NaN, 0.01)
        );
    }

    @Test
    public void testMultiply() {
        assertAll("multiplication",
                () -> assertEquals (c.multiply(10.0,10.0), 100.0, 0.01),
                () -> assertEquals (c.multiply(0.5,10.0), 5.0, 0.01),
                () -> assertEquals (c.multiply(-0.5,10.0), -5.0, 0.01),
                () -> assertEquals (c.multiply(Double.NaN,10.0), Double.NaN, 0.01)
        );
    }

    @Test
    public void testDivide() {
        assertAll("division",
                () -> assertEquals (c.divide(10.0,10.0), 1.0, 0.01),
                () -> assertEquals (c.divide(0.5,10.0), 0.05, 0.01),
                () -> assertEquals (c.divide(-0.5,10.0), -0.05, 0.01),
                () -> assertEquals (c.divide(Double.NaN,10.0), Double.NaN, 0.01)
        );
    }

}
