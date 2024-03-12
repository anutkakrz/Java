package org.example.java0703;

import java.util.Random;

public class Java0703 {
    public static void main(String[] args) {
        Random random = new Random();
        int day = random.nextInt(7) +1;
//        String day = "Monday";
        String dayString;

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wensday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
        System.out.println("Your day is "+dayString);
//        switch (day) {
//            case 1, 2, 3, 4, 5:
////            case 1:
////            case 2:
////            case 3:
////            case 4:
////            case 5:
//                dayString = "Working day";
//                break;
//            case 6:
//            case 7:
//                dayString = "Weekend";
//                break;
//            default:
//                dayString = "Invalid day";
//
//        }
//        System.out.println("Today is "+dayString);

//        switch (day) {
//            case "Monday", "Friday":
//                dayString = "Working day";
//                break;
//            case "Suturday", "Sunday":
//                dayString = "Weekend";
//                break;
//            default:
//                dayString = "Wrong day";
//
//        }
//        System.out.println(dayString);
    }

}
