package org.example.java2602;

import java.util.Scanner;

public class Java2602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите трехзначное число");
        int number = sc.nextInt();
        System.out.print(getNumbers(number));

    }
//    Дано трёхзначное число, вывести все цифры этого числа в виде строки.
//    Пример: 345 – вывод: Число 345 -> 3, 4, 5.
    public static String getNumbers(int number) {
        int num1 = number / 100;
        int num2 = (number - num1*100)/10;
        int num3 = number - num1*100 - num2*10;
        String result = "Число "+number+"->"+num1+", "+num2+", "+num3+".";
        return result;
    }
}
