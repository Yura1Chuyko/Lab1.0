package com.company;

public class Calculator {
    public static <C extends Number> double sum(final C firstNumber, final C secondNumber) {
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    public static <C extends Number> double diff(final C firstNumber, final C secondNumber) {
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }

    public static <C extends Number> double mltp(final C firstNumber, final C secondNumber) {
        return firstNumber.doubleValue() * secondNumber.doubleValue();
    }

    public static <C extends Number> double devide(final C firstNumber, final C secondNumber) {
        return firstNumber.doubleValue() / secondNumber.doubleValue();
    }

    public static double mltp(final CustomDouble firstNumber, final CustomDouble secondNumber) {
        return firstNumber.toDouble() * secondNumber.toDouble();
    }

    public static double divide(final CustomDouble firstNumber, final CustomDouble secondNumber) {
        return firstNumber.toDouble() / secondNumber.toDouble();
    }

    public static void main(final String[] args) {
        final CustomDouble a = new CustomDouble(1, 0.5);
        final CustomDouble b = new CustomDouble(2, 0.3);
        a.plus(b);
        System.out.println(divide(a, b));
        System.out.println(mltp(a, b));
        System.out.println(sum(1.2, 1.2));
    }
}

