package org.example.java2702;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;


public class Java2702 {

    public static void main(String[] args) {
//        int[] array1 = new int[10];
//        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(array2[1]);
//
//        int length = array2.length;
//        System.out.println(array2[length - 2]);
//
//        for (int element : array2) {
//            System.out.println(element);
//        }
//        for (int i = 0; i < array2.length; i++) {
//            System.out.print(array2[i] + " ");
//        }
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = -1;
//        }
//        for (int element : array2) {
//            System.out.println(element);
//        }
//        for (int element : array2) {
//            System.out.print(element + " ");
//        }
        System.out.println(Arrays.toString(getOdd()));
        System.out.println(eventNumbers(new int[]{51,10,46,52,6}));
    }

    //    Создайте массив из всех нечётных чисел от 1 до 99.
    public static int[] getOdd() {
        int oddNumber = 1;
        int[] oddNumbers = new int[50];
        for (int i = 0; i < oddNumbers.length; i++) {
           oddNumbers[i]=oddNumber;
           oddNumber+=2;

        }
        return oddNumbers;

    }
//        Дан массив целых чисел, подсчитайте сколько в массиве чётных элементов.
public static int eventNumbers(int array[]) {
    int result = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 == 0) {
            result++;
        }
    }
   return result;
}
}
