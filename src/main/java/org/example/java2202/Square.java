package org.example.java2202;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

//        double side = 5;
//        double area = side * side;
//        System.out.println(area);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side size");
        double side = scanner.nextDouble();

        double area = Math.pow(side, 2);
        System.out.println(area);

        //        String string = scanner.nextLine();
        //        char ch = scanner.next().charAt();
        System.out.println("строка1");
        System.out.println("строка2");
        double areaa = calculateArea(side);
    }

   public static double calculateArea(double side) {
        double area = side*side;
        return area;
   }
}
