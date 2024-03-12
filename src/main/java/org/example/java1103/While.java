package org.example.java1103;

import java.util.Random;

public class While {
    public static void main(String[] args) {
//        int i=0;
//        while (i<10) {
//            i++;
//            System.out.println(i);
//        }
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.print(i+"*"+j+"="+(i * j) + "\t");
//            }
//            System.out.println();
//        }
//        Загадать случайно 100 целых чисел в диапазоне от -100 до 100.
//        Вычислить процент положительных чисел, процент отрицательных чисел и
//        процент нулей. Вычислить процент чётных чисел и процент нечётных.

        Random random = new Random();

        int pol =0;
        int otr =0;
        int nol =0;
        int chet =0;
        int neChet =0;
        for (int i = 0; i < 100; i++) {
            int randNum = random.nextInt(201) - 100;
            if (randNum > 0) {
                pol++;
            } else if (randNum < 0) {
                otr++;
            } else {
                nol++;
            }
            if (randNum%2==0){
                chet++;
            }
            else neChet++;

        }
        System.out.println(pol);
        System.out.println(otr);
        System.out.println(nol);
            int prozpol = pol * 100 / 100;
            int prozentotr = otr*100/100;
            int prozentnol = nol*100/100;
        int prozChet = chet*100/100;
        int prozNeChet = neChet*100/100;


            System.out.println(prozpol+"%");
            System.out.println(prozentotr+"%");
            System.out.println(prozentnol+"%");
        System.out.println("четных: "+prozChet+"%");
        System.out.println("нечетных: "+prozNeChet+"%");




    }


}
