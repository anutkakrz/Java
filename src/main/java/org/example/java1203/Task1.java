package org.example.java1203;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
   int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\n--------------------------------");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        boolean[] arrayBool = new boolean[10];
        System.out.println(Arrays.toString(arrayBool));
        String[] arrayObj = new String[10];
        System.out.println(Arrays.toString(arrayObj));
        int[] array2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array2));
        array2[4]=10;
        System.out.println(Arrays.toString(array2));
        System.out.println("array[0] = "+array[0]);
    }
}
