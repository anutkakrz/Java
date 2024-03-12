package org.example.java1203;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int r = 5;
        int c = 6;
        int summRow=0;
        int[][] array = new int[r][c];
        Random random = new Random();
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j]=random.nextInt(10);
            }

        }
        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                summRow+=array[i][j];
            }
            System.out.println(summRow);
            summRow=0;
        }

    }
}
