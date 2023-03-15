package org.ewch.calculator;

import java.math.BigInteger;
import java.util.Objects;

public class Calculator {

    public static BigInteger sum(BigInteger  numberA, BigInteger  numberB) {
        return numberA.add(numberB);
    }

    public static BigInteger subtract(BigInteger numberA, BigInteger numberB) {
        return numberA.subtract(numberB);
    }

    public static BigInteger multiplication(BigInteger numberA, BigInteger numberB) {
        return numberA.multiply(numberB);
    }

    public static BigInteger division(BigInteger numberA, BigInteger numberB) {
        if (Objects.equals(numberB, BigInteger.ZERO)) {
            throw new ArithmeticException("Division by Zero not allowed it.");
        }
        return numberA.divide(numberB);
    }
}
