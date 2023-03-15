package org.ewch.calculator;

import java.math.BigInteger;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {

    private static Logger logger = Logger.getLogger(Calculator.class.getName());

    public static BigInteger sum(BigInteger numberA, BigInteger numberB) {
        BigInteger result = numberA.add(numberB);
        logger.log(Level.INFO,
                "Summing: ".concat(numberA.toString()).concat(" + ").concat(numberB.toString()).concat(" = ").concat(result.toString()));
        return result;
    }

    public static BigInteger subtract(BigInteger numberA, BigInteger numberB) {
        BigInteger result = numberA.subtract(numberB);
        logger.log(Level.INFO,
                "Subtracting: ".concat(numberA.toString()).concat(" - ").concat(numberB.toString()).concat(" = ").concat(result.toString()));
        return result;
    }

    public static BigInteger multiplication(BigInteger numberA, BigInteger numberB) {
        BigInteger result = numberA.multiply(numberB);
        logger.log(Level.INFO,
                "Multiplying: ".concat(numberA.toString()).concat(" * ").concat(numberB.toString()).concat(" = ").concat(result.toString()));
        return result;
    }

    public static BigInteger division(BigInteger numberA, BigInteger numberB) {
        if (Objects.equals(numberB, BigInteger.ZERO)) {
            System.out.println("ERROR: Division by Zero not allowed it.");
            logger.log(Level.SEVERE, "ERROR: Division by Zero not allowed it.");
            return BigInteger.ZERO;
        }
        BigInteger result = numberA.divide(numberB);
        logger.log(Level.INFO,
                "Dividing: ".concat(numberA.toString()).concat(" / ").concat(numberB.toString()).concat(" = ").concat(result.toString()));
        return result;
    }
}
