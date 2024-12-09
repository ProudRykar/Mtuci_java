package labs.lab4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public double performOperation() {
        System.out.print("Введите первое число: ");
        double num1 = getNumber();
        
        System.out.print("Введите второе число: ");
        double num2 = getNumber();
        
        System.out.print("Введите операцию (+, -, *, /, %, ^): ");
        char operation = getOperation();
        
        try {
            return calculate(num1, num2, operation);
        } catch (CustomUnsupportedOperationException e) {
            System.out.println(e.getMessage());
            return performOperation();
        }
    }

    private double getNumber() {
        boolean validInput = false;
        double number = 0;
        while (!validInput) {
            try {
                number = scanner.nextDouble();
                if (number < 0) {
                    throw new CustomUnsupportedOperationException("Число не может быть отрицательным");
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Пожалуйста, введите корректное число.");
                scanner.next(); 
            } catch (CustomUnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }

    private char getOperation() {
        while (true) {
            String op = scanner.next().trim();
            switch (op) {
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                case "^":
                    return op.charAt(0);
                default:
                    throw new CustomUnsupportedOperationException("Неизвестная операция");
            }
        }
    }

    private double calculate(double a, double b, char operation) throws CustomUnsupportedOperationException {
        switch (operation) {
            case '+':
                return add(a, b);
            case '-':
                return subtract(a, b);
            case '*':
                return multiply(a, b);
            case '/':
                if (b == 0) {
                    throw new CustomUnsupportedOperationException("Деление на ноль");
                }
                return divide(a, b);
            case '%':
                return modulus(a, b);
            case '^':
                return power(a, b);
            default:
                throw new CustomUnsupportedOperationException("Неизвестная операция");
        }
    }

    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) throws CustomUnsupportedOperationException {
        if (b == 0) {
            throw new CustomUnsupportedOperationException("Деление на ноль");
        }
        return a / b;
    }

    private double modulus(double a, double b) throws CustomUnsupportedOperationException {
        if (b == 0) {
            throw new CustomUnsupportedOperationException("Деление на ноль при вычислении остатка от деления");
        }
        return a % b;
    }

    private double power(double a, double b) throws CustomUnsupportedOperationException {
        if (a < 0 && b % 2 != 0) {
            throw new CustomUnsupportedOperationException("Отрицательное число в положительной степени с нечетным показателем");
        }
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        while (true) {
            try {
                double result = calculator.performOperation();
                System.out.println("Результат: " + result);
                break;
            } catch (CustomUnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
