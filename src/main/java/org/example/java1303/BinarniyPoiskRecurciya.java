package org.example.java1303;

import java.util.Arrays;
import java.util.Random;

public class BinarniyPoiskRecurciya {
    public static void main(String[] args) {

               Random random = new Random();
                int arrayLength = 10;
                int[] array = new int[arrayLength];
                for (int i = 0; i < arrayLength; i++) {
                    array[i] = random.nextInt(11);
                }
                int findElement = 5;
                Arrays.sort(array);
                System.out.println(Arrays.toString(array));
                System.out.println(findElement + " has index " + recursiveBS(array, 0, arrayLength - 1, findElement));
            }
    public static int recursiveBS(int[] array, int firstIdx, int lastIdx, int findElement) {
        if (lastIdx >= firstIdx) {
            int midIdx = firstIdx + (lastIdx - firstIdx) / 2;
            if (array[midIdx] == findElement) {
                return midIdx;
            }
            if (array[midIdx] > findElement) {
                return recursiveBS(array, firstIdx, midIdx - 1, findElement);
            }
            return recursiveBS(array, midIdx + 1, lastIdx, findElement);
        }
        return -1;
    }
    }

