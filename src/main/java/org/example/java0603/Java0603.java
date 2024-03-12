package org.example.java0603;

public class Java0603 {
    public static void main(String[] args) {
//        int num = 5;
//        System.out.println(-num);
//        for (int i = 0; i < num ; i++) {
//            System.out.println(i);
//        };
//        for (int j = 0; j < num; ++j) {
//            System.out.println(j);
//        }

        //унарные операторы:

//        int x1 = num++; //вначале используется, т.е. выводится на консоль, а потом увеличивается
////        на один и в памяти запоминает 6
//        int x2 = ++num; //  вначале меняет результат на один а потом выводит. в памяти у нас 6
////        и к ней добавляется вначале 1 а затем выводит на консоль
//        System.out.println(x1+" "+x2);

        int num = 15;
        if(num==15) {
            System.out.println("in if");
            System.out.println(num+" =15");
        }
        else {
            System.out.println("in else");
            System.out.println(num+" !=15");
        }


    }
}
