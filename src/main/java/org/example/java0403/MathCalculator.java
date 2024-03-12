package org.example.java0403;

import java.util.Arrays;

public class MathCalculator {
    public static void main(String[] args) {
        int num = 8;
//        System.out.println(convert(num));
        System.out.println(num+" -> " +reverseString(num));

    }

    public static String convert(int num) {
        String result = "";
        while (true) {
            if (num > 0) {
                result += num % 2;
                num /= 2;
            } else {
                break;
            }

        }
        return result;
    }
    public static String reverseString (int num) {
        String str = convert(num);
        char [] arrayRes = str.toCharArray();
//        System.out.println(Arrays.toString(arrayRes));
        for (int i = 0; i <arrayRes.length/2 ; i++) {
            char temp = arrayRes[i];
            arrayRes[i] = arrayRes[arrayRes.length-i-1];
            arrayRes[arrayRes.length-i-1]=temp;
        }
        return String.copyValueOf(arrayRes) ;
    }
}

