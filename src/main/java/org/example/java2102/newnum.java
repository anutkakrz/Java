package org.example.java2102;

public class newnum {
    public static void main(String[] args) {
        //Дано 5 чисел:  а=10,  b=15, c= 20, d=25, e=30.
//Переприсвоить и вывести их на экран в том же порядке(a,b,c,d,e), НО, таким образом,
// чтобы каждая переменная принимала “следующее” значение из этой цепочки.
//Пример: было а=10 стало а=15;  было е=30 стало е=10.
//Примечание: присваивать “напрямую” значения нельзя, все манипуляции должны
// происходить за счёт переменных, а не их значений.
//
//        int a = 10;
//        int b = 15;
//        int c = 20;
//        int d = 25;
//        int e = 30;
//        int temp = a;
//
//         a = b;
//         b = c;
//         c = d;
//         d = e;
//         e = temp;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);

//        Создать программу которая принимает на вход 3 вещественных числа,
//        и будет выводить на экран ТО число, чей остаток от деления на 1.5
//        -  меньше остальных. Для наглядности выводить и сам остаток.
//
//        double a = 6.5;
//        double b = 3.7;
//        double c = 9.9;
//
//        double remainderA = a % 1.5;
//        double remainderB = b % 1.5;
//        double remainderC = c % 1.5;
//
//        if (remainderA < remainderB && remainderA < remainderC) {
//            System.out.println(a);}
//
//           else if (remainderB < remainderA && remainderB < remainderC) {
//                System.out.println(b);
//            } else  {
//                System.out.println(c);
//            }
//        Даны три переменные, вещественные числа number1, number2, и символьный operation, который может содержать следующие символы (+ - * /). Написать программу "Калькулятор" которая будет выводить на консоль результат соответствующих вычислений.
//        double number1 = 15;
//        double number2 = 5.3 ;
//        char operation = '*';
//
//        if (operation == '*') {
//            System.out.println(number1 * number2);
//
//        } else if (operation == '/') {
//            if (number2 == 0) {
//                System.out.println("Error");
//            } else {
//                System.out.println(number1 / number2);
//            }
//
//        } else if (operation == '-') {
//            System.out.println(number1 - number2);
//
//        } else if (operation == '+') {
//            System.out.println(number1 + number2);
//        }

//        double number1 = 15;
//        double number2 = 9;
//        char operation = '*';
//
//        switch (operation) {
//            case '*':
//                System.out.println(number1 * number2);
//                break;
//            case '/':
//                if (number2 == 0) {
//                    System.out.println("Error");
//                } else {
//                    System.out.println(number1 / number2);
//                }
//                break;
//            case '+':
//                System.out.println(number1 + number2);
//                break;
//            case '-':
//                System.out.println(number1 - number2);
//                break;
//            default:
//                System.out.println("error");
//
//        }
//        В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (count == 25) {
                break;
            }
            if (i % 2 == 0 && i % 10 != 0) {
                count++;
                System.out.println(i);
            }
        }
    }
}

