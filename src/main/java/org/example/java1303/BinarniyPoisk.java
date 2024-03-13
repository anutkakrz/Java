package org.example.java1303;

import java.util.Arrays;
import java.util.Random;

public class BinarniyPoisk {
    public static void main(String[] args) {
        Random rand = new Random();
        int arrLenght = 10;
        int findEl = 0;
        int[] arr = new int[arrLenght];
        for (int i = 0; i < arrLenght; i++) {
            arr[i] = rand.nextInt(21) - 10;
        }
        System.out.println("findEl = " + findEl);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
