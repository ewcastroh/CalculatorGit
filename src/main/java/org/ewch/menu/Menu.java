package org.ewch.menu;

import org.ewch.calculator.Calculator;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private BigInteger numberA;
    private BigInteger numberB;

    private void getNumberForOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type number 1: ");
        this.numberA = BigInteger.valueOf(scanner.nextInt());
        System.out.print("Type number 2: ");
        this.numberB = BigInteger.valueOf(scanner.nextInt());
        System.out.print("Operation result is: ");
    }

    public void displayMenu() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;
        System.out.println("### Welcome to The Amazing Calculator ###");
        while (!exit) {
            System.out.println("Select desired action:");
            System.out.println("1. Sum two numbers.");
            System.out.println("2. Subtract two numbers.");
            System.out.println("3. Multiply two numbers.");
            System.out.println("4. Divide two numbers.");
            System.out.println("0. Exit.");

            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> {
                        getNumberForOperation();
                        System.out.println(Calculator.sum(this.numberA, this.numberB));
                    }
                    case 2 -> {
                        getNumberForOperation();
                        System.out.println(Calculator.subtract(this.numberA, this.numberB));
                    }
                    case 3 -> {
                        getNumberForOperation();
                        System.out.println(Calculator.multiplication(this.numberA, this.numberB));
                    }
                    case 4 -> {
                        getNumberForOperation();
                        System.out.println(Calculator.division(this.numberA, this.numberB));
                    }
                    case 0 -> {
                        System.out.println("Thanks for using our system.");
                        exit = true;
                    }
                    default -> System.out.println("Type just numbers.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Type a valid number.");
                scanner.next();
            }
        }
    }
}
