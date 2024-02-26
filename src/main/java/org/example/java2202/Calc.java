package org.example._2024_02_22;

public class Calc {
    public static void main(String[] args) {


    }

    public static double calculate(double num1, char operation, double num2) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return division(num1, num2);
            default:
                System.out.println("Error");
                System.exit(0);
                return 0;
        }
    }

    public static double division(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Error! Division by zero");
            System.exit(0);
        }
        return number1 / number2;
    }
}
