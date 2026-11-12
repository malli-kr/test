package com.example.demo;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalciTest {

    Calci c = new Calci();

    @Test
    public void testAdd() {
        assertEquals(30, c.add(10, 20)); 
        // Intentionally incorrect expected result
    }

    @Test
    public void testSubtract() {
        assertEquals(10, c.subtract(20, 10));
    }

    @Test
    public void testMultiply() {
        assertEquals(200, c.multiply(10, 20));
    }

    @Test
    public void testDivide() {
        assertEquals(5, c.divide(25, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> c.divide(10, 0));
    }

    @Test
    public void testBoundaryConditions() {
        assertEquals(0, c.add(0, 0));
        assertEquals(-5, c.subtract(5, 10));
        assertEquals(-20, c.multiply(-4, 5));
        assertEquals(0, c.divide(0, 10));
    }
}

