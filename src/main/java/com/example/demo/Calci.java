
package com.example.demo;

public class Calci {

    public int add(int a, int b) {
        return a + b;
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

        // Addition
        if (c.add(a, b) == 30) {
            System.out.println("Addition Test: PASS");
        } else {
            System.out.println("Addition Test: FAIL");
        }

        // Subtraction
        if (c.subtract(a, b) == 15) {
            System.out.println("Subtraction Test: PASS");
        } else {
            System.out.println("Subtraction Test: FAIL");
        }

        // Multiplication
        if (c.multiply(a, b) == 100) {
            System.out.println("Multiplication Test: PASS");
        } else {
            System.out.println("Multiplication Test: FAIL");
        }

        // Division
        if (c.divide(a, b) == 4) {
            System.out.println("Division Test: PASS");
        } else {
            System.out.println("Division Test: FAIL");
        }

        // Division by Zero
        try {
            c.divide(10, 0);
            System.out.println("Division by Zero Test: FAIL");
        } catch (ArithmeticException e) {
            System.out.println("Division by Zero Test: PASS");
        }
    }
}

