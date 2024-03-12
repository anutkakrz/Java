package org.example.java2802;

import java.util.Arrays;


public class Java2802 {

    public static void main(String[] args) {
        int[] array = {1, 12, 16, 19, 21, 5};
        int[] array1 = {1, -3, 8, -1, 12};
        double[] array2 = {1, 2.5, 5, 7.3, 4};
        System.out.println(getMaxNumber(array));
        System.out.println(getMaxNumberOddIndex(array));
        System.out.println(getSummPozitivNum(array1));
        System.out.println(getArithmeticMean(array2));
        System.out.println(Arrays.toString(getNumbersLowestAverage(array2)));
    }

    public static int getMaxNumber(int[] array) {
//        В массиве найти максимальный элемент
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMaxNumberOddIndex(int[] array) {
//  В массиве найти максимальный элемент с четным индексом
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1 && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getSummPozitivNum(int[] array) {
        //    В массиве, содержащем положительные и отрицательные целые числа,
        //    вычислить сумму четных положительных элементов
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                summ = summ + array[i];
            }
        }
        return summ;
    }

    //    Найти среднее арифметическое от всех элементов массива
    public static double getArithmeticMean(double[] array) {
        double summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];

        }
        double result = summa/array.length;
        return result;
    }

//    Найти в массиве те элементы, значение которых меньше среднего арифметического,
//    взятого от всех элементов массива
    public static double[] getNumbersLowestAverage(double[] array) {
        double Average = getArithmeticMean(array);
        double[] resultArray = new double[array.length];
        int count = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i]<Average){
                resultArray[count]=array[i];
                count++;
            }

        }
        double[] result = Arrays.copyOf(resultArray,count);
        return result;
    }
}
