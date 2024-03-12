package org.example.java1103;

import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Введите ответ на загадку:" +
                "Что такое синий, большой, с усами и полностью" +
                " набит зайцами?");
        for (int i = 0; i < 3; i++) {
//            if (exit == true) {
//                break;
//            }
//            String answer = sc.next();
//            switch (answer) {
//                case "Троллейбус":
//                case "троллейбус":
//                    System.out.println("правилльно");
//                    exit = true;
//                    break;
//
//                case "сдаюсь":
//                case "Сдаюсь":
//                    System.out.println("Правильный ответ: троллейбус.");
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("подумайте еще");


//            }
            String answer = sc.next();
            if (Objects.equals(answer, "Троллейбус")) {
                System.out.println("правилльно");
                break;
            }
             else if (Objects.equals(answer, "сдаюсь")) {
                System.out.println("Правильный ответ: троллейбус.");
                break;
            } else {
                System.out.println("попробуйте еще раз");
            }

        }
    }
}
