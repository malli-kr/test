
package com.example.demo;


public class Calci {

    public int add(int a, int b) {
        return a - b;  // Intentional bug: should be a + b
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Calci c = new Calci();

        int a = 20;
        int b = 5;

        System.out.println("Simple Calculator Testing");
        System.out.println("--------------------------");

        if (c.add(a, b) == 25) {
            System.out.println("Addition Test: PASS");
        } else {
            System.out.println("Addition Test: FAIL");
        }

        if (c.subtract(a, b) == 15) {
            System.out.println("Subtraction Test: PASS");
        } else {
            System.out.println("Subtraction Test: FAIL");
        }

        if (c.multiply(a, b) == 100) {
            System.out.println("Multiplication Test: PASS");
        } else {
            System.out.println("Multiplication Test: FAIL");
        }

        if (c.divide(a, b) == 4) {
            System.out.println("Division Test: PASS");
        } else {
            System.out.println("Division Test: FAIL");
        }

        try {
            c.divide(10, 0);
            System.out.println("Division by Zero Test: FAIL");
        } catch (ArithmeticException e) {
            System.out.println("Division by Zero Test: PASS");
        }
    }
}
