package org.example.java1203;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random rand = new Random();
        int sumArray1 = 0;
        int sumArray2 = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i]=rand.nextInt(5);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i]=rand.nextInt(5);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
           sumArray1+=array1[i];
           sumArray2+=array2[i];
        }
        System.out.println("avg of array1= "+(double)(sumArray1)/array1.length);
        System.out.println("avg of array2= "+(double)(sumArray2)/array2.length);
     }

}
