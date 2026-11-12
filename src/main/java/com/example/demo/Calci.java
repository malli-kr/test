
package com.example.demo;


//package com.example;

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

        System.out.println("Addition: " +
                (c.add(a, b) == 25 ? "PASS" : "FAIL"));

        System.out.println("Subtraction: " +
                (c.subtract(a, b) == 15 ? "PASS" : "FAIL"));

        System.out.println("Multiplication: " +
                (c.multiply(a, b) == 100 ? "PASS" : "FAIL"));

        System.out.println("Division: " +
                (c.divide(a, b) == 4 ? "PASS" : "FAIL"));

        try {
            c.divide(10, 0);
            System.out.println("Division by Zero: FAIL");
        } catch (ArithmeticException e) {
            System.out.println("Division by Zero: PASS");
        }
    }
}