package org.example.java1303;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arrLen = 10;
        int findEl = 0;
        int[] arr = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            arr[i] = rand.nextInt(21) - 10;
        }
        System.out.println("findEl = " + findEl);
        System.out.println(Arrays.toString(arr));

        int res = lSearch1(arr, findEl);
        if (res > -1) {
            System.out.println(findEl + " has index " + res);
        } else {
            System.out.println(findEl + " not found in the array");
        }
    }
    public static int lSearch(int[] arr, int findEl) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findEl) {
                return i;
            }
        }
        return -1;
    }
    public static int lSearch1(int[] arr, int findEl) {
        for (int i = arr.length-1; i >= 0 ; i--) {
            if (arr[i] == findEl) {
                return i;
            }
        } return -1; }
}
