package org.ewch.calculator;

public class Calculator {

    public static int sum(int numberA, int numberB) {
        return numberA + numberB;
    }

    public static int subtract(int numberA, int numberB) {
        return numberA - numberB;
    }

    public static int multiplication(int numberA, int numberB) {
        return numberA * numberB;
    }

    public static int division(int numberA, int numberB) {
        if (numberB == 0) {
            throw new ArithmeticException("Division by Zero not allowed it.");
        }
        return numberA / numberB;
    }
}
